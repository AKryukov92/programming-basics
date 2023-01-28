package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task2733 extends StreamInputLayout {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит числа по одному. Если число больше 0, нужно умножить его на 3 и вывести результат. " +
                "Если число меньше 0, нужно написать 'число должно быть больше 0' и пропустить умножение. " +
                "Если число равно 0, нужно завершить работу программы.");
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {

    }
}
