package Lab14.tasks;

import Lab14.solution.task9713.Interval;

/**
 * @author akryukov
 *         15.08.2017
 */
public class Task9713 {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
    }

    public static void Step1()
    {
        Interval range = new Interval();
        range.a = 829;
        range.b = 857;
        System.out.println(range);
    }

    public static void Step2()
    {
        Interval range = new Interval();
        range.a = 593;
        range.b = 607;
        System.out.println(range);
    }

    public static void Step3()
    {
        Interval left = new Interval();
        left.a = 0;
        left.b = 15;
        Interval right = new Interval();
        right.a = 10;
        right.b = 20;
        String result;
        if (left.intersects(right))
        {
            result = "пересекается";
        }
        else
        {
            result = "не пересекается";
        }
        System.out.printf("Интервал %s %s с интервалом %s\n", left, result, right);
    }

    public static void Step4()
    {
        Interval left = new Interval(), right = new Interval();
        left.a = 100;
        left.b = 200;
        right.a = 400;
        right.b = 300;
        String layout;
        if (left.intersects(right))
        {
            layout = "Интервал %s пересекается с интервалом %s\n";
        }
        else
        {
            layout = "Интервал %s не пересекается с интервалом %s\n";
        }
        System.out.printf(layout, left, right);
    }
}
