package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3226 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Файл с исходными данными содержит открывающиеся и закрывающиеся фигурные скобочки.Если есть другая, нужно вывести сообщение об ошибке. Нужно определить максимальную глубину вложенности.");
        appendCheckValuesHeader("filename");
        appendCheckValuesRowWithFile("files/task3226/test1.txt");
        appendCheckValuesRowWithFile("files/task3226/test2.txt");
        appendCheckValuesRowWithFile("files/task3226/test3.txt");
        appendCheckValuesRowWithFile("files/task3226/test4.txt");
        appendCheckValuesRowWithFile("files/task3226/test5.txt");
        appendCheckValuesRowWithFile("files/task3226/test6.txt");
        appendCheckValuesRowWithFile("files/task3226/test7.txt");
        appendCheckValuesRowWithFile("files/task3226/test8.txt");
        appendCheckValuesRowWithFile("files/task3226/test9.txt");
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
                System.out.println("Обрабатываю строку '" + line + "'");
                int openIndex;
                int closeIndex;
                int lastIndex = 0;
                while (lastIndex < line.length()) {
                    closeIndex = line.indexOf("}", lastIndex);
                    openIndex = line.indexOf("{", lastIndex);
                    if (openIndex >= 0) {
                        System.out.println("Найдена открывающая скобка на индексе " + openIndex);
                        if (closeIndex < 0) {
                            System.out.println("Закрывающая скобка не найдена");
                            depth++;
                            System.out.println("Вложенность " + depth);
                            lastIndex = openIndex;
                        } else {
                            System.out.println("Найдена закрывающая скобка на индексе " + closeIndex);
                            if (openIndex < closeIndex) {
                                System.out.println("Закрывающая скобка после открывающей");
                                depth++;
                                System.out.println("Вложенность " + depth);
                                lastIndex = openIndex;
                            } else {
                                System.out.println("Закрывающая скобка перед открывающей");
                                depth--;
                                System.out.println("Вложенность " + depth);
                                lastIndex = closeIndex;
                            }
                        }
                    } else {
                        System.out.println("Открывающая скобка не найдена");
                        if (closeIndex < 0) {
                            System.out.println("Закрывающая скобка не найдена");
                            break;
                        } else {
                            System.out.println("Найдена закрывающая скобка на индексе " + closeIndex);
                            depth--;
                            System.out.println("Вложенность " + depth);
                            lastIndex = closeIndex;
                        }
                    }
                    if (depth < 0) {
                        break;
                    }
                    if (maxDepth < depth) {
                        System.out.println("Текущая вложенность " + depth + " больше предыдущей максимальной " + maxDepth);
                        maxDepth = depth;
                    }
                    lastIndex++;
                }
                if (depth < 0) {
                    break;
                }
            }
            if (depth > 0) {
                System.out.println("Неожиданный конец файла");
            } else if (depth < 0) {
                System.out.println("Неожиданная закрывающаяся скобочка");
            } else {
                System.out.println("Максимальная вложенность " + maxDepth);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3226());
    }
}
