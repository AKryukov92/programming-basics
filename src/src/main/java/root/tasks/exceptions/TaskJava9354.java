package root.tasks.exceptions;

public class TaskJava9354 extends TaskCs9354 {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Дана длина ребра куба. Найти площадь его боковой поверхности по формуле <formula>area=6*edge<sup>2</sup></formula>.");
        appendOrderedEscaped(
                "Объявите в классе Library публичный статический метод task9354.",
                "Он принимает в качестве аргумента действительное число (edge).",
                "Метод возвращает действительное число в качестве результата.",
                "Если значение аргумента \"edge\" меньше или равно 0, то метод должен выбросить исключение."
        );
        appendTaskDescEscaped("Для того, чтобы выбросить исключение, нужно добавить в тело метода следующий код:");
        appendCheckSingleNonEscaped("if (edge <= 0) {\n" +
                "    throw new Exception(\"Значение edge должно быть положительным\");\n" +
                "}");
        appendTaskDescEscaped("Когда метод может выбросить исключение, то в его сигнатуре нужно добавлять выражение throws Exception. Сигнатура этого метода выглядит так:");
        appendCheckSingleNonEscaped("public static double task9354(double edge) throws Exception");
        appendTaskDescEscaped("В методе main класса Program добавьте код для проверки:");
        appendCheckSingleNonEscaped(methodExample());
        appendTaskDescEscaped("В результате запуска метода main, в консоли должен появиться следующий текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected String methodExample() {
        return "try {\n" +
                "    double e = 7;\n" +
                "    double res = Library.task9354(e);//Если эту команду написать за пределами блока try-catch, то возникнет ошибка компиляции:\n" +
                "    // java: unreported exception java.lang.Exception; must be caught or declared to be thrown\n" +
                "    System.out.printf(\"Площадь поверхности куба равна %.4f\", res);\n" +
                "    res = Library.task9354(7247);\n" +
                "    System.out.printf(\"Площадь поверхности куба равна %.4f\", res);\n" +
                "    res = Library.task9354(-11);\n" +
                "    System.out.printf(\"Площадь поверхности куба равна %.4f\", res);\n" +
                "} catch (Exception e) {\n" +
                "    System.out.println(e.getMessage());\n" +
                "}\n" +
                "try {\n" +
                "    double res = Library.task9354(0);\n" +
                "    System.out.printf(\"Площадь поверхности куба равна %.4f\", res);\n" +
                "} catch (Exception e) {\n" +
                "    System.out.println(e.getMessage());\n" +
                "}";
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava9354());
    }
}
