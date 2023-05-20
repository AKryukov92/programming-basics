package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7396 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Каждая строка исходного файла содержит несколько целых чисел, разделенных символом ';'. Каждую строку нужно преобразовать в массив чисел, а затем найти сумму элементов этого массива.");
        appendCheckValuesHeader("filename");
        appendCheckValuesRowWithFile("files/task7396/test1.txt");
        appendCheckValuesRowWithFile("files/task7396/test2.txt");
        appendCheckValuesRowWithFile("files/task7396/test3.txt");
        appendCheckValuesRowWithFile("files/task7396/test4.txt");
        appendCheckValuesRowWithFile("files/task7396/test5.txt");
        appendCheckValuesRowWithFile("files/task7396/test6.txt");
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
            while (fileReader.hasNext()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    System.out.println("Строка пуста");
                } else {
                    String[] arr = line.split(";");
                    System.out.println("Количество чисел в строке " + arr.length);
                    int i = 0;
                    int sum = 0;
                    while (i < arr.length) {
                        sum = sum + Integer.parseInt(arr[i]);
                        i++;
                    }
                    System.out.println("Их сумма равна " + sum);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7396());
    }
}
