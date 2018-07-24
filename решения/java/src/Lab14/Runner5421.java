package Lab14;

import Lab14.stage3.Point;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Runner5421 {
    public static void main(String[] args) {
        Point p = new Point(31, 37, "red");
        System.out.println(p);
        Point p1 = new Point(11, 13);
        Point p2 = new Point(17, 19);
        System.out.printf("Расстояние между %s и %s составляет %.4f\n", p1, p2, p1.distanceTo(p2));
    }
}
