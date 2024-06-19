package root.tasks.collections;

import root.tasks.StreamInputLayout;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskJava5087 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит 4 фрагмента текста. Все эти фрагменты нужно хранить в памяти. Когда пользователь закончит вводить данные, нужно напечатать на экран все фрагменты, которые пользователь вводил ранее.");
        appendCheckValuesHeader();
        appendCheckValuesRow("one,two,three,three".split(","));
        appendCheckValuesRow("five,six,seven,six".split(","));
        appendCheckValuesFooter();
        appendTaskDescEscaped("Чтобы пользоваться коллекцией, нужно импортировать её класс. Для этого в начале файла добавьте команду:");
        appendCheckSingleNonEscaped("import java.util.ArrayList;");
        appendTaskDescEscaped("Если в начале файла у вас присутствует команда package, значит команду импортирования нужно написать строкой ниже.");
        appendTaskDescEscaped("Тело метода main:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        ArrayList<String> fragments;//объявляю переменную для хранения листа строк
        fragments = new ArrayList<>();//создаю экземпляр класса листа
        String line = s.nextLine();
        fragments.add(line);//добавляю элемент в лист
        line = s.nextLine();
        fragments.add(line);
        line = s.nextLine();
        fragments.add(line);
        line = s.nextLine();
        fragments.add(line);
        //печать элементов листа на экран
        int i = 0;
        while (i < fragments.size()) {//ограничение цикла - количество элементов в листе
            System.out.print(fragments.get(i) + " ");//печатаю элемент листа на экране
            i = i + 1;
        }
    }
}
