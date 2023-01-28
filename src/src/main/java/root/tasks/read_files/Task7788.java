package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7788 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendNonEscaped("Исходный файл " + linkToFile("files/task7788/composers.csv", "composers.csv") + " содержит записи о композиторах. Первая строка содержит заголовки столбцов. Каждая строка содержит атрибуты одного композитора, перечисленные через точку с запятой \";\". Атрибуты записаны в следующем порядке:");
        appendOrdered(
                "composer_id - идентификатор композитора",
                "first_name - имя",
                "last_name - фамилия",
                "birth_date - дата рождения",
                "birth_place - место рождения",
                "death_date - дата смерти",
                "death_place - место смерти",
                "wiki_page - ссылка на страницу Википедии"
        );
        appendTaskDesc(
                "Нужно вывести фамилию, дату и место смерти. Первой колонкой должен быть код композитора. Порядок вывода соответствует содержимому файла. Перед списком композиторов нужно вывести заголовки столбцов. После списка композиторов нужно вывести фразу \"Всего композиторов\" и количество записей в файле. Строка с заголовками столбцов не участвует в подсчёте количества.");
        appendCheckSingle(wrapLogic("files/task7788/composers.csv"));
        appendFooter();
    }

    @Override
    protected void logic(String file) {
        File target = new File(file);
        try (Scanner scanner = new Scanner(target)) {
            int count = -1;
            while (scanner.hasNext()) {
                String entry = scanner.nextLine();
                String[] attributes = entry.split(";");
                System.out.printf(
                        "%s %s %s %s\n",
                        attributes[0],
                        attributes[2],
                        attributes[5],
                        attributes[6]
                );
                count++;
            }
            System.out.println("Всего композиторов: " + count);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7788().getContent());
    }
}
