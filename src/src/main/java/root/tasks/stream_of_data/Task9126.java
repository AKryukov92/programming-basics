package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task9126 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь загадал число. Компьютер угадывает его и при этом спрашивает. Если предположение компьютера больше загаданного, пользователь должен ввести 1. Если меньше, то 0.");
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {

    }
}
