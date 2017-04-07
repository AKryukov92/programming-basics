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
            System.out.println("-->" + out6175[i] + "<--");
            task6175(".\\task6175\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("4488");
        String[] out4488 = {
            "Равны",
            "Равны",
            "Равны",
            "Не равны",
            "Не равны",
            "Файл пуст",
            "Файл не существует",
            "Не удается считать число",
            "Не удается считать число"
        };
        for (int i = 0; i < out4488.length; i++){
            System.out.println("-->" + out4488[i] + "<--");
            task4488(".\\task4488\\test" + (i+1) + ".txt");
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
            System.out.println("-->" + out4954[i] + "<--");
            task4954(in4954[i], ".\\task4954\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("4642");
        String[] out4642 = {
            "0",
            "4.5000",
            "9.8516",
            "Некорректный объем данных",
            "Некорректный объем данных",
            "Некорректный объем данных",
            "Не удается считать число",
            "Файл не существует",
            "Файл пуст"
        };
        for (int i = 0; i < out4642.length; i++){
            System.out.println("-->" + out4642[i] + "<--");
            task4642(".\\task4642\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("9765");
        String[] out9765 = {
            "0",
            "0",
            "5",
            "Не удается считать число",
            "Не удается считать число",
            "Файл пуст",
            "Файл не существует",
            "Не удается считать число"
        };
        for (int i = 0; i < out9765.length; i++){
            System.out.println("-->" + out9765[i] + "<--");
            task9765(".\\task9765\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("5537");
        String[] out5537 = {
            "Некорректное число",
            "569",
            "253",
            "Не удается считать число",
            "Некорректное число",
            "0",
            "Файл не существует",
            "Некорректное число"
        };
        for (int i = 0; i < out5537.length; i++){
            System.out.println("-->" + out5537[i] + "<--");
            task5537(".\\task5537\\test" + (i+1) + ".txt");
        }
        System.out.println();
        System.out.println("6431");
        String[] out6431 = {
            "875",
            "129276",
            "Файл не существует",
            "Файл пуст",
            "3691856",
            "Некорректный формат данных",
            "Файл не существует",
            "Не удается считать число",
            "Не удается считать число"
        };
        for (int i = 0; i < out6431.length; i++){
            System.out.println("-->" + out6431[i] + "<--");
            task6431(".\\task6431\\test" + (i+1) + ".csv");
        }
        System.out.println();
        System.out.println("7193");
        String[] out7193 = {
            "1480",
            "907.9203",
            "Файл не существует",
            "Файл пуст",
            "Некорректный формат данных",
            "Некорректный формат данных",
            "Некорректный формат данных",
            "Некорректный формат данных"
        };
        for (int i = 0; i < out7193.length; i++){
            System.out.println("-->" + out7193[i] + "<--");
            task7193(".\\task7193\\test" + (i+1) + ".csv");
        }
    }

    public static void task6175(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            if (scanner.hasNext()){
                System.out.print(scanner.nextInt());
            }
            while (scanner.hasNext()) {
                System.out.print(",");
                System.out.print(scanner.nextInt());
            }
            System.out.println();
        } catch (InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task4488(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            int n, c = 0;
            if (!scanner.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                n = scanner.nextInt();
                while(scanner.hasNext()){
                    scanner.nextInt();
                    c++;
                }
                if (n == c){
                    System.out.println("Равны");
                } else {
                    System.out.println("Не равны");
                }
            }
        } catch (InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task4954(int a, String filename) {
        File target = new File(filename);
        if (a == 0){
            System.out.println("На ноль делить нельзя");
            return;
        }
        try (Scanner scanner = new Scanner(target)){
            int count = 0;
            while(scanner.hasNext()) {
                if (scanner.nextInt() % a == 0) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task4642(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            int n, total = 0, denominator = 0, nominator = 0;
            if (!scanner.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                n = scanner.nextInt();
                while(scanner.hasNext()) {
                    int next = scanner.nextInt();
                    if (next < 20) {
                        nominator += next;
                        denominator++;
                    }
                    total++;
                }
                if (total != n){
                    System.out.println("Некорректный объем данных");
                } else {
                    if (denominator == 0){
                        System.out.println("0");
                    } else {
                        System.out.printf("%.4f\n", (double) nominator / denominator);
                    }
                }
            }
        } catch (InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task9765(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            if (!scanner.hasNext()){
                System.out.println("Файл пуст");
            } else {
                int min = scanner.nextInt();
                while(scanner.hasNext()){
                    int current = scanner.nextInt();
                    if (current < min){
                        min = current;
                    }
                }
                System.out.println(min);
            }
        } catch (InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static void task5537(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            int count = 0;
            while(scanner.hasNext()){
                int current = scanner.nextInt();
                if (current < 1000 || current > 9999){
                    System.out.println("Некорректное число");
                    scanner.close();
                    return;
                }
                int d1 = current/1000;
                int d2 = current/100%10;
                int d3 = current/10%10;
                int d4 = current%10;
                if (d1 == d2 || d2 == d3 || d3 == d4){
                    count++;
                }
            }
            System.out.println(count);
        } catch (InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        }
    }

    public static int square6431(String line) throws Exception {
        String[] values = line.split(";");
        if (values.length < 4){
            throw new Exception("Некорректный формат данных");
        }
        int width = Integer.parseInt(values[2]);
        int height = Integer.parseInt(values[3]);
        return width*height;
    }

    public static void task6431(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (!scanner.hasNext()) {
                System.out.println("Файл пуст");
            } else {
                int max = square6431(scanner.nextLine());
                while (scanner.hasNext()) {
                    int current = square6431(scanner.nextLine());
                    if (current > max) {
                        max = current;
                    }
                }
                System.out.println(max);
            }
        } catch (NumberFormatException | InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println("Некорректный формат данных");
        }
    }

    public static double area7193(String line) throws Exception {
        String[] values = line.split(";");
        if (values.length < 1){
            throw new Exception("Некорректный формат данных");
        }
        if (values[0].equals("rect")){
            if (values.length < 5){
                throw new Exception("Некорректный формат данных");
            }
            int width = Integer.parseInt(values[3]);
            int height = Integer.parseInt(values[4]);
            return width*height;
        } else if (values[0].equals("circle")){
            if (values.length < 4){
                throw new Exception("Некорректный формат данных");
            }
            double r = Double.parseDouble(values[3]);
            return Math.PI * r * r;
        } else {
            throw new Exception("Некорректный формат данных");
        }
    }

    public static void task7193(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            if (!scanner.hasNext()){
                System.out.println("Файл пуст");
            } else {
                double max = area7193(scanner.nextLine());
                while (scanner.hasNext()){
                    double current = area7193(scanner.nextLine());
                    if (max < current){
                        max = current;
                    }
                }
                System.out.printf("%.4f\n", max);
            }
        } catch (NumberFormatException | InputMismatchException ex){
            System.out.println("Не удается считать число");
        } catch (FileNotFoundException ex){
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println("Некорректный формат данных");
        }
    }
}
