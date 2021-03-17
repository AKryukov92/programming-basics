package root.tasks.read_files;

import root.tasks.TwoInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4954 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Исходный файл содержит слова, написаные в столбик без дополнительного оформления. Количество слов в файле заранее неизвестно. Пользователь вводит фрагмент текста (substring). Определить, сколько раз встречаются слова, содержащие введенный фрагмент.");
        appendCheckValuesHeader("substring", "ссылка на файл");
        appendCheckValuesRowWithFile("а", "files/task4954/test1.txt");
        appendCheckValuesRowWithFile("ц", "files/task4954/test2.txt");
        appendCheckValuesRowWithFile("н", "files/task4954/test3.txt");
        appendCheckValuesRowWithFile("ч", "files/task4954/test4.txt");
        appendCheckValuesRowWithFile("п", "files/task4954/test5.txt");
        appendCheckValuesRowWithFile("бу", "files/task4954/test6.txt");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value, String file) {
        File target = new File(file);
        try (Scanner scanner = new Scanner(target)) {
            int count = 0;
            while (scanner.hasNext()) {
                if (scanner.nextLine().contains(value)) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4954().getContent());
    }
}
