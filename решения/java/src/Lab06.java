import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Александр on 31.03.2017.
 */
public class Lab06 {

    public static void main(String[] args) {
        step5301();
    }

    public static void step5301() {
        System.out.println();
        System.out.println("5301");
        task5301(100);
        task5301(10);
        task5301(150);
        task5301(0);
        task5301(-10);
    }

    public static void step3519(){
        System.out.println();
        System.out.println("3519");
        Lab06.task3519(2, 10, 3);
        System.out.println();
        Lab06.task3519(0, 10, 3);
        System.out.println();
        Lab06.task3519(20, 11, 4);
        System.out.println();
        Lab06.task3519(0, 96, 10);
        System.out.println();
        Lab06.task3519(-9, 9, 7);
        System.out.println();
        Lab06.task3519(0, 0, 10);
        System.out.println();
        Lab06.task3519(2, 7, 20);
        System.out.println();
        Lab06.task3519(1, 2, 0);
        System.out.println();
        Lab06.task3519(3,5,-6);
    }

    public static void step7086(){
        System.out.println();
        System.out.println("7086");
        task7086(2);
        task7086(13);
        task7086(-6);
        task7086(1000);
    }

    public static void step5170(){
        System.out.println();
        System.out.println("5170");
        task5170_2(6);
        task5170_2(3219);
        task5170_2(7);
        task5170_2(2017);
        task5170_2(-10);
    }

    public static void step9249() {
        System.out.println();
        System.out.println("9249");
        task9249(5, 11);
        task9249(20, 3);
        task9249(0, 7);
        task9249(4, 0);
        task9249(-1, 6);
        task9249(6, -2);
    }

    public static void step0000() {
        task0000(3, 4);
        System.out.println("-----------");
        task0000(3, 7);
        System.out.println("-----------");
        task0000(3, 17);
        System.out.println("-----------");
        task0000(2, 6);
        System.out.println("-----------");
        task0000(5, 3);
        System.out.println("-----------");
        task0000(11, 3);
        System.out.println("-----------");
        task0000(19, 4);
        System.out.println("-----------");
        task0000(10, 5);
        System.out.println("-----------");
        task0000(99, 99);
        System.out.println("-----------");
        task0000(2, -1);
        System.out.println("-----------");
        task0000(-11, 11);
        System.out.println("-----------");
        task0000(0, 0);
        System.out.println("-----------");
        task0000(0, 3);
        System.out.println("-----------");
        task0000(4, 0);
    }

    public static void task0000(int leftStep, int rightStep){
        if (leftStep <= 0 && rightStep > 0) {
            System.out.println("Ряды чисел не сойдутся");
            return;
        }
        if(leftStep > 0 && rightStep <= 0){
            System.out.println("Ряды чисел не сойдутся");
            return;
        }
        int i = leftStep, j = rightStep;
        System.out.println(i + " " + j);
        while(i != j){
            if (i < j){
                while (i < j){
                    i+=leftStep;
                    System.out.println(i + " " + j);
                }
            } else {
                while(j < i){
                    j += rightStep;
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static StringBuilder task8495(StringBuilder sb){
        int i = 0;
        while (i < 13){
            sb.append("!");
            i++;
        }
        return sb;
    }

    public static StringBuilder task1315(StringBuilder sb){
        int a = 17;
        int b = 47;
        while (a <= b){
            sb.append(a);
            sb.append(" ");
            a++;
        }
        return sb;
    }

    public static List<Integer> task5053(int a, int b){
        List<Integer> ret = new ArrayList<>();
        if (a < b){
            while(a <= b){
                ret.add(a);
                a++;
            }
        } else {
            while(b <= a){
                ret.add(a);
                a--;
            }
        }
        return ret;
    }

    public static StringBuilder task3762(StringBuilder sb){
        int i = 1;
        while (i <= 20){
            sb.append(i);
            sb.append(" ");
            sb.append(i*453);
            sb.append("\n");
            i++;
        }
        return sb;
    }

    public static void task5301(int limit) {
        if (limit < 0) {
            System.out.println("Введенное значение должно быть неотрицательным");
            return;
        }
        int i = 1;
        int current = 0;
        while (current < limit) {
            System.out.print(current);
            System.out.print(" ");
            current += i;
            i += 1;
        }
        System.out.println();
    }

    public static StringBuilder task3550(StringBuilder sb, int v){
        int i = 1;
        while (i <= 9){
            sb.append(i)
                .append(" x ")
                .append(v)
                .append(" = ")
                .append(i * v)
                .append("\n");
            i++;
        }
        return sb;
    }

    public static String task2475(){
        StringBuilder sb = new StringBuilder();
        int a = 100, b = 500, sum = 0;
        sb.append("Ход решения: ");
        while (a <= b){
            sum += a;
            sb.append(sum);
            sb.append(" ");
            a++;
        }
        sb.append("\nОтвет:");
        sb.append(sum);
        return sb.toString();
    }

    public static int task9180(int a) throws IllegalArgumentException {
        if (a < -100 || a > 500){
            throw new IllegalArgumentException("Значение A должно быть в интервале [-100, 500]");
        }
        int b = 500, sum = 0;
        while (a <= b) {
            sum += a;
            a++;
        }
        return sum;
    }

    public static int task1544(int b) throws IllegalArgumentException {
        if (b < -10 || b > 10000){
            throw new IllegalArgumentException("Значение b должно быть в интервале [-10,10000]");
        }
        int a = -10, sum = 0;
        while (a <= b){
            sum += a;
            a++;
        }
        return sum;
    }

    public static int task9562(int a, int b) {
        int n;
        int i;
        if (a > b){
            i = b;
            n = a;
        } else {
            i = a;
            n = b;
        }
        int sum = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        return sum;
    }

    public static long task3669(int a, int b) {
        long mul = 1;
        long i, n;
        if (a < b) {
            i = a;
            n = b;
        } else {
            i = b;
            n = a;
        }
        while (i <= n){
            mul *= i;
            i++;
        }
        return mul;
    }

    public static String task5951(){
        StringBuilder sb = new StringBuilder();
        int i = 20;
        int n = 40;
        int sum = 0;
        sb.append("Ход решения: ");
        while (i <= n){
            sb.append(sum);
            sb.append("+");
            sb.append(i*i*i);
            sb.append("= ");
            sum += i*i*i;
            i++;
        }
        sb.append("\nОтвет: ");
        sb.append(sum);
        return sb.toString();
    }

    public static double task2802(int n) throws IllegalArgumentException {
        if (n <= 0){
            throw new IllegalArgumentException("Значение N должно быть положительным");
        }
        int i = 1;
        double sum = 0;
        while (i <= n){
            sum += 1.0/i;
            i++;
        }
        return sum;
    }

    public static String task2324(String str)
    {
        String[] raw = str.split(" ");
        int sum = 0;
        int count = 0;
        int i = 0;
        int current;
        do
        {
            current = Integer.parseInt(raw[i]);
            sum += current;
            count++;
            i++;
        }
        while (current != 0);
        return String.format("Сумма чисел: %d, Количество чисел: %d", sum, count);
    }

    public static String task4082(String str)
    {
        String[] raw = str.split(" ");
        int leftCount = 0;
        int rightCount = 0;
        int current;
        int i = 0;
        do
        {
            current = Integer.parseInt(raw[i]);
            if (current <= 83)
            {
                leftCount += 1;
            }
            else if (current >= 199)
            {
                rightCount += 1;
            }
            else
            {
                break;
            }
            i++;
        }
        while (true);
        return String.format("Количество слева: %d, количество справа: %d", leftCount, rightCount);
    }

    public static long task6580(int a, int b){
        int i, n;
        long sum = 0;
        if (a < b){
            i = a;
            n = b;
        } else {
            i = b;
            n = a;
        }
        while (i <= n){
            sum += i*i;
            i++;
        }
        return sum;
    }

    static void task7486(int x) {
        int i = 10;
        while (i <= 20) {
            System.out.print(i);
            if (i == x){
                System.out.println(" Найдено");
            } else {
                System.out.println();
            }
            i = i + 1;
        }
        System.out.println();
    }

    public static StringBuilder task7585(StringBuilder sb, int x) {
        int i = 10;
        while (i <= 20){
            sb.append(i);
            if (i == x){
                sb.append("+");
            }
            sb.append("\n");
            i++;
        }
        return sb;
    }

    //Дано начало и конец интервала, а также ширина вывода. Вывести все числа в указанном интервале по возрастанию.
    //Количество чисел на каждой строке должно быть равно ширине вывода.
    //Числа в строке разделены тремя символами _
    public static void task3519(int begin, int end, int width) {
        if (width <= 0) {
            System.out.println("Ширина должна быть положительной");
            return;
        }
        int i;
        int n;
        if (begin < end) {
            i = begin;
            n = end;
        } else {
            i = end;
            n = begin;
        }
        int j = 1;
        while (i <= n) {
            System.out.print(i);
            if (j % width == 0) {
                System.out.print("\n");
            } else if (i != n){
                System.out.print("___");
            }
            i++;
            j++;
        }
        System.out.println();
    }

    public static StringBuilder task4236(StringBuilder sb, int y) throws IllegalArgumentException {
        if (y < 0 || y > 15){
            throw new IllegalArgumentException("Значение Y должно быть в интервале [0, 15]");
        }
        int i = 0;
        while (i < y){
            sb.append("#");
            i++;
        }
        while (i < 15){
            sb.append(".");
            i++;
        }
        return sb;
    }

    public static int task5969(int a, int b){
        int i, n;
        if (a < b){
            i = a;
            n = b;
        } else {
            i = b;
            n = a;
        }
        int sum = 0;
        while (i <= n){
            if (i%7 == 0){
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static String task8696(){
        StringBuilder sb = new StringBuilder();
        int i = 100, n = 1000;
        int count = 0;
        sb.append("Ход решения: ");
        while(i <= n){
            sb.append(i);
            if (i%13 == 0){
                sb.append("+");
                count++;
            }
            sb.append(" ");
            i++;
        }
        sb.append("\nОтвет: ");
        sb.append(count);
        return sb.toString();
    }

    public static void task5170_2(int y) {
        if (y <= 0) {
            System.out.println("Введенное число должно быть положительным");
            return;
        }
        int i = 2;
        int count = 1;
        while (i < y / 2 + 1) {
            if (y % i == 0) {
                count++;
            }
            i++;
        }
        count++;
        System.out.print("Число " + y + " без остатка делится на " + count);
        if (count == 2) {
            System.out.println(" других чисел. Число простое");
        } else {
            System.out.println(" других чисел. Число не простое");
        }
    }

    public static boolean task5170(int y) throws IllegalArgumentException {
        if (y <= 0){
            throw new IllegalArgumentException("Значение Y должно быть положительным");
        }
        int i = 2;
        while (i < y/2+1){
            if (y%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static StringBuilder task2592(StringBuilder sb, String s, int w, int h) throws IllegalArgumentException {
        if (w < 0){
            throw new IllegalArgumentException("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new IllegalArgumentException("Значение H должно быть неотрицательно");
        }
        if (w == 0 || h == 0){
            return sb;
        }
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                sb.append(s);
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder task4075(StringBuilder sb, int w) throws IllegalArgumentException {
        if (w < 0){
            throw new IllegalArgumentException("Значение W должно быть неотрицательно");
        }
        if (w < 2){
            return sb.append("\n\n");
        }
        sb.append("+");
        for (int i = 1; i < w-1; i++){
            sb.append("-");
        }
        sb.append("+\n|");
        for (int i = 1; i < w-1; i++){
            sb.append(".");
        }
        sb.append("|\n+");
        for (int i = 1; i < w-1; i++){
            sb.append("-");
        }
        sb.append("+");
        return sb;
    }

    public static StringBuilder task7517(StringBuilder sb, int w, int h) throws IllegalArgumentException {
        if (w < 0){
            throw new IllegalArgumentException("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new IllegalArgumentException("Значение H должно быть неотрицательно");
        }
        if (w == 0 || h == 0){
            return sb;
        }
        sb.append(" ");
        for (int i = 0; i < w; i++){
            sb.append(i);
        }
        sb.append("\n");
        for (int j = 0; j < h; j++){
            sb.append(j);
            for (int i = 0; i < w; i++){
                sb.append(".");
            }
            sb.append("|\n");
        }
        sb.append(" ");
        for (int i = 0; i < w; i++){
            sb.append("-");
        }
        return sb;
    }

    public static StringBuilder task5448(StringBuilder sb, String s, int h) throws IllegalArgumentException {
        if (h < 0){
            throw new IllegalArgumentException("Значение H должно быть неотрицательно");
        }
        for (int i = 1; i <= h; i++){
            for (int j = 0; j < i; j++){
                sb.append(s);
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder task6572(StringBuilder sb, int a, int b){
        int i = 0, n, min;
        if (a < b){
            n = b - a;
            min = a;
        } else {
            n = a - b;
            min = b;
        }
        if (min%2 == 0){
            min ++;
        }
        while(i <= n){
            for (int j = 0; j < i/2; j++){
                sb.append(".");
            }
            sb.append(i+min);
            sb.append("\n");
            i += 2;
        }
        return sb;
    }

    public static StringBuilder task5238(StringBuilder sb, int w, int h) throws IllegalArgumentException {
        if (w < 0){
            throw new IllegalArgumentException("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new IllegalArgumentException("Значение H должно быть неотрицательно");
        }
        if (w == 0 || h == 0){
            return sb;
        }
        for (int i = 0; i < h; i++){
            int j = 0;
            while (j < w - i){
                sb.append("+");
                j++;
            }
            while (j < w){
                sb.append("#");
                j++;
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder task2084(StringBuilder sb, int a, int b){
        if (a == b){
            return sb.append(a);
        } else if (a < b){
            int i = a + 2;
            if (a%2 == 0) {
                sb.append(a + 1);
                i++;
            } else {
                sb.append(a);
            }
            while (i <= b){
                sb.append(", ");
                sb.append(i);
                i+=2;
            }
            return sb;
        } else {
            int i = a - 2;
            if (a%2 == 0) {
                sb.append(a - 1);
                i--;
            } else {
                sb.append(a);
            }
            while (i >= b){
                sb.append(", ");
                sb.append(i);
                i-=2;
            }
            return sb;
        }
    }

    public static StringBuilder task5411(StringBuilder sb, int p, int q){
        int i = 1, n, min;
        if (p < q){
            min = p;
            n = q - p;
        } else {
            min = q;
            n = p - q;
        }
        sb.append(min);
        while (i <= n/2){
            sb.append("&lt;");
            sb.append(i+min);
            i++;
        }
        while (i <= n){
            sb.append("&gt;");
            sb.append(i+min);
            i++;
        }
        return sb;
    }

    public static StringBuilder task5171(StringBuilder sb, String s1, String s2, int w, int h) throws IllegalArgumentException {
        if (w < 0){
            throw new IllegalArgumentException("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new IllegalArgumentException("Значение H должно быть неотрицательно");
        }
        if (w == 0 || h == 0){
            return sb;
        }
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                if (i%2 == 0){
                    sb.append(s1);
                } else {
                    sb.append(s2);
                }
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder task1862(StringBuilder sb, String s1, String s2, int w, int h) throws IllegalArgumentException {
        if (w < 0){
            throw new IllegalArgumentException("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new IllegalArgumentException("Значение H должно быть неотрицательно");
        }
        if (w == 0 || h == 0){
            return sb;
        }
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                if (j%2 == 0){
                    sb.append(s1);
                } else {
                    sb.append(s2);
                }
            }
            sb.append("\n");
        }
        return sb;
    }

    public static void task9249(int r, int t) {
        if (r < 0) {
            System.out.println("Значение R должно быть неотрицательно");
            return;
        }
        if (t < 0) {
            System.out.println("Значение T должно быть неотрицательно");
            return;
        }
        System.out.println();
        for (int i = 0; i < r; i++) {
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0; i < t; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    public static void task7086(int x) {
        int i = x;
        while (i <= x + 30) {
            System.out.print(i);
            System.out.print(" ");
            i+=3;
        }
        System.out.println();
        i = x - 40;
        while (i <= x){
            System.out.print(i);
            System.out.print(" ");
            i+=4;
        }
        System.out.println();
    }
}
