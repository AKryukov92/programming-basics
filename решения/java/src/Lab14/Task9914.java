package Lab14;

import Lab14.task9914.Interval;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Task9914 {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
        Step5();
        Step6();
        Step7();
    }

    public static void Step1(){
        Interval l = new Interval();
        l.a = 2;
        l.b = 3;
        Interval r = new Interval();
        r.a = 5;
        r.b = 7;
        boolean fact = l.intersects(r);
        if(fact){
            System.out.println("Пересекаются");
        } else {
            System.out.println("Не пересекаются");
        }
    }

    public static void Step2(){
        Interval l = new Interval();
        l.a = 11;
        l.b = 17;
        Interval r = new Interval();
        r.a = 13;
        r.b = 19;
        if(r.intersects(l)){
            System.out.println("Пересекаются");
        } else {
            System.out.println("Не пересекаются");
        }
    }

    public static void Step3(){
        Interval l = new Interval();
        l.a = 5;
        l.b = 15;
        Interval r = new Interval();
        r.a = 0;
        r.b = 30;
        System.out.println(l.intersects(r));
    }

    public static void Step4(){
        Interval l = new Interval();
        l.a = 67;
        l.b = 71;
        Interval r = new Interval();
        r.a = 59;
        r.b = 61;
        System.out.println(l.intersects(r));
    }

    public static void Step5(){
        Interval l = new Interval();
        l.a = 79;
        l.b = 73;
        Interval r = new Interval();
        r.a = 83;
        r.b = 89;
        try {
            if(l.intersects(r)){
                System.out.println("Пересекаются");
            } else {
                System.out.println("Не пересекаются");
            }
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void Step6(){
        Interval l = new Interval();
        l.a = 97;
        l.b = 101;
        Interval r = new Interval();
        r.a = 107;
        r.b = 103;
        try {
            if(l.intersects(r)){
                System.out.println("Пересекаются");
            } else {
                System.out.println("Не пересекаются");
            }
        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void Step7(){
        Interval l = new Interval();
        l.a = 127;
        l.b = 131;
        Interval r = null;
        try {
            if(l.intersects(r)){
                System.out.println("Пересекаются");
            } else {
                System.out.println("Не пересекаются");
            }
        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
