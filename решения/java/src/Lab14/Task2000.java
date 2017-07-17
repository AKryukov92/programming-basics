package Lab14;

import Lab14.task2000.Interval;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Task2000 {
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
        System.out.println();
        Step7();
    }

    private static void Step1(){
        try {
            Interval range = new Interval(23,29);
            System.out.println("Интервал инициализирован");
            System.out.println(range.print());
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Step2(){
        try {
            Interval range = new Interval(41,29);
            System.out.println("Интервал инициализирован");
            System.out.println(range.print());
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Step3(){
        try {
            Interval range = new Interval(5, 11);
            System.out.println("Интервал инициализирован");
            range.slide(7);
            System.out.println("Интервал успешно изменен");
            System.out.println(range.print());
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Step4(){
        try {
            Interval range = new Interval(41,29);
            System.out.println("Интервал инициализирован");
            range.slide(20);
            System.out.println("Интервал успешно изменен");
            System.out.println(range.print());
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Step5(){
        try {
            Interval range = new Interval(211,223);
            range.squeeze(23);
            System.out.println("Интервал успешно изменен");
            System.out.println(range.print());
        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Step6(){
        try {
            Interval range = new Interval(13,151);
            range.squeeze(41);
            System.out.println("Интервал успешно изменен");
            System.out.println(range.print());
        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Step7(){
        try {
            Interval range = new Interval(13, 151);
            System.out.println("Длина интервала: " + range.length());
            range.squeeze(41);
            System.out.println("Интервал успешно изменен");
            System.out.println("Длина интервала: " + range.length());
            System.out.println(range.print());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
