package root.tasks.exceptions;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5101 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Исходный файл содержит целые числа, написаные в столбик без дополнительного оформления. Первое число в файле – количество чисел (N). Посчитать количество чисел в файле (C), исключая первое число. Проверить, равны ли числа N и C. Перехватить сгенерированные исключения и вывести указанное сообщение об ошибке.");
        appendCheckValuesHeader("file");
        appendCheckValuesRowWithFile("files/task5101/test1.txt");
        appendCheckValuesRowWithFile("files/task5101/test2.txt");
        appendCheckValuesRowWithFile("files/task5101/test3.txt");
        appendCheckValuesRowWithFile("files/task5101/test4.txt");
        appendCheckValuesRowWithFile("files/task5101/test5.txt");
        appendCheckValuesRowWithFile("files/task5101/test6.txt");
        appendCheckValuesRowWithFile("files/task5101/test7.txt");
        appendCheckValuesRowWithFile("files/task5101/test8.txt");
        appendCheckValuesRowWithFile("files/task5101/test9.txt");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String filename) {
        File target = new File(filename);
        try (Scanner fileReader = new Scanner(target)) {
            if (!fileReader.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                int n = fileReader.nextInt();
                int i = 0;
                double sum = 0;
                int count = 0;
                while (i < n) {
                    if (!fileReader.hasNext()) {
                        System.out.println("Заявленое количество " + n + ", фактическое количество " + i);
                        return;
                    }
                    double current = fileReader.nextDouble();
                    if (current < 20) {
                        sum += current;
                        count++;
                    }
                    i++;
                }
                while (fileReader.hasNext()) {
                    fileReader.nextDouble();
                    i++;
                }
                if (i > n) {
                    System.out.println("Заявленое количество " + n + ", фактическое количество " + i);
                    return;
                }
                System.out.println("Заявленное и фактическое количество чисел совпадает и равно " + count);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + target.getAbsolutePath());
        } catch (java.util.InputMismatchException e){
            System.out.println("Не удалось преобразовать строку в число");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5101());
    }
}
