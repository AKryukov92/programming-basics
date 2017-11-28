package Lab14;

import Lab14.task6011example.Point;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Task6011example {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
        Step5();
    }

    public static void Step1(){
        Point p1 = new Point();
        p1.x = 109;
        p1.y = 113;
        Point p2 = new Point();
        p2.x = 127;
        p2.y = 131;
        double dist = Point.distanceBetween(p1, p2);
        System.out.printf("%.4f\n",dist);
    }

    public static void Step2(){
        Point p1 = new Point();
        p1.x = 137;
        p1.y = 139;
        Point p2 = new Point();
        p2.x = 139;
        p2.y = 149;
        System.out.printf("%.4f\n", Point.distanceBetween(p1, p2));
    }

    public static void Step3(){
        Point p1 = null;
        Point p2 = new Point();
        p2.x = 151;
        p2.y = 157;
        try {
            double dist = Point.distanceBetween(p1, p2);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void Step4(){
        Point p1 = new Point();
        p1.x = 163;
        p1.y = 167;
        Point p2 = null;
        try {
            double dist = Point.distanceBetween(p1, p2);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void Step5(){
        Point p1 = null;
        Point p2 = null;
        try {
            double dist = Point.distanceBetween(p1, p2);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
