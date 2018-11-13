import java.util.InputMismatchException;
import java.util.Scanner;

/*
Начало работы программы
Введите исходные данные
-3
-7
Результат равен -21.0000
Программа завершена успешно


Начало работы программы
Введите исходные данные
13
15
Подкоренное выражение должно быть неотрицательно


Начало работы программы
Введите исходные данные
a
Не удалось считать число


Начало работы программы
Введите исходные данные
10
b
Не удалось считать число
 */
public class Lab13Task1934 {
    public static void main(String[] args) {
        System.out.println("Начало работы программы");
        try {
            step1934();
            System.out.println("Программа завершена успешно");
        } catch (InputMismatchException ex){
            System.out.println("Не удалось преобразовать строку в число");
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void step1934() {
        System.out.println("Введите значения A и B");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        double result = Methods.task1934(a, b);
        System.out.printf("Результат равен %.4f\n", result);
    }
}
