package Lab14.task1953;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Interval {
    private int a;
    private int b;
    public Interval(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String print(){
        if(a > b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        return "[" + a + ";" + b + "]";
    }
}
