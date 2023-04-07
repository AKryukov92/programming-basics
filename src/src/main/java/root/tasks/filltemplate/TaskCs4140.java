package root.tasks.filltemplate;

import root.tasks.TwoInputValLayout;

public class TaskCs4140 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskHeader();
        appendTaskDesc("Пользователь вводит фамилию и имя. Нужно оформить фразу по шаблону:");
        appendCheckSingle("Меня зовут $lastName, $firstName $lastName.");
        appendTaskDesc("Выражения вида $lastName это условное обозначение для вас." +
                " Вместо этого выражения нужно написать значение переменной lastName." +
                " В C# это можно сделать с помощью команды Console.WriteLine()." +
                " В скобочках нужно написать:");
        appendOrdered(
                "Шаблон текста со специальными символами {0} в тех местах, где нужно написать переменную.",
                "Переменные через запятую. Они пронумерованы начиная с 0. Этот номер ставится в специальных символах между фигурными скобками."
        );
        appendTaskDesc("Команда для решения этой задачи выглядит так");
        appendCheckSingle("Console.WriteLine(\"Меня зовут {0}, {1} {0}\", lastName, firstName);");
        appendCheckValuesHeader("first name", "last name");
        appendCheckValuesRow("Джеймс", "Бонд");
        appendCheckValuesRow("капитан", "Джек Воробей");
        appendCheckValuesRow("Александр", "Крюков");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstName, String lastName) {
        System.out.printf("Меня зовут %s, %s %s", lastName, firstName, lastName);
    }
}
