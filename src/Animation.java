import java.util.ArrayList;

/**
 * Created by BodunovRA on 29.09.2016.
 */
public class Animation
{
    private ArrayList<Frame> frames;
    private int curFrame;

    public Animation()
    {
        frames = new ArrayList<Frame>();
    }

    public void render()
    {
        Frame temp = frames.get(curFrame);

        if(temp.render())
        {
            curFrame++;
            curFrame %= frames.size();
        }
    }
}
