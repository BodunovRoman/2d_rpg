/**
 * Created by BodunovRA on 02.10.2016.
 */
public class Enemy extends GameObject
{
    private Stats stats;
    private GameObject target;

    public Enemy(int level)
    {
        stats = new Stats(level, false);
        target = null;
    }

    @Override
    public void update()
    {
        if(target == null)
        {
            Look();
        }
        else
        {
            Chase();

            if(Util.LineOfSight(this, target))
                Attack();
        }

        if(stats.getCurrentHealth() <= 0)
            Die();

    }

    protected void Attack()
    {

    }

    protected void Look()
    {

    }

    protected void Chase()
    {

    }

    protected void Die()
    {

    }

    public void setTarget (GameObject go)
    {
        target = go;
    }

    public GameObject getTarget ()
    {
        return target;
    }

    public Stats getStats()
    {
        return stats;
    }
}
