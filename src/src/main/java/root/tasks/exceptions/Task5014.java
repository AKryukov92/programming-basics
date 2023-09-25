package root.tasks.exceptions;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5014 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Файл с исходными данными содержит целые числа, написанные в столбик без дополнительного оформления. Нужно вывести числа из файла в строчку через запятую. Перед первым и после последнего числа запятой быть не должно. Перехватить сгенерированные исключения и вывести указанное сообщение об ошибке.");
        appendCheckValuesHeader("file");
        appendCheckValuesRowWithFile("files/task5014/test1.txt");
        appendCheckValuesRowWithFile("files/task5014/test2.txt");
        appendCheckValuesRowWithFile("files/task5014/test3.txt");
        appendCheckValuesRowWithFile("files/task5014/test4.txt");
        appendCheckValuesRowWithFile("files/task5014/test5.txt");
        appendCheckValuesRowWithFile("files/task5014/test6.txt");
        appendCheckValuesFooter();
        appendFooter();
    }

    protected void logic(String filename) {
        File target = new File(filename);
        try (Scanner fileReader = new Scanner(target)) {
            if (!fileReader.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                int current = fileReader.nextInt();
                System.out.print(current);
                while (fileReader.hasNext()) {
                    current = fileReader.nextInt();
                    System.out.print(", " + current);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + target.getAbsolutePath());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Не удалось преобразовать строку в число");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5014());
    }
}
