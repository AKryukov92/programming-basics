package Lab14;

import Lab14.stage3.Range;

/**
 * @author akryukov
 *         15.08.2017
 */
public class Runner9713 {
    public static void main(String[] args) {
        Range range = new Range(10, 60);
        System.out.print("Исходный интервал ");
        System.out.println(range);
        range.shift(70);
        System.out.printf("После сдвига %s\n", range);
        range.squeeze(40);
        System.out.printf("После сжатия %s", range);
    }
}
