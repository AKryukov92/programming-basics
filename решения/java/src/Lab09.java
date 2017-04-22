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
    }
    public static void call(){
        System.out.println("6175");
        String[] out6175 = {
            "стол, стул, дверь, шкаф, кровать",
            "космос",
            "Файл пуст",
            "кирпич, бетон, дерево",
            "Файл не существует",
            "один два три четыре пять"
        };
        for (int i = 0; i < out6175.length; i++){
            System.out.println("-->" + out6175[i] + "<--");
            task6175(".\\task6175\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("4488");
        String[] out4488 = {
            "Поэмы 14",
            "блокбастеры 0",
            "Научная и научно-популярная литература 160",
            "Сказки 7",
            "Файл не существует",
            "Файл пуст"
        };
        for (int i = 0; i < out4488.length; i++){
            System.out.println("-->" + out4488[i] + "<--");
            task4488(".\\task4488\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("4954");
        String[] in4954 = {"а","ц","н","ч","п"};
        String[] out4954 = {
            "36",
            "5",
            "92",
            "Файл не существует",
            "0"
        };
        for (int i = 0; i < in4954.length; i++){
            System.out.println("-->" + out4954[i] + "<--");
            task4954(in4954[i], ".\\task4954\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("4642");
        String[] out4642 = {
            "7",
            "10",
            "933",
            "Файл не существует",
            "Файл пуст"
        };
        for (int i = 0; i < out4642.length; i++){
            System.out.println("-->" + out4642[i] + "<--");
            task4642(".\\task4642\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("9765");
        String[] out9765 = {
            "0",
            "0",
            "5",
            "Не удается считать число",
            "Не удается считать число",
            "Файл пуст",
            "Файл не существует",
            "Не удается считать число"
        };
        for (int i = 0; i < out9765.length; i++){
            System.out.println("-->" + out9765[i] + "<--");
            task9765(".\\task9765\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("5537");
        String[] out5537 = {
            "Некорректное число",
            "569",
            "253",
            "Не удается считать число",
            "Некорректное число",
            "0",
            "Файл не существует",
            "Некорректное число"
        };
        for (int i = 0; i < out5537.length; i++){
            System.out.println("-->" + out5537[i] + "<--");
            task5537(".\\task5537\\test" + (i+1) + ".txt");
        }
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
        for (int i = 0; i < out6431.length; i++){
            System.out.println("-->" + out6431[i] + "<--");
            task6431(".\\task6431\\test" + (i+1) + ".csv");
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
        for (int i = 0; i < out7193.length; i++){
            System.out.println("-->" + out7193[i] + "<--");
            task7193(".\\task7193\\test" + (i+1) + ".csv");
        }
        System.out.println();
        System.out.println("5847");
        String[] in5847 = {
            "B", "Y", "I", "F", "", "B", "S"
        };
        String[] out5847 = {
            "32",
            "0",
            "24",
            "0",
            "Файл не существует",
            "Указанная буква не найдена",
            "В данной строке несколько искомых букв"
        };
        for (int i = 0; i < out5847.length; i++){
            System.out.println("-->" + out5847[i] + "<--");
            task5847(in5847[i], ".\\task5847\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("4768");
        String[] in4769a = {"P", "N" , "W", "U", "F", "I", "B", "P", "S"};
        String[] in4769b = {"Q", "K", "X", "T", "A", "I", "E", "Q", "F"};
        String[] out4769 = {
            "16",
            "0",
            "41",
            "4",
            "Одна из указанных букв не найдена",
            "В данной строке несколько искомых букв",
            "Одна из указанных букв не найдена",
            "Файл не существует",
            "Одна из указанных букв не найдена"
        };
        for (int i = 0; i < out4769.length; i++){
            System.out.println("-->" + out4769[i] + "<--");
            task4769(in4769a[i], in4769b[i], ".\\task4769\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("9930");
        for (int i = 1; i <= 6; i++){
            System.out.println("#" + i);
            task9930(".\\task9930\\test" + i + ".txt");
        }
        System.out.println();
        System.out.println("6861");
        for (int i = 1; i <= 5; i++){
            System.out.println("#" + i);
            task6861(".\\task6861\\test" + i + ".txt");
        }
        System.out.println();
        System.out.println("2205");
        for (int i = 1; i <= 4; i++){
            System.out.println("#" + i);
            task2205(".\\task2205\\test" + i + ".txt");
        }
        System.out.println();
        System.out.println("3226");
        for (int i = 1; i <= 9; i++){
            System.out.println("#" + i);
            task3226(".\\task3226\\test" + i + ".txt");
        }
        System.out.println();
        System.out.println("5032");
        for (int i = 0; i < 14; i++) {
            task5032(".\\task5032\\test" + (i + 1) + ".csv");
        }
        System.out.println();
        System.out.println("5108");
        for (int i = 0; i < 14; i++) {
            task5108(".\\task5108\\test" + (i + 1) + ".csv");
        }
        System.out.println();
        System.out.println("3567");
        for (int i = 0; i < 14; i++) {
            task3567(".\\task3567\\test" + (i + 1) + ".csv");
        }
        System.out.println();
        System.out.println("2033");
        for (int i = 0; i < 18; i++) {
            task2033(".\\task2033\\test" + (i + 1) + ".csv");
        }
    }

    public static void task6175(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            if (scanner.hasNext()){
                System.out.print(scanner.nextLine());
            } else {
                System.out.println("Файл пуст");
                return;
            }
            while (scanner.hasNext()) {
                System.out.print(", ");
                System.out.print(scanner.nextLine());
            }
            System.out.println();
        } catch (InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task4488(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            int c = 0;
            String n;
            if (!scanner.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                n = scanner.nextLine();
                while(scanner.hasNext()){
                    scanner.nextLine();
                    c++;
                }
                System.out.println(n + " " + c);
            }
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task4954(String a, String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            int count = 0;
            while(scanner.hasNext()) {
                if (scanner.nextLine().contains(a)) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task4642(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            int total = 0;
            if (!scanner.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                while(scanner.hasNext()) {
                    String line = scanner.nextLine();
                    String[] tokens = line.split(" ");
                    for (int i = 0; i < tokens.length; i++){
                        if (!tokens[i].trim().equals("")){
                            total++;
                        }
                    }
                }
                System.out.println(total);
            }
        } catch (InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task9765(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            if (!scanner.hasNext()){
                System.out.println("Файл пуст");
            } else {
                int min = scanner.nextInt();
                while(scanner.hasNext()){
                    int current = scanner.nextInt();
                    if (current < min){
                        min = current;
                    }
                }
                System.out.println(min);
            }
        } catch (InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task5537(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            int count = 0;
            while(scanner.hasNext()){
                int current = scanner.nextInt();
                if (current < 1000 || current > 9999){
                    System.out.println("Некорректное число");
                    scanner.close();
                    return;
                }
                int d1 = current/1000;
                int d2 = current/100%10;
                int d3 = current/10%10;
                int d4 = current%10;
                if (d1 == d2 || d2 == d3 || d3 == d4){
                    count++;
                }
            }
            System.out.println(count);
        } catch (InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static int square6431(String line) throws Exception {
        String[] values = line.split(";");
        if (values.length < 4){
            throw new Exception("Некорректный формат данных");
        }
        int width = Integer.parseInt(values[2]);
        int height = Integer.parseInt(values[3]);
        return width*height;
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
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println("Некорректный формат данных");
        }
    }

    public static double area7193(String line) throws Exception {
        String[] values = line.split(";");
        if (values.length < 1){
            throw new Exception("Некорректный формат данных");
        }
        if (values[0].equals("rect")){
            if (values.length < 5){
                throw new Exception("Некорректный формат данных");
            }
            int width = Integer.parseInt(values[3]);
            int height = Integer.parseInt(values[4]);
            return width*height;
        } else if (values[0].equals("circle")){
            if (values.length < 4){
                throw new Exception("Некорректный формат данных");
            }
            double r = Double.parseDouble(values[3]);
            return Math.PI * r * r;
        } else {
            throw new Exception("Некорректный формат данных");
        }
    }

    public static void task7193(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (!scanner.hasNext()){
                System.out.println("Файл пуст");
            } else {
                double max = area7193(scanner.nextLine());
                while (scanner.hasNext()){
                    double current = area7193(scanner.nextLine());
                    if (max < current){
                        max = current;
                    }
                }
                System.out.printf("%.4f\n", max);
            }
        } catch (NumberFormatException | InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println("Некорректный формат данных");
        }
    }

    public static void task5847(String a, String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (scanner.hasNext()){
                String line = scanner.next();
                if (line.indexOf(a) != line.lastIndexOf(a)){
                    System.out.println("В данной строке несколько искомых букв");
                } else if (line.contains(a)) {
                    System.out.println(line.length() - line.indexOf(a) - 1);
                } else {
                    System.out.println("Указанная буква не найдена");
                }
            } else {
                System.out.println("Файл пуст");
            }
        } catch (NumberFormatException | InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println("Некорректный формат данных");
        }
    }

    public static void task4769(String a, String b, String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (scanner.hasNext()){
                String line = scanner.next();
                int ia = line.indexOf(a);
                int ib = line.indexOf(b);
                if (ia != line.lastIndexOf(a) || ib != line.lastIndexOf(b)){
                    System.out.println("В данной строке несколько искомых букв");
                } else if (line.contains(a) && line.contains(b)){
                    if (ia > ib){
                        System.out.println(ia - ib - 1);
                    } else {
                        System.out.println(ib - ia - 1);
                    }
                } else {
                    System.out.println("Одна из указанных букв не найдена");
                }
            } else {
                System.out.println("Файл пуст");
            }
        } catch (NumberFormatException | InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println("Некорректный формат данных");
        }
    }

    public static String logic9930(String line) throws Exception {
        int start = line.lastIndexOf("\\");
        int end = line.lastIndexOf(".");
        String name;
        if (start > end){
            name = line.substring(start + 1);
        } else {
            name = line.substring(start + 1, end);
        }
        String[] check = {"*", "|", ":", "\"", "<", ">", "?", "/"};
        for (int i = 0; i < check.length; i++){
            if (name.contains(check[i])){
                throw new Exception("Некорректное имя файла");
            }
        }
        return name;
    }

    public static void task9930(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                try {
                    System.out.println(logic9930(line));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static String logic6861(String line) throws Exception {
        int start = line.lastIndexOf("@");
        int end = line.lastIndexOf(".");
        if (line.indexOf("@") != start || start == 0 || start > end || !line.contains("@")){
            throw new Exception("Некорректный почтовый адрес");
        }
        return line.substring(0, start);
    }

    public static void task6861(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                try {
                    System.out.println(logic6861(line));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static int logic2205(String line) throws Exception {
        if (line.isEmpty()){
            throw new Exception("Строка пуста");
        }
        String[] values = line.split(",");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i].isEmpty()){
                throw new NumberFormatException();
            }
            sum += Integer.parseInt(values[i]);
        }
        return sum;
    }

    public static void task2205(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                try {
                    System.out.println(logic2205(line));
                } catch(NumberFormatException ex){
                    System.out.println("Не удается считать число");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task3226(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            int depth = 0;
            int maxDepth = 0;
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                int openIndex;
                int closeIndex;
                int lastIndex = 0;
                while(lastIndex < line.length()){
                    closeIndex = line.indexOf("}", lastIndex);
                    openIndex = line.indexOf("{", lastIndex);
                    if (openIndex >= 0 && openIndex < closeIndex) {
                        depth++;
                        lastIndex = openIndex;
                    }
                    if (openIndex >= 0 && closeIndex < 0){
                        depth++;
                        lastIndex = openIndex;
                    }
                    if (openIndex >= 0 && openIndex > closeIndex && closeIndex >= 0){
                        depth--;
                        lastIndex = closeIndex;
                    }
                    if (openIndex < 0 && closeIndex >=0){
                        depth--;
                        lastIndex = closeIndex;
                    }
                    if (openIndex < 0 && closeIndex < 0){
                        break;
                    }
                    if (depth < 0){
                        break;
                    }
                    if (maxDepth < depth){
                        maxDepth = depth;
                    }
                    lastIndex++;
                }
                if (depth < 0){
                    break;
                }
            }
            if (depth > 0){
                System.out.println("Неожиданный конец файла");
            } else if (depth < 0) {
                System.out.println("Неожиданная закрывающаяся скобочка");
            } else {
                System.out.println(maxDepth);
            }
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task4372(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                int openIndex = line.indexOf("{");
                int closeIndex = line.indexOf("}");

            }
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static class class5032{
        int x;
        int y;
        int h;
        int w;
        public class5032(int x, int y, int h, int w) {
            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;
        }
        public void shiftX(int value) throws Exception {
            if (this.x < -value){
                throw new Exception("Координата X должна быть неотрицательной");
            }
            this.x += value;
        }
        public void shiftY(int value) throws Exception {
            if (this.y < -value){
                throw new Exception("Координата Y должна быть неотрицательной");
            }
            this.y += value;
        }
        public void stretchX(int value) throws Exception {
            if (this.w <= -value){
                throw new Exception("Ширина должна быть положительной");
            }
            this.w += value;
        }
        public void stretchY(int value) throws Exception {
            if (this.h <= -value){
                throw new Exception("Высота должна быть положительной");
            }
            this.h += value;
        }

        @Override
        public String toString() {
            return "{\"x\":" + x + ",\"y\":" + y + ",\"w\":" + w + ",\"h\":" + h + "}";
        }
    }

    public static void task5032(String filename) {
        File target = new File(filename);
        int count = 0;
        class5032 rect = new class5032(100,100,100,100);
        try (Scanner scanner = new Scanner(target)) {
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                String[] arr = line.split(";");
                if (arr.length != 2){
                    System.out.print(count);
                    System.out.println(" действий: Некорректный формат");
                    scanner.close();
                    return;
                }
                String action = arr[0];
                int value = Integer.parseInt(arr[1]);
                if (action.equals("shiftX")){
                    rect.shiftX(value);
                } else if (action.equals("shiftY")){
                    rect.shiftY(value);
                } else if (action.equals("stretchX")){
                    rect.stretchX(value);
                } else if (action.equals("stretchY")){
                    rect.stretchY(value);
                } else {
                    System.out.println("Некорректное действие: " + action);
                    scanner.close();
                    return;
                }
                count++;
            }
            System.out.print(count);
            System.out.print(" действий: ");
            System.out.println(rect);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.print(count);
            System.out.print(" действий: ");
            System.out.println(e.getMessage());
        }
    }

    public static class class5108 implements interface2033{
        int x;
        int y;
        int h;
        int w;
        int count = 0;
        public class5108(int x, int y, int h, int w) {
            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;
        }
        public void shiftX(int value) throws Exception {
            if (this.x < -value){
                throw new Exception("Координата X должна быть неотрицательной");
            }
            this.count++;
            this.x += value;
        }
        public void shiftY(int value) throws Exception {
            if (this.y < -value){
                throw new Exception("Координата Y должна быть неотрицательной");
            }
            this.count++;
            this.y += value;
        }
        public void stretchX(int value) throws Exception {
            if (this.w <= -value){
                throw new Exception("Ширина должна быть положительной");
            }
            this.count++;
            this.w += value;
        }
        public void stretchY(int value) throws Exception {
            if (this.h <= -value){
                throw new Exception("Высота должна быть положительной");
            }
            this.count++;
            this.h += value;
        }

        @Override
        public String toString() {
            return String.format("Действий:%d {\"x\":%d,\"y\":%d,\"w\":%d,\"h\":%d}",count,x,y,w,h);
        }
    }

    private static void logic5108(Scanner scanner) throws Exception {
        Map<String, class5108> map = new HashMap<>();
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length < 3){
                throw new Exception("Некорректный формат");
            }
            String action = arr[0];
            String id = arr[1];
            if(action.equals("create")){
                if (arr.length != 6){
                    throw new Exception("Некорректный формат");
                }
                if (map.containsKey(id)){
                    throw new Exception("Идентификатор не должен повторяться");
                }
                map.put(id, new class5108(
                        Integer.parseInt(arr[2]),
                        Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5])
                ));
                continue;
            }
            if (!map.containsKey(id)){
                throw new Exception("Операция над неопознанным объектом");
            }
            int value = Integer.parseInt(arr[2]);
            class5108 rect = map.get(id);
            if (action.equals("shiftX")){
                rect.shiftX(value);
            } else if (action.equals("shiftY")){
                rect.shiftY(value);
            } else if (action.equals("stretchX")){
                rect.stretchX(value);
            } else if (action.equals("stretchY")){
                rect.stretchY(value);
            } else {
                System.out.println("Некорректное действие: " + arr[0]);
                scanner.close();
                return;
            }
        }
        for(Map.Entry<String, class5108> item : map.entrySet()){
            System.out.print(item.getKey());
            System.out.print(" ");
            System.out.println(item.getValue());
        }
    }
    private static void task5108(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            System.out.println(filename);
            logic5108(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static class class3567{
        int cx;
        int cy;
        int r;

        public class3567(int cx, int cy, int r){
            this.cx = cx;
            this.cy = cy;
            this.r = r;
        }

        public void shiftX(int value) throws Exception {
            if (this.cx - this.r < -value){
                throw new Exception("Левая точка круга должна иметь неотрицательные координаты");
            }
            this.cx += value;
        }
        public void shiftY(int value) throws Exception {
            if (this.cy - this.r < -value){
                throw new Exception("Верхняя точка круга должна иметь неотрицательные координаты");
            }
            this.cy += value;
        }
        public void stretchX(int value) throws Exception {
            if (this.r * 2 <= -value){
                throw new Exception("Ширина должна быть положительной");
            }
            this.r += value/2;
            this.cx += value/2;
            this.cy += value/2;
        }
        public void stretchY(int value) throws Exception {
            if (this.r * 2 <= -value){
                throw new Exception("Ширина должна быть положительной");
            }
            this.r += value/2;
            this.cx += value/2;
            this.cy += value/2;
        }

        @Override
        public String toString() {
            return "{\"cx\":" + cx + ",\"y\":" + cy + ",\"r\":" + r + "}";
        }
    }

    private static void logic3567(Scanner scanner) throws Exception {
        class3567 circle = new class3567(150,150,100);
        int count = 0;
        while(scanner.hasNext()){
            count++;
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length != 2){
                throw new Exception("Действий:" + count + " Некорректный формат");
            }
            String action = arr[0];
            int value = Integer.parseInt(arr[1]);
            if (action.equals("shiftX")){
                circle.shiftX(value);
            } else if (action.equals("shiftY")){
                circle.shiftY(value);
            } else if (action.equals("stretchX")){
                circle.stretchX(value);
            } else if (action.equals("stretchY")){
                circle.stretchY(value);
            } else {
                throw new Exception("Некорректное действие: " + action);
            }
        }
        System.out.print(count);
        System.out.print(" действий: ");
        System.out.println(circle);
    }

    private static void task3567(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            System.out.println(filename);
            logic3567(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public interface interface2033{
        void shiftX(int value) throws Exception;
        void shiftY(int value) throws Exception;
        void stretchX(int value) throws Exception;
        void stretchY(int value) throws Exception;
    }

    public static class class2033 implements interface2033{
        int cx;
        int cy;
        int r;
        int count = 0;

        public class2033(int cx, int cy, int r){
            this.cx = cx;
            this.cy = cy;
            this.r = r;
        }

        public void shiftX(int value) throws Exception {
            if (this.cx - this.r < -value){
                throw new Exception("Левая точка круга должна иметь неотрицательные координаты");
            }
            this.cx += value;
            count++;
        }
        public void shiftY(int value) throws Exception {
            if (this.cy - this.r < -value){
                throw new Exception("Верхняя точка круга должна иметь неотрицательные координаты");
            }
            this.cy += value;
            count++;
        }
        public void stretchX(int value) throws Exception {
            if (this.r * 2 <= -value){
                throw new Exception("Ширина должна быть положительной");
            }
            this.r += value/2;
            this.cx += value/2;
            this.cy += value/2;
            count++;
        }
        public void stretchY(int value) throws Exception {
            if (this.r * 2 <= -value){
                throw new Exception("Высота должна быть положительной");
            }
            this.r += value/2;
            this.cx += value/2;
            this.cy += value/2;
            count++;
        }

        @Override
        public String toString() {
            return String.format("Действий:%d {\"cx\":%d,\"y\":%d,\"r\":%d}",count, cx, cy, r);
        }
    }

    public static void logic2033(Scanner scanner) throws Exception {
        Map<String, interface2033> map = new HashMap<>();
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length < 3){
                throw new Exception("Некорректный формат");
            }
            String action = arr[0];
            if(action.equals("create")){
                String id = arr[2];
                if (map.containsKey(id)){
                    throw new Exception("Идентификатор не должен повторяться");
                }
                String type = arr[1];
                if (type.equals("circle")){
                    if (arr.length != 6){
                        throw new Exception("Некорректный формат");
                    }
                    map.put(id, new class2033(
                        Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5])
                    ));
                } else if (type.equals("rectangle")){
                    if (arr.length != 7){
                        throw new Exception("Некорректный формат");
                    }
                    map.put(id, new class5108(
                            Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]),
                            Integer.parseInt(arr[5]),
                            Integer.parseInt(arr[6])
                    ));
                } else {
                    throw new Exception("Неизвестная фигура");
                }
                continue;
            }
            String id = arr[1];
            if (!map.containsKey(id)){
                throw new Exception("Операция над неопознанным объектом");
            }
            int value = Integer.parseInt(arr[2]);
            interface2033 rect = map.get(id);
            if (action.equals("shiftX")){
                rect.shiftX(value);
            } else if (action.equals("shiftY")){
                rect.shiftY(value);
            } else if (action.equals("stretchX")){
                rect.stretchX(value);
            } else if (action.equals("stretchY")){
                rect.stretchY(value);
            } else {
                System.out.println("Некорректное действие: " + arr[0]);
                scanner.close();
                return;
            }
        }
        for(Map.Entry<String, interface2033> item : map.entrySet()){
            System.out.print(item.getKey());
            System.out.print(" ");
            System.out.println(item.getValue());
        }
    }

    private static void task2033(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            System.out.println(filename);
            logic2033(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
