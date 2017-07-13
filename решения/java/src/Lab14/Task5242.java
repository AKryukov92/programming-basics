package Lab14;

import Lab14.task5242.Interval;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Task5242 {
    public static void main(String[] args) {
        Step1();
        Step2();
    }

    private static void Step1(){
        Interval range = new Interval();
        range.a = 23;
        range.b = 29;
        System.out.println(range.print());
    }

    private static void Step2(){
        Interval range = new Interval();
        range.a = 31;
        range.b = 29;
        try {
            System.out.println(range.print());
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }
    }
}
