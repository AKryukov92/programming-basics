import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Александр on 06.04.2017.
 */
public class Lab09 {
    public static void main(String[] args) {
        step9092();
    }

    public static void step9092() {
        System.out.println("9092");
        task9092(".\\task9092\\test1.csv");
        task9092(".\\task9092\\test2.csv");
        task9092(".\\task9092\\test3.csv");
        task9092(".\\task9092\\test4.csv");
        task9092(".\\task9092\\test5.csv");
        task9092(".\\task9092\\test6.csv");
    }

    public static void step5537() {
        System.out.println("5537");
        String[] out5537 = {
                "Файл пуст",
                "3",
                "569",
                "253",
                "Запись 'Опять, как в годы золотые,' длиннее четырех символов",
                "Файл не существует E:\\tfa\\решения\\java\\.\\task5537\\test6.txt",
                "Запись 'шъх' короче четырех символов"
        };
        for (int i = 0; i < out5537.length; i++) {
            System.out.println("-->" + out5537[i] + "<--");
            task5537(".\\task5537\\test" + (i + 1) + ".txt");
        }
    }

    public static void call() {
        System.out.println();
        System.out.println("4642");
        String[] out4642 = {
                "7",
                "10",
                "933",
                "Файл не существует",
                "Файл пуст"
        };
        for (int i = 0; i < out4642.length; i++) {
            System.out.println("-->" + out4642[i] + "<--");
            task4642(".\\task4642\\test" + (i + 1) + ".txt");
        }
        System.out.println();
        System.out.println("6882");
        String[] out6882 = {
                "0",
                "0",
                "5",
                "1023",
                "Не удается считать число",
                "Не удается считать число",
                "Файл пуст",
                "Файл не существует",
                "Не удается считать число",
                "-15"
        };
        for (int i = 0; i < out6882.length; i++) {
            System.out.println("-->" + out6882[i] + "<--");
            task6882(".\\task6882\\test" + (i + 1) + ".txt");
        }
        System.out.println();
        System.out.println();
        System.out.println("6431");
        String[] out6431 = {
                "875",
                "129276",
                "Файл не существует",
                "Файл пуст",
                "3691856",
                "Некорректный формат данных",
                "Файл не существует",
                "Не удается считать число",
                "Не удается считать число"
        };
        for (int i = 0; i < out6431.length; i++) {
            System.out.println("-->" + out6431[i] + "<--");
            task6431(".\\task6431\\test" + (i + 1) + ".csv");
        }
        System.out.println();
        System.out.println("7193");
        String[] out7193 = {
                "1480",
                "907.9203",
                "Файл не существует",
                "Файл пуст",
                "Некорректный формат данных",
                "Некорректный формат данных",
                "Некорректный формат данных",
                "Некорректный формат данных"
        };
        for (int i = 0; i < out7193.length; i++) {
            System.out.println("-->" + out7193[i] + "<--");
            task7193(".\\task7193\\test" + (i + 1) + ".csv");
        }
        System.out.println();
        System.out.println("5847");
        String[] in5847 = {
                "B", "Y", "I", "F", "", "B", "S", "X"
        };
        String[] out5847 = {
                "32",
                "0",
                "24",
                "0",
                "Файл не существует",
                "Указанная буква не найдена",
                "В данной строке несколько искомых букв",
                "В файле слишком много строк"
        };
        for (int i = 0; i < out5847.length; i++) {
            System.out.println("-->" + out5847[i] + "<--");
            task5847(in5847[i], ".\\task5847\\test" + (i + 1) + ".txt");
        }
        System.out.println();
        System.out.println("4769");
        String[] in4769a = {"P", "N", "W", "U", "F", "I", "B", "P", "S", "P", "P", "T"};
        String[] in4769b = {"Q", "K", "X", "T", "A", "I", "E", "Q", "F", "Q", "Q", "R"};
        String[] out4769 = {
                "16",
                "0",
                "41",
                "4",
                "Одна из указанных букв не найдена",
                "В данной строке несколько искомых букв",
                "Одна из указанных букв не найдена",
                "Файл не существует",
                "Одна из указанных букв не найдена",
                "В данной строке несколько искомых букв",
                "В данной строке несколько искомых букв",
                "В файле слишком много строк"
        };
        for (int i = 0; i < out4769.length; i++) {
            System.out.println("-->" + out4769[i] + "<--");
            task4769(in4769a[i], in4769b[i], ".\\task4769\\test" + (i + 1) + ".txt");
        }
        System.out.println();
        System.out.println("9930");
        for (int i = 1; i <= 6; i++) {
            System.out.println("#" + i);
            task9930(".\\task9930\\test" + i + ".txt");
        }
        System.out.println();
        System.out.println("6861");
        for (int i = 1; i <= 5; i++) {
            System.out.println("#" + i);
            task6861(".\\task6861\\test" + i + ".txt");
        }
        System.out.println();
        System.out.println("2205");
        for (int i = 1; i <= 4; i++) {
            System.out.println("#" + i);
            task2205(".\\task2205\\test" + i + ".txt");
        }
    }

    public static void task4642(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            int total = 0;
            if (!scanner.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    String[] tokens = line.split(" ");
                    for (int i = 0; i < tokens.length; i++) {
                        if (!tokens[i].trim().equals("")) {
                            total++;
                        }
                    }
                }
                System.out.println(total);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует");
        }
    }

    public static void task6882(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (!scanner.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                int min = scanner.nextInt();
                while (scanner.hasNext()) {
                    int current = scanner.nextInt();
                    if (current < min) {
                        min = current;
                    }
                }
                System.out.println(min);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует " + target.getAbsolutePath());
        }
    }

    public static void task5537(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            int count = 0;
            while (scanner.hasNext()) {
                String current = scanner.nextLine();
                if (current.length() > 4) {
                    System.out.println("Запись '" + current + "' длиннее четырех символов");
                    scanner.close();
                    return;
                } else if (current.length() < 4) {
                    System.out.println("Запись '" + current + "' короче четырех символов");
                    scanner.close();
                    return;
                } else {
                    char[] chars = current.toCharArray();
                    if (chars[0] == chars[1] || chars[1] == chars[2] || chars[2] == chars[3]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует " + target.getAbsolutePath());
        }
    }

    public static int square6431(String line) throws IllegalArgumentException {
        String[] values = line.split(";");
        if (values.length < 4) {
            throw new IllegalArgumentException("Некорректный формат данных");
        }
        int width = Integer.parseInt(values[2]);
        int height = Integer.parseInt(values[3]);
        return width * height;
    }

    public static void task6431(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (!scanner.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                int max = square6431(scanner.nextLine());
                while (scanner.hasNext()) {
                    int current = square6431(scanner.nextLine());
                    if (current > max) {
                        max = current;
                    }
                }
                System.out.println(max);
            }
        } catch (NumberFormatException | InputMismatchException ex) {
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println("Некорректный формат данных");
        }
    }

    public static double area7193(String line) throws IllegalArgumentException {
        String[] values = line.split(";");
        if (values.length < 1) {
            throw new IllegalArgumentException("Некорректный формат данных");
        }
        if (values[0].equals("rect")) {
            if (values.length < 5) {
                throw new IllegalArgumentException("Некорректный формат данных");
            }
            int width = Integer.parseInt(values[3]);
            int height = Integer.parseInt(values[4]);
            return width * height;
        } else if (values[0].equals("circle")) {
            if (values.length < 4) {
                throw new IllegalArgumentException("Некорректный формат данных");
            }
            double r = Double.parseDouble(values[3]);
            return Math.PI * r * r;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных");
        }
    }

    public static void task7193(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (!scanner.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                double max = area7193(scanner.nextLine());
                while (scanner.hasNext()) {
                    double current = area7193(scanner.nextLine());
                    if (max < current) {
                        max = current;
                    }
                }
                System.out.printf("%.4f\n", max);
            }
        } catch (NumberFormatException | InputMismatchException ex) {
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println("Некорректный формат данных");
        }
    }

    public static void task5847(String a, String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (scanner.hasNext()) {
                String line = scanner.next();
                if (scanner.hasNext()) {
                    System.out.println("В файле слишком много строк");
                } else if (line.indexOf(a) != line.lastIndexOf(a)) {
                    System.out.println("В данной строке несколько искомых букв");
                } else if (line.contains(a)) {
                    System.out.println(line.length() - line.indexOf(a) - 1);
                } else {
                    System.out.println("Указанная буква не найдена");
                }
            } else {
                System.out.println("Файл пуст");
            }
        } catch (NumberFormatException | InputMismatchException ex) {
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println("Некорректный формат данных");
        }
    }

    public static void task4769(String a, String b, String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (scanner.hasNext()) {
                String line = scanner.next();
                if (scanner.hasNext()) {
                    System.out.println("В файле слишком много строк");
                } else {
                    int ia = line.indexOf(a);
                    int ib = line.indexOf(b);
                    if (ia != line.lastIndexOf(a) || ib != line.lastIndexOf(b)) {
                        System.out.println("В данной строке несколько искомых букв");
                    } else if (line.contains(a) && line.contains(b)) {
                        if (ia > ib) {
                            System.out.println(ia - ib - 1);
                        } else {
                            System.out.println(ib - ia - 1);
                        }
                    } else {
                        System.out.println("Одна из указанных букв не найдена");
                    }
                }
            } else {
                System.out.println("Файл пуст");
            }
        } catch (NumberFormatException | InputMismatchException ex) {
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует " + target.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Некорректный формат данных");
        }
    }

    public static String logic9930(String line) throws IllegalArgumentException {
        int start = line.lastIndexOf("\\");
        int end = line.lastIndexOf(".");
        String name;
        if (start > end) {
            name = line.substring(start + 1);
        } else {
            name = line.substring(start + 1, end);
        }
        String[] check = {"*", "|", ":", "\"", "<", ">", "?", "/"};
        for (int i = 0; i < check.length; i++) {
            if (name.contains(check[i])) {
                throw new IllegalArgumentException("Некорректное имя файла");
            }
        }
        return name;
    }

    public static void task9930(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                try {
                    System.out.println(logic9930(line));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует");
        }
    }

    public static String logic6861(String line) throws IllegalArgumentException {
        int start = line.lastIndexOf("@");
        int end = line.lastIndexOf(".");
        if (line.indexOf("@") != start || start == 0 || start > end || !line.contains("@")) {
            throw new IllegalArgumentException("Некорректный почтовый адрес");
        }
        return line.substring(0, start);
    }

    public static void task6861(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                try {
                    System.out.println(logic6861(line));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует");
        }
    }

    public static int logic2205(String line) throws IllegalArgumentException {
        if (line.isEmpty()) {
            throw new IllegalArgumentException("Строка пуста");
        }
        String[] values = line.split(",");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i].isEmpty()) {
                throw new NumberFormatException();
            }
            sum += Integer.parseInt(values[i]);
        }
        return sum;
    }

    public static void task2205(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                try {
                    System.out.println(logic2205(line));
                } catch (NumberFormatException ex) {
                    System.out.println("Не удается считать число");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл " + target.getAbsolutePath() + " не существует");
        }
    }

    public static void task9092(String filename) {
        File target = new File(filename);
        System.out.println();
        System.out.println("Обработка файла " + target.getAbsolutePath());
        Map<String, Integer> result = new HashMap<>();
        int i = 0;
        try (Scanner scanner = new Scanner(target)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length != 2){
                    System.out.println("Некорректный формат записи в строке " + i);
                    return;
                }
                String key = parts[0];
                int value = Integer.parseInt(parts[1]);
                if (result.containsKey(key))
                {
                    value += result.get(key);
                }
                result.put(key, value);
                i++;
            }
            for (Map.Entry<String, Integer> entry : result.entrySet()){
                System.out.println("У группы '" + entry.getKey() + "' сумма равна " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + target.getAbsolutePath() + " не существует");
        } catch (NumberFormatException e) {
            System.out.println("Не удалось преобразовать число в строке " + i);
        }
    }

    public static void task4372(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                int openIndex = line.indexOf("{");
                int closeIndex = line.indexOf("}");

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует");
        }
    }
}
