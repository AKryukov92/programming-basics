import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Александр on 09.02.2019.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        String[] themeList = new String[]{
                "Заполнение шаблона текстом",
                "Организация вычислений",
                "Проверка исходных данных",
                "Взаимоисключающие случаи",
                "Работа с интервалами значений",
                "Реорганизация повторяющихся действий",
                "Массивы",
                "Вычисление агрегатов",
                "Строки",
                "Обработка неизвестного объема данных",
                "Запись в файлы",
                "Методы",
                "Исключения",
                "Классы и объекты",
                "Коллекции"
        };
        TaskGroup[] groups = new TaskGroup[]{
                new TaskGroup("Печать текста на экране",
                        new BookCitation("c1_p4.3"),
                        LabTask.makeExample(1662)),
                new TaskGroup("Диктант по присваиванию",
                        LabTask.makeExample(4131),
                        LabTask.make(7365)),
                new TaskGroup("Получение строк от пользователя",
                        LabTask.makeExample(1860),
                        new BookCitation("c7_p33"),
                        LabTask.make(4764),
                        LabTask.make(1910),
                        LabTask.make(2429),
                        new BookCitation("c6_p30.2"),
                        LabTask.make(7472)),
                new TaskGroup("Оформление текста по шаблону",
                        new BookCitation("c3_p10.2"),
                        LabTask.makeExample(4140),
                        LabTask.make(2959),
                        LabTask.make(7271),
                        LabTask.make(2632),
                        LabTask.make(4343),
                        LabTask.make(7474)),
                new TaskGroup("Уменьшение дублей повторяющихся фрагментов текста",
                        LabTask.make(1640),
                        LabTask.make(8693))
        };
        String css = loadCss("styles.css");
        String themeNav = makeNav(themeList);
        makeLab(1, themeList[0], groups, css, themeNav);
    }

    private static String makeFilename(int index) {
        return "Задания к " + index + " практической работе.html";
    }

    private static String loadCss(String path) throws IOException {
        Path p = Paths.get(path);
        System.out.println("Reading css from '" + p.toAbsolutePath().toString());
        return new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
    }

    private static String makePageTop(int index, String title, String css) {
        return String.format("<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<meta charset='utf-8'/>" +
                "<title>%d %s</title>" +
                "<style>%s</style>" +
                "</head>" +
                "<body class='section'>", index, title, css);
    }

    private static String makeHeading(String title) {
        return String.format("<a name='heading'><h1>%s</h1></a>", title);
    }

    private static String makeNav(String[] themeList) {
        StringBuilder sb = new StringBuilder();
        sb.append("<div class='lab_nav'>Другие темы<ol>");
        for (int i = 0; i < themeList.length; i++) {
            sb.append(String.format("<li>%d<a href='%s'>%s</a></li>", i + 1, makeFilename(i + 1), themeList[i]));
        }
        sb.append("</ol></div>");
        return sb.toString();
    }

    private static String makeTaskNav(TaskGroup[] groups) {
        int leftAmount = 1, rightAmount = 0;
        for (int l = groups.length - 1, i = 0; i <= l; ) {
            if (leftAmount <= rightAmount) {
                leftAmount += groups[i].navLength();
                i++;
            } else {
                rightAmount += groups[l].navLength();
                l--;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<div class='nav'><ul>");
        sb.append("<li><a href='#heading'>^</a></li>");
        int index = 1;
        for (int i = 0; i < groups.length; i++) {
            index = groups[i].addToNav(sb, index);
            if (index == leftAmount) {
                sb.append("</ul><ul>");
            }
        }
        sb.append("</ul></div>");
        return sb.toString();
    }

    private static final String BOTTOM_TEMPLATE = "</body>" +
            "</html>";

    public static void makeLab(int index, String title, TaskGroup[] groups, String css, String themeNav) throws IOException {
        String filename = makeFilename(index);
        File result = new File(filename);
        PrintWriter writer = new PrintWriter(result);
        writer.write(makePageTop(index, title, css));
        writer.write(makeHeading(title));
        writer.write(themeNav);
        writer.write(makeTaskNav(groups));
        for (int i = 0; i < groups.length; i++) {
            groups[i].appendContentTo(writer);
        }
        writer.write(BOTTOM_TEMPLATE);
        writer.close();
    }
}
