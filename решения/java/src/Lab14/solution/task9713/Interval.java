package Lab14.solution.task9713;

/**
 * @author akryukov
 *         15.08.2017
 */
public class Interval {
    public int a;
    public int b;

    public boolean intersects(Interval i)
    {
        return !(b <= i.a || i.b <= a);
    }

    @Override
    public String toString()
    {
        if(a > b)
        {
            return "[Некорректный интервал " + a + ";" + b + "]";
        }
        return "[" + a + ";" + b + "]";
    }
}
