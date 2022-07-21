package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class Task2959 extends OneInputValLayout {
    @Override
    protected void logic(String id) {
        System.out.println("SELECT first_name, last_name, group");
        System.out.printf("FROM students WHERE student_id = '%s';", id);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит несколько значений. Вывести данный фрагмент текста, заменив названия переменных их значениями. $ID на введенное значение id.");
        appendCheckSingle("SELECT first_name, last_name, group\n" +
                "FROM students WHERE student_id = '$ID';");
        appendCheckValuesHeader("id");
        appendCheckValuesRow("123456789");
        appendCheckValuesRow("fa93f");
        appendCheckValuesFooter();
        appendFooter();
    }
}
