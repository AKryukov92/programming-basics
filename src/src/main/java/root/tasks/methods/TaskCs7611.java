package root.tasks.methods;

import root.Console;

public class TaskCs7611 extends TaskJava7611 {
    @Override
    protected void logic(String val) {
        double result;
        result = Library.task4411(11.13);//в качестве аргумента передано число
        Console.WriteLine("{0}", result);
        double value = -79.19;
        result = Library.task4411(value);//в качестве аргумента передано значение переменной
        Console.WriteLine("{0}", result);
        Console.WriteLine("{0}", Library.task4411(0));//результат используется без промежуточной переменной
    }
}
