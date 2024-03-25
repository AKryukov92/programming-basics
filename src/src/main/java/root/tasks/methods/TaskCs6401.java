package root.tasks.methods;

import root.tasks.LayoutMaker;

public class TaskCs6401 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(8867));
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод Task8867.",
                "Он принимает три действительных числа: A, B, X и возвращает логическое значение.",
                "Если X принадлежит интервалу от A до B, метод должен вернуть значение true.",
                "Если X за пределами интервала от A до B, метод должен вернуть значение false."
        );
        добавить код для проверки
        appendFooter();
    }
}
