import java.util.*;

/**
 * Created by Александр on 03.04.2017.
 */
public class Lab07 {
    public static void step5900() {
        System.out.println();
        System.out.println("5900");
        task5900("4 0 0 6 3 8 1 3 3 3 9 3 1");
        task5900("9 7 8 5 9 8 5 0 3 6 8 2 4");
        task5900("5 0 3 2 2 2 7 7 0 0 0 2 2");
        task5900("1 2 3 4 5 6 7 8 9 0");
        task5900("");
        task5900("1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6");
    }

    public static void step9576() {
        System.out.println();
        System.out.println("9576");
        task9576("1;3;6;9;10");
        task9576("13;19");
        task9576("2;3;3;3;3;4");
        task9576("5");
        task9576("1;2;3;2;1");
        task9576("");
        task9576("1;5;9");
        task9576("20;21;22;23;24");
    }

    public static void step3218() {
        System.out.println();
        System.out.println("3218");
        task3218("4 1 1 1");
        task3218("1 4 2 1");
        task3218("3 4 1 5");
        task3218("1 2 3 4 1 2");
        task3218("9 8 9 1 1 5 1 1");
        task3218("5 5 5 5 5");
        task3218("1 9 1 30 9 1 100");
        task3218("");
        task3218("19");
    }

    public static void step4707() {
        System.out.println();
        System.out.println("4707");
        task4707("9 8 9 1 1 5 1 1");
        task4707("1 2 3 4 1 3 4 4 4 4");
        task4707("5 5 5 5 5");
        task4707("");
        task4707("17");
        task4707("1 9 1 30 9 1 100");
        task4707("1000000 1 1");
    }

    public static void step5795() {
        System.out.println();
        System.out.println("5795");
        task5795("9 8 7 6 5 4");
        task5795("11 59 84 28 40");
        task5795("100");
        task5795("5 6");
        task5795("");
    }

    public static void step6988() {
        System.out.println();
        System.out.println("6988");
        task6988("a s d f a", "a s d f a");
        task6988("a s d f a", "a s d f g");
        task6988("qwerty asdfgh zxcvb", "qwerty asdfgh asdfgh");
        task6988("qaz wsx edc", "wsx edc qaz");
        task6988("qaz wsx edc", "qaz wsx edc rfv");
        task6988("qaz wsx edc rfv tgb", "qaz wsx edc rfv");
        task6988("qaz wsx edc", "qaz tgb ujm yhn");
        task6988("qaz wsx vbn rfv tgb", "qaz wsx edc");
    }

    public static void step8471() {
        System.out.println();
        System.out.println("8471");
        task8471("qw er ty ui op");
        task8471("a sd fgh jkl");
        task8471("za qws xcde r fv tgb yhnu jm");
        task8471("p o i u a s d f");
    }

    private static void task8471(String str) {
        String[] arr = str.split(" ");
        int amountOfEven = arr.length / 2;
        System.out.println("Четных элементов: " + amountOfEven);
        String[] odd = new String[arr.length - amountOfEven];
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            odd[j] = arr[i];
            j = j + 1;
            i = i + 2;
        }
        i = 1;
        j = 0;
        while (i < arr.length) {
            arr[j] = arr[i];
            i = i + 2;
            j = j + 1;
        }
        i = 0;
        while (i < odd.length) {
            arr[j] = odd[i];
            j = j + 1;
            i = i + 1;
        }
        System.out.println(String.join(" ", arr));
    }

    public static void step8122() {
        System.out.println();
        System.out.println("8122");
        task8122("а,0,б,0,в,0,г,0,е,1,е,2,е,3,к,1,к,2,к,5,к,6,д,7,г,7");
        task8122("б,5,в,5,г,5,е,5,ж,5,з,5,и,5,д,1,д,2,д,3,д,7,д,8");
        task8122("а,-1,в,2,д,4");
        task8122("а,0,к,15");
        task8122("а,0,к,10");
        task8122("м,5,а,0,ж,3");
        task8122("");
        task8122("в,2,з,2,в,7,з");
    }

    public static void step5541() {
        System.out.println();
        System.out.println("5541");
        String[] in5541 = {
                "q q q q",
                "q q w w",
                "q q q w",
                "q w e r",
                "q w e r q w",
                "q q e e w w"
        };
        for (int i = 0; i < in5541.length; i++) {
            StringBuilder sb = new StringBuilder();
            Set<String> result = Lab07.task5541(in5541[i]);
            for (String item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    static void task5873(String raw, int t) {
        if (raw.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = raw.split(" ");
        if (t < 0 || t >= arr.length) {
            System.out.println("Число T должно быть в интервале [0, размер массива)");
            return;
        }
        System.out.println("Элемент на индексе " + t + " содержит значение " + arr[t]);
        if (t == 0) {
            System.out.println("Предыдущий элемент не существует");
        } else {
            System.out.println("Значение предыдущего элемента " + arr[t - 1]);
        }
        if (t == arr.length - 1) {
            System.out.println("Следующий элемент не существует");
        } else {
            System.out.println("Значение следующего элемента " + arr[t + 1]);
        }
        System.out.println();
    }

    public static List<String> task1223(String raw) {
        List<String> ret = new ArrayList<>();
        if (raw.isEmpty()) {
            return ret;
        }
        String[] arr = raw.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            ret.add(arr[i]);
        }
        return ret;
    }

    public static String task1433(String raw) {
        if (raw.isEmpty()) {
            throw new IllegalArgumentException("Исходная строка пуста");
        }
        String[] arr = raw.split(";");
        int index = (arr.length - 1) / 2;
        return String.format("Индекс %d, элемент %s", index, arr[index]);
    }

    public static void task1433_2(String raw) {
        if (raw.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = raw.split(";");
        int index = (arr.length - 1) / 2;
        System.out.println("Длина массива: " + arr.length + ", индекс: " + index + ", элемент: " + arr[index]);
    }

    public static void task1392(String raw) {
        if (raw.length() == 0) {
            System.out.println("Массив пуст");
            return;
        }
        String[] arr = raw.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int j = 0; j < num.length - 1; j++) {
            int minIdx = j;
            for (int i = j + 1; i < num.length; i++) {
                if (num[minIdx] > num[i]) {
                    minIdx = i;
                }
            }
            int temp = num[minIdx];
            num[minIdx] = num[j];
            num[j] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        if (num.length % 2 == 0) {
            int medianLeft = num.length / 2 - 1;
            int medianRight = num.length / 2;
            double realMedian = ((double) num[medianLeft] + num[medianRight]) / 2;
            System.out.printf("Медиана: %.2f\n", realMedian);
        } else {
            int medianIdx = num.length / 2;
            System.out.println("Медиана: " + num[medianIdx]);
        }
    }

    public static void task4707(String raw) {
        if (raw.length() == 0) {
            System.out.println("Массив пуст");
            return;
        }
        System.out.println(raw);
        String[] arr = raw.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int j = 0; j < num.length - 1; j++) {
            int minIdx = j;
            for (int i = j + 1; i < num.length; i++) {
                if (num[minIdx] > num[i]) {
                    minIdx = i;
                }
            }
            System.out.printf("Минимальное значение %d на индексе %d. Первая неотсортированная позиция: %d\n", num[minIdx], minIdx, j);
            int temp = num[minIdx];
            num[minIdx] = num[j];
            num[j] = temp;
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
    }

    public static double[] task6497(String raw) {
        if (raw.length() == 0) {
            return new double[0];
        }
        String[] arr = raw.split(" ");
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Double.parseDouble(arr[i]);
        }
        double avg = sum / arr.length;
        double[] deltas = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            deltas[i] = Math.abs(Double.parseDouble(arr[i]) - avg);
        }
        return deltas;
    }

    public static double task5648(String raw) {
        if (raw.length() == 0) {
            throw new IllegalArgumentException("Дана пустая последовательность");
        }
        String[] arr = raw.split(" ");
        double[] drr = new double[arr.length];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            drr[i] = Double.parseDouble(arr[i]);
            sum += drr[i];
        }
        double avg = sum / arr.length;
        double sumOfD = 0;
        for (int i = 0; i < arr.length; i++) {
            double d = (drr[i] - avg);
            sumOfD += d * d;
        }
        return Math.sqrt(1.0 / (arr.length - 1.0) * sumOfD);
    }

    public static List<String> task3333(int s, String raw) {
        String[] arr = raw.split(" ");
        List<String> ret = new ArrayList<>();
        int ds;
        if (s < 0) {
            ds = -s % arr.length;
        } else {
            ds = arr.length - s % arr.length;
        }
        for (int i = ds; i < arr.length; i++) {
            ret.add(arr[i]);
        }
        for (int i = 0; i < ds; i++) {
            ret.add(arr[i]);
        }
        return ret;
    }

    public static StringBuilder task5694(StringBuilder sb, String x) {
        String[] arr = "a b c d e f g h".split(" ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (arr[i].equals(x)) {
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb;
    }

    static void task6806(int x) {
        int[] arr = {11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (arr[i] == x) {
                System.out.print(" Найдено");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static StringBuilder task6806(StringBuilder sb, int x) {
        int[] arr = {11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20};
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (arr[i] == x) {
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb;
    }

    public static void task9576(String data) {
        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = data.split(";");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 1; i < num.length; i++) {
            if (num[i - 1] > num[i]) {
                System.out.println("Последовательность в исходных данных нарушена");
                return;
            }
            if (num[i - 1] == num[i]) {
                System.out.println("В исходных данных присутствуют дубликаты");
                return;
            }
        }
        for (int i = 1; i < num.length; i++) {
            if (num[i - 1] + 1 < num[i]) {
                int j = num[i - 1] + 1;
                while (j < num[i]) {
                    System.out.print(j + ";");
                    j++;
                }
            }
        }
        System.out.println();
    }

    public static String task2173(String data) {
        if (data.isEmpty()) {
            return "Исходная строка пуста";
        }
        if (!data.contains(";")) {
            return "Значения отсортированы по возрастанию";
        }
        String[] parts = data.split(";");
        int prev = Integer.parseInt(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            int current = Integer.parseInt(parts[i]);
            if (current < prev) {
                return "Элемент со значением " + current + " на индексе " + i + " нарушает закономерность";
            }
            prev = current;
        }
        return "Значения отсортированы по возрастанию";
    }

    public static String task6492(String charsRaw, String amountsRaw) {
        if (charsRaw.isEmpty()) {
            return "Отсутствуют данные о символах";
        }
        if (amountsRaw.isEmpty()) {
            return "Отсутствуют данные о количествах";
        }
        String[] chars = charsRaw.split(" ");
        String[] amountsStr = amountsRaw.split(" ");
        if (chars.length != amountsStr.length) {
            return "Длины массивов не совпадают";
        }
        int[] amounts = new int[amountsStr.length];
        for (int i = 0; i < amountsStr.length; i++) {
            amounts[i] = Integer.parseInt(amountsStr[i]);
        }
        int max = amounts[0];
        for (int i = 1; i < amounts.length; i++) {
            if (max < amounts[i]) {
                max = amounts[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i < amounts[j]) {
                    sb.append(chars[j]);
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String task7369(String leftRaw, String topRaw) {
        if (leftRaw.isEmpty()) {
            return "Данные слева отсутствуют";
        }
        if (topRaw.isEmpty()) {
            return "Данные сверху отсутствуют";
        }
        StringBuilder sb = new StringBuilder();
        String[] leftArr = leftRaw.split(" ");
        String[] topArr = topRaw.split(" ");
        sb.append("  ");
        sb.append(topRaw);
        sb.append("\n");
        for (int i = 0; i < leftArr.length; i++) {
            sb.append(leftArr[i]);
            for (int j = 0; j < topArr.length; j++) {
                if (leftArr[i].equals(topArr[j])) {
                    sb.append(" +");
                } else {
                    sb.append("  ");
                }
            }
            sb.append("|\n");
        }
        sb.append(" ");
        for (int i = 0; i < topArr.length; i++) {
            sb.append("--");
        }
        return sb.toString();
    }

    public static int task5894(String leftRaw, String topRaw) throws IllegalArgumentException {
        if (leftRaw.isEmpty()) {
            throw new IllegalArgumentException("Данные слева отсутствуют");
        }
        if (topRaw.isEmpty()) {
            throw new IllegalArgumentException("Данные сверху отсутствуют");
        }
        int count = 0;
        String[] leftArr = leftRaw.split(" ");
        String[] topArr = topRaw.split(" ");
        for (int i = 0; i < leftArr.length; i++) {
            for (int j = 0; j < topArr.length; j++) {
                if (leftArr[i].equals(topArr[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static List<Integer> task9271(String raw) {
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        if (arr.length == 0) {
            return ret;
        }
        int min = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int current = Integer.parseInt(arr[i]);
            if (current < min) {
                min = current;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ret.add(Integer.parseInt(arr[i]) - min);
        }
        return ret;
    }

    public static void task9271(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= min;
        }
    }

    public static String task8769(int p, int q, String raw) throws IllegalArgumentException {
        String[] arr = raw.split(" ");
        int i, n;
        if (p < 0 || p >= arr.length) {
            throw new IllegalArgumentException("Число P должно быть в интервале [0, размер массива)");
        }
        if (q < 0 || q >= arr.length) {
            throw new IllegalArgumentException("Число Q должно быть в интервале [0, размер массива)");
        }
        if (p < q) {
            i = p;
            n = q;
        } else {
            i = q;
            n = p;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Фрагмент массива:");
        int min = Integer.parseInt(arr[i]);
        while (i <= n) {
            sb.append(" ");
            sb.append(arr[i]);
            int current = Integer.parseInt(arr[i]);
            if (current < min) {
                min = current;
            }
            i++;
        }
        sb.append("\nМинимальное среди них: ");
        sb.append(min);
        return sb.toString();
    }

    public static List<Integer> task4497(int x, int y, String raw) {
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int current = Integer.parseInt(arr[i]);
            if (current == x) {
                ret.add(y);
            } else {
                ret.add(current);
            }
        }
        return ret;
    }

    public static List<String> task8820(String raw) {
        String[] arr = raw.split(" ");
        List<String> ret = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            ret.add(arr[i]);
        }
        return ret;
    }

    public static void task3218(String raw) {
        if (raw.isEmpty()) {
            System.out.println("Массив пуст");
            return;
        }
        System.out.println(raw);
        String[] arr = raw.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int j = 0; j < num.length; j++) {
            System.out.printf("Шаг %d ", j);
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    System.out.printf("Меняем %d и %d ", num[i], num[i + 1]);
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                } else {
                    System.out.printf("Оставляем %d и %d ", num[i], num[i + 1]);
                }
            }
            System.out.println();
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
    }

    public static int task4283(String k, String raw) {
        String[] arr = raw.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(k)) {
                count++;
            }
        }
        return count;
    }

    public static Set<String> task5541(String raw) {
        String[] arr = raw.split(" ");
        Set<String> data = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            data.add(arr[i]);
        }
        return data;
    }

    public static int task9182(String raw) {
        String[] arr = raw.split(" ");
        Set<String> data = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            data.add(arr[i]);
        }
        return data.size();
    }

    public static String task3095(String raw) {
        if (raw.isEmpty()) {
            throw new IllegalArgumentException("Исходная строка пуста");
        }
        String[] arr = raw.split(",");
        Set<String> data = new HashSet<>(Arrays.asList(arr));
        StringBuilder sb = new StringBuilder();
        data.toArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sb.append(arr[i]);
                sb.append(arr[j]);
                sb.append("\n");
                sb.append(arr[j]);
                sb.append(arr[i]);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void task5900(String data) {
        if (data.isEmpty()) {
            System.out.println("Нет данных о штрих-коде");
            return;
        }
        String[] arr = data.split(" ");
        if (arr.length != 13) {
            System.out.println("Некорректная длина штрих-кода");
            return;
        }
        System.out.println(data);
        int[] num = new int[arr.length];
        num[num.length - 1] = Integer.parseInt(arr[arr.length - 1]);
        int sum = 0;
        for (int i = 0; i < num.length - 1; i++) {
            num[i] = Integer.parseInt(arr[i]);
            int weight;
            if (i % 2 == 0) {
                weight = 1;
            } else {
                weight = 3;
            }
            sum += num[i] * weight;
            System.out.printf("Цифра %d вес %d произведение %d накопленная сумма %d\n", num[i], weight, num[i] * weight, sum);
        }
        int checksum;
        if (sum % 10 > 5) {
            checksum = 10 - sum % 10;
        } else {
            checksum = sum % 10;
        }
        if (checksum == num[num.length - 1]) {
            System.out.printf("Контрольная сумма %d совпадает с последней цифрой %d\n", checksum, num[num.length - 1]);
        } else {
            System.out.printf("Контрольная сумма %d расходится с последней цифрой %d\n", checksum, num[num.length - 1]);
        }
    }

    public static void task8122(String data) {
        System.out.println(data);
        if (data.isEmpty()) {
            System.out.println("Нет данных о кораблях");
            return;
        }
        String[] arr = data.split(",");

        char[] colHeaders = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'к'};
        int TOTAL_ROWS = 10;
        for (int j = 0; j < arr.length; j += 2) {
            String letter = arr[j];
            if (j + 1 == arr.length) {
                System.out.println("Некорректный формат. Последняя координата указана не полностью");
                return;
            }
            int number = Integer.parseInt(arr[j + 1]);
            if (number >= TOTAL_ROWS || number < 0) {
                System.out.println("Некорректная координата " + number);
                return;
            }
            boolean found = false;
            for (int col = 0; col < colHeaders.length; col++) {
                if (letter.charAt(0) == colHeaders[col]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Некорректная координата " + letter);
                return;
            }
        }
        System.out.print(" ");
        for (int i = 0; i < colHeaders.length; i++) {
            System.out.print(colHeaders[i]);
        }
        System.out.println();
        for (int row = 0; row < TOTAL_ROWS; row++) {
            System.out.print(row);
            for (int col = 0; col < colHeaders.length; col++) {
                boolean found = false;
                for (int j = 0; j < arr.length; j += 2) {
                    String letter = arr[j];
                    int number = Integer.parseInt(arr[j + 1]);
                    if (number == row && letter.charAt(0) == colHeaders[col]) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        System.out.println(" ----------");
    }

    public static void task6988(String left, String right) {
        String[] larr = left.split(" ");
        String[] rarr = right.split(" ");
        int i = 0;
        while (i < larr.length && i < rarr.length) {
            if (!larr[i].equals(rarr[i])) {
                System.out.println("Массивы начинают различаться на индексе " + i);
                return;
            }
            i = i + 1;
        }
        if (larr.length < rarr.length) {
            System.out.println("Массивы начинают различаться на индексе " + larr.length);
        } else if (larr.length > rarr.length) {
            System.out.println("Массивы начинают различаться на индексе " + rarr.length);
        } else {
            System.out.println("Массивы одинаковы");
        }
    }

    public static void task5795(String data) {
        if (data.isEmpty()) {
            System.out.println("Нет данных");
            return;
        }
        String[] arr = data.split(" ");
        int i = 0;
        int sum = 0;
        System.out.print("Числа на четных позициях:");
        while (i < arr.length) {
            System.out.print(" ");
            System.out.print(arr[i]);
            sum = sum + Integer.parseInt(arr[i]);
            i = i + 2;
        }
        System.out.println(". Сумма: " + sum);
        System.out.print("Числа на нечетных позициях:");
        i = 1;
        sum = 0;
        while (i < arr.length) {
            System.out.print(" ");
            System.out.print(arr[i]);
            sum = sum + Integer.parseInt(arr[i]);
            i = i + 2;
        }
        System.out.println(". Сумма: " + sum);
    }

    public static void task7793(String red, String green) {
        String[] redArr = red.split(" ");
        String[] greenArr = green.split(" ");
        System.out.println("Только в красном");
        for (int ri = 0; ri < redArr.length; ri++) {
            boolean found = false;
            for (int gi = 0; gi < greenArr.length; gi++) {
                if (redArr[ri].equals(greenArr[gi])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(redArr[ri]);
            }
        }
        System.out.println("Есть в обоих");
        for (int ri = 0; ri < redArr.length; ri++) {
            for (int gi = 0; gi < greenArr.length; gi++) {
                if (redArr[ri].equals(greenArr[gi])) {
                    System.out.println(redArr[ri]);
                    break;
                }
            }
        }
        System.out.println("Только в зеленом");
        for (int gi = 0; gi < greenArr.length; gi++) {
            boolean found = false;
            for (int ri = 0; ri < redArr.length; ri++) {
                if (redArr[ri].equals(greenArr[gi])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(greenArr[gi]);
            }
        }
        System.out.println();
    }

}
