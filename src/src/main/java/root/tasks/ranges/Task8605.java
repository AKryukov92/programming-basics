package root.tasks.ranges;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task8605 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Исходный файл " + linkToFile("files/task8605/dates.txt", "dates.txt") + " содержит список дат. Каждая строка содержит одну дату, описанную тремя числами: год, месяц и день. Написать пользователю, возможна ли такая дата и если нет, то почему.");
        appendCheckSingleNonEscaped(wrapLogic("files/task8605/dates.txt"));
        appendFooter();
    }

    @Override
    protected void logic(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.print(line + " ");
                String[] parts = line.split("-");
                if (parts.length == 3) {
                    int year = Integer.parseInt(parts[0]);
                    int month = Integer.parseInt(parts[1]);
                    int day = Integer.parseInt(parts[2]);
                    if (day < 0) {
                        System.out.println("День должен быть 1 или более");
                    } else if (month < 0 || month > 12) {
                        System.out.println("Месяц должен быть от 1 до 12 включительно");
                    } else if (month == 1 && day > 31) {
                        System.out.println("Количество дней в январе не должно превышать 31");
                    } else if (month == 2 && year % 4 == 0 && day > 29) {
                        System.out.println("Количество дней в феврале високосного года не должно превышать 29");
                    } else if (month == 2 && year % 4 != 0 && day > 28) {
                        System.out.println("Количество дней в феврале НЕвисокосного года не должно превышать 28");
                    } else if (month == 3 && day > 31) {
                        System.out.println("Количество дней в марте не должно превышать 31");
                    } else if (month == 4 && day > 30) {
                        System.out.println("Количество дней в апреле не должно превышать 31");
                    } else if (month == 5 && day > 31) {
                        System.out.println("Количество дней в мае не должно превышать 31");
                    } else if (month == 6 && day > 30) {
                        System.out.println("Количество дней в июне не должно превышать 30");
                    } else if (month == 7 && day > 31) {
                        System.out.println("Количество дней в июле не должно превышать 31");
                    } else if (month == 8 && day > 31) {
                        System.out.println("Количество дней в августе не должно превышать 31");
                    } else if (month == 9 && day > 30) {
                        System.out.println("Количество дней в сентябре не должно превышать 30");
                    } else  if (month == 10 && day > 31) {
                        System.out.println("Количество дней в октябре не должно превышать 31");
                    } else if (month == 11 && day > 30) {
                        System.out.println("Количество дней в ноябре не должно превышать 30");
                    } else  if (month == 12 && day > 31) {
                        System.out.println("Количество дней в декабре не должно превышать 31");
                    } else {
                        System.out.println("Дата корректна");
                    }
                } else {
                    System.out.println("Дата должна состоять из трех чисел");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8605());
    }
}
