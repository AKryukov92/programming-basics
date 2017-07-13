import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author akryukov
 *         26.04.2017
 */
public class Lab14 {
    public static void main(String[] args) {

    }

    public static void call(){
        Step6981();
        Step5032();
        Step5108();
        Step3567();
        Step2033();
    }

    private static void Step2033() {
        System.out.println();
        System.out.println("2033");
        for (int i = 0; i < 18; i++) {
            task2033(".\\task2033\\test" + (i + 1) + ".csv");
        }
    }

    private static void Step3567() {
        System.out.println();
        System.out.println("3567");
        for (int i = 0; i < 14; i++) {
            task3567(".\\task3567\\test" + (i + 1) + ".csv");
        }
    }

    private static void Step6981() {
        System.out.println();
        System.out.println("6981");
        for (int i = 0; i < 9; i++) {
            task6981(".\\task6981\\test" + (i + 1) + ".csv");
        }
    }

    private static void Step5108() {
        System.out.println();
        System.out.println("5108");
        for (int i = 0; i < 14; i++) {
            task5108(".\\task5108\\test" + (i + 1) + ".csv");
        }
    }

    private static void Step5032() {
        System.out.println();
        System.out.println("5032");
        for (int i = 0; i < 14; i++) {
            task5032(".\\task5032\\test" + (i + 1) + ".csv");
        }
    }

    public static class class5032{
        int x;
        int y;
        int h;
        int w;
        public class5032(int x, int y, int h, int w) {
            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;
        }
        public void shiftX(int value) throws Exception {
            if (this.x < -value){
                throw new Exception("Координата X должна быть неотрицательной");
            }
            this.x += value;
        }
        public void shiftY(int value) throws Exception {
            if (this.y < -value){
                throw new Exception("Координата Y должна быть неотрицательной");
            }
            this.y += value;
        }
        public void stretchX(int value) throws Exception {
            if (this.w <= -value){
                throw new Exception("Ширина должна быть положительной");
            }
            this.w += value;
        }
        public void stretchY(int value) throws Exception {
            if (this.h <= -value){
                throw new Exception("Высота должна быть положительной");
            }
            this.h += value;
        }

        @Override
        public String toString() {
            return "{\"x\":" + x + ",\"y\":" + y + ",\"w\":" + w + ",\"h\":" + h + "}";
        }
    }

    public static void task5032(String filename) {
        File target = new File(filename);
        int count = 0;
        class5032 rect = new class5032(100,100,100,100);
        try (Scanner scanner = new Scanner(target)) {
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                String[] arr = line.split(";");
                if (arr.length != 2){
                    System.out.print(count);
                    System.out.println(" действий: Некорректный формат");
                    scanner.close();
                    return;
                }
                String action = arr[0];
                int value = Integer.parseInt(arr[1]);
                if (action.equals("shiftX")){
                    rect.shiftX(value);
                } else if (action.equals("shiftY")){
                    rect.shiftY(value);
                } else if (action.equals("stretchX")){
                    rect.stretchX(value);
                } else if (action.equals("stretchY")){
                    rect.stretchY(value);
                } else {
                    System.out.println("Некорректное действие: " + action);
                    scanner.close();
                    return;
                }
                count++;
            }
            System.out.print(count);
            System.out.print(" действий: ");
            System.out.println(rect);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.print(count);
            System.out.print(" действий: ");
            System.out.println(e.getMessage());
        }
    }

    public static class class5108 implements interface2033{
        int x;
        int y;
        int h;
        int w;
        int count = 0;
        public class5108(int x, int y, int h, int w) {
            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;
        }
        public void shiftX(int value) throws Exception {
            if (this.x < -value){
                throw new Exception("Координата X должна быть неотрицательной");
            }
            this.count++;
            this.x += value;
        }
        public void shiftY(int value) throws Exception {
            if (this.y < -value){
                throw new Exception("Координата Y должна быть неотрицательной");
            }
            this.count++;
            this.y += value;
        }
        public void stretchX(int value) throws Exception {
            if (this.w <= -value){
                throw new Exception("Ширина должна быть положительной");
            }
            this.count++;
            this.w += value;
        }
        public void stretchY(int value) throws Exception {
            if (this.h <= -value){
                throw new Exception("Высота должна быть положительной");
            }
            this.count++;
            this.h += value;
        }

        @Override
        public String toString() {
            return String.format("Действий:%d {\"x\":%d,\"y\":%d,\"w\":%d,\"h\":%d}",count,x,y,w,h);
        }
    }

    private static void logic5108(Scanner scanner) throws Exception {
        Map<String, class5108> map = new HashMap<>();
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length < 3){
                throw new Exception("Некорректный формат");
            }
            String action = arr[0];
            String id = arr[1];
            if(action.equals("create")){
                if (arr.length != 6){
                    throw new Exception("Некорректный формат");
                }
                if (map.containsKey(id)){
                    throw new Exception("Идентификатор не должен повторяться");
                }
                map.put(id, new class5108(
                    Integer.parseInt(arr[2]),
                    Integer.parseInt(arr[3]),
                    Integer.parseInt(arr[4]),
                    Integer.parseInt(arr[5])
                ));
                continue;
            }
            if (!map.containsKey(id)){
                throw new Exception("Операция над неопознанным объектом");
            }
            int value = Integer.parseInt(arr[2]);
            class5108 rect = map.get(id);
            if (action.equals("shiftX")){
                rect.shiftX(value);
            } else if (action.equals("shiftY")){
                rect.shiftY(value);
            } else if (action.equals("stretchX")){
                rect.stretchX(value);
            } else if (action.equals("stretchY")){
                rect.stretchY(value);
            } else {
                System.out.println("Некорректное действие: " + arr[0]);
                scanner.close();
                return;
            }
        }
        for(Map.Entry<String, class5108> item : map.entrySet()){
            System.out.print(item.getKey());
            System.out.print(" ");
            System.out.println(item.getValue());
        }
    }
    private static void task5108(String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            System.out.println(filename);
            logic5108(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static class class3567{
        int cx;
        int cy;
        int r;

        public class3567(int cx, int cy, int r){
            this.cx = cx;
            this.cy = cy;
            this.r = r;
        }

        public void shiftX(int value) throws Exception {
            if (this.cx - this.r < -value){
                throw new Exception("Левая точка круга должна иметь неотрицательные координаты");
            }
            this.cx += value;
        }
        public void shiftY(int value) throws Exception {
            if (this.cy - this.r < -value){
                throw new Exception("Верхняя точка круга должна иметь неотрицательные координаты");
            }
            this.cy += value;
        }
        public void stretchX(int value) throws Exception {
            if (this.r * 2 <= -value){
                throw new Exception("Ширина должна быть положительной");
            }
            this.r += value/2;
            this.cx += value/2;
            this.cy += value/2;
        }
        public void stretchY(int value) throws Exception {
            if (this.r * 2 <= -value){
                throw new Exception("Ширина должна быть положительной");
            }
            this.r += value/2;
            this.cx += value/2;
            this.cy += value/2;
        }

        @Override
        public String toString() {
            return "{\"cx\":" + cx + ",\"y\":" + cy + ",\"r\":" + r + "}";
        }
    }

    private static void logic3567(Scanner scanner) throws Exception {
        class3567 circle = new class3567(150,150,100);
        int count = 0;
        while(scanner.hasNext()){
            count++;
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length != 2){
                throw new Exception("Действий:" + count + " Некорректный формат");
            }
            String action = arr[0];
            int value = Integer.parseInt(arr[1]);
            if (action.equals("shiftX")){
                circle.shiftX(value);
            } else if (action.equals("shiftY")){
                circle.shiftY(value);
            } else if (action.equals("stretchX")){
                circle.stretchX(value);
            } else if (action.equals("stretchY")){
                circle.stretchY(value);
            } else {
                throw new Exception("Некорректное действие: " + action);
            }
        }
        System.out.print(count);
        System.out.print(" действий: ");
        System.out.println(circle);
    }

    private static void task3567(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            System.out.println(filename);
            logic3567(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public interface interface2033{
        void shiftX(int value) throws Exception;
        void shiftY(int value) throws Exception;
        void stretchX(int value) throws Exception;
        void stretchY(int value) throws Exception;
    }

    public static class class2033 implements interface2033{
        int cx;
        int cy;
        int r;
        int count = 0;

        public class2033(int cx, int cy, int r){
            this.cx = cx;
            this.cy = cy;
            this.r = r;
        }

        public void shiftX(int value) throws Exception {
            if (this.cx - this.r < -value){
                throw new Exception("Левая точка круга должна иметь неотрицательные координаты");
            }
            this.cx += value;
            count++;
        }
        public void shiftY(int value) throws Exception {
            if (this.cy - this.r < -value){
                throw new Exception("Верхняя точка круга должна иметь неотрицательные координаты");
            }
            this.cy += value;
            count++;
        }
        public void stretchX(int value) throws Exception {
            if (this.r * 2 <= -value){
                throw new Exception("Ширина должна быть положительной");
            }
            this.r += value/2;
            this.cx += value/2;
            this.cy += value/2;
            count++;
        }
        public void stretchY(int value) throws Exception {
            if (this.r * 2 <= -value){
                throw new Exception("Высота должна быть положительной");
            }
            this.r += value/2;
            this.cx += value/2;
            this.cy += value/2;
            count++;
        }

        @Override
        public String toString() {
            return String.format("Действий:%d {\"cx\":%d,\"y\":%d,\"r\":%d}",count, cx, cy, r);
        }
    }

    public static void logic2033(Scanner scanner) throws Exception {
        Map<String, interface2033> map = new HashMap<>();
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            if (arr.length < 3){
                throw new Exception("Некорректный формат");
            }
            String action = arr[0];
            if(action.equals("create")){
                String id = arr[2];
                if (map.containsKey(id)){
                    throw new Exception("Идентификатор не должен повторяться");
                }
                String type = arr[1];
                if (type.equals("circle")){
                    if (arr.length != 6){
                        throw new Exception("Некорректный формат");
                    }
                    map.put(id, new class2033(
                        Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5])
                    ));
                } else if (type.equals("rectangle")){
                    if (arr.length != 7){
                        throw new Exception("Некорректный формат");
                    }
                    map.put(id, new class5108(
                        Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5]),
                        Integer.parseInt(arr[6])
                    ));
                } else {
                    throw new Exception("Неизвестная фигура");
                }
                continue;
            }
            String id = arr[1];
            if (!map.containsKey(id)){
                throw new Exception("Операция над неопознанным объектом");
            }
            int value = Integer.parseInt(arr[2]);
            interface2033 rect = map.get(id);
            if (action.equals("shiftX")){
                rect.shiftX(value);
            } else if (action.equals("shiftY")){
                rect.shiftY(value);
            } else if (action.equals("stretchX")){
                rect.stretchX(value);
            } else if (action.equals("stretchY")){
                rect.stretchY(value);
            } else {
                System.out.println("Некорректное действие: " + arr[0]);
                scanner.close();
                return;
            }
        }
        for(Map.Entry<String, interface2033> item : map.entrySet()){
            System.out.print(item.getKey());
            System.out.print(" ");
            System.out.println(item.getValue());
        }
    }

    private static void task2033(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            System.out.println(filename);
            logic2033(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void parse6981(Map<String, interface2033> map, String line) throws Exception {
        String[] arr = line.split(";");
        if (arr.length < 3){
            throw new Exception("Некорректный формат");
        }
        String action = arr[0];
        if(action.equals("create")){
            String id = arr[2];
            if (map.containsKey(id)){
                throw new Exception("Идентификатор не должен повторяться");
            }
            String type = arr[1];
            if (type.equals("circle")){
                if (arr.length != 6){
                    throw new Exception("Некорректный формат");
                }
                map.put(id, new class2033(
                    Integer.parseInt(arr[3]),
                    Integer.parseInt(arr[4]),
                    Integer.parseInt(arr[5])
                ));
            } else if (type.equals("rectangle")){
                if (arr.length != 7){
                    throw new Exception("Некорректный формат");
                }
                map.put(id, new class5108(
                    Integer.parseInt(arr[3]),
                    Integer.parseInt(arr[4]),
                    Integer.parseInt(arr[5]),
                    Integer.parseInt(arr[6])
                ));
            } else {
                throw new Exception("Неизвестная фигура");
            }
        } else {
            String id = arr[1];
            if (!map.containsKey(id)) {
                throw new Exception("Операция над неопознанным объектом");
            }
            int value = Integer.parseInt(arr[2]);
            interface2033 rect = map.get(id);
            if (action.equals("shiftX")) {
                rect.shiftX(value);
            } else if (action.equals("shiftY")) {
                rect.shiftY(value);
            } else if (action.equals("stretchX")) {
                rect.stretchX(value);
            } else if (action.equals("stretchY")) {
                rect.stretchY(value);
            } else {
                throw new Exception("Некорректное действие: " + arr[0]);
            }
        }
    }

    static void logic6981(Scanner scanner){
        Map<String, interface2033> map = new HashMap<>();
        int count = 0;
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            try {
                parse6981(map, line);
            } catch (Exception e) {
                count++;
            }
        }
        for(Map.Entry<String, interface2033> item : map.entrySet()){
            System.out.print(item.getKey());
            System.out.print(" ");
            System.out.println(item.getValue());
        }
        System.out.println("Некорректных записей: " + count);
    }

    public static void task6981(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)){
            System.out.println(filename);
            logic6981(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        }
    }
}
