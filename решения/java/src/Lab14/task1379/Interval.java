package Lab14.task1379;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Interval {
    public int a;
    public int b;

    public void slide(int value){
        if(a > b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        this.a += value;
        this.b += value;
    }

    public String print(){
        if(a > b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        return "[" + a + ";" + b + "]";
    }
}
