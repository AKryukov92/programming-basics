package Lab14.tasks;

import Lab14.solution.task1953.*;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Task1953 {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
    }

    private static void Step1(){
        Circle c = new Circle(100, 200, 50);
        System.out.println(c);
    }

    private static void Step2(){
        Circle c = new Circle(40, 50, 13);
        System.out.printf("%.4f\n", c.area());
    }

    private static void Step3(){
        Circle c = new Circle(100, 120, 17);
        Interval px = c.getProjectionX();
        Interval py = c.getProjectionY();
        System.out.println(px.print());
        System.out.println(py.print());
    }

    private static void Step4(){
        Circle c = new Circle(100, 120, 31);
        System.out.println(c.getProjectionX().print());
        System.out.println(c.getProjectionY().print());
    }
}
