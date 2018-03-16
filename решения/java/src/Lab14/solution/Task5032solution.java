package Lab14.solution;

import Lab14.solution.task5032.Rectangle5032;
import common.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Task5032solution {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("5032");
        for (int i = 0; i < 14; i++) {
            task5032(".\\task5032\\test" + (i + 1) + ".csv");
        }
    }

    public static void task5032(String filename) {
        File target = new File(filename);
        Rectangle5032 rect = new Rectangle5032(100, 100, 100, 100, "black");
        Rectangle5032 example = new Rectangle5032(100, 100, 100, 100, "red");
        try (Scanner scanner = new Scanner(target)) {
            logic5032(scanner, rect);
            String description = "<p>Действий: " + rect.getCount() + "</p>" +
                "<p>Результат:</p>";
            Utils.writeToHtml(filename + ".html", 500, 350, description, example.toString() + rect.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            String description = "<p>Действий: " + rect.getCount() + "</p>" +
                "<p>Ошибка: " + e.getMessage() + "</p>" +
                "<p>Последнее корректное состояние:</p>";
            Utils.writeToHtml(filename + ".html", 500, 350, description, example.toString() + rect.toString());
        }
    }

    private static void logic5032(Scanner scanner, Rectangle5032 rect) throws Exception {
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

}
