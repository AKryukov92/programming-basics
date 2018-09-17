using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Methods
{
    public class Lab07
    {
        static void Main(string[] args)
        {
            Step5541();
        }

        public static void Step5541()
        {
            Console.WriteLine();
            Console.WriteLine("5541");
            String[] in5541 = {
                "1 1 1 1",
                "1 1 2 2",
                "1 1 1 2",
                "1 2 3 4",
                "1 2 3 4 1 2",
                "1 1 3 3 2 2"};
            String[] out5541 = {
                "1",
                "1 2",
                "1 2",
                "1 2 3 4",
                "1 2 3 4",
                "1 3 2"};
            for (int i = 0; i < in5541.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                ISet<String> result = Task5541(in5541[i]);
                foreach (String item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        public static String Task4425(int a, String raw)
        {
            if (String.IsNullOrEmpty(raw))
            {
                throw new Exception("Исходная строка пуста");
            }
            String[] arr = raw.Split(new char[] { ' ' });
            if (a < 0 || a >= arr.Length)
            {
                throw new Exception("Число A должно быть в интервале [0, размер массива)");
            }
            return arr[a];
        }

        public static String Task1433(String raw)
        {
            if (String.IsNullOrEmpty(raw))
            {
                throw new ArgumentException("Исходная строка пуста");
            }
            String[] arr = raw.Split(';');
            int index = (arr.Length - 1) / 2;
            return String.Format("Индекс: {0}, элемент: {1}", index, arr[index]);
        }

        public static String Task5683(String str)
        {
            if (String.IsNullOrEmpty(str))
            {
                return "";
            }
            String[] arr = str.Split(' ');
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.Length; i++)
            {
                sb.Append(arr[i]);
                sb.Append(" ");
                sb.Append(i);
                sb.Append("\n");
            }
            return sb.ToString();
        }

        public static void Task1223(String[] arr)
        {
            for (int i = 0; i < arr.Length / 2; i++)
            {
                String temp = arr[i];
                arr[i] = arr[arr.Length - 1 - i];
                arr[arr.Length - 1 - i] = temp;
            }
        }

        public static IList<String> Task1223(String raw)
        {
            if (raw.Length == 0)
            {
                return new List<String>();
            }
            String[] arr = raw.Split(new char[] { ' ' });
            Task1223(arr);
            return arr.ToList();
        }

        public static double Task3946(int[] arr)
        {
            if (arr.Length == 0)
            {
                return 0;
            }
            return arr.Average();
        }

        public static double Task3946(String raw)
        {
            if (raw.Length == 0)
            {
                return 0;
            }
            String[] arr = raw.Split(new char[] { ' ' });
            double sum = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                sum += int.Parse(arr[i]);
            }
            return sum / arr.Length;
        }

        public static double[] Task6497(int[] arr)
        {
            if (arr.Length == 0)
            {
                return new double[0];
            }
            double sum = 0;
            for(int i = 0; i < arr.Length; i++)
            {
                sum += arr[i];
            }
            double avg = sum / arr.Length;
            double[] result = new double[arr.Length];
            for(int i = 0; i < arr.Length; i++)
            {
                result[i] = Math.Abs(arr[i] - avg);
            }
            return result;
        }

        public static List<Double> Task6497(String raw)
        {
            if (raw.Length == 0)
            {
                return new List<double>();
            }
            String[] arr = raw.Split(' ');
            double sum = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                sum += Double.Parse(arr[i]);
            }
            double avg = sum / arr.Length;
            List<Double> deltas = new List<double>();
            for (int i = 0; i < arr.Length; i++)
            {
                deltas.Add(Math.Abs(Double.Parse(arr[i]) - avg));
            }
            return deltas;
        }

        public static double task5648(String raw)
        {
            if (raw.Length == 0)
            {
                throw new ArgumentException("Дана пустая последовательность");
            }
            String[] arr = raw.Split(' ');
            double[] drr = new double[arr.Length];
            double sum = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                drr[i] = Double.Parse(arr[i]);
                sum += drr[i];
            }
            double avg = sum / arr.Length;
            double sumOfD = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                double d = (drr[i] - avg);
                sumOfD += d * d;
            }
            return Math.Sqrt(1.0 / (arr.Length - 1.0) * sumOfD);
        }

        public static IList<int> Task3940(String left, String right)
        {
            String[] larr = left.Split(new char[] { ' ' });
            String[] rarr = right.Split(new char[] { ' ' });
            if (larr.Length != rarr.Length)
            {
                throw new Exception("Размеры массивов должны быть одинаковы");
            }
            IList<int> ret = new List<int>();
            for (int i = 0; i < larr.Length; i++)
            {
                int l = int.Parse(larr[i]);
                int r = int.Parse(rarr[i]);
                ret.Add(l * r);
            }
            return ret;
        }

        public static IList<String> Task8311(int b, int e, String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            if (b < 0 || b >= arr.Length)
            {
                throw new Exception("Число B должно быть в интервале [0, размер массива)");
            }
            if (e < 0 || e >= arr.Length)
            {
                throw new Exception("Число E должно быть в интервале [0, размер массива)");
            }
            IList<String> ret = new List<String>();
            int i, n;
            if (b < e)
            {
                i = b;
                n = e;
            }
            else
            {
                i = e;
                n = b;
            }
            while (i <= n)
            {
                ret.Add(arr[i]);
                i++;
            }
            return ret;
        }

        public static IList<String> Task3134(int p, int q, String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            if (p < 0 || p >= arr.Length)
            {
                throw new Exception("Число P должно быть в интервале [0, размер массива)");
            }
            if (q < 0 || q >= arr.Length)
            {
                throw new Exception("Число Q должно быть в интервале [0, размер массива)");
            }
            IList<String> ret = new List<String>();
            String t = arr[p];
            arr[p] = arr[q];
            arr[q] = t;
            for (int i = 0; i < arr.Length; i++)
            {
                ret.Add(arr[i]);
            }
            return ret;
        }

        public static void Task9774(int m, int[] arr)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = arr[i] * m;
            }
        }

        public static IList<int> Task9774(int m, String raw)
        {
            IList<int> ret = new List<int>();
            if (String.IsNullOrWhiteSpace(raw))
            {
                return ret;
            }
            String[] arr = raw.Split(new char[] { ' ' });
            for (int i = 0; i < arr.Length; i++)
            {
                ret.Add(int.Parse(arr[i]) * m);
            }
            return ret;
        }

        public static IList<String> Task9711(String raw)
        {
            IList<String> ret = new List<String>();
            if (String.IsNullOrWhiteSpace(raw))
            {
                return ret;
            }
            String[] arr = raw.Split(new char[] { ' ' });
            
            ret.Add(arr[arr.Length - 1]);
            for (int i = 0; i < arr.Length - 1; i++)
            {
                ret.Add(arr[i]);
            }
            return ret;
        }

        public static IList<String> Task3333(int s, String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            IList<String> ret = new List<String>();
            int ds;
            if (s < 0)
            {
                ds = -s % arr.Length;
            }
            else
            {
                ds = arr.Length - s % arr.Length;
            }
            for (int i = ds; i < arr.Length; i++)
            {
                ret.Add(arr[i]);
            }
            for (int i = 0; i < ds; i++)
            {
                ret.Add(arr[i]);
            }
            return ret;
        }

        public static String Task7085(int s, String raw)
        {
            String[] arr = raw.Split(' ');
            if (s <= 0 || arr.Length <= s)
            {
                throw new ArgumentException("Количество позиций при сдвиге должно быть в интервале [0, длина массива)");
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s; j++)
            {
                String t = arr[arr.Length - 1];
                for (int i = arr.Length - 1; i > 0; i--)
                {
                    arr[i] = arr[i - 1];
                }
                arr[0] = t;
                for (int i = 0; i < arr.Length; i++)
                {
                    sb.Append(arr[i]);
                    sb.Append(' ');
                }
                sb.Append('\n');
            }
            return sb.ToString();
        }

        public static int Task7290(int b, String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            if (b < 0 || b >= arr.Length)
            {
                throw new Exception("Число B должно быть в интервале [0, размер массива)");
            }
            int t = int.Parse(arr[b]);
            int count = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                if (int.Parse(arr[i]) < t)
                {
                    count++;
                }
            }
            return count;
        }

        public static StringBuilder Task5694(StringBuilder sb, String x)
        {
            String[] arr = "a b c d e f g h".Split(new char[] { ' ' });
            for (int i = 0; i < arr.Length; i++)
            {
                sb.Append(arr[i]);
                if (arr[i].Equals(x))
                {
                    sb.Append("+");
                }
                sb.Append("\n");
            }
            return sb;
        }

        public static String Task1292(Char x)
        {
            String arr = "abcdefgh";
            int index = arr.IndexOf(x);
            if (index >= 0)
            {
                return arr.Substring(0, index + 1);
            }
            else
            {
                return arr;
            }
        }

        public static StringBuilder Task6806(StringBuilder sb, int x)
        {
            int[] arr = { 11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20 };
            for (int i = 0; i < arr.Length; i++)
            {
                sb.Append(arr[i]);
                if (arr[i] == x)
                {
                    sb.Append("+");
                }
                sb.Append("\n");
            }
            return sb;
        }

        public static int Task5894(String leftRaw, String topRaw)
        {
            if (String.IsNullOrWhiteSpace(leftRaw))
            {
                throw new Exception("Данные слева отсутствуют");
            }
            if (String.IsNullOrWhiteSpace(leftRaw))
            {
                throw new Exception("Данные сверху отсутствуют");
            }
            int count = 0;
            String[] leftArr = leftRaw.Split(' ');
            String[] topArr = topRaw.Split(' ');
            for (int i = 0; i < leftArr.Length; i++)
            {
                for (int j = 0; j < topArr.Length; j++)
                {
                    if (leftArr[i].Equals(topArr[j]))
                    {
                        count++;
                    }
                }
            }
            return count;
        }

        public static String Task7534(String charsRaw, String amountsRaw)
        {
            if (String.IsNullOrWhiteSpace(charsRaw))
            {
                return "Отсутствуют данные о символах";
            }
            if (String.IsNullOrWhiteSpace(amountsRaw))
            {
                return "Отсутствуют данные о количествах";
            }
            String[] chars = charsRaw.Split(' ');
            String[] amounts = amountsRaw.Split(' ');
            if (chars.Length != amounts.Length)
            {
                return "Длины массивов не совпадают";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < chars.Length; i++)
            {
                int amount = int.Parse(amounts[i]);
                for (int j = 0; j < amount; j++)
                {
                    sb.Append(chars[i]);
                }
                sb.Append("\n");
            }
            return sb.ToString();
        }

        public static String Task2173(String data)
        {
            if (String.IsNullOrWhiteSpace(data))
            {
                return "Исходная строка пуста";
            }
            if (!data.Contains(";"))
            {
                return "Значения отсортированы по возрастанию";
            }
            String[] parts = data.Split(';');
            int prev = int.Parse(parts[0]);
            for (int i = 1; i < parts.Length; i++)
            {
                int current = int.Parse(parts[i]);
                if (current < prev)
                {
                    return "Элемент со значением " + current + " на индексе " + i + " нарушает закономерность";
                }
                prev = current;
            }
            return "Значения отсортированы по возрастанию";
        }

        public static String Task7369(String leftRaw, String topRaw)
        {
            if (String.IsNullOrWhiteSpace(leftRaw))
            {
                return "Данные слева отсутствуют";
            }
            if (String.IsNullOrWhiteSpace(topRaw))
            {
                return "Данные сверху отсутствуют";
            }
            StringBuilder sb = new StringBuilder();
            String[] leftArr = leftRaw.Split(' ');
            String[] topArr = topRaw.Split(' ');
            sb.Append("  ");
            sb.Append(topRaw);
            sb.Append("\n");
            for (int i = 0; i < leftArr.Length; i++)
            {
                sb.Append(leftArr[i]);
                for (int j = 0; j < topArr.Length; j++)
                {
                    if (leftArr[i].Equals(topArr[j]))
                    {
                        sb.Append(" +");
                    }
                    else
                    {
                        sb.Append("  ");
                    }
                }
                sb.Append("|\n");
            }
            sb.Append(" ");
            for (int i = 0; i < topArr.Length; i++)
            {
                sb.Append("--");
            }
            return sb.ToString();
        }

        public static bool Task4515(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = i + 1; j < arr.Length; j++)
                {
                    if (arr[i].Equals(arr[j]))
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public static String Task7035(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            int min = int.Parse(arr[0]);
            StringBuilder sb = new StringBuilder();
            sb.Append("Ход решения: \nНачинаю с ");
            sb.Append(min);
            for (int i = 1; i < arr.Length; i++)
            {
                sb.Append("\nСравниваю ");
                sb.Append(min);
                sb.Append(" и ");
                int current = int.Parse(arr[i]);
                sb.Append(current);
                if (current < min)
                {
                    sb.Append("\nЗаменяю");
                    min = current;
                }
            }
            sb.Append("\nВ массиве {");
            sb.Append(raw);
            sb.Append("} минимальный элемент это ");
            sb.Append(min);
            return sb.ToString();
        }

        public static void Task9271(double[] arr)
        {
            if (arr.Length == 0)
            {
                return;
            }

            double min = arr[0];
            for (int i = 1; i < arr.Length; i++) {
                if(arr[i] < min)
                {
                    min = arr[i];
                }
            }
            for(int i = 0; i < arr.Length; i++)
            {
                arr[i] = arr[i] - min;
            }
        }

        public static IList<int> Task9271(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            IList<int> ret = new List<int>();
            if (arr.Length == 0)
            {
                return ret;
            }
            int min = int.Parse(arr[0]);
            for (int i = 1; i < arr.Length; i++)
            {
                int current = int.Parse(arr[i]);
                if (current < min)
                {
                    min = current;
                }
            }
            for (int i = 0; i < arr.Length; i++)
            {
                ret.Add(int.Parse(arr[i]) - min);
            }
            return ret;
        }

        public static int Task8769(int p, int q, String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            int i, n;
            if (p < 0 || p >= arr.Length)
            {
                throw new Exception("Число P должно быть в интервале [0, размер массива)");
            }
            if (q < 0 || q >= arr.Length)
            {
                throw new Exception("Число Q должно быть в интервале [0, размер массива)");
            }
            if (p < q)
            {
                i = p;
                n = q;
            }
            else
            {
                i = q;
                n = p;
            }
            int min = int.Parse(arr[i]);
            while (i <= n)
            {
                int current = int.Parse(arr[i]);
                if (current < min)
                {
                    min = current;
                }
                i++;
            }
            return min;
        }

        public static IList<int> Task4497(int x, int y, String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            IList<int> ret = new List<int>();
            for (int i = 0; i < arr.Length; i++)
            {
                int current = int.Parse(arr[i]);
                if (current == x)
                {
                    ret.Add(y);
                }
                else
                {
                    ret.Add(current);
                }
            }
            return ret;
        }

        public static IList<String> Task8820(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            IList<String> ret = new List<String>();
            for (int i = arr.Length - 1; i >= 0; i--)
            {
                ret.Add(arr[i]);
            }
            return ret;
        }

        public static IList<int> Task3218(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            IList<int> ret = new List<int>();
            int[] data = new int[arr.Length];
            for (int i = 0; i < arr.Length; i++)
            {
                data[i] = int.Parse(arr[i]);
            }
            for (int i = 0; i < arr.Length; i++)
            {
                int min = i;
                for (int j = i; j < arr.Length; j++)
                {
                    if (data[j] < data[min])
                    {
                        min = j;
                    }
                }
                int t = data[min];
                data[min] = data[i];
                data[i] = t;
                ret.Add(t);
            }
            return ret;
        }

        public static int Task4283(int k, int[] arr)
        {
            int count = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i] == k)
                {
                    count++;
                }
            }
            return count;
        }

        public static int Task4283(int k, String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            int count = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                if (int.Parse(arr[i]) == k)
                {
                    count++;
                }
            }
            return count;
        }

        public static IList<int> Task7703(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            IList<int> ret = new List<int>();
            for (int i = 0; i < arr.Length; i++)
            {
                int count = 0;
                for (int j = 0; j < arr.Length; j++)
                {
                    if (arr[j].Equals(arr[i]))
                    {
                        count++;
                    }
                }
                ret.Add(count);
            }
            return ret;
        }

        public static ISet<String> Task5541(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            ISet<String> data = new HashSet<String>();
            for (int i = 0; i < arr.Length; i++)
            {
                data.Add(arr[i]);
            }
            return data;
        }

        public static int Task9182(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            ISet<String> data = new HashSet<String>();
            for (int i = 0; i < arr.Length; i++)
            {
                data.Add(arr[i]);
            }
            return data.Count;
        }
    }
}