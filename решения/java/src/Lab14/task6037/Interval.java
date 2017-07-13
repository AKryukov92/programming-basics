package Lab14.task6037;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Interval {
    public int a;
    public int b;
    public static boolean hasIntersection(Interval i1, Interval i2){
        if(i1 == null){
            throw new IllegalArgumentException("Данный интервал не инициализирован");
        }
        if(i2 == null){
            throw new IllegalArgumentException("Данный интервал не инициализирован");
        }
        if(i1.a > i1.b || i2.a > i2.b){
            throw new IllegalArgumentException("Некорректный интервал");
        }
        return !(i1.b <= i2.a || i2.b <= i1.a);
    }
}
