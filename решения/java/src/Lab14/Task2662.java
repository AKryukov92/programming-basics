package Lab14;

import Lab14.task2662.Interval;

/**
 * @author akryukov
 *         18.07.2017
 */
public class Task2662 {
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
        Interval i1 = new Interval(0, 15);
        Interval i2 = new Interval(15, 30);
        if (i1.equals(i2)){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
    }

    private static void Step2(){
        Interval i1 = new Interval(10, 20);
        Interval i2 = i1;
        if (i1 == i2){
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
    }

    private static void Step3(){
        Interval i1 = new Interval(50, 100);
        Interval i2 = new Interval(50, 100);
        if (i1 == i2){
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
    }

    private static void Step4(){
        Interval i = new Interval(13, 17);
        if(i.equals(i)){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
    }

    private static void Step5(){
        Interval i = new Interval(40, 73);
        if (i.equals(null)){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
    }

    private static void Step6(){
        Interval interval = new Interval(0, 1);
        if(interval.equals(Math.PI)){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
    }
}
