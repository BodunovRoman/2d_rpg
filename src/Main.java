//package com.base.engine;

//import com.base.com.base.game.Game;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.GL11;
import java.io.Console;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by sannikov on 29.09.2016.
 */


public class Main {

    private static Game game;

    public static void main(String[] args){

        initDislpay();
        initGL();
        initGame();

        gameLoop();

        cleanUp();
    }

    private static void test(){

        try {
            Display.setDisplayMode(new DisplayMode(800,600));
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(0);
        }

        // init OpenGL
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, 800, 0, 600, 1, -1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);

        while (!Display.isCloseRequested()) {
            // Clear the screen and depth buffer
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

            // set the color of the quad (R,G,B,A)
            GL11.glColor3f(0.5f,0.5f,1.0f);

            // draw quad
            GL11.glBegin(GL11.GL_QUADS);
            GL11.glVertex2f(100,100);
            GL11.glVertex2f(100+200,100);
            GL11.glVertex2f(100+200,100+200);
            GL11.glVertex2f(100,100+200);
            GL11.glEnd();

            Display.update();
        }

        Display.destroy();
    }

    private static void initGame(){
        game = new Game();
    }

    private static void getInput(){
        game.getInput();
    }

    private static void update(){
        game.update();
    }

    private static void render(){
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        //glLoadIdentity();

        //Draw
        game.render();

        Display.update();
        Display.sync(60);
    }

    private static void gameLoop(){
        while (!Display.isCloseRequested()){
            getInput();
            update();
            render();
        }
    }

    private static void initGL(){
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        double width = Display.getWidth();
        double height = Display.getHeight();
        glOrtho(0, width, 0, height, 1, -1);
        glMatrixMode(GL_MODELVIEW);

        glDisable(GL_DEPTH_TEST);
        glClearColor(0,0,0,0);
    }

    private static void cleanUp(){
        Display.destroy();
        Keyboard.destroy();
    }

    private static void initDislpay() {
        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.create();
            Keyboard.create();
            Display.setVSyncEnabled(true);
        }
        catch (LWJGLException ex)
        {
            System.out.println("ERROR!");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
