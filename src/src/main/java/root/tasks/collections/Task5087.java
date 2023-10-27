package root.tasks.collections;

import root.tasks.StreamInputLayout;

import java.util.*;

public class Task5087 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит бесконечное количество фрагментов. Все эти фрагменты нужно хранить в памяти. После ввода нового фрагмента нужно написать на экран все фрагменты, которые пользователь ранее вводил. Программа сама не завершается. Нужно закрывать её вручную.");
        appendCheckValuesHeader();
        appendCheckValuesRow("q,w,e,q,q,q".split(","));
        appendCheckValuesRow("qw,as,zx,er,as,zx".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        List<String> fragments = new ArrayList<>();
        while (s.hasNext()) {
            String line = s.nextLine();
            fragments.add(line);
            int i = 0;
            while (i < fragments.size()) {
                System.out.print(fragments.get(i) + " ");
                i = i + 1;
            }
            System.out.println();
        }
    }
}
