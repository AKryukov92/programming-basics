package Lab14;


import Lab14.task4147example.Interval;
import Lab14.task4147example.Point;
import Lab14.task4147example.Rectangle;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Task4147example {

    public static void main(String[] args) {
        Step1();
        System.out.println();
        Step2();
        System.out.println();
        Step3();
        System.out.println();
        Step4();
        System.out.println();
        Step5();
        System.out.println();
        Step6();
    }

    private static void Step1(){
        Rectangle r = new Rectangle(5,5,20,20);
        Point p = new Point(30,30);
        if(r.contains(p)){
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    private static void Step2(){
        Point corner = new Point(10,10);
        Rectangle r = new Rectangle(corner,20,20);
        Point p = new Point(30,30);
        if(r.contains(p)){
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    private static void Step3(){
        Point corner = new Point(10,10);
        Rectangle r = new Rectangle(corner,20,20);
        System.out.println(r.area());
    }

    private static void Step4(){
        Interval projectionX = new Interval(15, 30);
        Interval projectionY = new Interval(20, 35);
        Rectangle r = new Rectangle(projectionX, projectionY);
        System.out.println(r.area());
    }

    private static void Step5(){
        Rectangle r = new Rectangle(100, 200, 300, 400);
        Interval i = new Interval(50, 75);
        if(r.getProjectionX().intersects(i)){
            System.out.println("Пересекаются");
        }else {
            System.out.println("Не пересекаются");
        }
    }

    private static void Step6(){
        Rectangle r = new Rectangle(100, 200, 300, 400);
        Interval i = new Interval(100, 300);
        if(r.getProjectionY().intersects(i)){
            System.out.println("Пересекаются");
        }else {
            System.out.println("Не пересекаются");
        }
    }
}
