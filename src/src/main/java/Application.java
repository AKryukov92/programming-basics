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
        String css = loadCss("styles.css");
        TaskBook[] taskBooks = makeNav(themeList, "cs");
        taskBooks[0].prepareTargetDirectory();
        taskBooks[0].withSourceDirectory("lab01")
                .withGroup("Печать текста на экране")
                .addCitation("c1_p4.3")
                .addExampleWithManual(1662)

                .withGroup("Диктант по присваиванию")
                .addExample(4131)
                .addTask(7365)

                .withGroup("Получение строк от пользователя")
                .addExampleWithManual(1860)
                .addCitation("c7_p33")
                .addTask(4764)
                .addTask(1910)
                .addTask(2429)
                .addCitation("c6_p30.2")
                .addTask(7472)

                .withGroup("Оформление текста по шаблону")
                .addCitation("c3_p10.2")
                .addExample(4140)
                .addTask(2959)
                .addTask(7271)
                .addTask(2632)
                .addTask(4343)
                .addTask(7474)

                .withGroup("Уменьшение дублей повторяющихся фрагментов текста")
                .addTask(1640)
                .addTask(8693)
                .make(css)
        ;
        taskBooks[1].withSourceDirectory("lab02")
                .withGroup("Вывод на экран действительных чисел с заданной точностью")
                .addExampleWithManual(3862)
                .addExampleWithManual(9231)

                .withGroup("Операторы и операнды")
                .addExampleWithManual(4411)
                .addTask(3832)
                .addTask(7457)
                .addTask(9865)
                .addTask(1976)

                .withGroup("Использование математических функций")
                .addExample(8428)
                .addCitation("c7_p32.5")
                .addExampleWithManual(7711)
                .addTask(1262)
                .addTask(9164)
                .addTask(3558)
                .addTask(6924)
                .make(css)
        ;
        taskBooks[2].withSourceDirectory("lab03")
                .withGroup("Ограничения, связанные с предметной областью")
                .addCitation("c2_p8.1")
                .addExample(9298)
                .addTask(4312)
                .addTask(3354)
                .addCitation("c3_p11.1")
                .addTask(5201)
                .addTask(2981)
                .withGroup("Ограничения при вычислении корня")
                .addExample(8833)
                .addTask(9020)
                .addCitation("c3_p11.2")
                .addTask(1934)
                .addTask(3943)
                .addTask(4913)
                .withGroup("Вычисление остатка от деления")
                .addExample(2361)
                .addTask(5063)
                .addTask(5870)
                .withGroup("Практика")
                .addTask(7237)
                .addTask(7619)
                .addTask(1346)
                .addTask(9622)
                .addCitation("c3_p12.1")
                .addTask(8873)
                .addTask(7799)
                .addTask(9354)
                .addTask(9130)
                .addTask(5895)
                .addTask(2461)
                .addTask(2790)
                .addTask(2624)
                .addTask(5871)
                .addTask(3591)
                .addTask(4366)
                .addTask(5789)
                .addTask(6522)
                .addTask(3490)
                .make(css)
        ;
    }

    private static String loadCss(String path) throws IOException {
        Path p = Paths.get(path);
        System.out.println("Reading css from '" + p.toAbsolutePath().toString());
        return new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
    }

    //TODO: Формировать массив тем за пределами метода,
    // а тут только указывать индекс практической и добавлять заголовок для навигации
    // Зачем?
    private static TaskBook[] makeNav(String[] themeList, String langAbbreviation) {
        TaskBook[] taskBooks = new TaskBook[themeList.length];
        StringBuilder themeNavContent = new StringBuilder();
        themeNavContent.append("<div class='lab_nav'>Другие темы<ol>");
        for (int i = 0; i < themeList.length; i++) {
            int labIndex = i + 1;
            taskBooks[i] = TaskBook.builder()
                    .withIndex(labIndex)
                    .withLangAbbreviation(langAbbreviation)
                    .withTheme(themeList[i]);
            themeNavContent.append(String.format("<li>%d <a href='%s'>%s</a></li>",
                    labIndex, taskBooks[i].getFilenameForLink(), themeList[i]));
        }
        themeNavContent.append("</ol></div>");
        String navContent = themeNavContent.toString();
        for (int i = 0; i < themeList.length; i++) {
            taskBooks[i].withThemeNav(navContent);
        }
        return taskBooks;
    }
}
