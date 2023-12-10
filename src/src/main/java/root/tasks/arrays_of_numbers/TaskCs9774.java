package root.tasks.arrays_of_numbers;

import root.Console;
import root.Int32;

public class TaskCs9774 extends TaskJava9774 {
    public class Verbose {
    protected void logic(String firstValue, String secondValue) {
        if (firstValue.isEmpty()) {
            System.out.println();
        }
        if (!firstValue.isEmpty()) {
            String[] arr = firstValue.split(" ");
            int m = Int32.Parse(secondValue);
            int num;
            num = Integer.parseInt(arr[0]);
            Console.Write(num * m + " ");
            num = Integer.parseInt(arr[1]);
            Console.Write(num * m + " ");
            num = Integer.parseInt(arr[2]);
            Console.Write(num * m + " ");
            num = Integer.parseInt(arr[3]);
            Console.Write(num * m + " ");
        }
    }
    }
}
