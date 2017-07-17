package Lab14;

import Lab14.task1379.Interval;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Task1379 {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
    }

    private static void Step1(){
        Interval range = new Interval();
        range.a = 5;
        range.b = 11;
        range.slide(7);
        System.out.println("Интервал успешно изменен");
        System.out.println(range.print());
    }

    private static void Step2(){
        Interval range = new Interval();
        range.a = 17;
        range.b = 29;
        range.slide(-4);
        System.out.println("Интервал успешно изменен");
        System.out.println(range.print());
    }

    private static void Step3(){
        Interval range = new Interval();
        range.a = 37;
        range.b = 31;
        try {
            range.slide(2);
            System.out.println("Интервал успешно изменен");
            System.out.println(range.print());
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Step4(){
        Interval range = new Interval();
        range.a = 41;
        range.b = 47;
        try {
            range.slide(-5);
            System.out.println("Интервал успешно изменен");
            range.a = 53;
            System.out.println(range.print());
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }
    }
}
