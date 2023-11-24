package root;

import root.tasks.arrays.TaskJava8072;
import root.tasks.aggregates.*;
import root.tasks.arrays.*;
import root.tasks.arrays_of_numbers.*;
import root.tasks.assertions.*;
import root.tasks.assignment_puzzles.*;
import root.tasks.calculations.*;
import root.tasks.call_methods.*;
import root.tasks.collections.*;
import root.tasks.combinations.*;
import root.tasks.conditions.Task3770;
import root.tasks.conditions.Task5116;
import root.tasks.conditions.Task5662;
import root.tasks.datetime.*;
import root.tasks.exceptions.*;
import root.tasks.internal_state.TaskJava2896;
import root.tasks.loops_with_conditions.*;
import root.tasks.method_generalisation.Task6813;
import root.tasks.method_generalisation.Task8862;
import root.tasks.method_generalisation.Task9309;
import root.tasks.method_generalisation.Task9709;
import root.tasks.nested_loops.*;
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
import root.tasks.recursion.Task1068;
import root.tasks.recursion.Task4106;
import root.tasks.recursion.Task6646;
import root.tasks.remainder.Task3883;
import root.tasks.search.*;
import root.tasks.search_in_array.*;
import root.tasks.sorting.*;
import root.tasks.sorting.Task5541;
import root.tasks.static_or_not.TaskJava1401;
import root.tasks.stream_of_data.*;
import root.tasks.use_std_lib.Task9279;
import root.tasks.write_files.Task7940;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Александр on 09.02.2019.
 */
public class Application {
    private static final String[] themeList = new String[]{
            "Печать текста на экран",
            "Заполнение шаблона данными от пользователя",
            "Организация вычислений",
            "Проверка исходных данных",
            "Взаимоисключающие случаи",
            "Работа с интервалами значений",

            "Реорганизация повторяющихся действий",
            "Обработка неизвестного объема данных",
            "Вложенные циклы",
            "Базовые операции с массивами",
            //методы?
            "Перестановки элементов массива",

            "Использование числовых массивов",
            "Вычисление агрегатов",
            "Поиск в массиве",
            "Сортировка вставкой",
            "Строки",

            "Чтение файлов",
            "Запись в файлы",
            "Методы",
            "Исключения",
            "Составные типы данных",

            "Внутреннее состояние",
            "Коллекции",
            "Рекурсия",
            "Даты"
    };

    private static TaskBook[] populateCsContent(String[] themeList) {
        TaskBook[] taskBooksCs = makeNav(themeList, "cs");

        fillPrintingText(taskBooksCs[0]);
        fillInputAndTemplates(taskBooksCs[1]);
        fillBasicCalculations(taskBooksCs[2]);
        fillPreliminaryAssertions(taskBooksCs[3]);
        fillMutualExclusives(taskBooksCs[4]);
        fillRanges(taskBooksCs[5]);

        fillLoops(taskBooksCs[6]);
        fillStreamOfData(taskBooksCs[7]);
        fillNestedLoops(taskBooksCs[8]);
        fillBasicArrayOperations(taskBooksCs[9]);
        fillSwapping(taskBooksCs[10]);
        fillArrayConversionToNumbers(taskBooksCs[11]);

        fillAggregateCalculation(taskBooksCs[12]);
        fillElementSearch(taskBooksCs[13]);
        fillInsertionSort(taskBooksCs[14]);
        fillStringMethods(taskBooksCs[15]);
        fillReadingFiles(taskBooksCs[16]);
        fillWritingFiles(taskBooksCs[17]);

        unitTesting(taskBooksCs[18]);
        fillExceptions(taskBooksCs[19]);
        fillAbstractDataStructures(taskBooksCs[20]);
        fillInternalState(taskBooksCs[21]);
        fillCollections(taskBooksCs[22]);
        fillRecursion(taskBooksCs[23]);
        fillDateTime(taskBooksCs[24]);
        updateCrossTaskLinks(taskBooksCs);
        return taskBooksCs;
    }

    private static TaskBook[] populateJavaContent(String[] themeList) {
        TaskBook[] taskBooksJava = makeNav(themeList, "java");
        fillPrintingText(taskBooksJava[0]);
        fillInputAndTemplates(taskBooksJava[1]);
        fillBasicCalculations(taskBooksJava[2]);
        fillPreliminaryAssertions(taskBooksJava[3]);
        fillMutualExclusives(taskBooksJava[4]);
        fillRanges(taskBooksJava[5]);

        fillLoops(taskBooksJava[6]);
        fillStreamOfData(taskBooksJava[7]);
        fillNestedLoops(taskBooksJava[8]);
        fillBasicArrayOperations(taskBooksJava[9]);
        fillSwapping(taskBooksJava[10]);
        fillArrayConversionToNumbers(taskBooksJava[11]);

        fillAggregateCalculation(taskBooksJava[12]);
        fillElementSearch(taskBooksJava[13]);
        fillInsertionSort(taskBooksJava[14]);
        fillStringMethods(taskBooksJava[15]);
        fillReadingFiles(taskBooksJava[16]);
        fillWritingFiles(taskBooksJava[17]);

        unitTesting(taskBooksJava[18]);
        fillExceptions(taskBooksJava[19]);
        fillAbstractDataStructures(taskBooksJava[20]);
        fillInternalState(taskBooksJava[21]);
        fillCollections(taskBooksJava[22]);

        //где то на этом этапе можно добавить реализацию http-сервера
        //на дом все те же самые задания, нужно хотя бы повторить. отличие - вместо круга прямоугольник
        //задания:
        //1. подготовить html страницу с кругом на svg
        //2. консольную программу, которая получает от пользователя параметры круга и выдает все в html+svg
        //3. подготовить csv файл с параметрами кругов
        //4. консольную программу, которая рисует все содержимое из файла в html+svg
        //5. консольную программу, которая сохраняет данные от пользователя в csv файл с параметрами круга
        //6. http сервер, который возвращает статичную страницу с кругом на svg
        //7. http сервер, который обрабатывает url вида cx=400&cy=300&r=200&stroke-width=4 и рисует круг с этими параметрами
        //8. http сервер, который читает все содержимое из файла с кругами и рисует html+svg
        //9. подготовить html страницу с формой для отправки данных на сервер action="/circle"
        //10. http сервер с двумя страницами: /add и /circle. add отдает пользователю html страницу. circle отдает пользователю

        fillRecursion(taskBooksJava[23]);
        fillDateTime(taskBooksJava[24]);
        updateCrossTaskLinks(taskBooksJava);
        return taskBooksJava;
    }

    private static String runCmd(String cmd) throws IOException {
        Process p = Runtime.getRuntime().exec(cmd);
        try (BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
            String line = input.readLine();
            input.close();
            return line;
        }
    }

    private static String getVersion() {
        File versionFile = new File("./.version");
        System.out.println("Version file is " + versionFile);
        try (Scanner s = new Scanner(versionFile)) {
            return s.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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

    private static void fillPrintingText(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab01")
                .withGroup("Печать текста на экране")
        ;
        if (taskBook.isCsharp()) {
            taskBook.addExample(new TaskCs1662())
                    .addTask(new Task5321())
                    .addTask(new TaskCs8691())
                    .addTask(new Task7920())
                    .addExample(new Task7339())//конкатенация
                    .addTask(new TaskCs5901())
                    .addTask(new Task3240())
                    .addTask(new Task7058())
                    .addTask(new Task5792())
                    .withGroup("Отработка присваивания")
                    .addExample(new TaskCs3246())
                    .addTask(new TaskCs7332())
                    .addTask(new TaskCs9781())
                    .addTask(new TaskCs6814());
            ;
        } else if (taskBook.isJava()) {
            taskBook.addExample(new TaskJava1662())
                    .addTask(new Task5321())
                    .addTask(new TaskJava8691())
                    .addTask(new Task7920())
                    .addExample(new Task7339())//конкатенация
                    .addTask(new TaskJava5901())
                    .addTask(new Task3240())
                    .addTask(new Task7058())
                    .addTask(new Task5792())
                    .addTask(new Task9523())//вывод спецсимвола UNICODE
                    .addTask(new Task6986())//вывод спецсимвола UNICODE
                    .withGroup("Отработка присваивания")
                    .addExample(new TaskJava3246())
                    .addTask(new TaskJava7332())
                    .addTask(new TaskJava9781())
                    .addTask(new TaskJava6814())
            ;
        } else {
            throw new NotImplementedException();
        }
        taskBook
                .withGroup("Уменьшение дублей повторяющихся фрагментов текста")
                .addExample(new Task1640())
                .addTask(new Task8693())

        //Ученики могут запросто писать циклы с одной итерацией, чтобы не задумываться когда его на самом деле нужно применять, а когда - нет.
        //Поэтому тема перенесена в первую практическую
        //Эти задания были нужны для того, чтобы люди с новой стороны посмотрели на циклы.
        //При этом они довольно сложные с точки зрения обвязки. Требуют особенный тип проекта и его настройки.
        //От задач больше проблем, чем пользы
        //Думаю их можно перенести в запись в файлы с SVG
//                .withGroup("Графический диктант")
//                .addExample(6062)
//                .addTask(6955)
//                .addTask(9639)
//                .addTask(7353)
//                .addTask(4910)
        ;
    }

    private static void fillInputAndTemplates(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab01")
                .withGroup("Получение строк от пользователя")
        ;
        if (taskBook.isCsharp()) {
            taskBook.addExample(new TaskCs1860())
            ;
        } else {
            taskBook.addExample(new TaskJava1860())
            ;
        }
        taskBook
                .addTask(new Task4764())
                .addTask(new Task2429())
                .addTask(new Task7472())
                .addTask(new Task1910())

                .withGroup("Диктант по присваиванию и конкатенации")
                .addExample(new Task4131())
                .addTask(new Task7365())

                .withGroup("Оформление текста по шаблону")
        ;
        if (taskBook.isCsharp()) {
            taskBook.addExample(new TaskCs4140());//вывод с помощью подстановочных символов
        } else {
            taskBook.addExample(new TaskJava4140());
        }
        taskBook
                .addTask(new Task2959())
                .addTask(new Task7271())
                .addTask(new Task2632())
                .addTask(new Task4343())
                .addTask(new Task7474())
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
                .withGroup("Операторы и операнды")
        ;
        if (taskBook.isCsharp()) {
            taskBook.addExample(new TaskCs4411());//преобразование в число, простая арифметика, вывод с нужной точностью
        } else if (taskBook.isJava()) {
            taskBook.addExample(new TaskJava4411());//преобразование в число, простая арифметика, вывод с нужной точностью
        }
        taskBook
                .addExample(new Task8428())//перевод из градусов в радианы по готовой формуле
                .addTask(new Task1976())//диктант
                .addTask(new Task3435())//обратное действие, нужно вывести формулу из задачи про радианы
                .addTask(new Task9865())//нужно перевести с естественного языка на ЯП
                .addTask(new Task7457())//нужно вывести формулу с помощью школьных знаний
                .addTask(new Task7237())

                .withGroup("Использование математических функций")
                .addExample(new Task7711())//синус
                .addTask(new Task3474())//длина гипотенузы, косинус
                .addTask(new Task1262())//косинус
                .addTask(new Task9164())//синус и косинус
                .addTask(new Task3558())//синус и косинус
                .addTask(new Task4913())//прямая геодезическая задача
                .addTask(new Task2790())//синус, корень
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
        //практика показывает, что на этом этапе нужно дать людям идею о вложенности условий и конструкций
        //это значит в случае когда нужно проверить 2 условия, их нужно пиать либо последовательно, либо вложенно.
        //если сразу рассказать о логических операторах и return, то у людей потом будут проблемы с вложенностью циклов
        taskBook.withSourceDirectory("lab03")
                .withGroup("Ограничения, связанные с предметной областью")
        ;
        if (taskBook.isJava()) {
            taskBook
                    .addExample(new TaskJava9298())//взаимоисключающий
            ;
        } else {
            taskBook
                    .addExample(new TaskCs9298())//взаимоисключающий
            ;
        }
        taskBook
                .addTask(new Task4312())//взаимоисключающий, несколько вариантов
                .addTask(new Task6522())//взаимоисключающий
                .addTask(new Task7619())//взаимоисключающий, несколько вариантов

                .withGroup("Ограничения при вычислении корня")
                .addExample(new Task8833())//взаимоисключающий
                .addTask(new Task9020())//взаимоисключающий
                .addTask(new Task1934())//взаимоисключающий
                .addTask(new Task3943())//взаимоисключающий, вложенный!

                .withGroup("Вычисление остатка от деления")
        ;
        if (taskBook.isJava()) {
            taskBook
                    .addExample(new TaskJava2801())//остаток от деления, не равно
            ;
        } else {
            taskBook
                    .addExample(new TaskCs2801())//остаток от деления, не равно
            ;
        }
        taskBook
                .addTask(new Task2361())//остаток от деления, сложная вложенность
                .addTask(new Task5063())//остаток от деления, кажется скучная
                .addTask(new Task5870())//остаток от деления

                .withGroup("Практика")
                .addTask(new Task3490())//округление вниз
                .addTask(new Task9622())//просто вычисления
                .addTask(new Task7799())//подвох в условиях корректности
                .addTask(new Task3591())//вычисления без формулы
                .addExample(new Task9130())//научная нотация чисел
                .addTask(5895)
                .addTask(2461)
                .addTask(2624)
                .addTask(5871)
        ;
    }

    private static void fillMutualExclusives(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab04")
                .withGroup("Взаимоисключающие случаи")
                .addExample(3072)
                .addTask(new Task3770())
                .addTask(5980)
                .addTask(8174)
                .addTask(7178)
                .addTask(new Task7243())
                .addTask(4257)
                .addTask(1763)
                .addTask(1945)
                .addTask(new Task2375())//вычитание одних денег из других. копейки отдельно от рублей
                .addTask(new Task4859())//расчет НДС, округление

                .withGroup("Несколько взаимоисключающих случаев if(){} else if() {} else {}")
                .addExample(8878)
                .addTask(6291)
                .addTask(new Task5662())
                .addTask(new Task5116())
                .addTask(2291)

                .withGroup("Несколько условий последовательно, с дополнением ответа в каждом условии. Нужно для объяснения циклов и массивов потом")
                .addExample(1186)
                .addTask(8518)
                .addTask(1292)
                .addTask(new Task6686())//поиск максимума, последовательный ввод и сравнение

                .withGroup("Просто задачи повышенного уровня сложности")
                .addTask(new Task6924())//нет проверок. просто расчеты с участием корня
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
                .addExample(new Task8715())//проверка двух условий одновременно
                .addTask(new Task8867())//проверка попадания в интервал
                .addTask(new Task7991())//проверка попадания в 1 интервал исключая границы
                .addTask(new Task7865())//проверка попадания в 2 интервала
                .addTask(new Task3883())//сравнение цифр в числе
                .addTask(new Task8751())//несколько if без else
                .addTask(new Task4858())//сравнение интервалов
                .addTask(new Task3864())//Обратная геодезическая задача. сравнение и тригонометрические функции
                .addTask(new Task9705())//очень объемная проверка 4 интервалов
                .addTask(5635)
                .addTask(8718)
        ;
    }

    private static void fillLoops(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab06")
                .withGroup("Отличие действий, которые нужно повторять, от действий перед и после цикла")
        ;
        if (taskBook.isJava()) {
            taskBook
                    .addExample(new TaskJava1315())
            ;
        } else {
            taskBook
                    .addExample(new TaskCs1315())
            ;
        }
        taskBook
                .addTask(new Task1631())//несколько чисел в столбик с повторением оформления
                .addTask(new Task2594())//повторить символ, оформление не повторяется

                .withGroup("Несколько заменяемых фрагментов в повторяющихся действиях")
                .addTask(new Task3762())//таблица соответствия между кг и фунтами
                .addTask(new Task3550())//таблица умножения на х
                .addTask(new Task1139())//10 следующих чисел с шагом
                .addTask(new Task9969())//три раза, потом 10 раз, потом 3 раза
                .addTask(new Task5301())//счётчик увеличивается каждую итерацию
                .addTask(new Task6790())//по возрастанию и вычислить функцию
                .addTask(new Task3850())//сформировать новый массив чисел

                .withGroup("Один цикл за другим")
                .addTask(new Task6059())//10 чисел, начиная с указанных
                .addTask(new Task7086())//10 следующих, 10 предыдущих
                .addTask(new Task5149())//несколько чисел с указанным шагом

                .withGroup("Цикл внутри условия")
        ;
        if (taskBook.isJava()) {
            taskBook
                    .addExample(new TaskJava6066())//вывод подряд с ошибкой
            ;
        } else {
            taskBook
                    .addExample(new TaskCs3985())//вывод подряд с ошибкой
            ;
        }
        taskBook
                .addTask(new Task1259())//повторить не более 20 раз
                .addTask(new Task2565())//по убыванию с ошибкой
                .addTask(new Task8722())//два столбца разной высоты
                .addTask(new Task2321())//вывод по возрастанию от меньшему к большему
                .addTask(new Task5053())//вывод по возрастанию/убыванию
                .addTask(new Task6663())//вывод по возрастанию/убыванию
                .addTask(new Task4338())//вывод в два столбика по убыванию и возрастанию
                .addTask(new Task7054())//вывод указанного количества
        ;
    }

    private static void fillStreamOfData(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab09")
                .withGroup("Обработка неизвестного объема данных")
                .addExample(new Task1903())//вывод с простым вычислением
                .addExample(new Task8138())//просто вывод, не запутаться с присваиваниями
                .addTask(new Task1845())//вывод с условием
                .addTask(new Task7083())//вывод с условием
                .addTask(new Task2072())//вывод с условием, обнуление
                .addTask(new Task2733())//повтор запроса ввода пока не будет введено корректное
                .addTask(new Task7595())//подсчет суммы
                .withGroup("Обработка конечной последовательности")
                .addTask(new Task2368())//подсчет суммы. конечное количество чисел
                .addTask(new Task5279())//конечное множество чисал. не запутаться с присваиваниями
                .addTask(new Task7150())//следующее предыдущее с подсчетом количества подряд

                .withGroup("Условие внутри цикла")
                .addTask(new Task4264())//обнуление в условии
                .addTask(new Task1483())//обнуление в условии неявное
                .addTask(new Task3983())//перенос строки и обнуление

                .withGroup("Цикл после цикла или цикл с условием внутри")
                // .addTask(4236)

                .addExample(new Task2324())//подсчет суммы и количества. остановка при вводе специального числа
                .addTask(new Task8731())//подсчет суммы, от которой зависит продолжение цикла
                .addTask(new Task4082())//повторение действий пока не будет введено специальное число
                .addTask(new Task9126())//Компьютер угадывает число пользователя
                .addTask(new Task3827())//вычисление корня методом бинарного поиска
                .addTask(2523)//переливания с выбором действий пользователем
        ;
    }

    private static void fillNestedLoops(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab06")

                .withGroup("Цикл после цикла. Подготовка к циклам внутри циклов")
                .addExample(new Task9249())//две строки с одним счетчиком
                .addTask(new Task4075())//три строчки указанной ширины
                .addTask(new Task8395())//несколько букв вывести указанное количество раз
                .addTask(new Task7323())//две строки с одним счетчиком, другое описание

                .withGroup("Циклы один за другим с вложением")
                .addTask(new Task5568())//вывести числа подряд указанное количество раз
                .addTask(new Task2592())//вложенные циклы, счетчик не видно
                .addTask(new Task6355())//вложенные циклы, счетчик увеличивается более чем на 1

                .withGroup("Просто сложные задачи")
                .addTask(new Task3519())//обнуление в зависимости от ввода
                .addTask(new Task6332())//счетчик не видно
                .addTask(7517)
                .addTask(5448)
                .addTask(6572)
                .addTask(5238)
                .addTask(2084)
                .addTask(5411)
                .addTask(5171)
                .addTask(1862)
//                .withGroup("Рисование")
//                .addTask(5902)
//                .addTask(6302)
        ;
    }

    private static void fillBasicArrayOperations(TaskBook taskBook) {
        taskBook.withSourceDirectory("arrays")
                .withGroup("Работа с массивами")
                .addExample(new Task4425())//образец чтения из массива
                .addTask(new Task7834())//элементы на конкретных индексах
                .addTask(new Task5873())//следующий и предыдущий
                .addTask(new Task3908())//третий с конца
                .addTask(new Task1433())//середина массива
                .addTask(new Task3791())//независимые условия
                .addTask(new Task9361())//пользователь вводит две даты dd_MM_yyyy выяснить какая из них больше.
                .addTask(new Task1058())//parse array to distinct numbers. distance between points
                .addTask(new Task6589())//parse array, range intersection
                .addTask(new Task9980())//чтение из массива по указанным индексам

                .withGroup("Обработка массивов циклом")
                .addExample(new Task5683())
                .addTask(new Task8557())
                .addCitation("link_c3_p12.8")
                .addTask(new Task1223())
                .addTask(new Task8311())
                .addTask(new Task6563())
                .addTask(new Task7295())//запись в массив по указанному индексу, бесконечный ввод
        ;
    }

    private static void fillSwapping(TaskBook taskBook) {
        taskBook.withSourceDirectory("arrays")
                .withGroup("Головоломки на перестановку")
        ;
        if (taskBook.isCsharp()) {
            taskBook.addTask(new TaskCs8775())
                    .addTask(new TaskCs5510())
                    .addTask(new TaskCs8072())
                    .addTask(new TaskCs3985())
            ;
        } else if (taskBook.isJava()) {
            taskBook.addTask(new TaskJava8775())
                    .addTask(new TaskJava5510())
                    .addTask(new TaskJava8072())
                    .addTask(new TaskJava3985())
            ;
        } else {
            throw new RuntimeException("Неопознанный идентификатор языка '" + taskBook.getLangAbbreviation() + "'");
        }
        taskBook
                .withGroup("Запись в массив")
                .addExample(new Task9923())//копируем последний в начало
                .addTask(new Task1331())//запись значения в массив по индексу
                .addTask(new Task1737())//создание массива и заполнение массива фрагментами
        ;

        //эти задачи легко сделать неправильно. а именно - просто вывести все элементы массива
        //можно добавить дополнительный ввод индекса и вывод элемента на этом индексе
        //но кажется такое усложнение не имеет смысла,
        // т.к. люди рано или поздно приходят к тому, что они решают задачу неправильно
        //задачу с усложненной постановкой они могут не решить вообще
        taskBook.withGroup("Перестановки элементов")
                .addExample(new Task3134())//перестановка двух элементов
                .addTask(new Task9711())//сдвиг на 1 позицию вправо
                .addTask(new Task7085())//сдвиг на 1 позицию вправо несколько раз
                .addTask(new Task8820())//инвертирование массива
                .addTask(new Task3333())//сдвиг на много позиций
                .addTask(new Task8471())//перестановка с дополнительным массивом

                .addTask(new Task3845())//моделирование стека
                .addTask(new Task1998())//создание массива, записьВозможно это слишком сложная задача
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
                .addTask(new Task1904())//сбор числа из цифр, проверка ошибки в цикле
                .addTask(new Task2390())//вложенные циклы
                .addTask(new Task7534())//вложенные циклы

                .withGroup("Задачи повышенного уровня сложности")
                //угол между отрезками
                //для трех точек - отклонение центральной от соседних
                .addTask(5900)//вычисление контрольной суммы штрих-кода
        ;
        //идея "перечислить все комбинации чисел" нужна для того, чтобы люди осознавали сколько возможных значений у переменных может быть
        //без этой идеи задачи на пересечение интервалов получаются вырожденные.
        //люди проверяют только часть возможных ситуаций и не осознают все множество возможных значений
        taskBook.withSourceDirectory("arrays")
                .withGroup("Печать на экран комбинаций чисел")
                .addExample(new Task4965())//все комбинации двух значений в большом диапазоне
                .addTask(new Task1839())//все комбинации
                .addTask(new Task7039())//все комбинации без повторений
                //использование массива чисел для получения данных от пользователя.
                .addTask(new Task3095())//все комбинации двух элементов из более большого массива
                .addTask(new Task6915())//все комбинации из массива четырех чисел
                //ради этой задачи это все было затеяно
                .addTask(new Task6714())// пересекаются ли интервалы
                .addTask(new Task1217())//определение области пересечения интервалов
                .addTask(new Task4531())//изобразить пересекающиеся интервалы символами
                .addTask(new Task1438())//пересечение прямоугольников
        ;
    }

    private static void fillAggregateCalculation(TaskBook taskBook) {
        //задачки выглядят простыми, но в этот период студенты могут загрустить от постоянных новых сложных задачек. Поэтому надо дать на повторение.
        taskBook.withSourceDirectory("arrays")
                .withGroup("Вычисление агрегатов из ряда чисел")
                .addExample(new Task7621())//Вычисление суммы элементов на указанных индексах

                .addTask(new Task3669())//произведение целых чисел, long, без массива, цикл в условии
                .addTask(new Task5951())//сумма кубов, без массива, не универсальная
                .addTask(new Task2802())//сумма ряда 1/2+1/3+1/n, без массива
                .addTask(6580)//сумма квадратов, без массива

                .withGroup("Вычисление агрегатов в массиве")
                .addExample(8696)//количество чисел кратных 13, без массива, не универсальная
                .addTask(5969)//сумма целых чисел, которые кратны 7 от A до B, без массива
                .addTask(5170)//подсчет количества делителей, без массива
                .addTask(new Task3946())//среднее арифметическое
                .addTask(6497)//абсолютное отклонение от среднего
                .addTask(5648)//среднее квадратическое отклонение
                .addTask(new Task3788())//подсчет чисел меньше 100, запись их в новый массив

                .withGroup("Сортировка массива вставкой")
                .addExample(new Task7290())//подсчет количества чисел меньше Х. Нужно как пререквизит для сортировки вставкой. нужно ближе к теме. посчитать количество равных числу X
                .addTask(new Task2173())//проверка корректности сортировки. Это задача на поиск или на подсчет агрегата
                .addTask(new Task9576())//вложенные циклы, проверка корректности сортировки
                .addTask(4497)//просмотр массива и замена
                .addTask(new Task3218())//сортировка массива

                .withGroup("Агрегат по группам")
                .addTask(new Task7260())//сумма чисел в группах по 3
                .addTask(5795)//сумма чисел на четных и на нечетных позициях
                .addTask(new Task8167())//подсчет суммы. помнить последние 5 чисел
        ;
    }

    private static void fillElementSearch(TaskBook taskBook) {
        //поиск в массиве это на самом деле несколько тем. по возрастанию сложности:
        //1. поиск вообще всех элементов массива, которые равны или которые больше нужного
        //2. определение что нужный элемент отсутствует. требует подсчета количества или флага
        //3. поиск только первого случая элемента массива. требует понимания конструкции break

        taskBook.withSourceDirectory("arrays")
                //Поиск по сути - вычисление агрегата, т.к. результат - один элемент - флаг "присутствует" или "отсутствует"
                .withGroup("Поиск конкретного элемента в массиве")
                .addExample(new Task5694())//поиск неизвестного элемента в известном массиве
                .addTask(new Task6806())//поиск в массиве
                .addExample(new Task7585())//линейный поиск
                .addTask(new Task5522())//линейный поиск с двумя условиями
                .addTask(new Task8770())//условие в цикле с добавлением else
                .addTask(new Task1708())//поиск, другое оформление

                .withGroup("Поиск всех подходящих по условию")
                .addTask(new Task3488())//линейный поиск с логическим или
                .addTask(new Task2222())//подробный поиск делителей, цикл с нестандартным шагом
                .addTask(new Task8418())//поиск делителей
                .addTask(new Task6028())//вычисление синуса и проверка результатов.

                .withGroup("Поиск в массиве и прерывание работы цикла")
                .addExample(new Task4283())//поиск и подсчет количества
                .addTask(new Task2003())//return, отсутствие
                .addTask(new Task8158())//проверка наличия двух символов в массиве
                .addTask(new Task1292())//вывод символов до указанного
                .addTask(new Task7703())//многократный поиск и подсчет количества
                .addTask(new Task2234())//поиск в массиве, отсутствие. вложенные циклы
                .addTask(new Task4851())//создание нового массива, поиск элементов
                .addTask(new Task7995())//элементы массива это другие массивы

                .withGroup("Сопоставление массивов")
                .addExample(new Task7369())//наглядное сопоставление двух массивов
                .addTask(new Task6988())//синхронный просмотр двух массивов
                .addTask(new Task2497())//все числа первого массива меньше всех чисел второго массива
                .addTask(new Task5894())//неявное сопоставление + подсчет количества
                .addTask(new Task4515())//сопоставление массива с самим собой
                .addTask(new Task9827())//сопоставление массивов MINUS
                .addTask(new Task7793())//сопоставление, все виды
                .addTask(new Task1036())//Гиперпрыгающие плазмошашки
                .addTask(8122)//сложная задача с кучей концепций
        ;
    }

    private static void fillInsertionSort(TaskBook taskBook) {
        taskBook
                .withGroup("Поиск минимального")
                .addExample(new Task7035())//поиск минимального
                .addTask(new Task1522())//поиск максимального и поиск минимального
                .addTask(new Task1431())//максимальное и следующее максимальное
                .addTask(new Task9271())//поиск и манипуляции с массивом
                .addTask(new Task8769())//минимальное в участке массива
                .addTask(new Task4707())//сортировка по возрастанию вставкой
                .addTask(new Task1392())//вычисление медианы
                .addTask(new Task6492())//Сначала найти максимальное, от которого зависит количество строк
                .addTask(new Task1794())//максимальная разница между элементами

                //Подготовительной задачей будет
                //Эти задачи решаются двумя способами
                //1. Через создание хешсета
                //2. Через многократный просмотр двух массивов
                //3. Через сортировку с последующим линейным просмотром
                //К решению через сортировку подводить кажется правильнее.
                //Проблема в том, что исходные данные - строки, а не цифры.
                //Сравнение на "больше" или "меньше" для строк не такое очевидное, как для цифр
                .addTask(new Task9182())//сортировка, подсчет разных
                .addTask(new Task5541())//сортировка, подсчет разных, выбор различных
                .addTask(new Task7066())//сортировка кортежей по первому элементу

        //Будет логично сюда поставить еще и бинарный поиск
        ;
    }

    private static void fillStringMethods(TaskBook taskBook) {
        //Цели:
        // познакомить студентов с концепцией вызова методов
        // научить читать документацию
        // раньше была цель научить искать в документации, но для начала можно просто читать
        // познакомить с упоротым термином "подстрока", который постоянно используется
        taskBook.withSourceDirectory("lab08")
                .withGroup("Строковые методы")
        ;
        if (taskBook.isCsharp()) {
            taskBook
                    .addExample(new TaskCs7491())//знакомство с contains
                    .addExample(new TaskCs9631())//знакомство с indexOf
                    .addTask(new Task9812())//indexOf + ветвление
                    .addTask(new Task9279())//знакомство с indexOf с двумя аргументами
                    .addExample(new TaskCs4845())//знакомство с substring
                    .addTask(new Task5728())//вырезание фрагмента ограниченного двумя другими фрагментам
            ;
        } else if (taskBook.isJava()) {
            taskBook
                    .addExample(new TaskJava7491())//знакомство с contains
                    .addExample(new TaskJava9631())//знакомство с indexOf
                    .addTask(new Task9812())//indexOf + ветвление
                    .addTask(new Task9279())//знакомство с indexOf с двумя аргументами
                    .addExample(new TaskJava4845())//знакомство с substring
                    .addTask(new Task5728())//вырезание фрагмента ограниченного двумя другими фрагментам
            ;
        }
        taskBook
                .addTask(new Task7222())//substring
                .addTask(new Task5923())//substring+substring
                .addTask(new Task8543())//расшифровка даты indexof substring
                .addTask(new Task4265())//toUpper, toLower
                .addTask(new Task2166())//replace
                .addTask(new Task4996())//азбука Морзе
                .addExample(9925)
                .addExample(3657)
                .addTask(6599)
                .addTask(1618)
                .addTask(1703)
                .addTask(8887)
                .addTask(9116)
        ;
    }

    private static void fillReadingFiles(TaskBook taskBook) {
        taskBook.withSourceDirectory("lab09")

                .withGroup("Чтение файлов")
                .addExample(new Task6175())//просто чтение и просто вывод на экран
                .addTask(new Task5236())//чтение чисел, конвертирование и простой вывод
                .addTask(new Task4488())//пропуск первой строки

                .addExample(new Task7396())//строки файла это массивы чисел
                .addTask(new Task8605())//строки файла это массивы, которые обозначают дату
                .addExample(new Task7788())//использование файла как таблицы СУБД
                .addTask(new Task6989())//файл-таблица СУБД. нужно вывести данные по идентификатору
                .addTask(new Task6170())//2 файла-таблицы СУБД. Нужно соединить две таблицы, вывести данные по коду
                .addTask(new Task8665())//2 файла-таблицы СУБД. Нужно выполнить поиск по неключу и вывести
                .addTask(new Task1761())

                //моделировать чтение файла с разнородным смыслом строк. например
                //в файле написано два массива.
                //первая строка - число элементов массива N1
                //следующие N1 строк - сами элементы
                //следующая строка - число элементов второго массива N2
                //следующие N2 строк - сами элементы
                //напечатать содержимое массивов через запятую
                //

                .addTask(new Task4477())//проанализировать вложенность скобок
                .addTask(new Task9417())//чтение нескольких файлов, поиск общей суммы, обработка ошибок
                .addTask(new Task3148())//чтение нескольких файлов. список в одном, обрабатывать другие
                //.addTask()
                .addTask(new Task6648())//смоделировать стек, но с расширяющимся хранилищем
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
        //компараторы - важная тема, но перед ней есть еще очень много других, не менее важных
        taskBook
                .withSourceDirectory("lab15")
                .withGroup("Реализация компаратора")
                .addExample(8258)
                .addTask(4061)//компаратор по возрастанию абсолютных значений
                .addTask(7186)
                .addTask(1457)
        ;
    }

    private static void fillRecursion(TaskBook taskBook) {
        taskBook.withSourceDirectory("recursion")
                .addTask(new Task4106())//написать подробное решение
                .addTask(new Task1068())//написать сокращенное решение
                //.addTask(new )//бинарный рекурсивный поиск корня. неинтересный
                .addTask(new Task6646())//сумма чисел во всех файлах
        //Обработка файла с древовидной структурой
        //Поиск решения, например A*, ИИ для крестиков-ноликов
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
        //это все будет полезно только если человек научился работать с массивами.
        // если нет, будет двойной затык: оформление и логика
        //прежде чем наворачивать одну сложную тему на другую, надо добиться, что студенты понимают предыдущий материал
        //на этом можно навечно застрять
        //цель всего этого мероприятия - дать ощущение прогресса по материалу и при этом повторить циклы и массивы.
        //еще методы позволяют быстрее тестировать задачи с большим количеством исходных данных
        //значит нужны задачи еще и на циклы.
        //план:
        //методы с типом возвращаемого значения void пока не давать
        //оформление текста
        //методы для простых вычислений: x+ 7
        //перевод из градусов в радианы
        //кроме вызова метода из Program нужно донести мы

        //печать массива целиком -- дать без конкретного описания "найдите общий код в нескольких методах и реализуйте как метод"
        //преобразование массива строк в массив чисел -- дать без конкретного описания
        //метод для перестановки элементов массива
        //перестановка первого и указанного
        //сортировка пузырьком
        //метод для поиска индекса минимального
        //метод для поиска индекса минимального в части массива
        //метод для сортировки вставкой
        //метод для поиска медианы
        //метод для подсчета количества различных
        //метод для формирования нового массива с различными
    }

    private static void methodGeneralisation(TaskBook taskBook) {
        //обобщение кода - одна из главных целей написания методов.
        // к ней нужно переходить после того как человек освоил базовый синтаксис.
        //сами задачи должны быть простыми, многократно пережеванными.
        //сложность здесь должна быть в обобщении 4 методов до одного.
        //задачи идут пачками:
        // - обработка целиком,
        // - начиная с индекса х до конца,
        // - начиная с 0 до индекса х,
        // - от x до y
        //задачи:
        // - напечатать массив,
        // - найти сумму элементов массива,
        // - найти минимальное
        taskBook.addTask(new Task9309())//печать всего массива
                .addTask(new Task8862())//печать от start до конца
                .addTask(new Task9709())//печать от start до end
                .addTask(new Task6813())//применить метод из 9709 в 9309 и 8862
        ;
        //в начале посильным упражнением может быть работа с готовым правильным кодом
        //цель - разбиение кода на наибольшее количество методов
        //идеальная задача для этого - поиск различных элементов в массиве
        //еще можно дать поиск медианы и сопоставление двух массивов (full outer join)
        //у них есть общая часть - сортировка вставкой.
        //рассчитываю, что ученики заметят это и смогут правильно переиспользовать код
    }

    private static void unitTesting(TaskBook taskBook) {
        taskBook
                .withSourceDirectory("lab12")
                .addCitation("info01")
                .withGroup("Проверка вспомогательной программой")
        ;

        if (taskBook.isJava()) {
            taskBook
                    .addExample(new TaskJava8307())//метод с одним аргументом и печатью в консоль
                    .addTask(new TaskJava8813())//метод с двумя аргументами и печатью в консоль
                    .addTask(new TaskJava5823())//метод с тремя аргументами и печатью в консоль
                    .addTask(new TaskJava2772())//метод с тремя аргументами и печатью в консоль
                    .addCitation("link_c2_p7.1")

                    .addExample(new TaskJava7611())//метод с одним аргументом, возвращает число
                    .addTask(new TaskJava4776())//метод с одним аргументом, возвращает число
                    .addTask(new TaskJava3597())//метод с условиями и возвратом строки
                    .addTask(new TaskJava6573())//метод с условием и циклом. возврат long
            ;
        } else if (taskBook.isCsharp()) {
            taskBook
                    .addExample(new TaskCs8307())//метод с одним аргументом и печатью в консоль
                    .addTask(new TaskCs8813())//метод с двумя аргументами и печатью в консоль
                    .addTask(new TaskCs5823())//метод с тремя аргументами и печатью в консоль
                    .addTask(new TaskCs2772())//метод с тремя аргументами и печатью в консоль
                    .addCitation("link_c2_p7.1")

                    .addExample(new TaskCs7611())//метод с одним аргументом, возвращает число
                    .addTask(new TaskCs4776())//метод с одним аргументом, возвращает число
                    //методы с условиями это особенная тема.
                    // если до этих пор не говорить студентам об else, то сейчас наверняка возникнуть проблемы вида
                    //missing return statement
                    //это хороший повод объяснить else
                    .addTask(new TaskCs3597())//метод с условиями и возвратом строки
                    .addTask(new TaskCs6573())//метод с условием и циклом. возврат long
            ;
        } else {
            throw new RuntimeException("Неопознанный идентификатор языка '" + taskBook.getLangAbbreviation() + "'");
        }
        taskBook
                .addTask(1292)
                .addCitation("link_c2_p7.2")

                .withGroup("Аргумент-массив")
                .addExample(3946)
        ;

        if (taskBook.isJava()) {
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
        } else if (taskBook.isCsharp()) {
            taskBook.addTask(new TaskCs8920())

                    .withGroup("Возврат массива в качестве результата")
                    .addTask(6497)//сначала среднее арифм. потом вычесть его из всех элементов
                    .addExample(new TaskCs2936())
                    .addTask(new TaskCs3539())

                    .withGroup("Возврат булевого значения")
                    .addExample(new TaskCs6401())
                    .addTask(new TaskCs7581())
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
        ;
        if (taskBook.isCsharp()) {
            taskBook.addExample(new TaskCs7740());//обработка не-чисел
        } else if (taskBook.isJava()) {
            taskBook.addExample(new TaskJava7740());//обработка не-чисел
        }
        taskBook
                .addTask(new Task1439())//обработка не-чисел
                .addTask(new Task5101())//подсчет количества в файле
                .addTask(new Task8733())//среднее арифметическое в файле
                .addTask(8139)//чтение файла, подсчет количества особенных, обработка не-чисел
                .addTask(new Task5014())//чтение файла, вывод первого и остальных, обработка не-чисел
                .withGroup("Выбрасывание исключения, проверка в консольной программе")
        ;
        if (taskBook.isCsharp()) {
            taskBook
                    .addExample(new TaskCs9354())//вызов метода, выбрасывание исключения
                    .addTask(new TaskCs5259())//вызов метода, выбрасывание исключения, расстановка try/catch
                    .addTask(new TaskCs9058())//вызов метода, выбрасывание исключения, расстановка try/catch
            ;
        } else if (taskBook.isJava()) {
            taskBook
                    .addExample(new TaskJava9354())//вызов метода, выбрасывание исключения
                    .addExample(new TaskJava5259())//вызов метода, выбрасывание исключения, расстановка try/catch
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
                .addTask(5170)
                .addTask(7891)

                .withGroup("Работа с файлами, перехват исключений на различных этапах работы программы")
                .addExample(6882)
                .addTask(1212)
                .addTask(9472)
                .addTask(5081)
        ;
    }

    private static void fillStaticVsNonStatic(TaskBook taskBook) {
        taskBook.withSourceDirectory("objects")
                .withGroup("Отличие статических методов от нестатических")
                .addExample(new Task6011())//Point.distanceBetween(Points)
                .addExample(new TaskJava3185())//Point.distanceTo(Point)
                .addExample(new TaskJava1401())//Point.distanceBetween(Points) && Point.distanceTo(Point)
                .addTask(new TaskJava1606());
    }

    private static void fillAbstractDataStructures(TaskBook taskBook) {
        taskBook.withSourceDirectory("objects")
                .withGroup("Классы как контейнеры данных (АТД)");
        //базовая цель - чтобы студенты научились отличать статический метод от нестатического
        //и обращаться к полям класса

        //на практике выяснилось, что людям очень трудно даются юнит-тесты, особенно когда смысл методов еще не закреплен
        //плюс большие тексты долго сложно писать.
        //в итоге люди их не читают, потому что многабукоф.
        //при этом для проверки достаточно печатать на экран.

        //большая сложность - в том, чтобы отследить какие методы и поля уже есть у классов
        //если они используются в разных заданиях и разных практических
        //Возможные решения:
        //1. ВНИМАТЕЛЬНО контролировать где какой класс используется и дописывать "проверьте что это объявлено"
        //2. Использовать разные классы в разных практических
        //3. Везде писать "создайте, объявите", даже если это не первая задача.
        // Люди додумаются что повторно не надо это делать.
        // Если не додумаются, то сначала поймают ошибки компиляции, а потом додумаются.

        //цель размазана на две разные практические. Методы с аргументом values - лишние. Отвлекают от основной цели. Возможно надо раньше давать.

        //не затронута тема статических переменных
        taskBook
                .addTask(new Task2686())//Point.print
                .addExample(new Task5789())//Point.distanceBetween(values)
                .addTask(new Task6011())//Point.distanceBetween(Points)
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
                .addExample(new Task7301())
                .addTask(new Task2000())

                .withGroup("Практика")
                .addTask(3864)
                .addTask(4913)
                .addTask(6522)
                .addTask(8225)

        //нужна задача: создайте класс с такими полями. Например Деньги.
        //Сделайте так, чтобы в этом классе в поле cent никогда не было значения меньше 0 и больше 99
        //Сделайте так, чтобы поле cent нельзя было менять в обход сеттера

        ;
    }

    private static void fillInternalState(TaskBook taskBook) {

        //сюда может хорошо подойти 1036 (прыгающие шашки)
        //чтобы не терять время дал свое решение "одним main".
        //Цель - сделать так, чтобы мы не зависели от консоли и могли передавать произвольные числа.
        //Ход работы:
        // Создать класс Puzzle.
        // Создать в классе Puzzle один метод "move", внутри которого поместить содержимое цикла
        // возникает проблема - где объявлять state. наилучший вариант - в классе, за пределами метода. доспустимо в методе state.
        // возникает другая проблема - нужно возвращать в main актуальное состояние.
        // теперь единственный допустимый вариант - в классе, т.к. при объявлении внутри метода, стейт не будет сохраняться.
        // для получения актуального состояния в main нужно создать метод getState, который будет возвращать значение

        //модель "лифт".
        //к модели, работающей с реальным временем, нужно дополнительную подготовку:
        //- неблокирующий ввод
        //- получение текущего времени
        //только после этого будет смысл от всех методов: "пишем так, чтобы не тратить реальное время"
        //Лифту можно посылать сигнал с номером этажа - откуда его вызывают.
        //Лифту также можно указать номер этажа на внутреннем пульте управления - куда ему нужно прийти.
        //а также вызывать update и передавать количество секунд с прошлого обновления.
        //лифт открывает и закрывает двери 10 секунд.
        //лифт двигается между соседними этажами 15 секунд.
        //лифт ждет пассажира 30 секунд, а потом закрывает двери.
        //изначально лифт на 1 этаже, двери закрыты. Всего этажей 12.
        //пользователь вводит "вызов 2". если послать update(5), то должно быть написано "лифт на 1 этаже. двери закрываются."
        //если далее послать update(20), то должно быть написано "лифт на 2 этаже, двери закрыты."
        //если послать update(3), то должно быть написано "лифт на 2 этаже, двери открываются".
        //если послать update(
        taskBook.withSourceDirectory("objects")
                .withGroup("Нестатические методы класса");
        if (taskBook.isJava()) {
            taskBook
                    .addExample(new TaskJava8403())//Point.distanceTo(values)
                    .addExample(new TaskJava3185())//Point.distanceTo(Point)
                    .addTask(new TaskJava9914())//Range.intersects(values)
            ;
        } else if (taskBook.isCsharp()) {
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

    private static void fillCollections(TaskBook taskBook) {
        //хорошо получилось дать задачу 7834 с постепенным вводом чисел и выводом всего результата каждый раз
        //затем задача на заполнение массива данными и вывод всего массива 5683
        //задача на поиск в массиве
        //затем задача на чтение файла, заполнение листа данными и вывод всего листа 6175
        //задача на чтение csv файла и вывод некоторых атрибутов
        //затем поиск в csv файле 6989. обратить внимание что мы сначала читаем файл, а данные из него обрабатываем потом. пользователь вводит несколько идентификаторов
        //задача на сопоставление двух листов 6170
        taskBook.withSourceDirectory("lab15")
        ;
        if (taskBook.isJava()) {
            taskBook
                    .withGroup("Формирование листа")
                    .addExample(new TaskJava5087())//наполнение листа
                    .addTask(new TaskJava3305())//целые числа в диапазоне
                    .addTask(new TaskJava8317())//делители числа, наполнение листа, обработка исключений
                    .withGroup("Формирование множества")
                    .addExample(new TaskJava4568())//запись в сет
                    .addTask(new Task9990())//чтение из файла, запись в сет
            ;
        } else {
            taskBook
                    .withGroup("Формирование листа")
                    .addExample(new TaskCs5087())//наполнение листа
                    .addTask(new TaskCs3305())//целые числа в диапазоне
                    .addTask(new TaskCs8317())//делители числа
                    .withGroup("Формирование множества")
                    .addExample(new TaskCs4568())//запись в сет
                    .addTask(new Task9990())//чтение из файла, запись в сет
            ;
        }
        taskBook
                //пока отключено, потому что в первом знакомстве с коллекциями, люди еще не готовы использовать их для хранения классов
//                .withGroup("Переопределение стандартного Equals")
//                .addExample(5449)
//                .addTask(9238)
//
//                .withGroup("Переопределение стандартного hashcode")
//                .addExample(9512)
//                .addTask(9924)

                .withGroup("Формирование словаря")
                //здесь надо задачу с бесконечным вводом по два элемента: ключ и значение
                //потом подсчет количества ключей
                .addExample(1056)
                .addTask(7738)
                .addTask(7657)
                .addTask(5108)
                .addTask(new Task7940())//заполнение расписания, наполнение листа, поиск подходящих, сравнение интервалов
                .addTask(new Task3146())//wordcount

                .withGroup("Вычисление агрегата по группам")
                .addTask(9092)
                .addTask(new Task6590())//задача решена через set и кажется это избыточно

                .withGroup("Заполнение коллекции экземплярами классов из иерархии")
                .addExample(3956)
                .addTask(6876)
                .addTask(2033)
                .addTask(6981)
                .addTask(1753)
        ;
    }

    private static void fillDateTime(TaskBook taskBook) {
        taskBook.withSourceDirectory("datetime")
                .addExample(new Task9425())//выбор форматирования для чтения дат
                .addExample(new Task3123())//вычисление разницы между двумя датами в часах, минутах, секундах
                .addTask(new Task9418())//определение разницы между датами в секундах
                .addExample(new Task7480())//сравнение двух дат "является ли позже"
                .addTask(new Task8811())//дан период дат. проверить, находится ли третья дата в этом периоде
                .addTask(new Task1912())//сравнение даты с другими несколько раз
                .addExample(new Task3696())//прибавление дней
                .addTask(new Task8381())//обращение к свойствам даты. прибавление и вычитание дней
                .addTask(new Task8498())//обращение к свойствам даты. проверка дня недели
                .addTask(new Task8096())//проверка дня недели. прибавление и вычитание дней
                .addExample(new Task8519())//перевод в другой часовой пояс
                .addTask(new Task2130())//перевод в указанный часовой пояс
//                .addTask(1912)
//                .addTask(6072)
//                .addTask(1103)
//                .addTask(1012)
//                .addTask(2681)
//                .addTask(6851)
//                .addTask(9641)
//                .addTask(2025)
//                .addTask(7407)
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
        themeNavContent.append("<div class='lab_nav'>Другие темы<ol>\n");
        for (int i = 0; i < themeList.length; i++) {
            int labIndex = i + 1;
            taskBooks[i] = TaskBook.builder()
                    .withIndex(labIndex)
                    .withLangAbbreviation(langAbbreviation)
                    .withTheme(themeList[i]);
            themeNavContent.append(String.format("<li>%d <a href='%s'>%s</a></li>\n",
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
        String version = getVersion();

        String css = loadCss("styles.css");

        TaskBook[] taskBooksJava = populateJavaContent(themeList);
        makeFiles(taskBooksJava, css, version);

        TaskBook[] taskBooksCs = populateCsContent(themeList);
        makeFiles(taskBooksCs, css, version);

        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
        System.out.println("Next task id is:" + suggestNextTaskId(taskBooksJava));
    }
}
