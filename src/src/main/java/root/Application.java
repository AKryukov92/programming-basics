package root;

import root.tasks.aggregates.Task2802;
import root.tasks.arrays.*;
import root.tasks.arrays_of_numbers.Task6707;
import root.tasks.arrays_of_numbers.Task7621;
import root.tasks.arrays_of_numbers.Task8613;
import root.tasks.calculations.Task3474;
import root.tasks.exceptions.Task1439;
import root.tasks.exceptions.TaskJs1439;
import root.tasks.filltemplate.*;
import root.tasks.loops.*;
import root.tasks.random.Task2386;
import root.tasks.random.Task2549;
import root.tasks.random.Task2910;
import root.tasks.read_files.*;
import root.tasks.search_in_array.Task1522;
import root.tasks.search_in_array.Task2497;
import root.tasks.search_in_array.Task4515;
import root.tasks.search_in_array.Task7035;
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
            "Вложенные циклы",
            "Базовые операции с массивами",
            "Использование числовых массивов",
            "Вычисление агрегатов",
            "Поиск в массиве",

            "Строки",
            "Обработка неизвестного объема данных",
            "Запись в файлы",
            "Методы",
            "Исключения",

            "Составные типы данных",
            "Внутреннее состояние",
            "Коллекции"
    };

    private static TaskBook[] populateCsContent(String[] themeList) throws IOException {
        TaskBook[] taskBooksCs = makeNav(themeList, "cs");

        fillPrintingTemplates(taskBooksCs[0]);
        fillBasicCalculations(taskBooksCs[1]);
        fillPreliminaryAssertions(taskBooksCs[2]);
        fillMutualExclusives(taskBooksCs[3]);
        fillRanges(taskBooksCs[4]);

        taskBooksCs[5]
                .addResource("PaintingApp/PaintingApp.sln")
                .addResource("PaintingApp/PaintingApp/App.config")
                .addResource("PaintingApp/PaintingApp/MainForm.cs")
                .addResource("PaintingApp/PaintingApp/MainForm.Designer.cs")
                .addResource("PaintingApp/PaintingApp/PaintingApp.csproj")
                .addResource("PaintingApp/PaintingApp/PenTool.cs")
                .addResource("PaintingApp/PaintingApp/Program.cs")
                .addResource("PaintingApp/PaintingApp/Properties/AssemblyInfo.cs")
                .addResource("PaintingApp/PaintingApp/Properties/Resources.Designer.cs")
                .addResource("PaintingApp/PaintingApp/Properties/Resources.resx")
                .addResource("PaintingApp/PaintingApp/Properties/Settings.Designer.cs")
                .addResource("PaintingApp/PaintingApp/Properties/Settings.settings");
        fillLoops(taskBooksCs[5]);
        fillNestedLoops(taskBooksCs[6]);
        fillBasicArrayOperations(taskBooksCs[7]);
        fillArrayConversionToNumbers(taskBooksCs[8]);
        fillAggregateCalculation(taskBooksCs[9]);

        fillElementSearch(taskBooksCs[10]);
        fillStringMethods(taskBooksCs[11]);
        fillReadingFiles(taskBooksCs[12]);
        fillWritingFiles(taskBooksCs[13]);
        fillMethods(taskBooksCs[14]);

        fillExceptions(taskBooksCs[15]);
        fillAbstractDataStructures(taskBooksCs[16]);
        fillInternalState(taskBooksCs[17]);
        fillCollections(taskBooksCs[18]);
        updateCrossTaskLinks(taskBooksCs);
        return taskBooksCs;
    }

    private static TaskBook[] populateJavaContent(String[] themeList) throws IOException {
        TaskBook[] taskBooksJava = makeNav(themeList, "java");
        fillPrintingTemplates(taskBooksJava[0]);
        fillBasicCalculations(taskBooksJava[1]);
        fillPreliminaryAssertions(taskBooksJava[2]);
        fillMutualExclusives(taskBooksJava[3]);
        fillRanges(taskBooksJava[4]);

        taskBooksJava[5]
                .addResource("graphics/PaintingApp.java")
                .addResource("graphics/Pen.java");
        fillLoops(taskBooksJava[5]);
        fillNestedLoops(taskBooksJava[6]);
        fillBasicArrayOperations(taskBooksJava[7]);
        fillArrayConversionToNumbers(taskBooksJava[8]);
        fillAggregateCalculation(taskBooksJava[9]);

        fillElementSearch(taskBooksJava[10]);
        fillStringMethods(taskBooksJava[11]);
        fillReadingFiles(taskBooksJava[12]);
        fillWritingFiles(taskBooksJava[13]);
        fillMethods(taskBooksJava[14]);

        fillExceptions(taskBooksJava[15]);
        fillAbstractDataStructures(taskBooksJava[16]);
        fillInternalState(taskBooksJava[17]);
        fillCollections(taskBooksJava[18]);
        updateCrossTaskLinks(taskBooksJava);
        return taskBooksJava;
    }

    private static TaskBook[] populateJsContent(String[] themeListJs) throws IOException {
        root.TaskBook[] taskBooksJs = makeNav(themeListJs, "js");
        taskBooksJs[0].addResource("base.html");
        fillPrintingTemplatesJs(taskBooksJs[0]);
        fillBasicCalculationsJs(taskBooksJs[1]);
        fillPreliminaryAssertions(taskBooksJs[2]);
        fillMutualExclusives(taskBooksJs[3]);
        fillRanges(taskBooksJs[4]);

        taskBooksJs[5]
                .addResource("graphics.html")
                .addResource("graphics.js");
        fillLoops(taskBooksJs[5]);
        fillNestedLoops(taskBooksJs[6]);
        fillBasicArrayOperations(taskBooksJs[7]);
        fillArrayConversionToNumbers(taskBooksJs[8]);
        fillAggregateCalculation(taskBooksJs[9]);

        fillElementSearch(taskBooksJs[10]);
        fillStringMethods(taskBooksJs[11]);
        fillMethods(taskBooksJs[12]);
        fillExceptionJs(taskBooksJs[13]);
        fillAbstractDataStructuresJs(taskBooksJs[14]);

        fillExcercisesWithButtons(taskBooksJs[15]);
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
                .addExample(1662)

                .withGroup("Диктант по присваиванию и конкатенации")
                .addExample(4131)
                .addTask(7365)

                .withGroup("Получение строк от пользователя")
                .addExample(1860)
                .addCitation("link_c7_p33")
                .addTask(new Task4764())
                .addTask(new Task2429())
                .addCitation("link_c6_p30.2")
                .addTask(new Task7472())
                .addTask(1910)

                .withGroup("Оформление текста по шаблону")
                .addCitation("link_c3_p10.2")
                .addExample(new Task4140())
                .addTask(new Task2959())
                .addTask(new Task7271())
                .addTask(new Task2632())
                .addTask(new Task4343())
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
                .addTask(new Task4764())
                .addTask(new Task2429())
                .addCitation("link_c6_p30.2")
                .addTask(new Task7472())
                .addTask(1910)

                .withGroup("Оформление текста по шаблону")
                .addCitation("link_c3_p10.2")
                .addExample(new Task4140())
                .addTask(new Task2959())
                .addTask(new Task7271())
                .addTask(new Task2632())
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
                .addExample(8428)
                .addTask(3435)
                .addCitation("link_c7_p32.5")
                .addExample(7711)
                .addTask(new Task3474())
                .addTask(1262)
                .addTask(9164)
                .addTask(3558)
                .addTask(4913)
        ;
    }

    private static void fillExcercisesWithButtons(TaskBook taskBook) {
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
                .addExample(8428)//перевод из градусов в радианы по готовой формуле
                .addTask(1976)//диктант
                .addTask(3435)//обратное действие, нужно вывести формулу из задачи про радианы
                .addTask(9865)//нужно перевести с естественного языка на ЯП
                .addTask(7457)//нужно вывести формулу с помощью школьных знаний
                .addTask(7237)

                .withGroup("Использование математических функций")
                .addCitation("link_c7_p32.5")
                .addExampleWithManual(7711)
                .addTask(new Task3474())
                .addTask(1262)
                .addTask(9164)
                .addTask(3558)
                .addTask(4913)
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
                .addTask(5789)
                .addTask(6924)

                .withGroup("Вычисление остатка от деления")
                .addExample(2801)
                .addTask(2361)
                .addTask(5063)
                .addTask(5870)

                .withGroup("Практика")
                .addTask(7619)
                .addTask(3490)
                .addTask(9622)
                .addCitation("link_c3_p12.1")
                .addTask(6522)
                .addTask(7799)
                .addTask(9354)
                .addTask(3591)
                .addTask(9130)
                .addTask(5895)
                .addTask(2461)
                .addTask(2790)
                .addTask(2624)
                .addTask(5871)
                .addTask(4366)
                .addTask(1346)
                .addTask(8873)
        ;
    }

    private static void fillMutualExclusives(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab04")
                .withGroup("Взаимоисключающие случаи")
                .addExample(3072)
                .addCitation("link_c4_p15.1")
                .addTask(5980)
                .addCitation("link_c4_p19.4")
                .addTask(8174)
                .addTask(7178)
                .addTask(7243)
                .addTask(4257)
                .addTask(3883)
                .addTask(1763)
                .addTask(1945)
                .addTask(4859)

                .withGroup("Несколько взаимоисключающих случаев if(){} else if() {} else {}")
                .addExample(8878)
                .addTask(6291)
                .addTask(5662)
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
                .addExample(new Task1315())
                .addTask(new Task1631())
                .addTask(new Task2594())

                .withGroup("Несколько заменяемых фрагментов в повторяющихся действиях")
                .addCitation("link_c3_p10.8")
                .addTask(3762)
                .addTask(3550)
                .addTask(1139)
                .addTask(5301)
                .addTask(new Task1259())

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
                .addExample(3488)
                .addTask(4264)
                .addTask(1483)
                .addTask(3983)
                .addTask(3519)
                .addTask(8770)
                .addCitation("link_c3_p11.2")
                .addTask(8418)
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
                .addTask(7323)

                .withGroup("Циклы один за другим с вложением")
                .addExample(5902)
                .addTask(5568)
                .addTask(2592)

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
                .addTask(6302)
        ;
    }

    private static void fillBasicArrayOperations(TaskBook taskBook) {
        taskBook.withSourceDirectory("arrays")
                .withGroup("Работа с массивами")
                .addExample(4425)
                .addTask(new Task7834())
                .addTask(new Task5873())
                .addTask(new Task3908())
                .addTask(1433)

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
                .addTask(new Task8775())
                .addTask(new Task5510())

                .withGroup("Перестановки элементов")
                .addExample(new Task3134())
                .addTask(new Task9711())
                .addTask(new Task7085())
                .addTask(8820)
                .addTask(3333)
                .addTask(8471)
        ;
    }

    private static void fillArrayConversionToNumbers(TaskBook taskBook) {
        taskBook.withSourceDirectory("arrays")
                .withGroup("Конвертирование элементов")
                .addExample(9774)//операции над массивом
                .addTask(3940)//просмотр массива и простая операция
                .addTask(new Task6707())//просмотр массива с условием
                .addTask(9525)//просмотр массива с условиями
                .addTask(new Task8613())//чтение элементов массива по индексу
                .addTask(2390)//вложенные циклы
                .addTask(7534)//вложенные циклы

                .withGroup("Задачи повышенного уровня сложности")
                .addTask(9576)
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
                .addTask(3946)
                .addTask(6497)
                .addTask(5648)

                .withGroup("Сортировка массива вставкой")
                .addExample(7290)//подсчет количества чисел меньше Х. Нужно как пререквизит для сортировки вставкой
                .addTask(2173)//понятие отсортированного массива. Это задача на поиск или на подсчет агрегата
                .addTask(4497)//просмотр массива и замена
                .addTask(3218)//сортировка массива

                .withGroup("Агрегат по группам")
                .addTask(7260)
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
                .addTask(7703)//многократный поиск и подсчет количества

                .withGroup("Сопоставление массивов")
                .addExample(7369)//наглядное сопоставление двух массивов
                .addTask(6988)//синхронный просмотр двух массивов
                .addTask(new Task2497())//все числа первого массива меньше всех чисел второго массива
                .addTask(5894)//неявное сопоставление + подсчет количества
                .addTask(new Task4515())//сопоставление массива с самим собой
                .addTask(9827)//сопоставление массивов MINUS
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
                .withGroup("Обработка неизвестного объема данны")
                .addExample(2324)
                .addCitation("link_c4_p16.1")
                .addTask(8731)
                .addTask(4082)
                .addTask(2523)

                .withGroup("Чтение файлов")
                .addExample(6175)
                .addTask(4488)
                .addTask(new Task4954())
                .addTask(4642)
                .addTask(5537)
                .addTask(5847)
                .addTask(4769)
                .addExample(new Task7788())
                .addTask(new Task6989())
                .addTask(new Task6170())
                .addTask(new Task8665())
                .addTask(1761)
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
                .addTask(new Task1439())
                .addTask(8733)
                .addTask(5101)
                .addTask(8139)
                .addTask(5014)

                .withGroup("Выбрасывание исключения, проверка в консольной программе")
                .addExample(1934)
                .addTask(3943)

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
                .withGroup("Классы как контейнеры данных (АТД)")
                .addExample(5789)
                .addExample(6011)
                .addTask(6589)
                .addTask(6037)

                .withGroup("Статический метод для создания экземпляров")
                .addExample(4491)
                .addTask(1193)

                .withGroup("Параметризованный конструктор")
                .addExample(7301)
                .addTask(2000)

                .addTask(3864)
                .addTask(4913)
                .addTask(6522)
                .addTask(8225)
        ;
    }

    private static void fillInternalState(TaskBook taskBook) {
        taskBook.withSourceDirectory("objects")
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
        //makeFiles(taskBooksCs, css, gitHash);

        TaskBook[] taskBooksJs = populateJsContent(themeListJs);
        //makeFiles(taskBooksJs, css, gitHash);

        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
    }
}
