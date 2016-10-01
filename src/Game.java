import org.lwjgl.opengl.Display;

import java.util.ArrayList;

/**
 * Created by BodunovRA on 29.09.2016.
 */
public class Game
{

    private ArrayList<GameObject> objects;
    private Player player;

    public Game()
    {
        objects = new ArrayList<GameObject>();

        player = new Player(Display.getWidth()/2 - Player.SIZE/2, Display.getHeight()/2 - Player.SIZE/2);

        objects.add(player);
    }

    public void getInput()
    {
        player.getInput();
    }

    public void update()
    {
        for(GameObject go : objects)
            go.update();
    }

    public void render()
    {
        for(GameObject go : objects)
            go.render();

    }
}
