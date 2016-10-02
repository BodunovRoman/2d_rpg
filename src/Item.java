/**
 * Created by BodunovRA on 01.10.2016.
 */
public class Item extends  GameObject
{
    protected String name;
    protected Player player;
    //protected Sprite spr;

    public Item(Player play)
    {
        this.player = play;
    }


    public void pickUp()
    {
        System.out.println("You just picked up " + name + "!");
        player.addItem(this);
        remove();
    }


    @Override
    public void update()
    {
        if(Physics.checkCollision(this, player) != null)
            pickUp();
    }

    public String getName()
    {
        return name;
    }

    protected void init(float x, float y, float r, float g, float b, float sx, float sy, String name)
    {
        this.x = x;
        this.y = y;
        this.type = ITEM_ID;
        this.spr = new Sprite (r, g, b, sx, sy);
        this.name = name;

    }

}
