package Lab14;

import Lab14.task3567.Circle3567;
import common.Utils;
import Lab14.task2033.Circle2033;
import Lab14.task2033.Figure2033;
import Lab14.task5108.Rectangle5108;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.List;

/**
 * @author akryukov
 *         26.04.2017
 */
public class Task3567 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("3567");
        for (int i = 0; i < 14; i++) {
            task3567(".\\task3567\\test" + (i + 1) + ".csv");
        }
    }

    private static void logic3567(Scanner scanner, Circle3567 circle) throws Exception {
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
        Circle3567 circle = new Circle3567(150, 150, 100, "black");
        Circle3567 example = new Circle3567(150, 150, 100, "red");
        try (Scanner scanner = new Scanner(target)) {
            System.out.println(filename);
            logic3567(scanner, circle);
            String description = "<p>Действий: " + circle.getCount() + "</p>" +
                "<p>Результат:</p>";
            Utils.writeToHtml(filename + ".html", 500, 350, description, example.toString() + circle.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            String description = "<p>Действий: " + circle.getCount() + "</p>" +
                "<p>Ошибка: " + e.getMessage() + "</p>" +
                "<p>Последнее корректное состояние:</p>";
            Utils.writeToHtml(filename + ".html", 500, 350, description, example.toString() + circle.toString());
        }
    }

    public static void task6981prepare() {
        int n = 100000;
        int totalElements = 10;
        List<Figure2033> elements = new ArrayList<>(totalElements);
        elements.add(new Circle2033(100, 100, 50));
        System.out.printf("create;circle;f0;%d;%d;%d\n", 100, 100, 50);
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n) {
            try {
                int roll = rnd.nextInt(6);
                int id = rnd.nextInt(elements.size());
                Figure2033 item = elements.get(id);
                if (roll == Utils.SHIFT_X) {
                    int min = -Utils.SCREEN_WIDTH;
                    int max = item.maxShiftX(Utils.SCREEN_WIDTH);
                    int value = rnd.nextInt(max - min) + min;
                    System.out.printf("shiftX;f%d;%d\n", id, value);
                    item.shiftX(value);
                } else if (roll == Utils.SHIFT_Y){
                    int min = -Utils.SCREEN_HEIGHT;
                    int max = item.maxShiftY(Utils.SCREEN_HEIGHT);
                    int value = rnd.nextInt(max - min) + min;
                    System.out.printf("shiftY;f%d;%d\n", id, value);
                    item.shiftY(value);
                } else if (roll == Utils.STRETCH_X){
                    int min = -1000;
                    int max = item.maxStretchX(Utils.SCREEN_WIDTH, Utils.SCREEN_HEIGHT);
                    int value = rnd.nextInt(max - min) + min;
                    System.out.printf("stretchX;f%d;%d\n", id, value);
                    item.stretchX(value);
                } else if (roll == Utils.STRETCH_Y){
                    int min = -1000;
                    int max = item.maxStretchY(Utils.SCREEN_WIDTH, Utils.SCREEN_HEIGHT);
                    int value = rnd.nextInt(max - min) + min;
                    System.out.printf("stretchY;f%d;%d\n", id, value);
                    item.stretchY(value);
                } else if (roll == Utils.CIRCLE && elements.size() < totalElements) {
                    int r = rnd.nextInt(Utils.SCREEN_WIDTH / 2) - 2;
                    int cx = rnd.nextInt(Utils.SCREEN_WIDTH - r - r) + r;
                    int cy = rnd.nextInt(Utils.SCREEN_HEIGHT - r - r) + r;
                    System.out.printf("create;circle;f%s;%d;%d;%d\n", elements.size(), cx, cy, r);
                    elements.add(new Circle2033(cx, cy, r));
                } else if (roll == Utils.RECTANGLE && elements.size() < totalElements) {
                    int w = rnd.nextInt(Utils.SCREEN_WIDTH) - 2;
                    int h = rnd.nextInt(Utils.SCREEN_HEIGHT) - 2;
                    int x = rnd.nextInt(Utils.SCREEN_WIDTH - w);
                    int y = rnd.nextInt(Utils.SCREEN_HEIGHT - h);
                    System.out.printf("create;rectangle;f%s;%d;%d;%d;%d\n", elements.size(), x, y, h, w);
                    elements.add(new Rectangle5108(x, y, h, w));
                }
            } catch (Exception e) {
                //System.out.println(e.getMessage());
                //ignore and keep producing entries
            }
            i++;
        }
        sb.append(String.format("<svg width='%d' height='%d'>", Utils.SCREEN_WIDTH, Utils.SCREEN_HEIGHT));
        for (Figure2033 item : elements) {
            sb.append(item);
        }
        sb.append("</svg>");
        Utils.writeToHtml("data6981.html", sb.toString());
    }

}
