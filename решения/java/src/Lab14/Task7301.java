package Lab14;


import Lab14.task7301example.Point;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Task7301 {
    public static void main(String[] args) {
        Step1();
        Step2();
        Step3();
        Step4();
        Step5();
        Step6();
        Step7();
    }

    private static void Step1(){
        Point p = new Point(53, 59);
        System.out.println(p.print());
    }

    private static void Step2(){
        Point p1 = new Point(53, 59);
        Point p2 = new Point(61,67);
        double distance = p1.distanceTo(p2);
        System.out.printf("Расстояние между %s и %s составляет %.4f\n",
            p1, p2, distance);
    }

    private static void Step3(){
        double distance = new Point(79, 83).distanceTo(new Point(89, 97));
        System.out.printf("%.4f\n", distance);
    }

    private static void Step4(){
        Point p = new Point(71, 73);
        System.out.printf("Расстояние между %s и (0;0) составляет %.4f\n",
            p, p.distanceTo(0, 0));
    }

    private static void Step5(){
        System.out.printf("%.4f\n", new Point(79, 83)
            .distanceTo(new Point(89, 97)));
    }

    private static void Step6(){
        double dist = Point.distanceBetween(
            new Point(151, 157),
            new Point(163, 167));
        System.out.printf("%.4f\n", dist);
    }

    private static void Step7(){
        System.out.printf("%.4f\n", Point.distanceBetween(
            new Point(173, 179),
            new Point(181, 191)));
    }
}
