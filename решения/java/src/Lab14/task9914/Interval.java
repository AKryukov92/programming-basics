package Lab14.task9914;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Interval {
    public int a;
    public int b;
    public boolean intersects(Interval i){
        if(i == null){
            throw new IllegalArgumentException("Данный интервал не инициализирован");
        }
        if(a > b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        if(i.a > i.b){
            throw new IllegalArgumentException("Некорректный интервал");
        }
        return !(b <= i.a || i.b <= a);
    }
}
