package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1761 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Первая строка исходного файла содержит наименование агрегатной функции (functionName). Затем идет пустая строка. Остальные строки файла содержат целые числа, написаные в столбик без дополнительного оформления. Количество чисел в файле заранее неизвестно. Вычислить результат агрегатной функции.");
        appendOrdered(
                "sum - сумма",
                "avg - среднее арифметическое",
                "max - максимальное",
                "min - минимальное"
        );
        appendTaskDesc("Результат - целое число с округлением вниз. Ответ вывести по шаблону:");
        appendCheckSingle("$functionName\n" +
                "------------\n" +
                "$result");
        appendCheckValuesHeader("command");
        appendCheckValuesRowWithFile("files/task1761/test1.txt");
        appendCheckValuesRowWithFile("files/task1761/test2.txt");
        appendCheckValuesRowWithFile("files/task1761/test3.txt");
        appendCheckValuesRowWithFile("files/task1761/test4.txt");
        appendCheckValuesRowWithFile("files/task1761/test5.txt");
        appendCheckValuesRowWithFile("files/task1761/test6.txt");
        appendCheckValuesRowWithFile("files/task1761/test7.txt");
        appendCheckValuesRowWithFile("files/task1761/test8.txt");
        appendCheckValuesRowWithFile("files/task1761/test9.txt");
        appendCheckValuesRowWithFile("files/task1761/test10.txt");
        appendCheckValuesRowWithFile("files/task1761/test11.txt");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (!scanner.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                String functionName = scanner.nextLine();
                if (scanner.hasNext()) {
                    scanner.nextLine();

                    if (!scanner.hasNext()) {
                        System.out.println("Отсутствуют данные для вычислений");
                    } else if (functionName.equals("sum")) {
                        int sum = 0;
                        while (scanner.hasNext()) {
                            sum += scanner.nextInt();
                        }
                        System.out.printf("sum\n------------\n%d\n", sum);
                    } else if (functionName.equals("avg")) {
                        int sum = 0;
                        int count = 0;
                        while (scanner.hasNext()) {
                            sum += scanner.nextInt();
                            count++;
                        }
                        int avg = sum / count;
                        System.out.printf("avg\n------------\n%d\n", avg);
                    } else if (functionName.equals("max")) {
                        int max = scanner.nextInt();
                        while (scanner.hasNext()) {
                            int current = scanner.nextInt();
                            if (current > max) {
                                max = current;
                            }
                        }
                        System.out.printf("max\n------------\n%d\n", max);
                    } else if (functionName.equals("min")) {
                        int min = scanner.nextInt();
                        while (scanner.hasNext()) {
                            int current = scanner.nextInt();
                            if (current < min) {
                                min = current;
                            }
                        }
                        System.out.printf("min\n------------\n%d\n", min);
                    } else {
                        System.out.println("Неизвестная функция: " + functionName);
                    }
                } else {
                    System.out.println("После имени функции должна идти пустая строка.");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует " + target.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1761());
    }
}
