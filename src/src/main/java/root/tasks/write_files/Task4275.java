package root.tasks.write_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class Task4275 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Исходный файл " + linkToFile("files/task4275/composers.csv") + " содержит записи о композиторах. Первая строка содержит заголовки столбцов. Каждая строка содержит атрибуты одного композитора, перечисленные через точку с запятой \";\". Атрибуты записаны в следующем порядке:");
        appendOrderedNonEscaped(
                "composer_id - идентификатор композитора",
                "first_name - имя",
                "last_name - фамилия",
                "birth_date - дата рождения",
                "birth_place - место рождения",
                "death_date - дата смерти",
                "death_place - место смерти",
                "wiki_page - ссылка на страницу Википедии"
        );
        appendTaskDescEscaped("Нужно сформировать множество html файлов. Каждый файл должен содержать информацию по отдельному композитору. Название файла оформляется по шаблону \"composer$composer_id.txt\", где вместо $composer_id идентификатор композитора. Файл должен содержать технический текст по стандарту html, а текст по следующему шаблону:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols("<h1>$first_name $last_name</h1>\n" +
                "Родился $birth_date в $birth_place\n" +
                "Умер $death_date в $death_place\n" +
                "Подробнее <a href=$wiki_page>Страница на Википедии</a>"));
        appendCheckSingleNonEscaped(escapeHtmlSymbols(wrapLogic("files/task4275/composers.csv")));
        appendFooter();
    }

    @Override
    protected void logic(String file) throws SQLException, FileNotFoundException {
        File target = new File(file);
        try (Scanner scanner = new Scanner(target)) {
            if (scanner.hasNext()) {
                scanner.nextLine();
            }
            while (scanner.hasNext()) {
                String entry = scanner.nextLine();
                String[] attributes = entry.split(";");
                System.out.printf("Файл composer%s.html\n", attributes[0]);
                System.out.println("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\"/>\n" +
                        "<head/>\n" +
                        "<body>");
                System.out.printf(
                        "<h1>%s %s</h1>\n" +
                                "Родился %s в %s\n" +
                                "Умер %s в %s\n" +
                                "Подробнее <a href=%s>Страница на Википедии</a>\n",
                        attributes[1],
                        attributes[2],
                        attributes[3],
                        attributes[4],
                        attributes[5],
                        attributes[6],
                        attributes[7]
                );
                System.out.println("</body>\n" +
                        "</html>\n\n");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4275());
    }
}
