package Lab15;

import Lab15.task1457.Comparator1457;
import Lab15.task1457.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 18.07.2017.
 */
public class Task1457 {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(6, 1));
        points.add(new Point(1, 2));
        points.add(new Point(3, 2));
        points.add(new Point(7, 3));
        points.add(new Point(5, 4));
        points.add(new Point(2, 5));
        points.add(new Point(3, 7));
        points.add(new Point(8, 7));
        Step1(points);
        Step2(points);
        Step3(points);
        Step4();
        Step5();
        points.add(null);
        Step6(points);
    }

    public static void Step1(List<Point> points) {
        System.out.println();
        System.out.println("step1");
        Point target = new Point(0, 0);
        Comparator1457 comparator1457 = new Comparator1457(target);
        points.sort(comparator1457);
        System.out.println("Целевая точка " + target);
        for (Point p : points) {
            System.out.printf("%s %.4f\n", p, target.distanceTo(p));
        }
        System.out.println("Произведено " + comparator1457.getCount() + " сравнений");
    }

    public static void Step2(List<Point> points) {
        System.out.println();
        System.out.println("step2");
        Comparator1457 comparator1457 = new Comparator1457(new Point(5, 5));
        points.sort(comparator1457);
        System.out.println("Целевая точка " + comparator1457.getTarget());
        for (Point p : points) {
            System.out.printf("%s %.4f\n", p, comparator1457.getTarget().distanceTo(p));
        }
        System.out.println("Произведено " + comparator1457.getCount() + " сравнений");
    }

    public static void Step3(List<Point> points) {
        System.out.println();
        System.out.println("step3");
        try {
            Comparator1457 comparator1457 = new Comparator1457(null);
            points.sort(comparator1457);
            for (Point p : points) {
                System.out.printf("%s %.4f\n", p, comparator1457.getTarget().distanceTo(p));
            }
            System.out.println("Произведено " + comparator1457.getCount() + " сравнений");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void Step4(){
        try {
            System.out.println();
            System.out.println("step4");
            Comparator1457 comparator1457 = new Comparator1457(new Point(0, 0));
            int result = comparator1457.compare(new Point(1,1), null);
            System.out.println(result);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void Step5(){
        try {
            System.out.println();
            System.out.println("step5");
            Comparator1457 comparator1457 = new Comparator1457(new Point(0, 0));
            int result = comparator1457.compare(null, new Point(1,1));
            System.out.println(result);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void Step6(List<Point> points) {
        try {
            System.out.println();
            System.out.println("step6");
            points.sort(new Comparator1457(new Point(0, 0)));
            for (Point p : points) {
                System.out.println(p);
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}