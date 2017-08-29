import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 31.03.2017.
 */
public class Lab06 {

    public static void main(String[] args) {


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

    public static StringBuilder task6066(StringBuilder sb, int a, int b) throws Exception {
        if (a > b){
            throw new Exception("Значение A должно быть не больше значения B");
        }
        int i = a;
        while(i <= b){
            sb.append(i);
            sb.append("\n");
            i++;
        }
        return sb;
    }

    public static StringBuilder task2565(StringBuilder sb, int a, int b) throws Exception {
        if (a > b){
            throw new Exception("Значение A должно быть не больше значения B");
        }
        int i = b;
        while(i >= a){
            sb.append(i);
            sb.append(" ");
            i--;
        }
        return sb;
    }

    public static StringBuilder task2594(StringBuilder sb, int a, String b) throws Exception {
        if (a < 0){
            throw new Exception("Значение A должно быть неотрицательным");
        }
        int i = 0;
        sb.append("\"");
        while(i < a){
            sb.append(b);
            i++;
        }
        sb.append("\"");
        return sb;
    }

    public static List<Integer> task2321(int a, int b){
        int i, n;
        List<Integer> ret = new ArrayList<>();
        if (a < b){
            i = a;
            n = b;
        } else {
            i = b;
            n = a;
        }
        while(i <= n){
            ret.add(i);
            i++;
        }
        return ret;
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

    public static StringBuilder task3550(StringBuilder sb){
        int i = 1;
        while (i <= 9){
            sb.append(i);
            sb.append(" x 7 = ");
            sb.append(i * 7);
            sb.append("\n");
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

    public static int task9180(int a) throws Exception {
        if (a < -100 || a > 500){
            throw new Exception("Значение A должно быть в интервале [-100, 500]");
        }
        int b = 500, sum = 0;
        while (a <= b) {
            sum += a;
            a++;
        }
        return sum;
    }

    public static int task1544(int b) throws Exception {
        if (b < -10 || b > 10000){
            throw new Exception("Значение b должно быть в интервале [-10,10000]");
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

    public static double task2802(int n) throws Exception {
        if (n <= 0){
            throw new Exception("Значение N должно быть положительным");
        }
        int i = 1;
        double sum = 0;
        while (i <= n){
            sum += 1.0/i;
            i++;
        }
        return sum;
    }
    public static int task2324(String str)
    {
        String[] raw = str.split(" ");
        int sum = 0;
        int i = 0;
        int current;
        do
        {
            current = Integer.parseInt(raw[i]);
            sum += current;
            i++;
        }
        while (current != 0);
        return sum;
    }

    public static int task8731(String str)
    {
        String[] raw = str.split(" ");
        int sum = 0;
        int index = 0;
        int current;
        do
        {
            current = Integer.parseInt(raw[index]);
            sum += current;
            index++;
        }
        while (sum <= 1000);
        return index;
    }

    public static String task4082(String str)
    {
        String[] raw = str.split(" ");
        int leftSum = 0;
        int rightSum = 0;
        int current;
        int i = 0;
        do
        {
            current = Integer.parseInt(raw[i]);
            if (current <= 83)
            {
                leftSum += current;
            }
            else if (current >= 199)
            {
                rightSum += current;
            }
            else
            {
                break;
            }
            i++;
        }
        while (true);
        return String.format("Сумма слева: %d, сумма справа: %d", leftSum, rightSum);
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

    public static StringBuilder task1483(StringBuilder sb, int n) throws Exception {
        if (n < 0){
            throw new Exception("Значение N должно быть неотрицательным");
        }
        int i = 1;
        while (i <= n){
            sb.append("!");
            if (i%5 == 0){
                sb.append(" ");
            }
            i++;
        }
        return sb;
    }

    public static StringBuilder task3983(StringBuilder sb, int n) throws Exception {
        if (n < 0){
            throw new Exception("Значение N должно быть неотрицательным");
        }
        int i = 1;
        while (i <= n){
            sb.append("#");
            if (i%20 == 0){
                sb.append("\n");
            }
            i++;
        }
        return sb;
    }

    public static StringBuilder task8770(StringBuilder sb, int x) {
        int i = 30;
        while (i <= 40){
            sb.append(i);
            if (i == x){
                sb.append("+");
            } else {
                sb.append("-");
            }
            sb.append("\n");
            i++;
        }
        return sb;
    }

    public static StringBuilder task4236(StringBuilder sb, int y) throws Exception {
        if (y < 0 || y > 15){
            throw new Exception("Значение Y должно быть в интервале [0, 15]");
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

    public static List<Integer> task8418(int x) throws Exception {
        if (x <= 0){
            throw new Exception("Значение X должно быть положительным");
        }
        int i = 1;
        List<Integer> ret = new ArrayList<>();
        while (i < x/2+1){
            if (x%i == 0){
                ret.add(i);
            }
            i++;
        }
        return ret;
    }

    public static boolean task5170(int y) throws Exception {
        if (y <= 0){
            throw new Exception("Значение Y должно быть положительным");
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

    public static StringBuilder task8395(StringBuilder sb, int w) throws Exception {
        if (w < 0 || w > 20){
            throw new Exception("Значение W должно быть в интервале [0, 20]");
        }
        for (int i = 0; i < w; i++){
            sb.append("a");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("b");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("c");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("d");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("e");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("f");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("g");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("h");
        }
        return sb;
    }

    public static StringBuilder task5568(StringBuilder sb, int w) throws Exception {
        if (w < 0 || w > 20){
            throw new Exception("Значение W должно быть в интервале [0, 20]");
        }
        int i = 0;
        while (i <= 9){
            int j = 0;
            while (j < w){
                sb.append(i);
                j++;
            }
            sb.append("\n");
            i++;
        }
        return sb;
    }

    public static StringBuilder task2592(StringBuilder sb, String s, int w, int h) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
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

    public static StringBuilder task4075(StringBuilder sb, int w) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
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

    public static StringBuilder task7517(StringBuilder sb, int w, int h) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
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

    public static StringBuilder task5448(StringBuilder sb, String s, int h) throws Exception {
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
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

    public static StringBuilder task5238(StringBuilder sb, int w, int h) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
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

    public static StringBuilder task5171(StringBuilder sb, String s1, String s2, int w, int h) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
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

    public static StringBuilder task1862(StringBuilder sb, String s1, String s2, int w, int h) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
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
}
