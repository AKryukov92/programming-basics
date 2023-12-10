package root.tasks.methods;

import root.Console;

public class TaskCs7611 extends TaskJava7611 {
    @Override
    protected void logic(String val) {
        double result;
        result = Library.task7611(11.13);//в качестве аргумента передано число
        Console.WriteLine("{0:F4}", result);
        double value = -79.19;
        result = Library.task7611(value);//в качестве аргумента передано значение переменной
        Console.WriteLine("{0:F4}", result);
        Console.WriteLine("{0:F4}", Library.task7611(0));//результат используется без промежуточной переменной
    }
}
