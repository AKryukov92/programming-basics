package root.tasks.stream_of_data;

import root.tasks.OneInputValLayout;

public class Task3827 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число. Найти его корень методом бинарного поиска. Взять половину от введенного числа. Если она меньше, тогда взять половину половины. И т.п.");
        appendFooter();
    }

    @Override
    protected void logic(String value) {

    }
}
