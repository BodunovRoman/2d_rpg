import org.lwjgl.opengl.Display;

import java.util.ArrayList;

/**
 * Created by BodunovRA on 29.09.2016.
 */
public class Game
{

    private ArrayList<GameObject> objects;
    private ArrayList<GameObject> remove;
    private Player player;

    public Game()
    {
        objects = new ArrayList<GameObject>();
        remove = new ArrayList<GameObject>();

        player = new Player(Display.getWidth()/2 - Player.SIZE/2, Display.getHeight()/2 - Player.SIZE/2);

        objects.add(player);
        objects.add(new Cube(32,32, player));
    }

    public void getInput()
    {
        player.getInput();
    }

    public void update()
    {
        for(GameObject go : objects)
        {
            if(!go.getRemove())
            {
                go.update();
            }
            else
            {
                remove.add(go);
            }
        }

        for(GameObject go : remove)
            objects.remove(go);
    }

    public void render()
    {
        for(GameObject go : objects)
            go.render();

    }


}
