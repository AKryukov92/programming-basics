import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab13Task7740 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            double x = s.nextDouble();
            double result = x + 7;
            System.out.printf("%.4f", result);
        } catch (InputMismatchException ex){
            System.out.println("Не удалось преобразовать строку в число");
        }
    }
}
