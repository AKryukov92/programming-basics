package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class TaskCs7581 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Определить, присутствует ли в данном массиве символ \"x\". Чтобы определить, что символ отсутствует, сравнивайте каждый элемент массива с эталоном \"x\". Если они равны, тогда возвращайте значение true. Если весь массив был просмотрен, а равных элементов не было найдено, верните false.");
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод Task7581.",
                "Он принимает массив строковых значений и возвращает логическое значение.",
                "В методе main класса Program добавьте код для проверки:"
        );
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescEscaped("В результате запуска метода main должен получиться следующий результат:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    static class Library {
        public static boolean Task7581(String[] arr) {
            int i = 0;
            while (i < arr.length) {
                if (arr[i].equals("x")) {
                    return true;
                }
                i += 1;
            }
            return false;
        }
    }

    @Override
    protected void logic(String value) throws SQLException {
        String[] arr = "a;s;d;f".split(";");
        boolean result = Library.Task7581(arr);
        Console.WriteLine(result);
        arr = new String[]{"z", "x", "c", "v", "x"};
        Console.WriteLine(Library.Task7581(arr));
        result = Library.Task7581("zx;df;ty;jk".split(";"));
        Console.WriteLine(result);
        Console.WriteLine(
                Library.Task7581(
                        "q;a;z;w;s;x;e;d;c".split(";")
                )
        );
        Console.WriteLine(Library.Task7581(new String[0]));
    }
}
