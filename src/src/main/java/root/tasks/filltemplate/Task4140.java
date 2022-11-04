package root.tasks.filltemplate;

import root.tasks.TwoInputValLayout;

public class Task4140 extends TwoInputValLayout {
    @Override
    protected void logic(String firstName, String lastName) {
        System.out.println("Меня зовут " + lastName + ", " + firstName + " " + lastName);
    }

    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskDesc("В условиях задач могут встречаться выражения вида $lastName. Это условное обозначение для вас. Вместо этого выражения нужно написать значение переменной lastName. Это можно сделать любым знакомым вам способом. Выражение со знаком доллара довольно широко распространено и полезно познакомиться с ним.");
        appendTaskHeader();
        appendTaskDesc("Пользователь вводит фамилию и имя. Нужно оформить фразу по шаблону: \"Меня зовут $lastName, $firstName $lastName.\".");
        appendCheckValuesHeader("first name", "last name");
        appendCheckValuesRow("Джеймс", "Бонд");
        appendCheckValuesRow("капитан", "Джек Воробей");
        appendCheckValuesRow("Александр", "Крюков");
        appendCheckValuesFooter();
        appendFooter();
    }
}
