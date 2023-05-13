package root.tasks.collections;

import root.tasks.MethodsDictationHelper;
import root.tasks.OneInputValLayout;


public class TaskJava9112 extends OneInputValLayout implements MethodsDictationHelper {
    @Override
    protected void logic(String value) {

    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(1139));
        appendOrderedNonEscaped(
                "В классе Library импортируйте классы \"java.util.Arrays\" и \"java.util.ArrayList\"",
                implementStatic("Library", "task9112"),
                "Он принимает в качестве аргумента 1 целое число и возвращает List целых чисел",
                "В теле метода task9112 "
        );
        appendFooter();
    }
}
