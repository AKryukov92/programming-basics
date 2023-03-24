package root.tasks;

import static root.tasks.LayoutMaker.linkToTask;

public interface MethodsDictationHelper {
    default boolean isJs() {
        return false;
    }

    default boolean isCs() {
        return false;
    }

    default boolean isJava() {
        return false;
    }

    default String implementMethodToSolve(int taskId) {
        return "Реализуйте метод для решения задачи " + linkToTask(7474);
    }

    default String implementNonStatic(String className, String methodName) {
        if (isJs()) {
            throw new IllegalStateException();
        } else {
            return "В классе " + className + " реализуйте публичный нестатический метод " + methodName + " (без ключевого слова static перед типом возвращаемого значения).";
        }
    }

    default String implementStatic(String className, String methodName) {
        if (isJs()) {
            return "В файле для исходного кода реализуйте функцию " + methodName;
        } else {
            return "В классе " + className + " реализуйте публичный статический метод " + methodName + ".";
        }
    }

    default String itAccepts(String desc) {
        if (isJs()) {
            return "В качестве аргументов ей будут передавать " + desc + ".";
        } else {
            return "Он принимает в качестве аргументов " + desc + ".";
        }
    }

    default String itShouldDo(String methodName) {
        if (isJs()) {
            return "В теле функции нужно напечатать в консоль решение задачи  используя значение аргумента как исходные данные.";
        } else {
            return "В теле метода " + methodName + " напечатайте в консоль решение задачи, используя значение аргументов в качестве исходных данных.";
        }
    }

    default String callMethod(String caller, String className, String methodName) {
        if (isJs()) {
            return "В методе main класса " + caller + " вызовите метод " + methodName + " класса " + className + ".";
        } else {
            return "В корне директории создайте файл " + caller + ".html. Подключите в нем файл с кодом. " +
                    "В скриптах на странице " + caller + " вызовите функцию " + methodName;
        }
    }

    default String passArguments(String first, String second, String third) {
        if (isJs()) {
            return "Первым аргументом передайте ей " + first + ", вторым - " + second + ", третьим - " + third + ".";
        } else {
            return "Первым аргументом передайте ему " + first + ", вторым - " + second + ", третьим - " + third + ".";
        }
    }
}
