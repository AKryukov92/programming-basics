package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4477 extends OneInputValLayout {
    private Task3226 oldVersionOfTask;

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Файл с исходными данными содержит открывающие '{' и закрывающие '}' фигурные скобки. На каждой строке находится только одна скобка. Если в строке содержится что-то другое, нужно вывести сообщение об ошибке. Нужно определить максимальную глубину вложенности, вывести подробный ход решения.");
        appendCheckValuesHeader("filename");
        appendCheckValuesRowWithFile("files/task4477/test1.txt");
        appendCheckValuesRowWithFile("files/task4477/test2.txt");
        appendCheckValuesRowWithFile("files/task4477/test3.txt");
        appendCheckValuesRowWithFile("files/task4477/test4.txt");
        appendCheckValuesRowWithFile("files/task4477/test5.txt");
        appendCheckValuesRowWithFile("files/task4477/test6.txt");
        appendCheckValuesRowWithFile("files/task4477/test7.txt");
        appendCheckValuesRowWithFile("files/task4477/test9.txt");
        appendCheckValuesRowWithFile("files/task4477/test10.txt");
        appendCheckValuesRowWithFile("files/task4477/test11.txt");
        appendCheckValuesRowWithFile("files/task4477/test12.txt");
        appendCheckValuesRowWithFile("files/task4477/test13.txt");
        appendCheckValuesRowWithFile("files/task4477/test14.txt");
        appendCheckValuesRowWithFile("files/task4477/test15.txt");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            int depth = 0;
            int maxDepth = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.equals("{")) {
                    for (int i = 0; i < depth; i++) {
                        System.out.print(' ');
                    }
                    depth++;
                    System.out.println("Скобки открылись.");
                    for (int i = 0; i < depth; i++) {
                        System.out.print(' ');
                    }
                    if (maxDepth < depth) {
                        System.out.println("Текущая вложенность " + depth + " больше максимальной " + maxDepth);
                        maxDepth = depth;
                    } else {
                        System.out.println("Текущая вложенность " + depth + " не больше максимальной " + maxDepth);
                    }
                } else if (line.equals("}")) {
                    depth--;
                    if (depth < 0) {
                        System.out.println("Неожиданная закрывающая скобка");
                        break;
                    }
                    for (int i = 0; i < depth; i++) {
                        System.out.print(' ');
                    }
                    System.out.println("Закрылись скобки.");
                } else {
                    System.out.println("Неожиданный фрагмент '" + line + "'");
                }
            }
            if (depth > 0) {
                System.out.println("Неожиданный конец файла");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4477());
    }
}
