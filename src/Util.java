/**
 * Created by BodunovRA on 02.10.2016.
 */
public class Util
{
    public static boolean LineOfSight(GameObject go1, GameObject Go2)
    {
        return true;
    }

    public static float dist(float x1, float y1, float x2, float y2)
    {
        float x = x2 - x1;
        float y = y2 - y1;

        return (float)Math.sqrt((x * x) + (y * y));

    }
}
