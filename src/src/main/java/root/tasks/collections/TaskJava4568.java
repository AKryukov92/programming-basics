package root.tasks.collections;

import root.tasks.StreamInputLayout;

import java.util.HashSet;
import java.util.Scanner;

public class TaskJava4568 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит 4 фрагмента текста. В памяти нужно хранить только различные фрагменты из всех, которые пользователь ранее вводил.");
        appendCheckValuesHeader();
        appendCheckValuesRow("red,green,red,green".split(","));
        appendCheckValuesRow("red,red,blue,blue".split(","));
        appendCheckValuesRow("a,a,a,a".split(","));
        appendCheckValuesFooter();
        appendTaskDescEscaped("Уникальность элементов достигается за счет использования HashSet.");
        appendTaskDescEscaped("В начале файла добавьте команду:");
        appendCheckSingleNonEscaped("import java.util.HashSet;\n");
        appendTaskDescEscaped("Тело метода main:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        HashSet<String> fragments; //объявляю переменную для хранения множества строк
        fragments = new HashSet<>();//создаю экземпляр класса множества
        String line = s.nextLine();
        fragments.add(line);//добавляю элемент во множество
        line = s.nextLine();
        fragments.add(line);
        line = s.nextLine();
        fragments.add(line);
        line = s.nextLine();
        fragments.add(line);
        //печать элементов множества на экран
        //из за того, что к элементам нельзя обращаться по индексу,
        // нужно использовать специальный синтаксис цикла
        for (String item : fragments) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava4568());
    }
}
