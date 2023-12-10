package root.tasks.loops;

import root.Console;
import root.Int32;

public class TaskCs6790 extends TaskJava6790 {
    private class Verbose {
    protected void logic(String value) {
        double xRad, current, xDeg;
        xDeg = Int32.Parse(value);
        int i = 0;
        System.out.println("Градусы\tРадианы\tФункция");
        if (i < 20) {
            xRad = xDeg * Math.PI / 180;
            current = 5 * Math.cos(xRad);
            Console.WriteLine("{0:F4}\t{1:F4}\t{2:F4}\n", xDeg, xRad, current);
            xDeg = xDeg + 50;
            i = i + 1;
        }
        if (i < 20) {
            xRad = xDeg * Math.PI / 180;
            current = 5 * Math.cos(xRad);
            Console.WriteLine("{0:F4}\t{1:F4}\t{2:F4}\n", xDeg, xRad, current);
            xDeg = xDeg + 50;
            i = i + 1;
        }
    }
    }
}
