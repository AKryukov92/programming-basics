package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4488 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Исходный файл содержит множество записей, написанных в столбик без дополнительного оформления. Посчитать количество записей в файле, исключая первую запись. Вывести первую запись и количество остальных записей.");
        appendCheckValuesHeader("filename");
        appendCheckValuesRowWithFile("files/task4488/test1.txt");
        appendCheckValuesRowWithFile("files/task4488/test2.txt");
        appendCheckValuesRowWithFile("files/task4488/test3.txt");
        appendCheckValuesRowWithFile("files/task4488/test4.txt");
        appendCheckValuesRowWithFile("files/task4488/test5.txt");
        appendCheckValuesRowWithFile("files/task4488/test6.txt");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("Файл не существует " + file.getAbsolutePath());
            return;
        }
        try {
            Scanner fileReader = new Scanner(file);
            if (!fileReader.hasNext()) {
                System.out.println("Файл пуст");
                return;
            }
            String line = fileReader.nextLine();
            int count = 0;
            while (fileReader.hasNext()) {
                fileReader.nextLine();
                count++;
            }
            System.out.println(line + " " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4488());
    }
}
