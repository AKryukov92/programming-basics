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
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        System.out.println("Мы стремимся к " + value);
    }
}
