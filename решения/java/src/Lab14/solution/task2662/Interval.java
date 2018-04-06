package Lab14.solution.task2662;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Interval {
    private int a;
    private int b;

    public Interval(int a, int b){
        if(a > b){
            throw new IllegalArgumentException("Некорректный интервал");
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Interval interval = (Interval) o;

        if (a != interval.a) return false;
        return b == interval.b;

    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }
}
