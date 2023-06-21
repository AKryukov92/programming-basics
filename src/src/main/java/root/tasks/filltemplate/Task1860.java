package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class Task1860 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskHeader();
        appendTaskDescEscaped("Составить программу вывода на экран слова (word), вводимого с клавиатуры. Перед выводимым словом нужно написать фразу \"Мы стремимся к \"." +
                "Для хранения текста от пользователя нужно объявить переменную. Правила именования переменных:");
        appendOrderedEscaped(
                "Может состоять из русских и латинских букв, цифр, знака подчеркивания \"_\"",
                "Может начинаться с буквы или знака подчеркивания. С цифры начинаться не может.",
                "Не может содержать знаки математических операций",
                "Название должно отражать назначение переменной"
        );
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
