package Lab05;

import java.util.Scanner;

/**
 * Created by Александр on 23.11.2017.
 */
public class Task7088 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = s.nextDouble();
        System.out.println("Введите y:");
        double y = s.nextDouble();
        if (2 <= x && 0 <= y) {
            System.out.println("Выполняется");
        } else if (1 <= x && y <= -1) {
            System.out.println("Выполняется");
        } else {
            System.out.println("Не выполняется");
        }
    }
}
