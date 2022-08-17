package root.tasks.collections;

import root.tasks.OneInputValLayout;

public class TaskJava9112 extends OneInputValLayout {
    @Override
    protected void logic(String value) {

    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(1139));
        appendOrdered(
                "В классе Methods импортируйте классы \"java.util.Arrays\" и \"java.util.ArrayList\"",
                "В классе Methods реализуйте публичный статический метод task9112",
                "Он принимает в качестве аргумента 1 целое число и возвращает List целых чисел",
                "В теле метода task9112 "
        );
        appendFooter();
    }
}
