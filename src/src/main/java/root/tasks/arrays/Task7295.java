package root.tasks.arrays;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task7295 extends StreamInputLayout {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дан массив 'one','two','three','four','five', 'six'. Пользователь вводит число. Оно обозначает позицию в массиве, на которую будут записываться другие буквы. Затем пользователь вводит два строковых значения. Первое записывается на указанную позицию. Второе - на следующую. После ввода букв, нужно напечатать получившийся массив на экране. Затем пользователь может ввести данные повторно.");
        appendCheckValuesHeader();
        appendCheckValuesRow("2,aaaa,bbbb");
        appendCheckValuesRow("1,zx,cv,3,as,df");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {

    }
}
