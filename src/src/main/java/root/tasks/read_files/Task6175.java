package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6175 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Исходный файл содержит записи, написанные в столбик без дополнительного оформления. Нужно вывести записи из файла в столбик.");
        appendCheckValuesHeader("filename");
        appendCheckValuesRowWithFile("files/task6175/test1.txt");
        appendCheckValuesRowWithFile("files/task6175/test2.txt");
        appendCheckValuesRowWithFile("files/task6175/test3.txt");
        appendCheckValuesRowWithFile("files/task6175/test4.txt");
        appendCheckValuesRowWithFile("files/task6175/test5.txt");
        appendCheckValuesRowWithFile("files/task6175/test6.txt");
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
            String line;
            //если есть что читать
            while (fileReader.hasNext()) {
                //прочитать строку из файла
                line = fileReader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6175());
    }
}
