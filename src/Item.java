/**
 * Created by BodunovRA on 01.10.2016.
 */
public class Item extends  GameObject
{
    protected String name;
    //protected Sprite spr;

    public void pickUp()
    {

    }

    protected void init(float x, float y, float r, float g, float b, float sx, float sy, String name)
    {
        this.x = x;
        this.y = y;
        this.type = 1;
        this.spr = new Sprite (r, g, b, sx, sy);
        this.name = name;

    }

}
