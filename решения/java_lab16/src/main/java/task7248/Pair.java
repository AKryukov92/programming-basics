package task7248;

/**
 * @author akryukov
 *         07.09.2017
 */
public class Pair {
    private Interval first;
    private Interval second;
    public Pair(int a1, int b1, int a2, int b2){
        first = new Interval(a1, b1);
        second = new Interval(a2, b2);
    }
}
