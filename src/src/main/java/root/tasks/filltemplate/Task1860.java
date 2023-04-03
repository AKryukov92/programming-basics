package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class Task1860 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskHeader();
        appendTaskDesc("Составить программу вывода на экран слова (word), вводимого с клавиатуры. Перед выводимым словом нужно написать фразу \"Мы стремимся к \".");
        appendCheckValuesHeader("word");
        appendCheckValuesRow("знаниям");
        appendCheckValuesRow("цели");
        appendCheckValuesRow("результату");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        System.out.println("Мы стремимся к " + value);
    }
}
