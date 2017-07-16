package Lab14;

import Lab14.task7297.Interval;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Task7297 {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
    }

    public static void Step1(){
        Interval l = new Interval();
        l.a = 11;
        l.b = 17;
        boolean fact = l.contains(0);
        if(fact){
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    public static void Step2(){
        Interval interval = new Interval();
        interval.a = 31;
        interval.b = 37;
        if(interval.contains(35)){
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    public static void Step3(){
        Interval i = new Interval();
        i.a = 41;
        i.b = 43;
        System.out.println(i.contains(50));
    }

    public static void Step4(){
        Interval range = new Interval();
        range.a = 19;
        range.b = 17;
        try {
            if(range.contains(18)){
                System.out.println("Содержит");
            } else {
                System.out.println("Не содержит");
            }
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }
    }
}
