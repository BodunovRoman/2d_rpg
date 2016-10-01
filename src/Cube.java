/**
 * Created by BodunovRA on 01.10.2016.
 */
public class Cube extends Item
{
    public static final float SIZE = 32;

    private Player player;
    //private Game game;

    public Cube(float x, float y, Player play)
    {
        init(x, y, 1.0f, 0.5f, 0, SIZE, SIZE, "The Cube");
        this.player = play;
       // this.game = game;
    }

    @Override
    public void pickUp()
    {
        System.out.println("You just picked up " + name + "!");
        player.addItem(this);
        remove();
    }




    public void update()
    {
        if(Physics.checkCollision(this, player))
            pickUp();
    }
}
