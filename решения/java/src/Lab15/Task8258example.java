package Lab15;

import Lab15.task8258example.Comparator8258;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author akryukov
 *         18.07.2017
 */
public class Task8258example {
    //Отсортировать в порядке удаления от числа 6
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
        Step5();
    }

    public static void Step1(){
        Comparator8258 comparator8258 = new Comparator8258();
        int result = comparator8258.compare(5, 10);
        System.out.println(result);
    }

    public static void Step2(){
        Comparator8258 comparator8258 = new Comparator8258();
        int result = comparator8258.compare(1000, 3);
        System.out.println(result);
    }

    public static void Step3(){
        Comparator8258 comparator8258 = new Comparator8258();
        int result = comparator8258.compare(17, -5);
        System.out.println(result);
    }

    public static void Step4(){
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(10);
        integers.add(3);
        integers.add(7);
        Comparator8258 comparator8258 = new Comparator8258();
        integers.sort(comparator8258);
        System.out.println(integers);
    }

    public static void Step5(){
        List<Integer> integers = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Comparator8258 comparator8258 = new Comparator8258();
        integers.sort(comparator8258);
        System.out.println(integers);
    }
}
