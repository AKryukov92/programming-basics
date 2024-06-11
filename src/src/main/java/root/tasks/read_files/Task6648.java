package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Task6648 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Смоделируйте работу стека без ограничения по количеству хранимых элементов");
        appendTaskDescEscaped("В файле записаны слова 'push' и 'pop'. На следующей строке за 'push' находится . Это значение нужно записать в массив. Самое первое значение записывается на индекс 0. Изначальный размер массива равен 10. С каждым введенным элементом, индекс записи увеличивается на 1. Если пользователь ввел 'pop', то индекс записи уменьшается на 1. При попытке записи элемента на индекс, отсутствующий в массиве, нужно создать новый массив вдвое большего размера, переписать элементы из старого в новый, и далее использовать новый массив для записи.");
        appendCheckValuesHeader("filename");
        appendCheckValuesRowWithFile("files/task6648/test1.txt");
        appendCheckValuesRowWithFile("files/task6648/test2.txt");
        appendCheckValuesRowWithFile("files/task6648/test3.txt");
        appendCheckValuesRowWithFile("files/task6648/test4.txt");
        appendCheckValuesRowWithFile("files/task6648/test5.txt");
        appendCheckValuesRowWithFile("files/task6648/test6.txt");
        appendCheckValuesRowWithFile("files/task6648/test7.txt");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String filename) {
        File target = new File(filename);
        try (Scanner s = new Scanner(target)) {
            String[] arr = new String[10];
            int index = 0;
            while (s.hasNext()) {
                String cmd = s.next();
                if (cmd.equals("push") && arr.length - 1 == index) {
                    String[] arr2 = new String[arr.length * 2];
                    System.arraycopy(arr, 0, arr2, 0, arr.length);
                    arr = arr2;
                    System.out.println("ПЕРЕПОЛНЕНИЕ. Размер нового массива " + arr2.length);
                }
                if (cmd.equals("push")) {
                    String value = s.next();
                    arr[index] = value;
                    index++;
                } else if (cmd.equals("pop")) {
                    if (index <= 0) {
                        System.out.println("Массив пуст");
                        return;
                    }
                    index--;
                }
            }
            System.out.println("Размер итогового массива равен " + arr.length);
            System.out.println("В нем находится " + index + " значений.");
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + target.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6648());
    }

    public static void generate() {
        Random rnd = new Random();
        int i = 0;
        int depth = 0;
        while (i < 10000) {
            int cmd = rnd.nextInt(5);
            if (cmd < 3 || depth == 0) {
                System.out.println("push");
                int value = 100 + rnd.nextInt(899);
                System.out.println(value);
                depth++;
            }
            else {
                System.out.println("pop");
                depth--;
            }
            i++;
        }
    }
}
