import org.lwjgl.input.Keyboard;

import javax.swing.*;

/**
 * Created by BodunovRA on 30.09.2016.
 */

public class Player extends GameObject
{

    public static final float SIZE = 32;



    public Player(float x, float y)
    {
        init(x,y,0.1f,1f,0.25f,SIZE,SIZE);

    }

    public void getInput()
    {
        if(Keyboard.isKeyDown(Keyboard.KEY_W))
            move(0,1);
        if(Keyboard.isKeyDown(Keyboard.KEY_S))
            move(0,-1);
        if(Keyboard.isKeyDown(Keyboard.KEY_D))
            move(1,0);
        if(Keyboard.isKeyDown(Keyboard.KEY_A))
            move(-1,0);
    }

    private  void move(float magX, float magY)
    {
        x += getSpeed()*magX;
        y += getSpeed()*magY;
    }

    public float getSpeed()
    {
      return 4f;
    }
}
