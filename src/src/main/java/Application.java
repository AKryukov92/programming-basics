import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

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
                "Вложенные циклы",
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
        TaskBook[] taskBooksCs = makeNav(themeList, "cs");
        taskBooksCs[0].prepareTargetDirectory();
        fillPrintingTemplates(taskBooksCs[0]);
        fillBasicCalculations(taskBooksCs[1]);
        fillPreliminaryAssertions(taskBooksCs[2]);
        fillMutualExclusives(taskBooksCs[3]);
        fillRanges(taskBooksCs[4]);
        fillLoops(taskBooksCs[5]);
        fillNestedLoops(taskBooksCs[6]);
        fillArrayHandling(taskBooksCs[7]);
        fillAggregateCalculation(taskBooksCs[8]);
        fillStringMethods(taskBooksCs[9]);
        fillReadingFiles(taskBooksCs[10]);
        fillWritingFiles(taskBooksCs[11]);
        fillMethods(taskBooksCs[12]);
        fillExceptions(taskBooksCs[13]);
        fillAbstractDataStructures(taskBooksCs[14]);
        fillCollections(taskBooksCs[15]);
        updateCrossTaskLinks(taskBooksCs);
        makeFiles(taskBooksCs, css);

        TaskBook[] taskBooksJava = makeNav(themeList, "java");
        taskBooksJava[0].prepareTargetDirectory();
        fillPrintingTemplates(taskBooksJava[0]);
        fillBasicCalculations(taskBooksJava[1]);
        fillPreliminaryAssertions(taskBooksJava[2]);
        fillMutualExclusives(taskBooksJava[3]);
        fillRanges(taskBooksJava[4]);
        fillLoops(taskBooksJava[5]);
        fillNestedLoops(taskBooksJava[6]);
        fillArrayHandling(taskBooksJava[7]);
        fillAggregateCalculation(taskBooksJava[8]);
        fillStringMethods(taskBooksJava[9]);
        fillReadingFiles(taskBooksJava[10]);
        fillWritingFiles(taskBooksJava[11]);
        fillMethods(taskBooksJava[12]);
        fillExceptions(taskBooksJava[13]);
        fillAbstractDataStructures(taskBooksJava[14]);
        fillCollections(taskBooksJava[15]);
        updateCrossTaskLinks(taskBooksJava);
        makeFiles(taskBooksJava, css);

        String[] themeListJs = new String[]{
                "Заполнение шаблона текстом",
                "Организация вычислений",
                "Проверка исходных данных",
                "Взаимоисключающие случаи",
                "Работа с интервалами значений",

                "Реорганизация повторяющихся действий",
                "Вложенные циклы",
                "Массивы",
                "Вычисление агрегатов",
                "Строки",

                "Функции",
                "Исключения",
                "Объекты"
        };
        TaskBook[] taskBooksJs = makeNav(themeListJs, "js");
        taskBooksJs[0].prepareTargetDirectory();
        fillPrintingTemplates(taskBooksJs[0]);
        fillBasicCalculations(taskBooksJs[1]);
        fillPreliminaryAssertions(taskBooksJs[2]);
        fillMutualExclusives(taskBooksJs[3]);
        fillRanges(taskBooksJs[4]);
        fillLoops(taskBooksJs[5]);
        fillNestedLoops(taskBooksJs[6]);
        fillArrayHandling(taskBooksJs[7]);
        fillAggregateCalculation(taskBooksJs[8]);
        fillStringMethods(taskBooksJs[9]);
        fillMethods(taskBooksJs[10]);
        fillExceptionJs(taskBooksJs[11]);
        fillAbstractDataStructuresJs(taskBooksJs[12]);
        makeFiles(taskBooksJs, css);

        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
    }

    private static void makeFiles(TaskBook[] taskBooks, String css) throws IOException {
        for (TaskBook book : taskBooks) {
            book.make(css);
        }
    }

    public static void updateCrossTaskLinks(TaskBook[] taskBooks) throws IOException {
        for (TaskBook book : taskBooks) {
            book.updateReferenceLinks(new TaskBookFinder(taskBooks));
        }
    }

    private static void fillPrintingTemplates(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab01")
                .withGroup("Печать текста на экране")
                .addCitation("link_c1_p4.3")
                .addExampleWithManual(1662)

                .withGroup("Диктант по присваиванию и конкатенации")
                .addExample(4131)
                .addTask(7365)

                .withGroup("Получение строк от пользователя")
                .addExampleWithManual(1860)
                .addCitation("link_c7_p33")
                .addTask(4764)
                .addTask(1910)
                .addTask(2429)
                .addCitation("link_c6_p30.2")
                .addTask(7472)

                .withGroup("Оформление текста по шаблону")
                .addCitation("link_c3_p10.2")
                .addExample(4140)
                .addTask(2959)
                .addTask(7271)
                .addTask(2632)
                .addTask(4343)
                .addTask(7474)

                .withGroup("Отработка присваивания")
                .addExample(3246)
                .addTask(7332)
                .addTask(9781)
                .addTask(6814)

                .withGroup("Уменьшение дублей повторяющихся фрагментов текста")
                .addExample(1640)
                .addTask(8693)
        ;
    }

    private static void fillBasicCalculations(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab02")
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
                .addCitation("link_c7_p32.5")
                .addExampleWithManual(7711)
                .addTask(1262)
                .addTask(9164)
                .addTask(3558)
                .addTask(6924)
        ;
    }

    private static void fillPreliminaryAssertions(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab03")
                .withGroup("Ограничения, связанные с предметной областью")
                .addCitation("link_c2_p8.1")
                .addExample(9298)
                .addTask(4312)
                .addTask(3354)
                .addCitation("link_c3_p11.1")
                .addTask(5201)
                .addTask(2981)

                .withGroup("Ограничения при вычислении корня")
                .addExample(8833)
                .addTask(9020)
                .addCitation("link_c3_p11.2")
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
                .addCitation("link_c3_p12.1")
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
        ;
    }

    private static void fillMutualExclusives(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab04")
                .withGroup("Взаимоисключающие случаи")
                .addTask(3072)
                .addCitation("link_c4_p15.1")
                .addTask(5980)
                .addCitation("link_c4_p19.4")
                .addTask(8174)
                .addTask(7178)
                .addTask(1186)
                .addTask(4257)
                .addTask(3883)
                .addTask(1763)
                .addTask(1945)

                .withGroup("Несколько взаимоисключающих случаев if(){} else if() {} else {}")
                .addExample(8878)
                .addTask(6291)
                .addTask(5662)
                .addCitation("link_c4_p19.2")
                .addTask(2291)

                .withGroup("Одна задача, решение которой нужно для объяснения циклов и массивов потом")
                .addExample(8518)
                .addTask(1292)

                .withGroup("Просто задачи повышенного уровня сложности")
                .addTask(4527)
                .addTask(6556)
                .addCitation("link_c2_p5.3")
                .addTask(3878)
                .addTask(2153)
                .addTask(7937)
                .addTask(8135)
        ;
    }

    private static void fillRanges(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab05")
                .withGroup("Работа с интервалами значений")
                .addExample(8715)
                .addTask(3770)
                .addTask(8867)
                .addTask(7865)
                .addCitation("link_c4_p19.3")
                .addTask(7991)
                .addTask(8751)
                .addTask(4858)
                .addTask(6589)
                .addTask(3864)
                .addCitation("link_c4_p19.1")
                .addTask(5635)
                .addTask(1217)
                .addTask(1438)
                .addTask(8718)
        ;
    }

    private static void fillLoops(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab06")
                .withGroup("Отличие действий, которые нужно повторять, от действий перед и после цикла")
                .addExample(1315)
                .addTask(1631)
                .addTask(2594)

                .withGroup("Несколько заменяемых фрагментов в повторяющихся действиях")
                .addCitation("link_c3_p10.8")
                .addTask(3762)
                .addTask(3550)
                .addTask(1139)

                .withGroup("Один цикл за другим")
                .addTask(7086)

                .withGroup("Графический диктант с циклами один за другим")
                .addExample(6062)
                .addTask(6955)
                .addTask(9639)
                .addTask(7353)
                .addTask(4910)

                .withGroup("Цикл внутри условия")
                .addExample(6066)
                .addTask(2565)
                .addCitation("link_c4_p16.2")
                .addTask(2321)
                .addTask(5053)
                .addTask(4338)

                .withGroup("Условие внутри цикла")
                .addExample(7585)
                .addTask(4264)
                .addTask(1483)
                .addTask(3983)
                .addTask(8770)
                .addCitation("link_c3_p11.2")
                .addTask(8418)
                .addTask(5170)
                .addTask(8722)

                .withGroup("Цикл после цикла или цикл с условием внутри")
                .addTask(4236)
        ;
    }

    private static void fillNestedLoops(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab06")

                .withGroup("Цикл после цикла. Подготовка к циклам внутри циклов")
                .addExample(9249)
                .addTask(4075)
                .addTask(8395)

                .withGroup("Циклы один за другим с вложением")
                .addExample(5902)
                .addTask(5568)
                .addTask(2592)

                .withGroup("Просто сложные задачи")
                .addCitation("link_c2_p9.2")
                .addTask(7517)
                .addTask(5448)
                .addTask(6572)
                .addTask(5238)
                .addTask(2084)
                .addTask(5411)
                .addTask(5171)
                .addTask(1862)
                .addTask(6302)
                ;
    }

    private static void fillArrayHandling(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab07")
                .withGroup("Работа с массивами")
                .addExample(4425)
                .addTask(1433)
                .addTask(7834)

                .withGroup("Обработка массивов циклом")
                .addExample(5683)
                .addTask(8557)
                .addCitation("link_c3_p12.8")
                .addTask(1223)
                .addTask(8311)

                .withGroup("Перестановки элементов")
                .addExample(3134)
                .addTask(9711)
                .addTask(7085)
                .addTask(8820)
                .addTask(3333)
                .addTask(8471)

                .withGroup("Конвертирование элементов")
                .addExample(9774)
                .addTask(2390)
                .addTask(3940)
                .addTask(9525)

                .withGroup("Реорганизация повторяющихся действий")
                .addExample(5694)
                .addTask(1292)
                .addTask(6806)
                .addTask(8613)
                .addTask(7534)
                .addTask(2173)

                .withGroup("Поиск повторений в массиве")
                .addExample(7369)
                .addTask(5894)
                .addTask(4515)
                .addTask(2234)

                .withGroup("Сортировка массива вставкой")
                .addExample(7290)
                .addTask(4497)
                .addTask(3218)

                .withGroup("Задачи повышенного уровня сложности")
                .addTask(6492)
                .addTask(4283)
                .addTask(7703)
                .addTask(5541)
                .addTask(9182)
                .addTask(3095)
                .addTask(8122)
        ;
    }

    private static void fillAggregateCalculation(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab061")
                .withGroup("Вычисление агрегатов")
                .addExample(2475)
                .addTask(9180)
                .addTask(1544)
                .addTask(9562)
                .addTask(3669)
                .addTask(5951)
                .addCitation("link_c5_p23.1")
                .addTask(2802)
                .addTask(6580)
                .addExample(8696)
                .addTask(5969)
                .addTask(3946)
                .addTask(6497)
                .addTask(5648)
                .addTask(7035)
                .addTask(9271)
                .addTask(8769)
                .addTask(7260)
        ;
    }

    private static void fillStringMethods(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab08")
                .withGroup("Строковые методы")
                .addExample(7491)
                .addTask(9631)
                .addTask(9812)
                .addTask(9279)
                .addExample(4845)
                .addTask(5728)
                .addTask(7222)
                .addTask(5923)
                .addTask(4265)
                .addTask(2166)
                .addTask(9116)
                .addTask(4996)
                .addExample(9925)
                .addExample(3657)
                .addTask(6599)
                .addTask(1618)
                .addTask(1703)
                .addTask(8887)
        ;
    }

    private static void fillReadingFiles(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab09")
                .withGroup("Обработка неизвестного объема данны")
                .addExample(2324)
                .addCitation("link_c4_p16.1")
                .addTask(8731)
                .addTask(4082)

                .withGroup("Чтение файлов")
                .addExample(6175)
                .addTask(4488)
                .addTask(4954)
                .addTask(4642)
                .addTask(5537)
                .addTask(5847)
                .addTask(4769)
                .addCitation("link_c2_p8.3")
                .addTask(9930)
                .addTask(6861)
                .addTask(3226)
                .addTask(4372)
                .addTask(4463)
                .addTask(1668)
                .addTask(9417)
                .addTask(3148)
                .addTask(2137)
        ;
    }

    private static void fillWritingFiles(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab10")
                .addCitation("info01")
                .withGroup("Запись в файлы")
                .addExample(9300)
                .addCitation("info02")
                .addTask(3951)
                .addTask(7343)
                .addTask(7060)
                .addTask(6409)

                .withGroup("Случайные числа")
                .addExample(2386)
                .addTask(4342)
                .addTask(9159)
                .addTask(5309)
                .addTask(3290)
                .addTask(5345)
                .addTask(6812)
        ;
    }

    private static void fillMethods(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab12")
                .addCitation("link_c2_p7")
                .addCitation("info01")
                .withGroup("Проверка вспомогательной программой")
                .addExample(1860)
                .addTask(4140)
                .addTask(2632)
                .addTask(7474)
                .addCitation("link_c2_p7.1")

                .withGroup("Проверка юнит-тестами")
                .addExample(4411)
                .addTask(2790)
                .addTask(5662)
                .addTask(3669)
                .addTask(1292)
                .addCitation("link_c2_p7.2")

                .withGroup("Аргумент-массив")
                .addExample(3946)
                .addTask(4283)
                .addTask(6497)

                .withGroup("Модификация массива-аргумента")
                .addExample(9774)
                .addTask(9271)

                .withGroup("Возврат булевого значения")
                .addExample(4847)
                .addTask(6740)
                .addCitation("link_c2_p7.3")
        ;
    }

    private static void fillExceptions(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab13")
                .addCitation("link_c2_p8.4")
                .withGroup("Обработка исключения при преобразовании string->int в консольной программе")
                .addExample(7740)
                .addTask(1439)

                .withGroup("Выбрасывание исключения, проверка в консольной программе")
                .addExample(1934)
                .addTask(3943)

                .withGroup("Выбрасывание исключения, проверка в юнит-тестах")
                .addExample(9020)
                .addTask(5871)
                .addTask(7799)
                .addTask(9354)
                .addTask(5170)

                .withGroup("Работа с файлами, перехват исключений на различных этапах работы программы")
                .addExample(6882)
                .addTask(1212)
                .addTask(9472)
                .addTask(5081)
        ;
    }

    private static void fillExceptionJs(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab13")
                .addCitation("link_c2_p8.4")
                .withGroup("Обработка исключения при преобразовании string->int в консольной программе")
                .addExample(7740)
                .addTask(1439)

                .withGroup("Выбрасывание исключения, проверка в юнит-тестах")
                .addExample(9020)
                .addTask(3943)
                .addTask(7799)
                .addTask(9354)
                .addTask(5170)
        ;
    }

    private static void fillAbstractDataStructures(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab14")
                .withGroup("Классы как контейнеры данных (АТД)")
                .addExample(5789)
                .addExample(6011)
                .addTask(6589)
                .addTask(6037)
                .addTask(3864)
                .addTask(4913)
                .addTask(6522)
                .addTask(8225)

                .withGroup("Нестатические методы класса")
                .addExample(8403)
                .addExample(3185)
                .addTask(9914)
                .addTask(4916)

                .withGroup("Сокрытие полей класса от внешнего мира. Сеттеры")
                .addExample(2809)
                .addTask(2662)

                .withGroup("Предварительный equals")
                .addTask(8168)
                .addTask(1168)

                .withGroup("Модификации состояния с контролем целостности")
                .addTask(8265)

                .withGroup("Параметризованный конструктор")
                .addExample(7301)
                .addTask(2000)
                .withGroup("ToString")
                .addExample(5421)
                .addTask(9713)

                .withGroup("Задачи повышенной сложности")
                .addExample(5032)
                .addTask(3567)
        ;
    }

    private static void fillAbstractDataStructuresJs(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab14")
                .withGroup("Объекты как контейнеры данных (АТД)")
                .addExample(5789)
                .addExample(6011)
                .addTask(6589)
                .addTask(6037)

                .withGroup("функции экземпляров объектов")
                .addExample(8403)
                .addExample(3185)
                .addTask(9914)
                .addTask(4916)

                .withGroup("Параметризованный конструктор")
                .addExample(7301)
                .addTask(2000)
        ;
    }

    private static void fillCollections(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab15")
                .withGroup("Формирование листа")
                .addExample(5087)
                .addTask(8418)

                .withGroup("Реализация компаратора")
                .addExample(8258)
                .addTask(4061)
                .addTask(7186)
                .addTask(1457)

                .withGroup("Формирование множества")
                .addExample(4568)
                .addTask(9990)

                .withGroup("Переопределение стандартного Equals")
                .addExample(5449)
                .addTask(9238)

                .withGroup("Переопределение стандартного hashcode")
                .addExample(9512)
                .addTask(9924)

                .withGroup("Формирование словаря")
                .addExample(1056)
                .addTask(7738)
                .addTask(7657)
                .addTask(5108)

                .withGroup("Заполнение коллекции экземплярами классов из иерархии")
                .addExample(3956)
                .addTask(6876)
                .addTask(2033)
                .addTask(6981)
                .addTask(1753)
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

    public static int suggestNextTaskId(TaskBook[] books) {
        Random rnd = new Random();
        int potentialId;
        boolean found;
        do {
            potentialId = 1000 + rnd.nextInt(9000);
            found = false;
            for (TaskBook book : books){
                if (book.containsTaskWithId(potentialId)){
                    found = true;
                    break;
                }
            }
        } while (found);
        return potentialId;
    }
}
