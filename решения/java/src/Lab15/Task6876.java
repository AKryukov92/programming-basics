package Lab15;

import Lab15.task6876.Circle;
import Lab15.task6876.Comparator6876;
import Lab15.task6876.Rectangle;
import Lab15.task6876.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author akryukov
 *         19.07.2017
 */
public class Task6876 {
    public static void main(String[] args) {
        Step1();
        System.out.println();
        Step2();
        System.out.println();
        Step3();
    }

    public static void Step1(){
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(40, 30, 10));
        circles.add(new Circle(50, 80, 20));
        circles.add(new Circle(70, 50, 40));
        Comparator6876 comparator = new Comparator6876();
        circles.sort(comparator);
        System.out.println(Circle.getHeader());
        for(Circle item : circles){
            System.out.println(item);
        }
        System.out.println(Circle.getFooter());
    }

    public static void Step2(){
        Rectangle[] figures = new Rectangle[]{
            new Rectangle(30, 0, 10, 40),
            new Rectangle(50, 10, 30, 10),
            new Rectangle(10, 50, 20, 10),
            new Rectangle(50, 30, 40, 40)
        };
        Arrays.sort(figures, new Comparator6876());
        System.out.println(Rectangle.getHeader());
        for (Rectangle item : figures){
            System.out.println(item);
        }
        System.out.println(Rectangle.getFooter());
    }

    public static void Step3(){
        List<Shape> items = new ArrayList<>();
        items.add(new Circle(20, 30, 10));
        items.add(new Rectangle(40, 20, 10, 30));
        items.add(new Circle(80, 30, 20));
        items.add(new Rectangle(10, 60, 30, 20));
        items.add(new Rectangle(50, 60, 20, 10));
        items.sort(new Comparator6876());
        System.out.println(Shape.getHeader());
        for (Shape item : items){
            System.out.println(item);
        }
        System.out.println(Shape.getFooter());
    }
}
