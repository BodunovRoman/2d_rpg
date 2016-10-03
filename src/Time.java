import org.lwjgl.Sys;

/**
 * Created by BodunovRA on 03.10.2016.
 */
public class Time
{
    public static final float DAMPING = 18000000f;

    private static long curTime;
    private static long lastTime;

    public static long getTime()
    {
        return System.nanoTime();
    }

    public static float getDelta()
    {
        return (curTime - lastTime) / DAMPING;
    }

    public static void update()
    {
        lastTime = curTime;
        curTime = getTime();
    }

    public static void init()
    {
        lastTime = getTime();
        curTime = getTime();
    }

}
