package Lab14;

import Lab14.task8403example.Point;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Task8403example {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
    }

    private static void Step1(){
        Point p = new Point();
        p.x = 0;
        p.y = 0;
        double dist = p.distanceTo(4,3);
        System.out.println(dist);
    }

    private static void Step2(){
        Point p = new Point();
        p.x = 0;
        p.y = 0;
        System.out.println(p.distanceTo(0,0));
    }

    private static void Step3(){
        Point p = new Point();
        p.x = 19;
        p.y = 23;
        System.out.printf("%.4f", p.distanceTo(11,13));
    }

    private static void Step4(){
        Point p = new Point();
        p.x = 11;
        p.y = 23;
        System.out.println(p.distanceTo(11,13));
    }
}
