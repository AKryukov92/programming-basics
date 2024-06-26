package root.tasks.filltemplate;

import root.tasks.TwoInputValLayout;

public class Task7472 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        System.out.println(secondValue + " " + firstValue);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит две строки(first и second). Нужно составить из них третью строку, которая должна начинаться строкой second и заканчиваться строкой first.");
        appendCheckValuesHeader("first", "second");
        appendCheckValuesRow("начало", "конец");
        appendCheckValuesRow("сила", "знание");
        appendCheckValuesRow("курица", "яйцо");
        appendCheckValuesRow("шаг", "шаг");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7472().getContent());
    }
}
