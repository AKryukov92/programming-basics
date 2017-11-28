package Lab14;


import Lab14.task5449.Point;

/**
 * @author akryukov
 *         18.07.2017
 */
public class Task5449example {
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
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        if (a.equals(b)){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
    }

    private static void Step2(){
        Point c = new Point(15, 17);
        Point d = new Point(15, 17);
        if (d == c){
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
    }

    private static void Step3(){
        Point f = new Point(83, 61);
        Point h = f;
        if (f == h){
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
    }

    private static void Step4(){
        Point i = new Point(13, 13);
        if (i.equals(null)){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
    }
    
    private static void Step5(){
        Point j = new Point(59, 59);
        if(j.equals("(59;59)")){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
    }

    private static void Step6(){
        Point k = new Point(1097, 691);
        if(k.equals(k)){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
    }
}
