package Lab14.task5242;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Interval {
    public int a;
    public int b;
    public String print(){
        if(a > b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        return "[" + a + ";" + b + "]";
    }
}
