package root.tasks.collections;

import root.tasks.StreamInputLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task3146 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("В файле слова, которые могут повторяться. Нужно запомнить сколько раз встречается каждое слово. Пользователь вводит бесконечное количество чисел. После каждого числа нужно вывести на экран слова, которые повторяются указанное количество раз.");
        appendCheckValuesHeader();
        appendCheckValuesRow("task3146/test1.txt,1,2,3".split(","));
        appendCheckValuesRow("task3146/test2.txt,1,2,3".split(","));
        appendCheckValuesRow("task3146/test3.txt,1,2,3".split(","));
        appendCheckValuesRow("task3146/test3.txt,3,0".split(","));
        appendCheckValuesRow("task3146/test4.txt,1,2,3".split(","));
        appendCheckValuesRow("task3146/test5.txt,1,2,3,4,1000".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        HashMap<String, Integer> amountByName = new HashMap<>();
        HashMap<Integer, Set<String>> namesByAmount = new HashMap<>();
        String filename = source.next();
        File target = new File("./files/" + filename);
        try (Scanner s = new Scanner(target)) {
            while (s.hasNext()) {
                String current = s.nextLine();
                System.out.println("Обрабатываю слово " + current);
                int newAmount;
                if (amountByName.containsKey(current)) {
                    newAmount = amountByName.get(current) + 1;
                } else {
                    newAmount = 1;
                }
                amountByName.put(current, newAmount);
                int oldAmount = newAmount - 1;
                //remove old position of current
                if (namesByAmount.containsKey(oldAmount)) {
                    System.out.println("Есть слова, которые встречались " + oldAmount + " раз. Очищаю.");
                    Set<String> oldNames = namesByAmount.get(oldAmount);
                    Set<String> newNames = new HashSet<>(oldNames);
                    newNames.remove(current);
                    namesByAmount.put(oldAmount, newNames);
                }
                //append to new position of current
                if (namesByAmount.containsKey(newAmount)) {
                    System.out.println("Есть слова, которые встречались " + newAmount + " раз. Дополняю.");
                    Set<String> oldNames = namesByAmount.get(newAmount);
                    Set<String> newNames = new HashSet<>(oldNames);
                    newNames.add(current);
                    namesByAmount.put(newAmount, newNames);
                } else {
                    System.out.println("Отсутствуют слова, которые встречались " + newAmount + " раз. Создаю новую запись.");
                    Set<String> names = new HashSet<>();
                    names.add(current);
                    namesByAmount.put(newAmount, names);
                }
            }
            System.out.println("Обработка файла завершена.");
            while (source.hasNext()) {
                System.out.println("Введите число");
                int n = Integer.parseInt(source.next());
                if (namesByAmount.containsKey(n)) {
                    Set<String> names = namesByAmount.get(n);
                    if (names.isEmpty()){
                        System.out.println("Нет слов, которые бы встречались " + n + " раз.");
                    } else {
                        System.out.println("Слова, которые встречаются " + n + " раз: " + String.join(" ", names));
                    }
                } else {
                    System.out.println("Нет слов, которые бы встречались " + n + " раз.");
                }
            }


        } catch (FileNotFoundException ex) {
            System.out.println("Файл не существует " + target.getAbsolutePath());
        }
    }


    public static void main(String[] args) {
        System.out.println(new Task3146());
    }
}