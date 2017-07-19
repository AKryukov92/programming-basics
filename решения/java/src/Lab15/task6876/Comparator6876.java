package Lab15.task6876;

import java.util.Comparator;

/**
 * @author akryukov
 *         19.07.2017
 */
public class Comparator6876 implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        double area1 = o1.area();
        double area2 = o2.area();

        return (int) (area2 - area1);
    }
}
