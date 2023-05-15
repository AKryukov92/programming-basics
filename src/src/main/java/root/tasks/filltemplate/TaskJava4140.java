package root.tasks.filltemplate;

import root.tasks.TwoInputValLayout;

public class TaskJava4140 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskHeader();
        appendTaskDescEscaped("Пользователь вводит фамилию и имя. Нужно оформить фразу по шаблону:");
        appendCheckSingleNonEscaped("Меня зовут $lastName, $firstName $lastName.");
        appendTaskDescEscaped("Выражения вида $lastName это условное обозначение для вас." +
                " Вместо этого выражения нужно написать значение переменной lastName." +
                " В Java это можно сделать с помощью команды System.out.printf()." +
                " В скобочках нужно написать:");
        appendOrderedNonEscaped(
                "Шаблон текста со специальными символами %s в тех местах, где нужно написать переменную.",
                "Переменные через запятую. В том порядке, как они должны быть написаны в сообщении."
        );
        appendTaskDescEscaped("Команда для решения этой задачи выглядит так");
        appendCheckSingleNonEscaped("System.out.printf(\"Меня зовут %s, %s %s\", lastName, firstName, lastName);");
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
