package Lab15;

import Lab15.task7186.Comparator7186;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Александр on 18.07.2017.
 */
public class Task7186 {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
        Step5();
    }

    public static void Step1(){
        Comparator7186 comparator7186 = new Comparator7186(100);
        int result = comparator7186.compare(99, 1);
        System.out.println(result);
    }

    public static void Step2(){
        Comparator7186 comparator7186 = new Comparator7186(47);
        int result = comparator7186.compare(9, 57);
        System.out.println(result);
    }

    public static void Step3(){
        Comparator7186 comparator0000 = new Comparator7186(100);
        Integer[] arr = new Integer[]{50, 60, 70, 80, 90, 99, 109, 118, 127, 136};
        Arrays.sort(arr, comparator0000);
        for (Integer item : arr) {
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void Step4(){
        Comparator7186 comparator7186 = new Comparator7186(-50);
        List<Integer> values = Arrays.asList(-49, -55, -60, -60, 15, -28, 22, -16,
                4, 61, 74, -39, -55, -14, -12, 66, 80, -47, 1, -65);
        values.sort(comparator7186);
        System.out.println(values);
    }

    private static void Step5() {
        Comparator7186 c1 = new Comparator7186(8);
        Comparator7186 c2 = new Comparator7186(11);
        List<Integer> values = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        values.sort(c1);
        for(Integer item : values){
            System.out.print(item);
            System.out.print("\t");
        }
        System.out.println();
        values.sort(c2);
        for(Integer item : values){
            System.out.print(item);
            System.out.print("\t");
        }
        System.out.println();
    }
}
