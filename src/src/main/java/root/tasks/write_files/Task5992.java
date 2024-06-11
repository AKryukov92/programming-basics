package root.tasks.write_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class Task5992 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Исходный файл " + linkToFile("files/task5992/composers.csv") + " содержит записи о композиторах. Первая строка содержит заголовки столбцов. Каждая строка содержит атрибуты одного композитора, перечисленные через точку с запятой \";\". Атрибуты записаны в следующем порядке:");
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
        appendTaskDescEscaped("Сформируйте html файл, содержащий список композиторов. Текст в файле будет состоять из четырех частей. Первая часть - техническое оформление html.");
        appendCheckSingleNonEscaped(escapeHtmlSymbols("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>"));
        appendTaskDescEscaped("Вторая часть - заголовок");
        appendCheckSingleNonEscaped(escapeHtmlSymbols("<h1>Композиторы</h1>"));
        appendTaskDescEscaped("Третья часть - список с именами. Каждое имя оформляется как элемент списка по шаблону ");
        appendCheckSingleNonEscaped(escapeHtmlSymbols("<li><a href=\"composer?id=$composer_id\">$first_name $last_name</a></li>"));
        appendTaskDescEscaped("где $composer_id - идентификатор композитора, $first_name - имя, $last_name - фамилия. Перед всеми элементами списка нужно поставить открывающий тэг <ol>, а после всех элементов - закрывающий тэг </ol>. Четвертая часть - техническое оформление html.");
        appendCheckSingleNonEscaped(escapeHtmlSymbols("</body>\n" +
                "</html>"));
        appendCheckSingleNonEscaped(escapeHtmlSymbols(wrapLogic("files/task7788/composers.csv")));
        appendFooter();
    }

    @Override
    protected void logic(String file) throws SQLException, FileNotFoundException {
        File target = new File(file);
        try (Scanner scanner = new Scanner(target)) {
            System.out.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<ol>");
            if (scanner.hasNext()) {
                scanner.nextLine();
            }
            while (scanner.hasNext()) {
                String entry = scanner.nextLine();
                String[] attributes = entry.split(";");
                System.out.printf(
                        "<li><a href=\"composer?id=%s\">%s %s</a></li>\n",
                        attributes[0],
                        attributes[1],
                        attributes[2]
                );
            }
            System.out.println("</ol>\n" +
                    "</body>\n" +
                    "</html>");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5992());
    }
}
