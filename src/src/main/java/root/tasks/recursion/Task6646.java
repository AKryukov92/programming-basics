package root.tasks.recursion;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6646 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь указывает путь к папке. Нужно реализовать подсчет суммы чисел во всех вложенных файлах и папках. В папке может быть несколько файлов. Каждый файл содержит неизвестное количество целых чисел. Пустые файлы нужно пропустить. Подсчитывать только сумму корректных целых чисел. Некорректные значения нужно пропустить, не прекращая работу программы.");
        appendCheckValuesHeader("path");
        appendCheckValuesRowWithFile("files/task6646/test1");
        appendCheckValuesRowWithFile("files/task6646/test2");
        appendCheckValuesRowWithFile("files/task6646/test3");
        appendCheckValuesRowWithFile("files/task6646/test4");
        appendCheckValuesRowWithFile("files/task6646/test5");
        appendCheckValuesRowWithFile("files/task6646/test1");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String filename) {
        File target = new File(filename);
        sumOfContent(target);
    }

    private int sumOfContent(File target) {
        if (!target.exists()) {
            System.out.println("Путь не существует " + target.getAbsolutePath());
            return 0;
        }
        if (target.isDirectory()) {
            System.out.println("Это папка " + target.getAbsolutePath());
            File[] files = target.listFiles();
            int sum = 0;
            if (files != null) {
                for (File file : files) {
                    sum = sum + sumOfContent(file);
                }
            }
            System.out.println("Сумма в папке " + sum + " " + target.getAbsolutePath());
            return sum;
        } else {
            System.out.println("Это файл " + target.getAbsolutePath());
            int sum = 0;
            try (Scanner fileReader = new Scanner(target)) {
                while (fileReader.hasNext()) {
                    String value = fileReader.nextLine();
                    try {
                        sum = sum + Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        System.out.println("Запись содержит не число " + value);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден " + target.getAbsolutePath());
            }
            System.out.println("Сумма в файле " + sum);
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6646());
    }
}
