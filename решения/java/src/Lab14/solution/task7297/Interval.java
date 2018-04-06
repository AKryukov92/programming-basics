package Lab14.solution.task7297;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Interval {
    public int a;
    public int b;
    public boolean contains(int t){
        if(a > b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        return a < t && t < b;
    }
}
