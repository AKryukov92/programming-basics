package Lab14.task2401;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Interval {
    public int a;
    public int b;

    public void squeeze(int value){
        if(a > b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        if(a > b - value){
            throw new IllegalArgumentException("Невозможно уменьшить интервал на указанную длину");
        }
        this.b -= value;
    }

    public String print(){
        if(a > b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        return "[" + a + ";" + b + "]";
    }
}
