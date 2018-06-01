/**
 * @author akryukov
 * 29.05.2018
 */
public class Runner9020 {
    public static void main(String[] args) {
        System.out.printf("%.4f\n", Lab02.task9020(0));
        System.out.printf("%.4f\n", Lab02.task9020(-9));
        System.out.printf("%.4f\n", Lab02.task9020(61));
        System.out.printf("%.4f\n", Lab02.task9020(60));
        try {
            Lab02.task9020(62);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            Lab02.task9020(7573);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            Lab02.task9020(75);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
