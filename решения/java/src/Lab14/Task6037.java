package Lab14;

import Lab14.task6037.Interval;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Task6037 {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
    }

    public static void Step1(){
        Interval l = new Interval();
        l.a = 2;
        l.b = 3;
        Interval r = new Interval();
        r.a = 5;
        r.b = 7;
        boolean found = Interval.hasIntersection(l,r);
        if(found){
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
        if(Interval.hasIntersection(l,r)){
            System.out.println("Пересекаются");
        } else {
            System.out.println("Не пересекаются");
        }
    }

    public static void Step3(){
        Interval l = new Interval();
        l.a = 79;
        l.b = 73;
        Interval r = new Interval();
        r.a = 83;
        r.b = 89;
        try {
            if(Interval.hasIntersection(l,r)){
                System.out.println("Пересекаются");
            } else {
                System.out.println("Не пересекаются");
            }
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void Step4(){
        Interval l = new Interval();
        l.a = 97;
        l.b = 101;
        Interval r = new Interval();
        r.a = 107;
        r.b = 103;
        try {
            boolean found = Interval.hasIntersection(l,r);
            if(found){
                System.out.println("Пересекаются");
            } else {
                System.out.println("Не пересекаются");
            }
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }
    }
}
