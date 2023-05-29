package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5236 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Файл с исходными данными содержит целые числа, написанные в столбик без дополнительного оформления. Нужно прочитать все числа. К каждому числу прибавить 7 и вывести на экран в столбик.");
        appendCheckValuesHeader("filename");
        appendCheckValuesRowWithFile("files/task5236/test1.txt");
        appendCheckValuesRowWithFile("files/task5236/test2.txt");
        appendCheckValuesRowWithFile("files/task5236/test3.txt");
        appendCheckValuesRowWithFile("files/task5236/test4.txt");
        appendCheckValuesRowWithFile("files/task5236/test5.txt");
        appendCheckValuesRowWithFile("files/task5236/test6.txt");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String filename) {
        File file = new File(filename);
        //если файл не существует
        if (!file.exists()) {
            //сообщить полный путь
            System.out.println("Файл не существует " + file.getAbsolutePath());
            return;
        }
        //читаем не из консоли, а из файла
        try {
            Scanner fileReader = new Scanner(file);
            if (!fileReader.hasNext()) {
                System.out.println("Файл пуст");
                return;
            }
            //если есть что читать
            while (fileReader.hasNext()) {
                //прочитать строку из файла
                int value = Integer.parseInt(fileReader.nextLine());
                int result = value + 7;
                System.out.println("К числу " + value + " прибавили 7, получилось " + result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5236());
    }
}
