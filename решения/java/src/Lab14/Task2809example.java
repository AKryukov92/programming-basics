package Lab14;

import Lab14.task2809example.Point;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Task2809example {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
        Step5();
    }

    public static void Step1(){
        Point p = new Point();
        p.x = 127;
        p.y = 113;
        String str = p.print();
        System.out.println(str);
    }

    public static void Step2(){
        Point p = new Point();
        p.x = 31;
        p.y = 37;
        System.out.println(p.print());
    }

    public static void Step3(){
        Point p = new Point();
        p.setCoordinates(5,7);
        System.out.println(p.print());
    }

    public static void Step4(){
        Point p1 = new Point();
        p1.setCoordinates(23,29);
        System.out.printf("Расстояние между %s и (0;0) составляет %.4f\n", p1.print(), p1.distanceTo(0,0));
    }

    public static void Step5(){
        Point p1 = new Point();
        p1.setCoordinates(11,13);
        Point p2 = new Point();
        p2.x = 17;
        p2.y = 19;
        System.out.printf("Расстояние между %s и (0;0) составляет %.4f\n", p1.print(), p1.distanceTo(p2));
    }
}
