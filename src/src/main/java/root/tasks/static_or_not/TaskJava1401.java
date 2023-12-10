package root.tasks.static_or_not;

import root.tasks.LayoutMaker;
import root.tasks.MethodsDictationHelper;
import root.tasks.assertions.TaskJava1058;

public class TaskJava1401 extends LayoutMaker implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {

        appendHeader();
        appendSubheading("Подготовьте классы");
        appendOrderedNonEscaped(
                "Создайте класс Point в папке для исходного кода",
                "Создайте в классе Point поля x и y для действительных значений",
                "Создайте класс PointSuite в папке для тестов"
        );
        appendSubheading("Условие задачи совпадает с " + linkToTask(1058));
        appendTaskDescEscaped(TaskJava1058.getTaskDescription());
        appendSubheading("Реализуйте статический метод distanceBetween");
        appendOrderedNonEscaped(
                "Он принимает в качестве аргумента 2 экземпляра класса Point",
                "Он возвращает действительное число",
                "Для вычисления результата используйте поля \"x\" и \"y\" экземпляров класса Point"
        );
        appendSubheading("Напишите тесты для метода distanceBetween");
        appendOrderedNonEscaped(
                "В классе PointSuite создайте юнит-тест distanceBetweenPointsTest.",
                "В теле метода distanceBetweenPointsTest объявите переменные a и b типа Point.",
                //простая формулировка заполнения
                "Создайте экземпляр класса класса Point и запишите его в переменную a.",
                //другая формулировка того же самого
                "Инициализируйте переменную b экземпляром класса Point.",
                //Проверяем тесты из оригинальной задачи по одному потому что сложность задачи в оформлении,
                //а не в написании формулы. К тому же формулу проверили в первой задаче этой лабораторной
                //сначала заполняем поля явно, по одному
                "Инициализируйте поле \"x\" переменной b значением 3.",
                "Инициализируйте поле \"y\" переменной b значением 4.",
                //когда по одному получилось, тогда можно обобщенную фразу
                "Инициализируйте поле \"x\" и \"y\" переменной a значениями 1.",
                "Вызовите статический метод distanceBetween класса Point и передайте ему в качестве аргументов значения переменных a и b.",
                "Проверьте, что результат вызова метода distanceBetween равен 3.6056 с точностью 0.0001.",
                "После запуска тестового метода, он должен быть отмечен зеленым знаком в списке методов."
        );
        appendSubheading("Реализуйте НЕстатический метод distanceTo");
        appendOrderedNonEscaped(
            "Он принимает в качестве аргумента 1 экземпляр класса Point",
            "Он возвращает действительное число",
            "Для вычисления результата используйте поля \"x\" и \"y\" экземпляра, у которого вызвали метод, и поля \"x\" и \"y\" экземпляра, который передали в качестве аргумента."
        );
        appendFooter();
    }
}
