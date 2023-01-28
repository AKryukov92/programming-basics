package root.tasks.exceptions;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task8733 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Исходный файл содержит целые числа, написаные в столбик без дополнительного оформления. Первое число в файле – количество чисел (N). Оно не участвует в вычислениях. Найти среднее арифметическое только тех чисел, значение которых не превышает 20. Данные в файле написаны в столбик без дополнительного оформления.");
        appendCheckValuesHeader("file");
        appendCheckValuesRowWithFile("files/task8733/test1.txt");
        appendCheckValuesRowWithFile("files/task8733/test2.txt");
        appendCheckValuesRowWithFile("files/task8733/test3.txt");
        appendCheckValuesRowWithFile("files/task8733/test4.txt");
        appendCheckValuesRowWithFile("files/task8733/test5.txt");
        appendCheckValuesRowWithFile("files/task8733/test6.txt");
        appendCheckValuesRowWithFile("files/task8733/test7.txt");
        appendCheckValuesRowWithFile("files/task8733/test8.txt");
        appendCheckValuesRowWithFile("files/task8733/test9.txt");
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
                System.out.println("Общее количество чисел " + i);
                System.out.println("Количество чисел " + count + " их сумма " + sum);
                if (count > 0) {
                    double avg = sum / count;
                    System.out.printf("Среднее арифметическое %.4f", avg);
                } else System.out.print("Среднее арифметическое 0");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + target.getAbsolutePath());
        } catch (java.util.InputMismatchException e){
            System.out.println("Не удалось преобразовать строку в число");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8733());
    }
}
