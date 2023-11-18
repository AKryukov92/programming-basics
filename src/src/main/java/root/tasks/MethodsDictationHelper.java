package root.tasks;

import static root.tasks.LayoutMaker.linkToTask;

public interface MethodsDictationHelper {
    default String implementMethodToSolve(int taskId) {
        return "Реализуйте метод для решения задачи " + linkToTask(taskId);
    }

    default String implementNonStatic(String className, String methodName) {
            return "В классе " + className + " реализуйте публичный нестатический метод " + methodName + " (без ключевого слова static перед типом возвращаемого значения).";
    }

    default String implementStatic(String className, String methodName) {
            return "В классе " + className + " реализуйте публичный статический метод " + methodName + ".";
    }

    default String itAccepts(String desc) {
            return "Он принимает в качестве аргументов " + desc + ".";

    }

    default String itShouldDo(String methodName) {
            return "В теле метода " + methodName + " напечатайте в консоль решение задачи, используя значение аргументов в качестве исходных данных.";
    }

    default String callMethod(String caller, String className, String methodName) {
            return "В методе main класса " + caller + " вызовите метод " + methodName + " класса " + className + ".";
    }

    default String passArguments(String first, String second, String third) {
            return "Первым аргументом передайте ему " + first + ", вторым - " + second + ", третьим - " + third + ".";
    }

    default String importClasses(String className, String... classesToImport) {
            return "В файле с классом " + className + " импортируйте классы: " + String.join(",", classesToImport) + ".";
    }
}
