package root.tasks.arrays;

public class TaskCs5683 extends TaskJava5683 {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - символы, разделенные пробелами. Вывести элементы массива на экран в столбик и пронумеровать их, начиная с нуля.");
        appendCheckValuesHeader("str");
        appendCheckValuesRow("qw er ty");
        appendCheckValuesRow("qw er ty ui op");
        appendCheckValuesRow("asd fgh jkl");
        appendCheckValuesRow("");
        appendCheckValuesRow("q w e r a s d f z x c v");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Подробное решение этой задачи выглядит так:");
        appendCheckSingleNonEscaped(getMain(getClass().getSimpleName()));
        appendTaskDescEscaped("Примените конструкцию цикла чтобы сделать решение универсальным.");
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs5683().getContent());
    }
}
