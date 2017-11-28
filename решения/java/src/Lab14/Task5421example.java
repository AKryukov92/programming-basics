package Lab14;

import Lab14.task5421example.Point;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Task5421example {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
    }

    private static void Step1(){
        Point p = new Point();
        p.x = 31;
        p.y = 37;
        System.out.println(p);
    }

    private static void Step2(){
        Point p = new Point();
        p.setCoordinates(5,7);
        System.out.println(p);
    }

    private static void Step3(){
        Point p1 = new Point();
        p1.setCoordinates(23,29);
        System.out.printf("Расстояние между %s и (0;0) составляет %.4f\n", p1, p1.distanceTo(0,0));
    }

    private static void Step4(){
        Point p1 = new Point();
        p1.setCoordinates(11,13);
        Point p2 = new Point();
        p2.x = 17;
        p2.y = 19;
        System.out.printf("Расстояние между %s и %s составляет %.4f\n", p1, p2, p1.distanceTo(p2));
    }
}
