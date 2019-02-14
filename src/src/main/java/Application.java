import java.io.IOException;
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
        String LAB_01_DIR = "lab01";
        String css = loadCss("styles.css");
        TaskBook[] taskBooks = makeNav(themeList);
        Manual man1662 = Manual.builder()
                .withDirectory(LAB_01_DIR)
                .forTask(LabTask.makeExample(LAB_01_DIR, 1662))
                .withLangAbbreviation("cs");

        taskBooks[0].withGroups(
                        new TaskGroup("Печать текста на экране",
                                new BookCitation(LAB_01_DIR, "c1_p4.3"),
                                man1662.getTask()),
                        new TaskGroup("Диктант по присваиванию",
                                LabTask.makeExample(LAB_01_DIR, 4131),
                                LabTask.make(LAB_01_DIR, 7365)),
                        new TaskGroup("Получение строк от пользователя",
                                LabTask.makeExample(LAB_01_DIR, 1860).withManual(),
                                new BookCitation(LAB_01_DIR, "c7_p33"),
                                LabTask.make(LAB_01_DIR, 4764),
                                LabTask.make(LAB_01_DIR, 1910),
                                LabTask.make(LAB_01_DIR, 2429),
                                new BookCitation(LAB_01_DIR, "c6_p30.2"),
                                LabTask.make(LAB_01_DIR, 7472)),
                        new TaskGroup("Оформление текста по шаблону",
                                new BookCitation(LAB_01_DIR, "c3_p10.2"),
                                LabTask.makeExample(LAB_01_DIR, 4140),
                                LabTask.make(LAB_01_DIR, 2959),
                                LabTask.make(LAB_01_DIR, 7271),
                                LabTask.make(LAB_01_DIR, 2632),
                                LabTask.make(LAB_01_DIR, 4343),
                                LabTask.make(LAB_01_DIR, 7474)),
                        new TaskGroup("Уменьшение дублей повторяющихся фрагментов текста",
                                LabTask.make(LAB_01_DIR, 1640),
                                LabTask.make(LAB_01_DIR, 8693)));
        taskBooks[0].make(css);
        man1662.make(css);

    }

    private static String loadCss(String path) throws IOException {
        Path p = Paths.get(path);
        System.out.println("Reading css from '" + p.toAbsolutePath().toString());
        return new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
    }

    //TODO: Формировать массив тем за пределами метода, а тут только указывать индекс практической и добавлять заголовок для навигации
    private static TaskBook[] makeNav(String[] themeList) {
        TaskBook[] taskBooks = new TaskBook[themeList.length];
        StringBuilder themeNavContent = new StringBuilder();
        themeNavContent.append("<div class='lab_nav'>Другие темы<ol>");
        for (int i = 0; i < themeList.length; i++) {
            int labIndex = i + 1;
            taskBooks[i] = TaskBook.builder()
                    .withIndex(labIndex)
                    .withTheme(themeList[i]);
            themeNavContent.append(String.format("<li>%d<a href='%s'>%s</a></li>", labIndex, taskBooks[i].getFilename(), themeList[i]));
        }
        themeNavContent.append("</ol></div>");
        String navContent = themeNavContent.toString();
        for (int i = 0; i < themeList.length; i++){
            taskBooks[i].withThemeNav(navContent);
        }
        return taskBooks;
    }
}
