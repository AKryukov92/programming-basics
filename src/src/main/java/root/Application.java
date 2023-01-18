package root;

import root.tasks.aggregates.Task2802;
import root.tasks.aggregates.Task3946;
import root.tasks.aggregates.Task7260;
import root.tasks.aggregates.Task7290;
import root.tasks.arrays.*;
import root.tasks.arrays_of_numbers.*;
import root.tasks.assertions.*;
import root.tasks.assignment_puzzles.*;
import root.tasks.calculations.*;
import root.tasks.collections.TaskJava5087;
import root.tasks.collections.TaskJava8317;
import root.tasks.conditions.Task3770;
import root.tasks.conditions.Task5116;
import root.tasks.exceptions.*;
import root.tasks.internal_state.TaskJava2896;
import root.tasks.loops_with_conditions.*;
import root.tasks.ranges.*;
import root.tasks.filltemplate.*;
import root.tasks.internal_state.TaskJava3185;
import root.tasks.internal_state.TaskJava8403;
import root.tasks.internal_state.TaskJava9914;
import root.tasks.loops.*;
import root.tasks.methods.*;
import root.tasks.objects.*;
import root.tasks.random.Task2386;
import root.tasks.random.Task2549;
import root.tasks.random.Task2910;
import root.tasks.read_files.*;
import root.tasks.search.Task2003;
import root.tasks.search.Task7703;
import root.tasks.search.Task8158;
import root.tasks.search.Task9827;
import root.tasks.search_in_array.Task1522;
import root.tasks.search_in_array.Task2497;
import root.tasks.search_in_array.Task4515;
import root.tasks.search_in_array.Task7035;
import root.tasks.stream_of_data.*;
import root.tasks.use_std_lib.Task9279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

/**
 * Created by Александр on 09.02.2019.
 */
public class Application {
    private static final String[] themeListJs = new String[]{
            "Заполнение шаблона текстом",
            "Организация вычислений",
            "Проверка исходных данных",
            "Взаимоисключающие случаи",
            "Работа с интервалами значений",

            "Реорганизация повторяющихся действий",
            "Обработка неизвестного объема данных",
            "Вложенные циклы",
            "Базовые операции с массивами",
            "Работа с массивами чисел",

            "Вычисление агрегатов",
            "Поиск в массиве",
            "Строки",
            "Функции",
            "Исключения",

            "Объекты",
            "Упражнения с кнопками"
    };
    private static final String[] themeList = new String[]{
            "Заполнение шаблона текстом",
            "Организация вычислений",
            "Проверка исходных данных",
            "Взаимоисключающие случаи",
            "Работа с интервалами значений",

            "Реорганизация повторяющихся действий",
            "Обработка неизвестного объема данных",
            "Вложенные циклы",
            "Базовые операции с массивами",
            "Использование числовых массивов",

            "Вычисление агрегатов",
            "Поиск в массиве",
            "Строки",
            "Чтение файлов",
            "Запись в файлы",

            "Методы",
            "Исключения",
            "Составные типы данных",
            "Внутреннее состояние",
            "Коллекции"
    };

    private static TaskBook[] populateCsContent(String[] themeList) throws IOException {
        TaskBook[] taskBooksCs = makeNav(themeList, "cs");

        taskBooksCs[0]
                .addResource("PaintingApp/PaintingApp.sln")
                .addResource("PaintingApp/PaintingApp/App.config")
                .addResource("PaintingApp/PaintingApp/MainFrm.cs")
                .addResource("PaintingApp/PaintingApp/PaintingApp.csproj")
                .addResource("PaintingApp/PaintingApp/PenTool.cs")
                .addResource("PaintingApp/PaintingApp/Program.cs")
                .addResource("PaintingApp/PaintingApp/Properties/AssemblyInfo.cs")
                .addResource("PaintingApp/PaintingApp/Properties/Resources.Designer.cs")
                .addResource("PaintingApp/PaintingApp/Properties/Resources.resx")
                .addResource("PaintingApp/PaintingApp/Properties/Settings.Designer.cs")
                .addResource("PaintingApp/PaintingApp/Properties/Settings.settings");
        fillPrintingTemplates(taskBooksCs[0]);
        fillBasicCalculations(taskBooksCs[1]);
        fillPreliminaryAssertions(taskBooksCs[2]);
        fillMutualExclusives(taskBooksCs[3]);
        fillRanges(taskBooksCs[4]);

        fillLoops(taskBooksCs[5]);
        fillStreamOfData(taskBooksCs[6]);
        fillNestedLoops(taskBooksCs[7]);
        fillBasicArrayOperations(taskBooksCs[8]);
        fillArrayConversionToNumbers(taskBooksCs[9]);

        fillAggregateCalculation(taskBooksCs[10]);
        fillElementSearch(taskBooksCs[11]);
        fillStringMethods(taskBooksCs[12]);
        fillReadingFiles(taskBooksCs[13]);
        fillWritingFiles(taskBooksCs[14]);

        fillMethods(taskBooksCs[15]);
        fillExceptions(taskBooksCs[16]);
        fillAbstractDataStructures(taskBooksCs[17]);
        fillInternalState(taskBooksCs[18]);
        fillCollections(taskBooksCs[19]);
        updateCrossTaskLinks(taskBooksCs);
        return taskBooksCs;
    }

    private static TaskBook[] populateJavaContent(String[] themeList) throws IOException {
        TaskBook[] taskBooksJava = makeNav(themeList, "java");
        taskBooksJava[0]
                .addResource("graphics/PaintingApp.java")
                .addResource("graphics/Pen.java");
        fillPrintingTemplates(taskBooksJava[0]);
        fillBasicCalculations(taskBooksJava[1]);
        fillPreliminaryAssertions(taskBooksJava[2]);
        fillMutualExclusives(taskBooksJava[3]);
        fillRanges(taskBooksJava[4]);

        fillLoops(taskBooksJava[5]);
        fillStreamOfData(taskBooksJava[6]);
        fillNestedLoops(taskBooksJava[7]);
        fillBasicArrayOperations(taskBooksJava[8]);
        fillArrayConversionToNumbers(taskBooksJava[9]);

        fillAggregateCalculation(taskBooksJava[10]);
        fillElementSearch(taskBooksJava[11]);
        fillStringMethods(taskBooksJava[12]);
        fillReadingFiles(taskBooksJava[13]);
        fillWritingFiles(taskBooksJava[14]);

        fillMethods(taskBooksJava[15]);
        fillExceptions(taskBooksJava[16]);
        fillAbstractDataStructures(taskBooksJava[17]);
        fillInternalState(taskBooksJava[18]);
        fillCollections(taskBooksJava[19]);
        updateCrossTaskLinks(taskBooksJava);
        return taskBooksJava;
    }

    private static TaskBook[] populateJsContent(String[] themeListJs) throws IOException {
        root.TaskBook[] taskBooksJs = makeNav(themeListJs, "js");
        taskBooksJs[0]
                .addResource("base.html")
                .addResource("graphics.html")
                .addResource("graphics.js");
        ;
        fillPrintingTemplatesJs(taskBooksJs[0]);
        fillBasicCalculationsJs(taskBooksJs[1]);
        fillPreliminaryAssertions(taskBooksJs[2]);
        fillMutualExclusives(taskBooksJs[3]);
        fillRanges(taskBooksJs[4]);

        fillLoops(taskBooksJs[5]);
        fillStreamOfData(taskBooksJs[6]);
        fillNestedLoops(taskBooksJs[7]);
        fillBasicArrayOperations(taskBooksJs[8]);
        fillArrayConversionToNumbers(taskBooksJs[9]);

        fillAggregateCalculation(taskBooksJs[10]);
        fillElementSearch(taskBooksJs[11]);
        fillStringMethods(taskBooksJs[12]);
        fillMethods(taskBooksJs[13]);
        fillExceptionJs(taskBooksJs[14]);

        fillAbstractDataStructuresJs(taskBooksJs[15]);
        fillExercisesWithButtons(taskBooksJs[16]);
        updateCrossTaskLinks(taskBooksJs);
        return taskBooksJs;
    }

    private static String getGitHash() throws IOException {
        Process p = Runtime.getRuntime().exec("git show --name-status");
        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = input.readLine();
        input.close();
        return line.substring(7, 14);
    }

    private static void makeFiles(TaskBook[] taskBooks, String css, String gitHash) throws IOException {
        taskBooks[0].prepareTargetDirectory();
        for (TaskBook book : taskBooks) {
            book.make(css, gitHash);
        }
    }

    public static void updateCrossTaskLinks(TaskBook[] taskBooks) {
        for (TaskBook book : taskBooks) {
            book.updateReferenceLinks(new TaskBookFinder(taskBooks));
        }
    }

    private static void fillPrintingTemplatesJs(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab01")
                .withGroup("Печать текста на экране")
                .addCitation("link_c1_p4.3")
                .addExample(new TaskJs1662())
                .addTask(new Task5321())
                .addTask(new Task3240())
                .addTask(new Task7058())
                .addTask(new Task8691())
                .addTask(new Task9523())
                .addTask(new Task5901())
                .addTask(new Task5792())
                .addTask(new Task6986())

                .withGroup("Диктант по присваиванию и конкатенации")
                .addExample(4131)
                .addTask(7365)

                .withGroup("Получение строк от пользователя")
                .addExample(new Task1860())
                .addCitation("link_c7_p33")
                .addTask(new Task4764())
                .addTask(new Task2429())
                .addCitation("link_c6_p30.2")
                .addTask(new Task7472())
                .withGroup("Конкатенация")
                .addTask(1910)

                .withGroup("Оформление текста по шаблону")
                .addCitation("link_c3_p10.2")
                .addExample(new Task4140())
                .addTask(new Task2959())
                .addTask(new Task7271())
                .addTask(new Task2632())
                .addTask(new Task4343())
                .addTask(new Task7474())

                .withGroup("Отработка присваивания")
                .addExample(new TaskJs3246())
                .addTask(new TaskJs7332())
                .addTask(new TaskJs9781())
                .addTask(new TaskJs6814())

                .withGroup("Уменьшение дублей повторяющихся фрагментов текста")
                .addExample(new Task1640())
                .addTask(new Task8693())
        ;
    }

    private static void fillPrintingTemplates(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab01")
                .withGroup("Печать текста на экране")
                .addCitation("link_c1_p4.3")
                .addExampleWithManual(new Task1662())
                .addTask(new Task5321())
                .addTask(new Task3240())
                .addTask(new Task7058())
                .addTask(new Task8691())
                .addTask(new Task9523())
                .addTask(new Task5901())
                .addTask(new Task5792())
                .addTask(new Task6986())

                .withGroup("Получение строк от пользователя")
                .addExampleWithManual(new Task1860())
                .addCitation("link_c7_p33")
                .addTask(new Task4764())
                .addTask(new Task2429())
                .addCitation("link_c6_p30.2")
                .addTask(new Task7472())
                .addTask(1910)

                .withGroup("Диктант по присваиванию и конкатенации")
                .addExample(4131)
                .addTask(7365)

                .withGroup("Оформление текста по шаблону")
                .addCitation("link_c3_p10.2")
                .addExample(new Task4140())
                .addTask(new Task2959())
                .addTask(new Task7271())
                .addTask(new Task2632())
                .addTask(new Task4343())
                .addTask(new Task7474())
        ;
        if (taskBook.getLangAbbreviation().equals("java")) {
            taskBook
                    .withGroup("Отработка присваивания")
                    .addExample(new TaskJava3246())
                    .addTask(new TaskJava7332())
                    .addTask(new TaskJava9781())
                    .addTask(new TaskJava6814());
        } else if (taskBook.getLangAbbreviation().equals("cs")) {
            taskBook
                    .withGroup("Отработка присваивания")
                    .addExample(new TaskCs3246())
                    .addTask(new TaskCs7332())
                    .addTask(new TaskCs9781())
                    .addTask(new TaskCs6814());
        }
        taskBook
                .withGroup("Уменьшение дублей повторяющихся фрагментов текста")
                .addExample(new Task1640())
                .addTask(new Task8693())

                //Ученики могут запросто писать циклы с одной итерацией, чтобы не задумываться когда его на самом деле нужно применять, а когда - нет.
                //Поэтому тема перенесена в первую практическую
                .withGroup("Графический диктант")
                .addExample(6062)
                .addTask(6955)
                .addTask(9639)
                .addTask(7353)
                .addTask(4910)
        ;
    }

    private static void fillBasicCalculationsJs(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab02")
                .withGroup("Вывод на экран действительных чисел с заданной точностью")
                .addExample(3862)
                .addExample(9231)

                .withGroup("Операторы и операнды")
                .addExample(4411)
                .addTask(7457)
                .addTask(9865)
                .addTask(1976)
                .addTask(7237)

                .withGroup("Использование математических функций")
                .addExample(new Task8428())
                .addTask(new Task3435())
                .addCitation("link_c7_p32.5")
        ;
        if (taskBook.getLangAbbreviation().equals("js")) {
            taskBook.addExample(new Task7711());
        } else {
            taskBook.addExampleWithManual(new Task7711());
        }
        taskBook
                .addTask(new Task3474())
                .addTask(1262)
                .addTask(new Task9164())
                .addTask(3558)
                .addTask(4913)
        ;
    }

    private static void fillExercisesWithButtons(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab18")
                .withGroup("Случайные числа")
                .addExample(7874)
                .addTask(3915)
                .withGroup("активация кнопок")
                .addExample(9021)
                .addTask(4172)
                .addTask(7563)
                .addTask(9405)
                .withGroup("влияние на стили")
                .addExample(2387)
                .addTask(4868)
        ;
    }

    private static void fillBasicCalculations(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab02")
                .withGroup("Вывод на экран действительных чисел с заданной точностью")
                .addExampleWithManual(3862)
                .addExampleWithManual(9231)

                .withGroup("Операторы и операнды")
                .addExampleWithManual(4411)
                .addExample(new Task8428())//перевод из градусов в радианы по готовой формуле
                .addTask(1976)//диктант
                .addTask(new Task3435())//обратное действие, нужно вывести формулу из задачи про радианы
                .addTask(9865)//нужно перевести с естественного языка на ЯП
                .addTask(7457)//нужно вывести формулу с помощью школьных знаний
                .addTask(7237)

                .withGroup("Использование математических функций")
                .addCitation("link_c7_p32.5")
                .addExampleWithManual(new Task7711())
                .addTask(new Task3474())
                .addTask(1262)
                .addTask(new Task9164())
                .addTask(3558)
                .addTask(4913)
        ;
    }

    /*
    В практике встречаются несколько способов оформления ветвлений:
    А. последовательный
    if(){}
    if(){}
    if(){}
    Б. взаимоисключающий
    if(){} else {}
    if(){} else {}
    В. взаимоисключающий несколько вариантов
    if(){}
    else if(){}
    else if(){}
    else {}
    Главная проблема студентов - не знают когда какой вариант применять.

    Кроме того, есть еще другой выбор.
    А. вложенные
    if(A){
      if(B){}
    }
    Б. объединенный
    if(A && B){}
     */
    private static void fillPreliminaryAssertions(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab03")
                .withGroup("Ограничения, связанные с предметной областью")
                .addExample(new Task9298())//взаимоисключающий
                .addTask(new Task4312())//взаимоисключающий, несколько вариантов
                .addTask(new Task6522())//взаимоисключающий
                .addCitation("link_c3_p11.1")
                .addTask(new Task7619())//взаимоисключающий, несколько вариантов

                .withGroup("Ограничения при вычислении корня")
                .addExample(new Task8833())//взаимоисключающий
                .addTask(new Task9020())//взаимоисключающий
                .addCitation("link_c3_p11.2")
                .addTask(new Task1934())//взаимоисключающий
                .addTask(new Task3943())//взаимоисключающий, вложенный!
                .addTask(6924)

                .withGroup("Вычисление остатка от деления")
                .addExample(2801)
                .addTask(2361)
                .addTask(5063)
                .addTask(5870)

                .withGroup("Практика")
                .addTask(3490)
                .addTask(9622)
                .addCitation("link_c3_p12.1")
                .addTask(7799)
                .addTask(9354)
                .addTask(3591)
                .addTask(9130)
                .addTask(5895)
                .addTask(2461)
                .addTask(2790)
                .addTask(2624)
                .addTask(5871)
        ;
    }

    private static void fillMutualExclusives(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab04")
                .withGroup("Взаимоисключающие случаи")
                .addExample(3072)
                .addTask(new Task3770())
                .addCitation("link_c4_p15.1")
                .addTask(5980)
                .addCitation("link_c4_p19.4")
                .addTask(8174)
                .addTask(7178)
                .addTask(new Task7243())
                .addTask(4257)
                .addTask(1763)
                .addTask(1945)
                .addTask(4859)

                .withGroup("Несколько взаимоисключающих случаев if(){} else if() {} else {}")
                .addExample(8878)
                .addTask(6291)
                .addTask(5662)
                .addTask(new Task5116())
                .addCitation("link_c4_p19.2")
                .addTask(2291)

                .withGroup("Несколько условий последовательно, с дополнением ответа в каждом условии. Нужно для объяснения циклов и массивов потом")
                .addExample(1186)
                .addTask(8518)
                .addTask(1292)

                .withGroup("Просто задачи повышенного уровня сложности")
                .addTask(4527)
                .addTask(6556)
                .addCitation("link_c2_p5.3")
                .addTask(3878)
                .addTask(2153)
                .addTask(7937)
                .addTask(8135)//несколько условий последовательно, с дополнением ответа в каждом условии
                .addTask(6896)
                .addTask(9734)
        ;
    }

    private static void fillRanges(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab05")
                .withGroup("Работа с интервалами значений")
                .addExample(new Task8715())
                .addTask(new Task8867())
                .addTask(new Task7991())
                .addTask(new Task7865())
                .addTask(new Task9705())
                .addTask(3883)
                .addCitation("link_c4_p19.3")
                .addTask(8751)
                .addTask(new Task4858())
                .addTask(new Task6589())
                .addTask(3864)
                .addCitation("link_c4_p19.1")
                .addTask(5635)
                .addTask(1217)
                .addTask(8718)
        ;
    }

    private static void fillLoops(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab06")
                .withGroup("Отличие действий, которые нужно повторять, от действий перед и после цикла")
                .addExample(new Task1315())
                .addTask(new Task1631())
                .addTask(new Task2594())

                .withGroup("Несколько заменяемых фрагментов в повторяющихся действиях")
                .addCitation("link_c3_p10.8")
                .addTask(new Task3762())
                .addTask(new Task3550())
                .addTask(new Task1139())
                .addTask(new Task9969())
                .addTask(new Task5301())
                .addTask(new Task1259())

                .withGroup("Один цикл за другим")
                .addTask(new Task7086())

                .withGroup("Цикл внутри условия")
                .addExample(new Task6066())
                .addTask(new Task2565())
                .addCitation("link_c4_p16.2")
                .addTask(new Task2321())
                .addTask(5053)
                .addTask(new Task6663())
                .addTask(4338)
                .addTask(new Task7054())
                .addTask(new Task4531())
        ;
    }

    private static void fillStreamOfData(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab09")
                .withGroup("Обработка неизвестного объема данных")
                .addExample(new Task1903())//вывод с простым вычислением
                .addTask(new Task8138())//просто вывод, не запутаться с присваиваниями
                .addTask(new Task1845())//вывод с условием
                .addTask(new Task7083())//вывод с условием
                .addTask(new Task2072())//вывод с условием
                .addTask(new Task7595())//подсчет суммы
                .withGroup("Обработка конечной последовательности")
                .addTask(new Task2368())//подсчет суммы. конечное количество чисел
                .addTask(new Task5279())//конечное множество чисал. не запутаться с присваиваниями

                .withGroup("Условие внутри цикла")
                .addExample(new Task7585())
                .addTask(new Task3488())
                .addTask(new Task4264())
                .addTask(new Task1483())
                .addTask(new Task3983())
                .addTask(new Task3519())
                .addTask(new Task8770())
                .addTask(new Task2222())
                .addTask(new Task8418())
                .addTask(new Task8722())

                .withGroup("Цикл после цикла или цикл с условием внутри")
                // .addTask(4236)

                .addExample(new Task2324())
                .addCitation("link_c4_p16.1")
                .addTask(8731)
                .addTask(4082)
                .addTask(2523)
        ;
    }

    private static void fillNestedLoops(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab06")

                .withGroup("Цикл после цикла. Подготовка к циклам внутри циклов")
                .addExample(9249)
                .addTask(4075)
                .addTask(8395)
                .addTask(7323)

                .withGroup("Циклы один за другим с вложением")
                .addTask(5568)
                .addTask(2592)
                .addTask(new Task6355())

                .withGroup("Просто сложные задачи")
                .addCitation("link_c2_p9.2")
                .addTask(new Task6332())
                .addTask(7517)
                .addTask(5448)
                .addTask(6572)
                .addTask(5238)
                .addTask(2084)
                .addTask(5411)
                .addTask(5171)
                .addTask(1862)
                .addTask(5902)
                .addTask(6302)
        ;
    }

    private static void fillBasicArrayOperations(TaskBook taskBook) {
        taskBook.withSourceDirectory("arrays")
                .withGroup("Работа с массивами")
                .addExample(new Task4425())
                .addTask(new Task7834())
                .addTask(new Task5873())
                .addTask(new Task3908())
                .addTask(1433)
                .addTask(new Task3791())
                .addTask(new Task1058())//parse array to distinct numbers. distance between points
                .addTask(new Task6589())//parse array, range intersection

                .withGroup("Обработка массивов циклом")
                .addExample(new Task5683())
                .addTask(new Task8557())
                .addCitation("link_c3_p12.8")
                .addTask(new Task1223())
                .addTask(new Task8311())
                .addTask(new Task6563())

                .withGroup("Запись в массив")
                .addExample(new Task9923())
                .addTask(new Task1331())
                .addTask(new Task1998())//Возможно это слишком сложная задача. требуется новый синтаксис - перестановки элементов

                .withGroup("Головоломки на перестановку")
        ;

        if (taskBook.getLangAbbreviation().equals("cs")) {
            taskBook.addTask(new TaskCs8775())
                    .addTask(new TaskCs5510())
            ;
        } else if (taskBook.getLangAbbreviation().equals("java")) {
            taskBook.addTask(new TaskJava8775())
                    .addTask(new TaskJava5510())
            ;
        } else if (taskBook.getLangAbbreviation().equals("js")) {
            taskBook.addTask(new TaskJs8775())
                    .addTask(new TaskJs5510())
            ;
        } else {
            throw new RuntimeException("Неопознанный идентификатор языка '" + taskBook.getLangAbbreviation() + "'");
        }

        taskBook.withGroup("Перестановки элементов")
                .addExample(new Task3134())
                .addTask(new Task9711())
                .addTask(new Task7085())
                .addTask(new Task8820())
                .addTask(new Task3333())
                .addTask(new Task8471())
        ;
    }

    private static void fillArrayConversionToNumbers(TaskBook taskBook) {
        taskBook.withSourceDirectory("arrays")
                .withGroup("Конвертирование элементов")
                .addExample(new Task9774())//операции над массивом
                .addTask(new Task3940())//просмотр массива и простая операция
                .addTask(new Task6707())//просмотр массива с условием
                .addTask(new Task9525())//просмотр массива с условиями
                .addTask(new Task3289())//просмотр массива со сравнением следующего и предыдущего
                .addTask(new Task5380())//просмотр в массиве. сравнение элемента с длиной
                .addTask(new Task8613())//чтение элементов массива по индексу
                .addTask(new Task9213())//фильтр по одному массиву, вывод из другого
                .addTask(new Task2390())//вложенные циклы
                .addTask(new Task7534())//вложенные циклы

                .withGroup("Задачи повышенного уровня сложности")
                .addTask(new Task6714())//использование массива чисел для получения данных от пользователя
                .addTask(new Task1438())
                .addTask(9576)//вложенные циклы
                .addTask(3095)//комбинаторика. понятие "все комбинации"
                .addTask(8122)//сложная задача с кучей концепций
                .addTask(5900)
        ;
    }

    private static void fillAggregateCalculation(TaskBook taskBook) {
        taskBook.withSourceDirectory("arrays")
                .withGroup("Вычисление агрегатов из ряда чисел")
                .addExample(2475)
                .addTask(new Task7621())//Вычисление суммы элементов на указанных индексах
                .addTask(3669)
                .addTask(5951)
                .addCitation("link_c5_p23.1")
                .addTask(new Task2802())
                .addTask(6580)

                .withGroup("Вычисление агрегатов в массиве")
                .addExample(8696)
                .addTask(5969)
                .addTask(5170)//подсчет количества делителей
                .addTask(new Task3946())
                .addTask(6497)
                .addTask(5648)

                .withGroup("Сортировка массива вставкой")
                .addExample(new Task7290())//подсчет количества чисел меньше Х. Нужно как пререквизит для сортировки вставкой
                .addTask(2173)//понятие отсортированного массива. Это задача на поиск или на подсчет агрегата
                .addTask(4497)//просмотр массива и замена
                .addTask(3218)//сортировка массива

                .withGroup("Агрегат по группам")
                .addTask(new Task7260())
                .addTask(5795)
        ;
    }

    private static void fillElementSearch(TaskBook taskBook) {
        taskBook.withSourceDirectory("arrays")
                //Поиск по сути - вычисление агрегата, т.к. результат - один элемент - флаг "присутствует" или "отсутствует"
                .withGroup("Поиск конкретного элемента в массиве")
                .addExample(5694)//поиск в массиве
                .addTask(6806)//поиск в массиве
                .addTask(2234)//поиск в массиве

                .withGroup("Поиск в массиве и прерывание работы цикла")
                .addExample(new Task2003())
                .addTask(new Task8158())
                .addTask(1292)
                .addTask(4283)//поиск и подсчет количества
                .addTask(new Task7703())//многократный поиск и подсчет количества

                .withGroup("Сопоставление массивов")
                .addExample(7369)//наглядное сопоставление двух массивов
                .addTask(6988)//синхронный просмотр двух массивов
                .addTask(new Task2497())//все числа первого массива меньше всех чисел второго массива
                .addTask(5894)//неявное сопоставление + подсчет количества
                .addTask(new Task4515())//сопоставление массива с самим собой
                .addTask(new Task9827())//сопоставление массивов MINUS
                .addTask(7793)//сопоставление, все виды

                .withGroup("Поиск минимального")
                .addExample(new Task7035())
                .addTask(new Task1522())//поиск максимального и поиск минимального
                .addTask(9271)//поиск и манипуляции с массивом
                .addTask(8769)//минимальное в участке массива
                .addTask(4707)//сортировка по возрастанию пузырьком
                .addTask(1392)//вычисление медианы
                .addTask(6492)//Сначала найти максимальное, от которого зависит количество строк

                //Подготовительной задачей будет
                //Эти задачи решаются двумя способами
                //1. Через создание хешсета
                //2. Через многократный просмотр двух массивов
                //3. Через сортировку с последующим линейным просмотром
                //К решению через сортировку подводить кажется правильнее.
                //Проблема в том, что исходные данные - строки, а не цифры.
                //Сравнение на "больше" или "меньше" для строк не такое очевидное, как для цифр
                .addTask(5541)
                .addTask(9182)
        //Будет логично сюда поставить еще и бинарный поиск
        ;
    }

    private static void fillStringMethods(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab08")
                .withGroup("Строковые методы")
                .addExample(7491)
                .addTask(9631)
                .addTask(9812)
                .addTask(new Task9279())
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

                .withGroup("Чтение файлов")
                .addExample(6175)
                .addTask(4488)

                .addExample(new Task7788())//использование файла как таблицы СУБД
                .addTask(new Task6989())//файл-таблица СУБД. нужно вывести данные по идентификатору
                .addTask(new Task6170())//2 файла-таблицы СУБД. Нужно соединить две таблицы, вывести данные по коду
                .addTask(new Task8665())//2 файла-таблицы СУБД. Нужно выполнить поиск по неключу и вывести
                .addTask(new Task1761())

                .addTask(new Task4477())//проанализировать вложенность скобок
                .addTask(new Task9417())//чтение нескольких файлов, поиск общей суммы, обработка ошибок
                .addTask(new Task3148())//чтение нескольких файлов. список в одном, обрабатывать другие
        ;
    }

    public static void fillObsoleteTasks(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab09")
                .addTask(new Task4954())//чтение простых строк. проверка содержимого
                .addTask(5847)//посчитать количество символов после A. неинтересно
                .addTask(4769)//неинтересная. про применение строковых функций
                .addTask(4642)
                .addTask(5537)
                .addTask(9930)//нужно объяснение что такое абсолютное имя файла и относительное
                .addTask(6861)//валидация емейла без регулярок. Надо нормально описать требования
                //потенциально хорошие задачи, но нужно расширить требования
                .addTask(4372)//извлечение селекторов из CSS. нужно нормально описать требования
                .addTask(4463)//скорее всего нужна дополнительная информация - что такое тэг, что такое атрибут тэга
                .addTask(1668)//разбор HTML формы
                .addTask(2137)//крайне путаная задача. возможно надо добавить ход решения
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
                .addExample(new Task2386())
                .addTask(new Task2910())
                .addTask(new Task2549())
                .addTask(4342)
                .addTask(9159)
                .addTask(5309)
                .addTask(3290)
                .addTask(5345)
                .addTask(6812)
        ;
    }

    private static void fillMethods(TaskBook taskBook) {
        taskBook
                .withSourceDirectory("lab12")
                .addCitation("link_c2_p7")
                .addCitation("info01")
                .withGroup("Проверка вспомогательной программой");

        if (taskBook.getLangAbbreviation().equals("java")) {
            taskBook
                    .addExample(new TaskJava8307())
                    .addTask(new TaskJava8813())
                    .addTask(new TaskJava5823())
                    .addTask(new TaskJava2772());
        } else if (taskBook.getLangAbbreviation().equals("cs")) {
            taskBook
                    .addExample(new TaskCs8307())
                    .addTask(new TaskCs8813())
                    .addTask(new TaskCs5823())
                    .addTask(new TaskCs2772());
        } else if (taskBook.getLangAbbreviation().equals("js")) {
            taskBook
                    .addExample(new TaskJs8307())
                    .addTask(new TaskJs8813())
                    .addTask(new TaskJs5823())
                    .addTask(new TaskJs2772());
        } else {
            throw new RuntimeException("Неопознанный идентификатор языка '" + taskBook.getLangAbbreviation() + "'");
        }
        taskBook
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
        ;

        if (taskBook.getLangAbbreviation().equals("java")) {
            taskBook.addTask(new TaskJava8920())
                    .addTask(6497)

                    .withGroup("Возврат массива в качестве результата")
                    .addExample(new TaskJava2936())
                    .addTask(new TaskJava3539())

                    .withGroup("Возврат булевого значения")
                    .addExample(new TaskJava6401())
                    .addTask(new TaskJava7581())
                    .addCitation("link_c2_p7.3")
            ;
        } else if (taskBook.getLangAbbreviation().equals("cs")) {
            taskBook.addTask(new TaskCs8920())
                    .addTask(6497)

                    .withGroup("Возврат массива в качестве результата")
                    .addExample(new TaskCs2936())
                    .addTask(new TaskCs3539())

                    .withGroup("Возврат булевого значения")
                    .addExample(new TaskCs6401())
                    .addTask(new TaskCs7581())
                    .addCitation("link_c2_p7.3")
            ;
        } else if (taskBook.getLangAbbreviation().equals("js")) {
            taskBook.addTask(new TaskJs8920())
                    .addTask(6497)

                    .withGroup("Возврат массива в качестве результата")
                    .addExample(new TaskJs2936())
                    .addTask(new TaskJs3539())

                    .withGroup("Возврат булевого значения")
                    .addExample(new TaskJs6401())
                    .addTask(new TaskJs7581())
                    .addCitation("link_c2_p7.3")
            ;
        } else {
            throw new RuntimeException("Неопознанный идентификатор языка '" + taskBook.getLangAbbreviation() + "'");
        }
    }

    private static void fillExceptions(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab13")
                .addCitation("link_c2_p8.4")
                .withGroup("Обработка исключения при преобразовании string->int в консольной программе")
                .addExample(7740)
                .addTask(new Task1439())
                .addTask(8733)
                .addTask(5101)
                .addTask(8139)
                .addTask(5014)
        ;
        if (taskBook.getLangAbbreviation().equals("cs")) {
            taskBook.withGroup("Выбрасывание исключения, проверка в консольной программе")
                    .addExample(new TaskCs5259())
                    .addTask(new TaskCs9058())
            ;
        } else if (taskBook.getLangAbbreviation().equals("java")) {
            taskBook.withGroup("Выбрасывание исключения, проверка в консольной программе")
                    .addExample(new TaskJava5259())
                    //.addTask(3943)
            ;
        } else {
            taskBook
                    .withGroup("Выбрасывание исключения, проверка в консольной программе")
                    .addExample(1934)
                    //.addTask(3943)
            ;
        }
        taskBook
                .withGroup("Выбрасывание исключения, проверка в юнит-тестах")
                .addExample(9020)
                .addTask(5871)
                .addTask(7799)
                .addTask(9354)
                .addTask(5170)
                .addTask(7891)

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
                .addTask(new TaskJs1439())

                .withGroup("Выбрасывание исключения, проверка в юнит-тестах")
                .addExample(9020)
                .addTask(3943)
                .addTask(7799)
                .addTask(9354)
                .addTask(5170)
                .addTask(7891)
        ;
    }

    private static void fillAbstractDataStructures(TaskBook taskBook) {
        taskBook.withSourceDirectory("objects")
                .withGroup("Классы как контейнеры данных (АТД)");
            //базовая цель - чтобы студенты научились отличать статический метод от нестатического
            //и обращаться к полям класса

            //большая сложность - в том, чтобы отследить какие методы и поля уже есть у классов
            //если они используются в разных заданиях и разных практических
            //Возможные решения:
            //1. ВНИМАТЕЛЬНО контролировать где какой класс используется и дописывать "проверьте что это объявлено"
            //2. Использовать разные классы в разных практических
            //3. Везде писать "создайте, объявите", даже если это не первая задача.
            // Люди додумаются что повторно не надо это делать.
            // Если не додумаются, то сначала поймают ошибки компиляции, а потом додумаются.
            taskBook
                    .addExample(new TaskJava5789())//Point.distanceBetween(values)
                    .addTask(new TaskJava6011())//Point.distanceBetween(Points)
                    .addTask(new TaskJava7040())//Range.contains(values)
                    .addTask(new TaskJava1606())//Range.contains(Range+value)
                    .addTask(new TaskJava4574())//Range.hasIntersection(values)
                    .addTask(new TaskJava6037())//Range.hasIntersection(Ranges)

                    .withGroup("Статический метод для создания экземпляров")
                    .addTask(new TaskJava4491())//Point.zero()
                    .addTask(new TaskJava1193())//Point.make(x,y)
                    .addTask(new TaskJava8347())//найти центр отрезка по двум концам
            ;
        taskBook
                .withGroup("Параметризованный конструктор")
                .addExample(7301)
                .addTask(2000)

                .withGroup("Практика")
                .addTask(3864)
                .addTask(4913)
                .addTask(6522)
                .addTask(8225)
        ;
    }

    private static void fillInternalState(TaskBook taskBook) {
        taskBook.withSourceDirectory("objects")
                .withGroup("Нестатические методы класса");
        if (taskBook.getLangAbbreviation().equals("java")) {
            taskBook
                    .addExample(new TaskJava8403())
                    .addExample(new TaskJava3185())
                    .addTask(new TaskJava9914());
        } else if (taskBook.getLangAbbreviation().equals("cs")) {
            taskBook
                    .addExample(new TaskJava8403())
                    .addExample(new TaskJava3185())
                    .addTask(new TaskJava9914());
        } else {
            taskBook.addExample(8403)
                    .addExample(3185)
                    .addTask(9914);
        }
        taskBook
                .addTask(4916)

                .withGroup("Сокрытие полей класса от внешнего мира. Сеттеры")
                .addExample(2809)
                .addTask(2662)

                .withGroup("Предварительный equals")
                .addTask(8168)
                .addTask(1168)

                .withGroup("Модификации состояния с контролем целостности")
                .addTask(8265)
                .addTask(new TaskJava2896())//ReverseCounter
                .withGroup("ToString")
                .addExample(5421)
                .addTask(9713)

                .withGroup("Работа с датами")
                .addTask(7397)
                .addTask(8240)

                .withGroup("Задачи повышенной сложности")
                .addExample(5032)
                .addTask(3567)
        ;
    }

    private static void fillAbstractDataStructuresJs(TaskBook taskBook) {
        taskBook.withSourceDirectory("objects")
                .withGroup("Объекты как контейнеры данных (АТД)")
                .addExample(5789)//Point.distanceBetween(values)
                .addExample(new TaskJs6011())
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
                .withGroup("Формирование листа");
        if (taskBook.getLangAbbreviation().equals("java")) {
            taskBook.addExample(new TaskJava5087())
                    .addTask(new TaskJava8317());
        } else {
            taskBook.addExample(5087);
        }
        taskBook
                .addTask(8418)

                .withGroup("Реализация компаратора")
                .addExample(8258)
                .addTask(4061)
                .addTask(7186)
                .addTask(1457)

                .withGroup("Формирование множества")
                .addExample(4568)
                .addTask(9990)
                .addTask(new Task6590())

                .withGroup("Вычисление агрегата по группам")
                .addTask(9092)

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
            for (TaskBook book : books) {
                if (book.containsTaskWithId(potentialId)) {
                    found = true;
                    break;
                }
            }
        } while (found);
        return potentialId;
    }

    public static void main(String[] args) throws IOException {
        String gitHash = getGitHash();

        String css = loadCss("styles.css");

        TaskBook[] taskBooksJava = populateJavaContent(themeList);
        makeFiles(taskBooksJava, css, gitHash);

        TaskBook[] taskBooksCs = populateCsContent(themeList);
        makeFiles(taskBooksCs, css, gitHash);

        TaskBook[] taskBooksJs = populateJsContent(themeListJs);
        //makeFiles(taskBooksJs, css, gitHash);

        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
    }
}
