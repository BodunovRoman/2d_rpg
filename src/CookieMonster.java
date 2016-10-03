import java.util.ArrayList;

/**
 * Created by BodunovRA on 02.10.2016.
 */
public class CookieMonster extends Enemy
{

    public static final int SIZE = 32;

    public CookieMonster (float x, float y, int level)
    {
        super(level);
        init(x, y, 0.2f, 0.2f, 1.0f, SIZE, SIZE, 0);
        setAttackDelay(200);
    }

}
