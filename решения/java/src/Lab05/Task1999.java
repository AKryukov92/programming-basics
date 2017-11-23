package Lab05;

import java.util.Scanner;

/**
 * Created by Александр on 23.11.2017.
 */
public class Task1999 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = s.nextDouble();
        System.out.println("Введите y:");
        double y = s.nextDouble();
        if (x <= -2){
            if (y >= 1){
                System.out.println("Выполняется");
            } else {
                System.out.println("Не выполняется");
            }
        } else {
            if (y >= 1){
                System.out.println("Не выполняется");
            } else {
                System.out.println("Выполняется");
            }
        }
    }
}
