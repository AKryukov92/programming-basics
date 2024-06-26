package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3148 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Исходные данные находятся в нескольких файлах dataX.csv, где X - целое число. Каждый файл содержит два столбика целых чисел, разделенных символом \";\". При запуске программы нужно обработать только часть файлов. Список файлов для обработки находится в файле listY.txt, где Y - вводится с клавиатуры. Посчитать количество записей, в которых левое число меньше правого для каждого файла в списке, а также общее количество во всех файлах списка. При возникновении ошибки, вывести сообщение, прекратить обработку текущего файла и перейти к обработке следующего в списке.");
        appendCheckValuesHeader("list filename");
        appendCheckValuesRowWithFile("files/task3148/list1.txt");
        appendCheckValuesRowWithFile("files/task3148/list2.txt");
        appendCheckValuesRowWithFile("files/task3148/list3.txt");
        appendCheckValuesRowWithFile("files/task3148/list4.txt");
        appendCheckValuesRowWithFile("files/task3148/list5.txt");
        appendCheckValuesRowWithFile("files/task3148/list6.txt");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Данные в файлах dataX.csv можно посмотреть по этим ссылкам:");
        appendOrderedNonEscaped(
                linkToFile("files/task3148/data0.csv"),
                linkToFile("files/task3148/data1.csv"),
                linkToFile("files/task3148/data2.csv"),
                linkToFile("files/task3148/data3.csv"),
                linkToFile("files/task3148/data4.csv"),
                linkToFile("files/task3148/data5.csv"),
                linkToFile("files/task3148/data6.csv"),
                linkToFile("files/task3148/data7.csv"),
                linkToFile("files/task3148/data8.csv")
        );
        appendFooter();
    }

    @Override
    protected void logic(String filename) throws FileNotFoundException {
        long total = 0;
        File index = new File(filename);
        System.out.println("Обработка списка " + filename);
        if (!index.exists()) {
            System.out.println("ОШИБКА: Список не найден");
        } else {
            Scanner indexScanner = new Scanner(index);
            while (indexScanner.hasNext()) {
                String line = indexScanner.nextLine();
                String dataFilename = "files/task3148/" + line;
                File dataFile = new File(dataFilename);
                System.out.println("Обработка файла " + dataFilename);
                long count = 0;
                if (!dataFile.exists()) {
                    System.out.println("ОШИБКА: Файл данных не найден " + dataFile.getAbsolutePath());
                } else {
                    Scanner dataScanner = new Scanner(dataFile);
                    while (dataScanner.hasNext()) {
                        String row = dataScanner.nextLine();
                        String[] arr = row.split(";");
                        if (arr.length != 2) {
                            System.out.println("ОШИБКА: В строке должно быть 2 числа. Найдено " + arr.length);
                            count = 0;
                            break;
                        }
                        int left = Integer.parseInt(arr[0]);
                        int right = Integer.parseInt(arr[1]);
                        if (left < right) {
                            count++;
                        }
                    }
                    total += count;
                    System.out.println("Количество подходящих записей в файле: " + count);
                }
                System.out.println("Общее количество подходящих записей: " + total);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3148());
    }
}
