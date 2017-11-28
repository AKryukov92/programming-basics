package Lab14;

import Lab14.task3185example.Point;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Task3185example {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
        Step5();
    }

    private static void Step1(){
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        Point p2 = new Point();
        p2.x = 4;
        p2.y = 3;
        double dist = p1.distanceTo(p2);
        System.out.println(dist);
    }

    private static void Step2(){
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        Point p2 = new Point();
        p2.x = 0;
        p2.y = 0;
        System.out.println(p1.distanceTo(p2));
    }

    private static void Step3(){
        Point p1 = new Point();
        p1.x = 19;
        p1.y = 23;
        Point p2 = new Point();
        p2.x = 11;
        p2.y = 13;
        System.out.printf("%.4f\n", p1.distanceTo(p2));
    }

    private static void Step4(){
        Point p1 = new Point();
        p1.x = 11;
        p1.y = 23;
        Point p2 = new Point();
        p2.x = 11;
        p2.y = 13;
        System.out.println(p1.distanceTo(p2));
    }

    private static void Step5(){
        Point p1 = new Point();
        p1.x = 11;
        p1.y = 23;
        Point p2 = null;
        try {
            System.out.println(p1.distanceTo(p2));
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
