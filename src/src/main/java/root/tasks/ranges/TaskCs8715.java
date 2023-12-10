package root.tasks.ranges;

import root.Console;
import root.Int32;

public class TaskCs8715 extends TaskJava8715 {
    @Override
    protected void logic(String firstValue, String secondValue, String thirdValue) {
        int a = Int32.Parse(firstValue);
        int b = Int32.Parse(secondValue);
        int c = Int32.Parse(thirdValue);
        if (a < b) {
            if (b < c) {
                Console.WriteLine("Истинно");
            }
            if (c <= b) {
                Console.WriteLine("Ложно");
            }
        }
        if (b <= a) {
            Console.WriteLine("Ложно");
        }
    }
}
