package root.tasks.collections;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task9990 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Файл с исходными данными содержит фрагменты текста, написанные в столбик без дополнительного оформления. Нужно вывести слова через запятую без повторений. Порядок слов может отличаться.");
        appendCheckValuesHeader("filename");
        appendCheckValuesRowWithFile("files/task9990/test1.txt");
        appendCheckValuesRowWithFile("files/task9990/test2.txt");
        appendCheckValuesRowWithFile("files/task9990/test3.txt");
        appendCheckValuesRowWithFile("files/task9990/test4.txt");
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
                Set<String> result = new HashSet<>();
                while(fileReader.hasNext()){
                    String line = fileReader.next();
                    result.add(line);
                }
                System.out.println(String.join(", ", result));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + target.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task9990());
    }
}
