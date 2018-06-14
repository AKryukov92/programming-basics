package Lab15.solution;

import Lab15.solution.task5108.Rectangle5108;
import common.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Task5108solution {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("5108");
        for (int i = 0; i < 14; i++) {
            task5108(".\\task5108\\test" + (i + 1) + ".csv");
        }
    }

    private static void task5108(String filename) {
        File target = new File(filename);
        Map<String, Rectangle5108> map = new HashMap<>();
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
            for (Map.Entry<String, Rectangle5108> item : map.entrySet()) {
                description.append("<p>");
                description.append(item.getKey());
                description.append(" действий: ");
                description.append(item.getValue().getCount());
                description.append("</p>");
                content.append(item.getValue());
            }
            Utils.writeToHtml(filename + ".html", 800, 600, description.toString(), content.toString());
        }
    }

    private static void logic5108(Scanner scanner, Map<String, Rectangle5108> map) throws Exception {
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
                map.put(id, new Rectangle5108(
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
            Rectangle5108 rect = map.get(id);
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
        Random rnd = new Random();
        int x = rnd.nextInt(Utils.SCREEN_WIDTH);
        int y = rnd.nextInt(Utils.SCREEN_HEIGHT);
        int w = rnd.nextInt(Utils.SCREEN_WIDTH - x);
        int h = rnd.nextInt(Utils.SCREEN_HEIGHT - y);
        Rectangle5108 rect = new Rectangle5108(x, y, h, w);
        System.out.printf("create;%s;%d;%d;%d;%d\n", id, x, y, h, w);
        int n = rnd.nextInt(100) + 100;
        try {
            for (int i = 0; i < n; i++) {
                int action = rnd.nextInt(4);
                if (action == Utils.SHIFT_X) {
                    int value = rnd.nextInt(Utils.SCREEN_WIDTH - rect.getW()) - rect.getX();
                    System.out.print("shiftX;" + id + ";" + value);
                    rect.shiftX(value);
                    // System.out.println(";" + (rect.x + rect.w));
                } else if (action == Utils.SHIFT_Y) {
                    int value = rnd.nextInt(Utils.SCREEN_HEIGHT - rect.getH()) - rect.getY();
                    System.out.print("shiftY;" + id + ";" + value);
                    rect.shiftY(value);
                    //System.out.println(";" + (rect.y + rect.h));
                } else if (action == Utils.STRETCH_X) {
                    int value = rnd.nextInt(Utils.SCREEN_WIDTH - rect.getX()) - rect.getW() + 1;
                    System.out.print("stretchX;" + id + ";" + value);
                    rect.stretchX(value);
                    //System.out.println(";" + (rect.y + rect.h));
                } else if (action == Utils.STRETCH_Y) {
                    int value = rnd.nextInt(Utils.SCREEN_HEIGHT - rect.getY()) - rect.getH() + 1;
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

}
