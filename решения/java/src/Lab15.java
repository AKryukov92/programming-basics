import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author akryukov
 *         26.04.2017
 */
public class Lab15 {
    public static void main(String[] args) {
        Step9990();
        Step7738();
        Step9924();
        Step7657();
    }

    public static String task1056(String raw){
        String[] parts = raw.split(" ");
        Map<String, Integer> stats = new HashMap<>();
        for (int i = 0; i < parts.length; i++){
            if(stats.containsKey(parts[i])){
                Integer count = stats.get(parts[i]);
                count++;
                stats.put(parts[i], count);
            } else {
                stats.put(parts[i], 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : stats.entrySet()){
            result
                .append(entry.getKey())
                .append(" ")
                .append(entry.getValue())
                .append("\n");
        }
        return result.toString();
    }

    public static String task5087(String raw) {
        String[] parts = raw.split(" ");
        List<String> stringList = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < parts.length; i++) {
            stringList.add(parts[i]);
            stringSet.add(parts[i]);
        }
        return "Set: " + String.join(" ", stringSet) +
            "\nList: " + String.join(" ", stringList);
    }

    private static void Step7738() {
        System.out.println();
        System.out.println("7738");
        for (int i = 1; i <= 4; i++){
            task7738("..\\..\\java\\files\\task7738\\test" + i + ".txt");
        }
    }

    private static void Step9990() {
        System.out.println();
        System.out.println("9990");
        for (int i = 1; i <= 4; i++){
            task9990(".\\task9990\\test" + i + ".txt");
        }
    }

    private static void Step7657() {
        System.out.println();
        System.out.println("7657");
        for (int i = 1; i <= 9; i++) {
            task7657(".\\task7657\\test" + i + ".csv");
        }
    }

    private static void Step9924() {
        System.out.println();
        System.out.println("9924");
        for (int i = 1; i <= 7; i++) {
            task9924(".\\task9924\\test" + i + ".csv");
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
        System.out.println(target.getAbsolutePath());
        try (Scanner scanner = new Scanner(target)){
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
        System.out.println(target.getAbsolutePath());
        try (Scanner scanner = new Scanner(target)){
            logic7657(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void logic9990(Scanner scanner){
        Set<String> result = new HashSet<>();
        while(scanner.hasNext()){
            String line = scanner.next();
            result.add(line);
        }
        System.out.println(String.join(", ", result));
    }

    static void task9990(String filename){
        File target = new File(filename);
        System.out.println(target.getAbsolutePath());
        try (Scanner scanner = new Scanner(target)){
            logic9990(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static String logic7738(Scanner scanner){
        Map<String, Integer> stats = new HashMap<>();
        while(scanner.hasNext()){
            String line = scanner.next();
            if(stats.containsKey(line)){
                Integer count = stats.get(line);
                count++;
                stats.put(line, count);
            } else {
                stats.put(line, 1);
            }
        }
        Map.Entry<String, Integer> max = stats.entrySet().iterator().next();
        for(Map.Entry<String, Integer> entry : stats.entrySet()){
            if (entry.getValue() > max.getValue()){
                max = entry;
            }
        }
        return max.getKey();
    }

    static void task7738(String filename){
        File target = new File(filename);
        System.out.println(target.getAbsolutePath());
        try(Scanner scanner = new Scanner(target)){
            System.out.println(logic7738(scanner));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
