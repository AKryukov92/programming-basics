package Lab14;

import Lab14.task3956example.*;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Task3956example {

    public static void main(String[] args) {
        Step1();
        System.out.println();
        Step2();
        System.out.println();
        Step3();
        System.out.println();
        Step4();
    }

    private static void Step1(){
        Shape s1 = new Rectangle(0,0,20,20);
        Point center = s1.getCenter();
        System.out.println(center.print());
        Shape s2 = new Circle(100,100,15);
        System.out.println(s2.getCenter().print());
        if (s1.getCenter().equals(s2.getCenter())){
            System.out.println("Совпадают");
        } else {
            System.out.println("Различаются");
        }
    }

    private static void Step2(){
        Shape s1 = new Rectangle(0,0,20,20);
        System.out.println(s1.getCenter().print());
        Shape s2 = new Circle(100,100,15);
        System.out.println(s2.getCenter().print());
        s1.slide(90,0);
        System.out.println(s1.getCenter().print());
        s2.slide(0,-90);
        System.out.println(s2.getCenter().print());
        if (s1.getCenter().equals(s2.getCenter())){
            System.out.println("Совпадают");
        } else {
            System.out.println("Различаются");
        }
    }

    private static void Step3(){
        Shape[] arr = new Shape[] {
            new Rectangle(0,0,20,20),
            new Circle(100,100,15),
            new Rectangle(13,17,19,23),
            new Circle(73,79,83)
        };
        double areaSum = 0;
        for (int i = 0; i < arr.length; i++){
            areaSum += arr[i].area();
        }
        System.out.printf("%.4f\n", areaSum);
    }

    private static void Step4(){
        Shape r = new Rectangle(0, 0, 10, 10, "blue", "red", 5);
        Shape c = new Circle(50, 50, 40, "green", "yellow", 4);
        System.out.println(r);
        System.out.println(c);
    }
}
