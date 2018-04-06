package Lab14.solution.task2000;

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

    public void slide(int value){
        this.a += value;
        this.b += value;
    }

    public void squeeze(int value){
        if(a > b - value){
            throw new IllegalArgumentException("Невозможно уменьшить интервал на указанную длину");
        }
        this.b -= value;
    }

    public int length(){
        return b - a;
    }

    public String print(){
        return "[" + a + ";" + b + "]";
    }
}
