package root.tasks.collections;

import root.tasks.StreamInputLayout;

import java.util.*;

public class Task4568 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит бесконечное количество фрагментов. Все эти фрагменты нужно хранить в памяти. После ввода нового фрагмента нужно написать на экран только различные фрагменты, которые пользователь ранее вводил. Программа сама не завершается. Нужно закрывать её вручную.");
        appendCheckValuesHeader();
        appendCheckValuesRow("q,w,e,q,q,q".split(","));
        appendCheckValuesRow("qw,as,zx,er,as,zx".split(","));
        appendCheckValuesF//ooter();
        //нужен пример кода
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        Set<String> fragments = new HashSet<>();
        while (s.hasNext()) {
            String line = s.nextLine();
            fragments.add(line);
            for (String k: fragments) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
