/**
 * Created by BodunovRA on 29.09.2016.
 */
import static org.lwjgl.opengl.GL11.*;

public abstract class GameObject
{
    protected float x;
    protected float y;
    protected Sprite spr;

    public void update()
    {

    }

    public void render()
    {
        glPushMatrix();
        {
            glTranslatef(x, y, 0);
            spr.render();
        }
        glPopMatrix();
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public float getSX()
    {
        return spr.getSX();
    }

    public float getSY()
    {
        return spr.getSY();
    }

    protected void init(float x, float y, float r, float g, float b, float sx, float sy)
    {
        this.x = x;
        this.y = y;
        this.spr = new Sprite (r, g, b, sx, sy);

    }

}
