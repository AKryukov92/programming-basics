package Lab15.example;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Task3956 {

    public static void main(String[] args) {
        Step1();
        System.out.println();
        Step2();
        System.out.println();
        Step3();
        System.out.println();
        Step4();
    }

    private static void Step1(){
        Lab15.task3956example.Shape s1 = new Lab15.task3956example.Rectangle(0,0,20,20);
        Lab15.task3956example.Point center = s1.getCenter();
        System.out.println(center.print());
        Lab15.task3956example.Shape s2 = new Lab15.task3956example.Circle(100,100,15);
        System.out.println(s2.getCenter().print());
        if (s1.getCenter().equals(s2.getCenter())){
            System.out.println("Совпадают");
        } else {
            System.out.println("Различаются");
        }
    }

    private static void Step2(){
        Lab15.task3956example.Shape s1 = new Lab15.task3956example.Rectangle(0,0,20,20);
        System.out.println(s1.getCenter().print());
        Lab15.task3956example.Shape s2 = new Lab15.task3956example.Circle(100,100,15);
        System.out.println(s2.getCenter().print());
        s1.slide(90,0);
        System.out.println(s1.getCenter().print());
        s2.slide(0,-90);
        System.out.println(s2.getCenter().print());
        if (s1.getCenter().equals(s2.getCenter())){
            System.out.println("Совпадают");
        } else {
            System.out.println("Различаются");
        }
    }

    private static void Step3(){
        Lab15.task3956example.Shape[] arr = new Lab15.task3956example.Shape[] {
            new Lab15.task3956example.Rectangle(0,0,20,20),
            new Lab15.task3956example.Circle(100,100,15),
            new Lab15.task3956example.Rectangle(13,17,19,23),
            new Lab15.task3956example.Circle(73,79,83)
        };
        double areaSum = 0;
        for (int i = 0; i < arr.length; i++){
            areaSum += arr[i].area();
        }
        System.out.printf("%.4f\n", areaSum);
    }

    private static void Step4(){
        Lab15.task3956example.Shape r = new Lab15.task3956example.Rectangle(0, 0, 10, 10, "blue", "red", 5);
        Lab15.task3956example.Shape c = new Lab15.task3956example.Circle(50, 50, 40, "green", "yellow", 4);
        System.out.println(r);
        System.out.println(c);
    }
}
