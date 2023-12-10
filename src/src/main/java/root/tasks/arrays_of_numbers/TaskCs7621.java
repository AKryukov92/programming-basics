package root.tasks.arrays_of_numbers;

import root.Console;
import root.Int32;

public class TaskCs7621 extends TaskJava7621 {
    private class Verbose {
    protected void logic(String value) {
        String[] arr = value.split(" ");
        int sum = 0;//переменная для накопления суммы
        Console.WriteLine("Значение элемента на индексе 0 это " + arr[0]);
        int at0 = Int32.Parse(arr[0]);
        sum = sum + at0;
        Console.WriteLine("Промежуточный итог: " + sum);
        Console.WriteLine("Значение элемента на индексе 1 это " + arr[1]);
        int at1 = Int32.Parse(arr[1]);
        sum = sum + at1;
        Console.WriteLine("Промежуточный итог: " + sum);
        Console.WriteLine("Значение элемента на индексе 3 это " + arr[3]);
        int at3 = Int32.Parse(arr[3]);
        sum = sum + at3;
        Console.WriteLine("Промежуточный итог: " + sum);
        Console.WriteLine("Значение элемента на индексе 4 это " + arr[4]);
        int at4 = Int32.Parse(arr[4]);
        sum = sum + at4;
        Console.WriteLine("Промежуточный итог: " + sum);
        Console.WriteLine("Финальный итог: " + sum);
    }
    }
}
