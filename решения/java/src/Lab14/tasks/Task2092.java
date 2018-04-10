package Lab14.tasks;

import Lab14.solution.task2092.Interval;

/**
 * @author akryukov
 * 10.04.2018
 */
public class Task2092 {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
        Step5();
        Step6();
    }

    public static void Step1() {
        Interval interval = new Interval();
        interval.a = 0;
        interval.b = 10;
        boolean fact = interval.contains(5);
        if (fact) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    public static void Step2() {
        Interval interval = new Interval();
        interval.a = 100;
        interval.b = 1000;
        if (interval.contains(100)) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    public static void Step3() {
        Interval interval = new Interval();
        interval.a = 13;
        interval.b = 17;
        if (interval.contains(17)) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    public static void Step4() {
        Interval interval = new Interval();
        interval.a = 23;
        interval.b = 29;
        if (interval.contains(0)) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    public static void Step5() {
        Interval interval = new Interval();
        interval.a = 31;
        interval.b = 43;
        if (interval.contains(50)) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    public static void Step6(){
        Interval interval = new Interval();
        interval.a = 100;
        interval.b = 0;
        try {
            interval.contains(10);
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
}
