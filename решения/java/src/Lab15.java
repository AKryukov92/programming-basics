import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author akryukov
 *         26.04.2017
 */
public class Lab15 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("7657");
        for (int i = 0; i < 9; i++) {
            task7657(".\\task7657\\test" + (i + 1) + ".csv");
        }
    }

    public static void call(){
        System.out.println();
        System.out.println("9924");
        for (int i = 0; i < 7; i++) {
            task9924(".\\task9924\\test" + (i + 1) + ".csv");
        }
    }

    public static class class9924{
        int x;
        int y;
        String color;
        public class9924(int x, int y, String color){
            this.x = x;
            this.y = y;
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            class9924 class9924 = (class9924) o;

            if (x != class9924.x) return false;
            return y == class9924.y;

        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        @Override
        public String toString() {
            return "{" +
                "\"x\":" + x +
                ", \"y\":" + y +
                ", \"color\":\"" + color + '\"' +
                '}';
        }
    }

    static void logic9924(Scanner scanner) throws Exception {
        Set<class9924> points = new HashSet<>();
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length != 3){
                throw new Exception("Некорректный формат");
            }
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            String color = arr[2];
            class9924 current = new class9924(x,y,color);
            if (points.contains(current)){
                continue;
            }
            points.add(current);
        }
        for (class9924 point : points){
            System.out.println(point);
        }
    }

    static void task9924(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            System.out.println(filename);
            logic9924(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch(NumberFormatException e){
            System.out.println("Не удалось считать число");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void logic7657(Scanner scanner){
        Map<class9924, Integer> points = new HashMap<>();
        int count = 0;
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length != 3){
                count++;
                continue;
            }
            try {
                int x = Integer.parseInt(arr[0]);
                int y = Integer.parseInt(arr[1]);
                String color = arr[2];
                class9924 current = new class9924(x, y, color);
                if (points.containsKey(current)) {
                    Integer amount = points.get(current);
                    points.remove(current);
                    points.put(current, amount + 1);
                } else {
                    points.put(current, 1);
                }
            } catch(NumberFormatException e){
                count++;
            }
        }
        for (class9924 point : points.keySet()){
            Integer amount = points.get(point);
            System.out.print(point);
            System.out.print(" Замен: ");
            System.out.println(amount);
        }
        System.out.println("Некорректных записей: " + count);
    }

    static void task7657(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            System.out.println(filename);
            logic7657(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
