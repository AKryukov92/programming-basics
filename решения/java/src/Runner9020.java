/**
 * @author akryukov
 * 29.05.2018
 */
public class Runner9020 {
    public static void main(String[] args) {
        int[] in = {0, -9, 61, 60, 62, 7573, 75};
        for (int item : in) {
            try {
                System.out.printf("%.4f\n", Lab02.task9020(item));
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
