package Lab15.solution;

import Lab15.solution.task2033.Circle2033;
import Lab15.solution.task2033.Figure2033;
import common.Utils;
import Lab15.solution.task5108.Rectangle5108;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Task2033solution {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("2033");
        for (int i = 0; i < 18; i++) {
            task2033(".\\task2033\\test" + (i + 1) + ".csv");
        }
    }

    private static void task2033(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            System.out.println(filename);
            Map<String, Figure2033> results = new HashMap<>();
            logic2033(scanner, results);

            StringBuilder description = new StringBuilder();
            StringBuilder geometry = new StringBuilder();
            for (Map.Entry<String, Figure2033> item : results.entrySet()) {
                description.append(item.getKey()).append(" Действий:").append(item.getValue().getCount()).append("<br/>");
                geometry.append(item.getValue());
            }
            Utils.writeToHtml(filename + ".html", Utils.SCREEN_WIDTH, Utils.SCREEN_HEIGHT, description.toString(), geometry.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void logic2033(Scanner scanner, Map<String, Figure2033> map) throws Exception {
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
                    map.put(id, new Circle2033(
                        Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5])
                    ));
                } else if (type.equals("rectangle")) {
                    if (arr.length != 7) {
                        throw new Exception("Некорректный формат");
                    }
                    map.put(id, new Rectangle5108(
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
            Figure2033 rect = map.get(id);
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
    }


    public static void task2033prepare() throws Throwable {
        int n = 1000000;
        int totalElements = 10;
        List<Figure2033> elements = new ArrayList<>(totalElements);
        elements.add(new Circle2033(100, 100, 50));
        System.out.printf("create;circle;f%s;%d;%d;%d\n", elements.size(), 100, 100, 50);
        int i = 0;
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        while (i < n) {
            try {
                int roll = rnd.nextInt(6);
                int id = rnd.nextInt(elements.size());
                Figure2033 item = elements.get(id);
                if (roll == Utils.SHIFT_X) {
                    int min = item.minShiftX();
                    int max = item.maxShiftX(Utils.SCREEN_WIDTH);
                    int value = rnd.nextInt(max - min) + min;
                    System.out.printf("shiftX;f%s;%d\n", id, value);
                    item.shiftX(value);
                } else if (roll == Utils.SHIFT_Y) {
                    int min = item.minShiftY();
                    int max = item.maxShiftY(Utils.SCREEN_HEIGHT);
                    int value = rnd.nextInt(max - min) + min;
                    System.out.printf("shiftY;f%s;%d\n", id, value);
                    item.shiftY(value);
                } else if (roll == Utils.STRETCH_X) {
                    int min = item.minStretchX();
                    int max = item.maxStretchX(Utils.SCREEN_WIDTH, Utils.SCREEN_HEIGHT);
                    int value = rnd.nextInt(max - min) + min;
                    System.out.printf("stretchX;f%s;%d\n", id, value);
                    item.stretchX(value);
                } else if (roll == Utils.STRETCH_Y) {
                    int min = item.minStretchY();
                    int max = item.maxStretchY(Utils.SCREEN_WIDTH, Utils.SCREEN_HEIGHT);
                    int value = rnd.nextInt(max - min) + min;
                    System.out.printf("stretchY;f%s;%d\n", id, value);
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
            } catch (Exception ex) {
                sb.append(String.format("<svg width='%d' height='%d'>", Utils.SCREEN_WIDTH, Utils.SCREEN_HEIGHT));
                for (Figure2033 item : elements) {
                    sb.append(item);
                }
                sb.append("</svg>");
                //writeToHtml("data2033.html", sb.toString());
                throw new Throwable(ex);
            }
            i++;
        }
        sb.append(String.format("<svg width='%d' height='%d'>", Utils.SCREEN_WIDTH, Utils.SCREEN_HEIGHT));
        for (Figure2033 item : elements) {
            sb.append(item);
        }
        sb.append("</svg>");
        Utils.writeToHtml("data2033.html", sb.toString());
    }
}
