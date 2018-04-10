package Lab14.solution.task2092;

/**
 * @author akryukov
 * 10.04.2018
 */
public class Interval {
    public int a;
    public int b;

    public boolean contains(int value) {
        if (a > b) {
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        return a <= value && value <= b;
    }
}
