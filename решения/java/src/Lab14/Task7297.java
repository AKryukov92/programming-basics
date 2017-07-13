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
    }

    public static void Step1(){
        Interval l = new Interval();
        l.a = 11;
        l.b = 17;
        if(l.contains(0)){
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
        if(l.contains(15)){
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
        if(l.contains(20)){
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    public static void Step2(){
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
