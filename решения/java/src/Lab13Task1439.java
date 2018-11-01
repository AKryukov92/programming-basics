import java.util.Scanner;

public class Lab13Task1439 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            try {
                sum += Integer.parseInt(arr[i]);
                count++;
            } catch (NumberFormatException ex){
                System.out.println("Элемент №" + i + " со значением " + arr[i] + " не число");
            }
        }
        if (count > 0) {
            double result = sum / count;
            System.out.printf("%.4f",result);
        } else {
            System.out.println("В исходном массиве отсутствовали числа");
        }
    }
}
