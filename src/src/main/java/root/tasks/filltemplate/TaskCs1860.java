package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class TaskCs1860 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskHeader();
        appendTaskDescEscaped("Пользователь вводит слово (goal). Нужно напечатать на экран фразу \"Мы стремимся к \" и затем слово от пользователя.");
        appendCheckSingleNonEscaped(
                "String goal;               //Объявить переменную для хранения текста\n" +
                "goal = Console.ReadLine(); //Получить данные от пользователя и записать их в переменную\n" +
                "Console.WriteLine(\"Мы стремимся к \" + goal); //Напечатать текст на экран"
        );
        appendTaskDescEscaped("Чтобы проверить эту программу, её нужно запустить несколько раз. При каждом запуске нужно вводить только одно слово из колонки Исходные данные. Задача решена правильно, если для всех исходных данных у вас получились соответствующие результаты.");
        appendCheckValuesHeader("word");
        appendCheckValuesRow("знаниям");
        appendCheckValuesRow("цели");
        appendCheckValuesRow("результату");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Одна из распространенных ошибок - не объявить переменную и дать команду на запись значения в переменную.");
        appendCheckSingleNonEscaped(
                "//для иллюстрации команда объявления пропущена String goal;\n" +
                "goal = Console.ReadLine();\n" +
                "Console.WriteLine(\"Мы стремимся к \" + goal);"
        );
        appendTaskDescEscaped("При попытке запустить такой код, компьютер выдаст ошибку: \"Имя \"goal\" не существует в текущем контексте.\"");
        appendTaskDescEscaped("Другая распространенная ошибка - пропустить инициализацию переменной. То есть объявить переменную и сразу использовать её в команде печати на экран.");
        appendCheckSingleNonEscaped(
                "String goal;\n" +
                "//для иллюстрации, команда записи значения пропущена: goal = Console.ReadLine();\n" +
                "Console.WriteLine(\"Мы стремимся к \" + goal);"
        );
        appendTaskDescEscaped("В таком случае компьютер выдаст ошибку: \"Использование локальной переменной \"goal\", которой не присвоено значение.\"");
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        System.out.println("Мы стремимся к " + value);
    }
}
