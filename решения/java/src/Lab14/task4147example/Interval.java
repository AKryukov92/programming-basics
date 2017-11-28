package Lab14.task4147example;

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

    public int length(){
        return b - a;
    }

    public int getA() {
        return a;
    }

    public boolean intersects(Interval i) {
        return !(b <= i.a || i.b <= a);
    }
}
