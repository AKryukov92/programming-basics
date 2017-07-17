package Lab14;


import Lab14.task2401.Interval;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Task2401 {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
    }

    private static void Step1(){
        Interval range = new Interval();
        range.a = 31;
        range.b = 37;
        try {
            range.squeeze(2);
            System.out.println("Интервал успешно изменен");
            System.out.println(range.print());
        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Step2(){
        Interval range = new Interval();
        range.a = 41;
        range.b = 43;
        try {
            range.squeeze(19);
            System.out.println("Интервал успешно изменен");
            System.out.println(range.print());
        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Step3(){
        Interval range = new Interval();
        range.a = 101;
        range.b = 67;
        try {
            range.squeeze(23);
            System.out.println("Интервал успешно изменен");
            System.out.println(range.print());
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Step4(){
        Interval range = new Interval();
        range.a = 11;
        range.b = 107;
        try {
            range.squeeze(17);
            System.out.println("Интервал успешно изменен");
            range.b = 7;
            System.out.println(range.print());
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }
    }
}
