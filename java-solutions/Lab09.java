import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Александр on 06.04.2017.
 */
public class Lab09 {
    public static void main(String[] args) {
        System.out.println("6175");
        String[] out6175 = {
            "1,2,3,4,5",
            "0",
            "",
            "-1,-2,-3",
            "Файл не существует",
            "Не удается считать число"
        };
        for (int i = 0; i < out6175.length; i++){
            String str = task6175(".\\task6175\\test" + (i+1) + ".txt");
            System.out.println(str.equals(out6175[i]));
        }
        System.out.println();
        System.out.println("4488");
        String[] out4488 = {
            "Равны",
            "Равны",
            "Равны",
            "Не равны",
            "Не равны",
            "Файл не существует",
            "Файл пуст",
            "Не удается считать число",
            "Не удается считать число"
        };
        for (int i = 0; i < out4488.length; i++){
            String str = task4488(".\\task4488\\test" + (i+1) + ".txt");
            System.out.println(str.equals(out4488[i]));
        }
        System.out.println();
        System.out.println("4954");
        int[] in4954 = {13, 371, 12, 0, 23};
        String[] out4954 = {
            "86",
            "6",
            "Не удается считать число",
            "На ноль делить нельзя",
            "0"
        };
        for (int i = 0; i < in4954.length; i++){
            String str = task4954(in4954[i], ".\\task4954\\test" + (i+1) + ".txt");
            System.out.println(str.equals(out4954[i]));
        }
    }

    public static String task6175(String filename) {
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(filename))){
            if (scanner.hasNext()){
                sb.append(scanner.nextInt());
            }
            while (scanner.hasNext()) {
                sb.append(",");
                sb.append(scanner.nextInt());
            }
        } catch (InputMismatchException ex){
            return "Не удается считать число";
        } catch (FileNotFoundException ex){
            return "Файл не существует";
        }
        return sb.toString();
    }

    public static String task4488(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))){
            int n, c = 0;
            if (scanner.hasNext()){
                n = scanner.nextInt();
            } else {
                return "Файл пуст";
            }
            while(scanner.hasNext()){
                scanner.nextInt();
                c++;
            }
            if (n == c){
                return "Равны";
            }else {
                return "Не равны";
            }
        } catch (InputMismatchException ex){
            return "Не удается считать число";
        } catch (FileNotFoundException ex){
            return "Файл не существует";
        }
    }

    public static String task4954(int a, String filename) {
        if (a == 0){
            return "На ноль делить нельзя";
        }
        try (Scanner scanner = new Scanner(new File(filename))){
            int count = 0;
            while(scanner.hasNext()) {
                if (scanner.nextInt() % a == 0) {
                    count++;
                }
            }
            return Integer.toString(count);
        } catch (InputMismatchException ex){
            return "Не удается считать число";
        } catch (FileNotFoundException ex){
            return "Файл не существует";
        }
    }
}
