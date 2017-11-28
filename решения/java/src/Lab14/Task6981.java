package Lab14;

import common.Utils;
import Lab14.task2033.Circle2033;
import Lab14.task2033.Figure2033;
import Lab14.task5108.Rectangle5108;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Task6981 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("6981");
        for (int i = 0; i < 9; i++) {
            task6981(".\\task6981\\test" + (i + 1) + ".csv");
        }
    }

    private static void task6981(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            Map<String, Figure2033> map = new HashMap<>();
            System.out.println(filename);
            int errorCount = logic6981(scanner, map);
            StringBuilder description = new StringBuilder();
            StringBuilder geometry = new StringBuilder();
            for (Map.Entry<String, Figure2033> item : map.entrySet()) {
                description.append(item.getKey()).append(" Действий:").append(item.getValue().getCount()).append("<br/>");
                geometry.append(item.getValue());
            }
            description.append("Некорректных записей: ").append(errorCount);
            Utils.writeToHtml(filename + ".html", Utils.SCREEN_WIDTH, Utils.SCREEN_HEIGHT, description.toString(), geometry.toString());

        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        }
    }

    private static int logic6981(Scanner scanner, Map<String, Figure2033> map) {
        int count = 0;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            try {
                parse6981(map, line);
            } catch (Exception e) {
                count++;
            }
        }
        return count;
    }

    private static void parse6981(Map<String, Figure2033> map, String line) throws Exception {
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
        } else {
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
                throw new Exception("Некорректное действие: " + arr[0]);
            }
        }
    }


}
