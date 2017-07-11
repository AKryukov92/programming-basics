using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Methods
{
    public class Lab08
    {
        static void Main(string[] args)
        {
            task8787();
        }

        public static void task8787()
        {
            Console.WriteLine();
            Console.WriteLine("1223");
            String[] in1223 = {
                "1 2 3 4 1",
                "1 2 3 4 1 2 3 4 1 2",
                ""};
            for (int i = 0; i < in1223.Length; i++)
            {
                var result = String.Join(" ", task1223(in1223[i]));
                Console.WriteLine(result);
            }

            Console.WriteLine();
            Console.WriteLine("3940");
            String[] in3940l = {
                "1 2 3 4 1",
                "1 2 3 4 1 3 4 4 4 4",
                "1 2 3",
                "1 2 3"};
            String[] in3940r = {
                "2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 4",
                "3 4",
                "3 4 1 2"};
            for (int i = 0; i < in3940l.Length; i++)
            {
                try
                {
                    var result = task3940(in3940l[i], in3940r[i]);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("8311");
            int[] in8311b = { 0, 1, 2, 3, 2, 8, 11, -1, 8 };
            int[] in8311e = { 3, 3, 3, 10, 2, 2, 8, 5, 50 };
            String[] in8311data = {
                "1 2 3 4 1",
                "1 2 3 4 1",
                "1 2 3 4 1",
                "1 2 3 4 1 2 3 4 1 2 3",
                "1 2 3 4 1 2 3 4 1 2 3",
                "1 2 3 4 1 2 3 4 1 2 3",
                "1 2 3 4 1 2 3 4 1 2 3",
                "1 2 3 4 1 2 3 4 1 2 3",
                "1 2 3 4 1 2 3 4 1 2 3"};
            for (int i = 0; i < in8311b.Length; i++)
            {
                try
                {
                    var result = task8311(in8311b[i], in8311e[i], in8311data[i]);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("3134");
            int[] in3134p = { 0, 2, 4, -1, 2, 19, 1 };
            int[] in3134q = { 3, 5, 2, 5, 17, 2, -5 };
            String in3134data = "1 2 3 4 1 2";
            for (int i = 0; i < in3134p.Length; i++)
            {
                try
                {
                    var result = task3134(in3134p[i], in3134q[i], in3134data);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("9774");
            int[] in9774m = { 31, -3 };
            String in9774data = "1 2 3 4 1 2";
            for (int i = 0; i < in9774m.Length; i++)
            {
                var result = task9774(in9774m[i], in9774data);
                Console.WriteLine(String.Join(" ", result));
            }

            Console.WriteLine();
            Console.WriteLine("9711");
            String[] in9711 = {
                "1 2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 4"};
            for (int i = 0; i < in9711.Length; i++)
            {
                var result = task9711(in9711[i]);
                Console.WriteLine(String.Join(" ", result));
            }

            Console.WriteLine();
            Console.WriteLine("3333");
            int[] in3333s = { 1, 3, 6, 8, 99, -2, -9 };
            String in3333data = "1 2 3 4 1 2";
            for (int i = 0; i < in3333s.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<int> result = task3333(in3333s[i], in3333data);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }

            Console.WriteLine();
            Console.WriteLine("9271");
            String[] in9271 = {
                "1 2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 1 2",
                "4 2 3 4 3 2",
                "4 4 4 4 4 3 2 1",
                "4 4 4 4",
                "4 3"};
            for (int i = 0; i < in9271.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<int> result = task9271(in9271[i]);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }


            Console.WriteLine();
            Console.WriteLine("4497");
            int[] in4497x = { 1, 3, 5 };
            int[] in4497y = { 33, 55, 1 };
            String in4497data = "1 2 3 4 1 2";
            String[] out4497 = {
                "33 2 3 4 33 2",
                "1 2 55 4 1 2",
                "1 2 3 4 1 2"};
            for (int i = 0; i < in4497x.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<int> result = task4497(in4497x[i], in4497y[i], in4497data);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }

            Console.WriteLine();
            Console.WriteLine("8820");
            String[] in8820 = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3"};
            String[] out8820 = {
                "2 1 4 3 2 1",
                "3 2 1 4 3 2 1 4 3 2 1"};
            for (int i = 0; i < in8820.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<string> result = task8820(in8820[i]);
                foreach (string item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }

            Console.WriteLine();
            Console.WriteLine("3218");
            String[] in3218 = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3"};
            String[] out3218 = {
                "1 1 2 2 3 4",
                "1 1 1 2 2 2 3 3 3 4 4"};
            for (int i = 0; i < in3218.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<int> result = task3218(in3218[i]);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }

            Console.WriteLine();
            Console.WriteLine("7703");
            String[] in7703 = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3",
                "3 2 2 2 2 2",
                "4 4 4 4 4 4"};
            String[] out7703 = {
                "2 2 1 1 2 2",
                "3 3 3 2 3 3 3 2 3 3 3",
                "1 5 5 5 5 5",
                "6 6 6 6 6 6"};
            for (int i = 0; i < in7703.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<int> result = task7703(in7703[i]);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }

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
                ISet<String> result = task5541(in5541[i]);
                foreach (String item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        public static String task4425(int a, String raw)
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

        public static String task5683(String str)
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

        public static IList<int> task1223(String raw)
        {
            IList<int> ret = new List<int>();
            if (raw.Length == 0)
            {
                return ret;
            }
            String[] arr = raw.Split(new char[] { ' ' });
            for (int i = arr.Length - 1; i >= 0; i--)
            {
                ret.Add(int.Parse(arr[i]));
            }
            return ret;
        }

        public static double task3946(String raw)
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

        public static IList<int> task3940(String left, String right)
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

        public static IList<int> task8311(int b, int e, String raw)
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
            IList<int> ret = new List<int>();
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
                ret.Add(int.Parse(arr[i]));
                i++;
            }
            return ret;
        }

        public static IList<String> task3134(int p, int q, String raw)
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

        public static IList<int> task9774(int m, String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            IList<int> ret = new List<int>();
            for (int i = arr.Length - 1; i >= 0; i--)
            {
                ret.Add(int.Parse(arr[i]) * m);
            }
            return ret;
        }

        public static IList<int> task9711(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            IList<int> ret = new List<int>();
            ret.Add(int.Parse(arr[arr.Length - 1]));
            for (int i = 0; i < arr.Length - 1; i++)
            {
                ret.Add(int.Parse(arr[i]));
            }
            return ret;
        }

        public static IList<int> task3333(int s, String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            IList<int> ret = new List<int>();
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
                ret.Add(int.Parse(arr[i]));
            }
            for (int i = 0; i < ds; i++)
            {
                ret.Add(int.Parse(arr[i]));
            }
            return ret;
        }

        public static int task7290(int b, String raw)
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

        public static StringBuilder task5694(StringBuilder sb, String x)
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

        public static StringBuilder task6806(StringBuilder sb, int x)
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

        public static int task5894(String leftRaw, String topRaw)
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

        public static String task7369(String leftRaw, String topRaw)
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

        public static bool task4515(String raw)
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

        public static int task7035(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            int min = int.Parse(arr[0]);
            for (int i = 1; i < arr.Length; i++)
            {
                int current = int.Parse(arr[i]);
                if (current < min)
                {
                    min = current;
                }
            }
            return min;
        }

        public static IList<int> task9271(String raw)
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

        public static int task8769(int p, int q, String raw)
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

        public static IList<int> task4497(int x, int y, String raw)
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

        public static IList<String> task8820(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            IList<String> ret = new List<String>();
            for (int i = arr.Length - 1; i >= 0; i--)
            {
                ret.Add(arr[i]);
            }
            return ret;
        }

        public static IList<int> task3218(String raw)
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

        public static int task4283(int k, String raw)
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

        public static IList<int> task7703(String raw)
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

        public static ISet<String> task5541(String raw)
        {
            String[] arr = raw.Split(new char[] { ' ' });
            ISet<String> data = new HashSet<String>();
            for (int i = 0; i < arr.Length; i++)
            {
                data.Add(arr[i]);
            }
            return data;
        }

        public static int task9182(String raw)
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