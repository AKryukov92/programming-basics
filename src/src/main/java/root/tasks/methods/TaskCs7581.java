package root.tasks.methods;

import root.tasks.LayoutMaker;

public class TaskCs7581 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(2003));
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод Task2003.",
                "Он принимает массив строковых значений и возвращает логическое значение.",
                "Если данный массив содержит хотя бы один символ 'x', метод должен вернуть значение true.",
                "Если символ 'x' в массиве отсутствует, метод должен вернуть значение false."
        );

        добавить код для проверки
        appendFooter();
    }
}
