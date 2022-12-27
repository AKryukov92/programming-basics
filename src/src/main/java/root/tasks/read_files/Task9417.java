package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task9417 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Исходные данные находятся в нескольких файлах dataX.txt, где X - число от 0 до 10 включительно. Каждый файл содержит неизвестное количество целых чисел, записанных в столбик без дополнительного оформления. Посчитать сумму чисел в каждом файле, а также общую сумму. При возникновении ошибки, вывести сообщение, прекратить обработку текущего файла и перейти к обработке следующего.");
        appendCheckSingle(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        long total = 0;
        for (int i = 0; i <= 10; i++) {
            String filename = String.format("files/task9417/data%d.txt", i);
            File target = new File(filename);
            System.out.println("Обработка файла " + filename);
            try (Scanner scanner = new Scanner(target)) {
                long sum = 0;
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    int number = Integer.parseInt(line);
                    sum += number;
                }
                total += sum;
                System.out.println("Сумма в файле: " + sum);
            } catch (FileNotFoundException e) {
                System.out.println("ОШИБКА: Файл не найден");
            } catch (NumberFormatException e) {
                System.out.println("ОШИБКА: Не удалось преобразовать число");
            }
        }
        System.out.println("Общая сумма: " + total);
    }

    public static void main(String[] args) {
        System.out.println(new Task9417());
    }
}
