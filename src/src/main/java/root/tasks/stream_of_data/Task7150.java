package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task7150 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество чисел. Если текущее число больше чем предыдущее, вывести 'ВВЕРХ'. Иначе вывести 'ВНИЗ'. Если 'ВВЕРХ' написано три раза подряд, то дополнительно вывести 'ПОТОЛОК'. Если 'ВНИЗ' написано четыре раза подряд, то дополнительно вывести 'ДНО'.");
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {

    }
}
