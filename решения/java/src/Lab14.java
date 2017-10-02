import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author akryukov
 *         26.04.2017
 */
public class Lab14 {
    public static void main(String[] args) {
    }

    public static void call() {
        Step3567();
        Step6981();
        Step5032();
        Step5108();
        Step2033();
        //task5108prepare("r0");
    }

    private static void Step2033() {
        System.out.println();
        System.out.println("2033");
        for (int i = 0; i < 18; i++) {
            task2033(".\\task2033\\test" + (i + 1) + ".csv");
        }
    }

    private static void Step3567() {
        System.out.println();
        System.out.println("3567");
        for (int i = 0; i < 14; i++) {
            task3567(".\\task3567\\test" + (i + 1) + ".csv");
        }
    }

    private static void Step6981() {
        System.out.println();
        System.out.println("6981");
        for (int i = 0; i < 9; i++) {
            task6981(".\\task6981\\test" + (i + 1) + ".csv");
        }
    }

    private static void Step5108() {
        System.out.println();
        System.out.println("5108");
        for (int i = 0; i < 14; i++) {
            task5108(".\\task5108\\test" + (i + 1) + ".csv");
        }
    }

    private static void Step5032() {
        System.out.println();
        System.out.println("5032");
        for (int i = 0; i < 14; i++) {
            task5032(".\\task5032\\test" + (i + 1) + ".csv");
        }
    }

    public static class class5032 {
        int x;
        int y;
        int h;
        int w;
        String stroke;
        int count;

        public class5032(int x, int y, int h, int w, String stroke) {
            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;
            this.stroke = stroke;
            this.count = 0;
        }

        public void shiftX(int value) throws Exception {
            if (this.x < -value) {
                throw new Exception("Координата X должна быть неотрицательной");
            }
            this.count++;
            this.x += value;
        }

        public void shiftY(int value) throws Exception {
            if (this.y < -value) {
                throw new Exception("Координата Y должна быть неотрицательной");
            }
            this.count++;
            this.y += value;
        }

        public void stretchX(int value) throws Exception {
            if (this.w <= -value) {
                throw new Exception("Ширина должна быть положительной");
            }
            this.count++;
            this.w += value;
        }

        public void stretchY(int value) throws Exception {
            if (this.h <= -value) {
                throw new Exception("Высота должна быть положительной");
            }
            this.count++;
            this.h += value;
        }

        public int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return String.format("<rect x='%d' y='%d' width='%d' height='%d' fill='transparent' stroke='%s'/>", x, y, w, h, stroke);
        }
    }

    private static void writeToHtml(String filename, int width, int height, String description, String content) {
        try (PrintWriter writer = new PrintWriter(filename, "UTF-8")) {
            writer.println("<!DOCTYPE html>" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>");
            writer.println(filename);
            writer.println("</h1>");
            writer.println(description);
            writer.println(String.format("<svg width=\"%d\" height=\"%d\">", width, height));
            writer.println(content);
            writer.println("</svg>\n" +
                    "</body>\n" +
                    "</html>");
            Desktop.getDesktop().open(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void logic5032(Scanner scanner, class5032 rect) throws Exception {
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length != 2) {
                throw new Exception("Некорректный формат");
            }
            String action = arr[0];
            int value = Integer.parseInt(arr[1]);
            if (action.equals("shiftX")) {
                rect.shiftX(value);
            } else if (action.equals("shiftY")) {
                rect.shiftY(value);
            } else if (action.equals("stretchX")) {
                rect.stretchX(value);
            } else if (action.equals("stretchY")) {
                rect.stretchY(value);
            } else {
                throw new IllegalStateException("Некорректное состояние");
            }
        }
    }

    public static void task5032(String filename) {
        File target = new File(filename);
        class5032 rect = new class5032(100, 100, 100, 100, "black");
        class5032 example = new class5032(100, 100, 100, 100, "red");
        try (Scanner scanner = new Scanner(target)) {
            logic5032(scanner, rect);
            String description = "<p>Действий: " + rect.getCount() + "</p>" +
                    "<p>Результат:</p>";
            writeToHtml(filename + ".html", 500, 350, description, example.toString() + rect.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            String description = "<p>Действий: " + rect.getCount() + "</p>" +
                    "<p>Ошибка: " + e.getMessage() + "</p>" +
                    "<p>Последнее корректное состояние:</p>";
            writeToHtml(filename + ".html", 500, 350, description, example.toString() + rect.toString());
        }
    }

    public static class class5108 implements interface2033 {
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
            if (this.x < -value) {
                throw new Exception("Координата X должна быть неотрицательной");
            }
            this.count++;
            this.x += value;
        }

        public void shiftY(int value) throws Exception {
            if (this.y < -value) {
                throw new Exception("Координата Y должна быть неотрицательной");
            }
            this.count++;
            this.y += value;
        }

        public void stretchX(int value) throws Exception {
            if (this.w <= -value) {
                throw new Exception("Ширина должна быть положительной");
            }
            this.count++;
            this.w += value;
        }

        public void stretchY(int value) throws Exception {
            if (this.h <= -value) {
                throw new Exception("Высота должна быть положительной");
            }
            this.count++;
            this.h += value;
        }

        @Override
        public String toString() {
            return String.format("<rect x='%d' y='%d' width='%d' height='%d' fill='transparent' stroke='black'/>", x, y, w, h);
        }
    }

    private static void logic5108(Scanner scanner, Map<String, class5108> map) throws Exception {
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length < 3) {
                throw new Exception("Некорректный формат");
            }
            String action = arr[0];
            String id = arr[1];
            if (action.equals("create")) {
                if (arr.length != 6) {
                    throw new Exception("Некорректный формат");
                }
                if (map.containsKey(id)) {
                    throw new Exception("Идентификатор не должен повторяться (" + id + ")");
                }
                map.put(id, new class5108(
                        Integer.parseInt(arr[2]),
                        Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5])
                ));
                continue;
            }
            if (!map.containsKey(id)) {
                throw new Exception("Операция над неопознанным объектом (" + id + ")");
            }
            int value = Integer.parseInt(arr[2]);
            class5108 rect = map.get(id);
            if (action.equals("shiftX")) {
                rect.shiftX(value);
            } else if (action.equals("shiftY")) {
                rect.shiftY(value);
            } else if (action.equals("stretchX")) {
                rect.stretchX(value);
            } else if (action.equals("stretchY")) {
                rect.stretchY(value);
            } else {
                throw new Exception("Некорректное действие: " + arr[0]);
            }
        }
    }

    private static void task5108prepare(String id) {
        int MAX_HEIGHT = 300;
        int MAX_WIDTH = 500;
        Random rnd = new Random();
        int x = rnd.nextInt(MAX_WIDTH);
        int y = rnd.nextInt(MAX_HEIGHT);
        int w = rnd.nextInt(MAX_WIDTH - x);
        int h = rnd.nextInt(MAX_HEIGHT - y);
        class5108 rect = new class5108(x, y, h, w);
        System.out.printf("create;%s;%d;%d;%d;%d\n", id, x, y, h, w);
        int n = rnd.nextInt(100) + 100;
        try {
            for (int i = 0; i < n; i++) {
                int action = rnd.nextInt(4);
                if (action == 0) {//shiftX
                    int value = rnd.nextInt(MAX_WIDTH - rect.w) - rect.x;
                    System.out.print("shiftX;" + id + ";" + value);
                    rect.shiftX(value);
                   // System.out.println(";" + (rect.x + rect.w));
                } else if (action == 1) { //shiftY
                    int value = rnd.nextInt(MAX_HEIGHT - rect.h) - rect.y;
                    System.out.print("shiftY;" + id + ";" + value);
                    rect.shiftY(value);
                    //System.out.println(";" + (rect.y + rect.h));
                } else if (action == 2) {//stretchX
                    int value = rnd.nextInt(MAX_WIDTH - rect.x) - rect.w + 1;
                    System.out.print("stretchX;" + id + ";" + value);
                    rect.stretchX(value);
                    //System.out.println(";" + (rect.y + rect.h));
                } else if (action == 3) {//stretchY
                    int value = rnd.nextInt(MAX_HEIGHT - rect.y) - rect.h + 1;
                    System.out.print("stretchY;" + id + ";" + value);
                    rect.stretchY(value);
                    //System.out.println(";" + (rect.y + rect.h));
                }
                System.out.println();
            }
            //System.out.println(rect);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void task5108(String filename) {
        File target = new File(filename);
        Map<String, class5108> map = new HashMap<>();
        StringBuilder description = new StringBuilder();
        try (Scanner scanner = new Scanner(target)) {
            System.out.println(filename);
            logic5108(scanner, map);
        } catch (FileNotFoundException e) {
            description.append("<p>Файл не существует</p>");
        } catch (Exception e) {
            description.append("<p>Ошибка: ");
            description.append(e.getMessage());
            description.append("</p>");
        } finally {
            StringBuilder content = new StringBuilder();
            for (Map.Entry<String, class5108> item : map.entrySet()) {
                description.append("<p>");
                description.append(item.getKey());
                description.append(" действий: ");
                description.append(item.getValue().count);
                description.append("</p>");
                content.append(item.getValue());
            }
            writeToHtml(filename + ".html", 800, 600, description.toString(), content.toString());
        }
    }

    public static class class3567 {
        int cx;
        int cy;
        int r;
        String stroke;
        int count;

        public class3567(int cx, int cy, int r, String stroke) {
            this.cx = cx;
            this.cy = cy;
            this.r = r;
            this.stroke = stroke;
            this.count = 0;
        }

        public void shiftX(int value) throws Exception {
            if (this.cx - this.r < -value) {
                throw new Exception("Левая точка круга должна иметь неотрицательные координаты");
            }
            this.cx += value;
            this.count++;
        }

        public void shiftY(int value) throws Exception {
            if (this.cy - this.r < -value) {
                throw new Exception("Верхняя точка круга должна иметь неотрицательные координаты");
            }
            this.cy += value;
            this.count++;
        }

        public void stretchX(int value) throws Exception {
            if (this.r * 2 <= -value) {
                throw new Exception("Ширина должна быть положительной");
            }
            this.r += value / 2;
            this.cx += value / 2;
            this.cy += value / 2;
            this.count++;
        }

        public void stretchY(int value) throws Exception {
            if (this.r * 2 <= -value) {
                throw new Exception("Ширина должна быть положительной");
            }
            this.r += value / 2;
            this.cx += value / 2;
            this.cy += value / 2;
            this.count++;
        }

        public int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return String.format("<circle cx='%d' cy='%d' r='%d' fill='transparent' stroke='%s'/>", cx, cy, r, stroke);
        }
    }

    private static void logic3567(Scanner scanner, class3567 circle) throws Exception {
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length != 2) {
                throw new IllegalStateException("Некорректный формат");
            }
            String action = arr[0];
            int value = Integer.parseInt(arr[1]);
            if (action.equals("shiftX")) {
                circle.shiftX(value);
            } else if (action.equals("shiftY")) {
                circle.shiftY(value);
            } else if (action.equals("stretchX")) {
                circle.stretchX(value);
            } else if (action.equals("stretchY")) {
                circle.stretchY(value);
            } else {
                throw new IllegalStateException("Некорректное действие: " + action);
            }
        }
    }

    private static void task3567(String filename) {
        File target = new File(filename);
        class3567 circle = new class3567(150, 150, 100, "black");
        class3567 example = new class3567(150, 150, 100, "red");
        try (Scanner scanner = new Scanner(target)) {
            System.out.println(filename);
            logic3567(scanner, circle);
            String description = "<p>Действий: " + circle.getCount() + "</p>" +
                    "<p>Результат:</p>";
            writeToHtml(filename + ".html", 500, 350, description, example.toString() + circle.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            String description = "<p>Действий: " + circle.getCount() + "</p>" +
                    "<p>Ошибка: " + e.getMessage() + "</p>" +
                    "<p>Последнее корректное состояние:</p>";
            writeToHtml(filename + ".html", 500, 350, description, example.toString() + circle.toString());
        }
    }

    public interface interface2033 {
        void shiftX(int value) throws Exception;

        void shiftY(int value) throws Exception;

        void stretchX(int value) throws Exception;

        void stretchY(int value) throws Exception;
    }

    public static class class2033 implements interface2033 {
        int cx;
        int cy;
        int r;
        int count = 0;

        public class2033(int cx, int cy, int r) {
            this.cx = cx;
            this.cy = cy;
            this.r = r;
        }

        public void shiftX(int value) throws Exception {
            if (this.cx - this.r < -value) {
                throw new Exception("Левая точка круга должна иметь неотрицательные координаты");
            }
            this.cx += value;
            count++;
        }

        public void shiftY(int value) throws Exception {
            if (this.cy - this.r < -value) {
                throw new Exception("Верхняя точка круга должна иметь неотрицательные координаты");
            }
            this.cy += value;
            count++;
        }

        public void stretchX(int value) throws Exception {
            if (this.r * 2 <= -value) {
                throw new Exception("Ширина должна быть положительной");
            }
            this.r += value / 2;
            this.cx += value / 2;
            this.cy += value / 2;
            count++;
        }

        public void stretchY(int value) throws Exception {
            if (this.r * 2 <= -value) {
                throw new Exception("Высота должна быть положительной");
            }
            this.r += value / 2;
            this.cx += value / 2;
            this.cy += value / 2;
            count++;
        }

        @Override
        public String toString() {
            return String.format("Действий:%d {\"cx\":%d,\"y\":%d,\"r\":%d}", count, cx, cy, r);
        }
    }

    public static void logic2033(Scanner scanner) throws Exception {
        Map<String, interface2033> map = new HashMap<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length < 3) {
                throw new Exception("Некорректный формат");
            }
            String action = arr[0];
            if (action.equals("create")) {
                String id = arr[2];
                if (map.containsKey(id)) {
                    throw new Exception("Идентификатор не должен повторяться");
                }
                String type = arr[1];
                if (type.equals("circle")) {
                    if (arr.length != 6) {
                        throw new Exception("Некорректный формат");
                    }
                    map.put(id, new class2033(
                            Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]),
                            Integer.parseInt(arr[5])
                    ));
                } else if (type.equals("rectangle")) {
                    if (arr.length != 7) {
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
            if (!map.containsKey(id)) {
                throw new Exception("Операция над неопознанным объектом");
            }
            int value = Integer.parseInt(arr[2]);
            interface2033 rect = map.get(id);
            if (action.equals("shiftX")) {
                rect.shiftX(value);
            } else if (action.equals("shiftY")) {
                rect.shiftY(value);
            } else if (action.equals("stretchX")) {
                rect.stretchX(value);
            } else if (action.equals("stretchY")) {
                rect.stretchY(value);
            } else {
                System.out.println("Некорректное действие: " + arr[0]);
                scanner.close();
                return;
            }
        }
        for (Map.Entry<String, interface2033> item : map.entrySet()) {
            System.out.print(item.getKey());
            System.out.print(" ");
            System.out.println(item.getValue());
        }
    }

    private static void task2033(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            System.out.println(filename);
            logic2033(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void parse6981(Map<String, interface2033> map, String line) throws Exception {
        String[] arr = line.split(";");
        if (arr.length < 3) {
            throw new Exception("Некорректный формат");
        }
        String action = arr[0];
        if (action.equals("create")) {
            String id = arr[2];
            if (map.containsKey(id)) {
                throw new Exception("Идентификатор не должен повторяться");
            }
            String type = arr[1];
            if (type.equals("circle")) {
                if (arr.length != 6) {
                    throw new Exception("Некорректный формат");
                }
                map.put(id, new class2033(
                        Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5])
                ));
            } else if (type.equals("rectangle")) {
                if (arr.length != 7) {
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
        } else {
            String id = arr[1];
            if (!map.containsKey(id)) {
                throw new Exception("Операция над неопознанным объектом");
            }
            int value = Integer.parseInt(arr[2]);
            interface2033 rect = map.get(id);
            if (action.equals("shiftX")) {
                rect.shiftX(value);
            } else if (action.equals("shiftY")) {
                rect.shiftY(value);
            } else if (action.equals("stretchX")) {
                rect.stretchX(value);
            } else if (action.equals("stretchY")) {
                rect.stretchY(value);
            } else {
                throw new Exception("Некорректное действие: " + arr[0]);
            }
        }
    }

    static void logic6981(Scanner scanner) {
        Map<String, interface2033> map = new HashMap<>();
        int count = 0;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            try {
                parse6981(map, line);
            } catch (Exception e) {
                count++;
            }
        }
        for (Map.Entry<String, interface2033> item : map.entrySet()) {
            System.out.print(item.getKey());
            System.out.print(" ");
            System.out.println(item.getValue());
        }
        System.out.println("Некорректных записей: " + count);
    }

    public static void task6981(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            System.out.println(filename);
            logic6981(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        }
    }
}
