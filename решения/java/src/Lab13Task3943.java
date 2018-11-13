import java.util.InputMismatchException;
import java.util.Scanner;

/*
Начало работы программы
Введите исходные данные
-5
81
Результат равен -10.0000
Конец работы программы


Начало работы программы
Введите исходные данные
7507
7499
Результат равен -435.7062
Конец работы программы


Начало работы программы
Введите исходные данные
7489
-7487
Не удалось вычислить результат
Подкоренное выражение должно быть неотрицательно
Конец работы программы


Начало работы программы
Введите исходные данные
-7481
7477
Не удалось вычислить результат
Подкоренное выражение должно быть неотрицательно
Конец работы программы


Начало работы программы
Введите исходные данные
x
Не удалось считать число
Конец работы программы


Начало работы программы
Введите исходные данные
0
y
Не удалось считать число
Конец работы программы
 */
public class Lab13Task3943 {
    public static void main(String[] args) {
        System.out.println("Начало работы программы");
        step3943();
        System.out.println("Конец работы программы");
    }

    public static void step3943() {
        System.out.println("Введите значения x и y");
        Scanner s = new Scanner(System.in);
        try {
            int x = s.nextInt();
            int y = s.nextInt();
            double result = Methods.task3943(x, y);
            System.out.printf("Результат равен %.4f\n", result);
        } catch (IllegalArgumentException ex) {
            System.out.println("Не удалось вычислить результат");
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Не удалось преобразовать строку в число");
        }
    }
}
