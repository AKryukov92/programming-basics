using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Methods
{
    public class Lab06
    {
        static void Main(string[] args)
        {
        }
        
        public static StringBuilder Task8495(StringBuilder sb)
        {
            int i = 0;
            while (i < 13)
            {
                sb.Append("!");
                i++;
            }
            return sb;
        }

        public static StringBuilder Task1315(StringBuilder sb)
        {
            int a = 17;
            int b = 47;
            while (a <= b)
            {
                sb.Append(a);
                sb.Append(" ");
                a++;
            }
            return sb;
        }

        public static StringBuilder Task6066(StringBuilder sb, int a, int b)
        {
            if (a > b) {
                throw new Exception("Значение A должно быть не больше значения B");
            }
            int i = a;
            while (i <= b) {
                sb.Append(i);
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static StringBuilder Task2565(StringBuilder sb, int a, int b)
        {
            if (a > b) {
                throw new Exception("Значение A должно быть не больше значения B");
            }
            int i = b;
            while (i >= a) {
                sb.Append(i);
                sb.Append(" ");
                i--;
            }
            return sb;
        }

        public static StringBuilder Task2594(StringBuilder sb, int a, String b)
        {
            if (a < 0) {
                throw new Exception("Значение A должно быть неотрицательным");
            }
            int i = 0;
            sb.Append("\"");
            while (i < a) {
                sb.Append(b);
                i++;
            }
            sb.Append("\"");
            return sb;
        }

        public static IList<int> Task2321(int a, int b)
        {
            int i, n;
            IList<int> ret = new List<int>();
            if (a < b)
            {
                i = a;
                n = b;
            }
            else {
                i = b;
                n = a;
            }
            while (i <= n)
            {
                ret.Add(i);
                i++;
            }
            return ret;
        }

        public static IList<int> Task5053(int a, int b)
        {
            IList<int> ret = new List<int>();
            if (a < b)
            {
                while (a <= b)
                {
                    ret.Add(a);
                    a++;
                }
            }
            else {
                while (b <= a)
                {
                    ret.Add(a);
                    a--;
                }
            }
            return ret;
        }

        public static StringBuilder Task3762(StringBuilder sb)
        {
            int i = 1;
            while (i <= 20)
            {
                sb.Append(i);
                sb.Append(" ");
                sb.Append(i * 453);
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static StringBuilder Task3550(StringBuilder sb)
        {
            int i = 1;
            while (i <= 9)
            {
                sb.Append(i);
                sb.Append(" x 7 = ");
                sb.Append(i * 7);
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static int Task2475()
        {
            int a = 100, b = 500, sum = 0;
            while (a <= b)
            {
                sum += a;
                a++;
            }
            return sum;
        }

        public static int Task9180(int a)
        {
            if (a < -100 || a > 500) {
                throw new Exception("Значение A должно быть в интервале [-100, 500]");
            }
            int b = 500, sum = 0;
            while (a <= b) {
                sum += a;
                a++;
            }
            return sum;
        }

        public static int Task1544(int b)
        {
            if (b < -10 || b > 10000) {
                throw new Exception("Значение b должно быть в интервале [-10,10000]");
            }
            int a = -10, sum = 0;
            while (a <= b) {
                sum += a;
                a++;
            }
            return sum;
        }

        public static int Task9562(int a, int b)
        {
            int n;
            int i;
            if (a > b)
            {
                i = b;
                n = a;
            }
            else {
                i = a;
                n = b;
            }
            int sum = 0;
            while (i <= n)
            {
                sum += i;
                i++;
            }
            return sum;
        }

        public static long Task3669(int a, int b)
        {
            long mul = 1;
            long i, n;
            if (a < b)
            {
                i = a;
                n = b;
            }
            else {
                i = b;
                n = a;
            }
            while (i <= n)
            {
                mul *= i;
                i++;
            }
            return mul;
        }

        public static int Task5951()
        {
            int i = 20;
            int n = 40;
            int sum = 0;
            while (i <= n)
            {
                sum += i;
                i++;
            }
            return sum;
        }

        public static double Task2802(int n)
        {
            if (n <= 0) {
                throw new Exception("Значение N должно быть положительным");
            }
            int i = 1;
            double sum = 0;
            while (i <= n) {
                sum += 1.0 / i;
                i++;
            }
            return sum;
        }

        public static int Task2324(String str)
        {
            String[] raw = str.Split(' ');
            int sum = 0;
            int i = 0;
            int current;
            do
            {
                current = int.Parse(raw[i]);
                sum += current;
                i++;
            }
            while (current != 0);
            return sum;
        }

        public static int Task8731(String str)
        {
            String[] raw = str.Split(' ');
            int sum = 0;
            int index = 0;
            int current;
            do
            {
                current = int.Parse(raw[index]);
                sum += current;
                index++;
            }
            while (sum <= 1000);
            return index;
        }

        public static String Task4082(String str)
        {
            String[] raw = str.Split(' ');
            int leftSum = 0;
            int rightSum = 0;
            int current;
            int i = 0;
            do
            {
                current = int.Parse(raw[i]);
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
            return String.Format("Сумма слева: {0}, сумма справа: {1}", leftSum, rightSum);
        }

        public static long Task6580(int a, int b)
        {
            int i, n;
            long sum = 0;
            if (a < b)
            {
                i = a;
                n = b;
            }
            else {
                i = b;
                n = a;
            }
            while (i <= n)
            {
                sum += i * i;
                i++;
            }
            return sum;
        }

        public static StringBuilder Task7585(StringBuilder sb, int x)
        {
            int i = 10;
            while (i <= 20)
            {
                sb.Append(i);
                if (i == x)
                {
                    sb.Append("+");
                }
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static StringBuilder Task1483(StringBuilder sb, int n)
        {
            if (n < 0)
            {
                throw new Exception("Значение N должно быть неотрицательным");
            }
            int i = 1;
            while (i <= n)
            {
                sb.Append("!");
                if (i % 5 == 0)
                {
                    sb.Append(" ");
                }
                i++;
            }
            return sb;
        }

        public static StringBuilder Task3983(StringBuilder sb, int n)
        {
            if (n < 0) {
                throw new Exception("Значение N должно быть неотрицательным");
            }
            int i = 1;
            while (i <= n) {
                sb.Append("#");
                if (i % 20 == 0)
                {
                    sb.Append("\n");
                }
                i++;
            }
            return sb;
        }

        public static StringBuilder Task8770(StringBuilder sb, int x)
        {
            int i = 30;
            while (i <= 40)
            {
                sb.Append(i);
                if (i == x)
                {
                    sb.Append("+");
                }
                else {
                    sb.Append("-");
                }
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static StringBuilder Task4236(StringBuilder sb, int y)
        {
            if (y < 0 || y > 15) {
                throw new Exception("Значение Y должно быть в интервале [0, 15]");
            }
            int i = 0;
            while (i < y) {
                sb.Append("#");
                i++;
            }
            while (i < 15) {
                sb.Append(".");
                i++;
            }
            return sb;
        }

        public static int Task5969(int a, int b)
        {
            int i, n;
            if (a < b)
            {
                i = a;
                n = b;
            }
            else {
                i = b;
                n = a;
            }
            int sum = 0;
            while (i <= n)
            {
                if (i % 7 == 0)
                {
                    sum += i;
                }
                i++;
            }
            return sum;
        }

        public static int Task8696()
        {
            int i = 100, n = 1000;
            int count = 0;
            while (i <= n)
            {
                if (i % 13 == 0)
                {
                    count++;
                }
                i++;
            }
            return count;
        }

        public static IList<int> Task8418(int x)
        {
            if (x <= 0) {
                throw new Exception("Значение X должно быть положительным");
            }
            int i = 1;
            IList<int> ret = new List<int>();
            while (i < x / 2 + 1) {
                if (x % i == 0) {
                    ret.Add(i);
                }
                i++;
            }
            return ret;
        }

        public static bool Task5170(int y)
        {
            if (y <= 0) {
                throw new Exception("Значение Y должно быть положительным");
            }
            int i = 2;
            while (i < y / 2 + 1) {
                if (y % i == 0)
                {
                    return false;
                }
                i++;
            }
            return true;
        }

        public static StringBuilder Task8395(StringBuilder sb, int w)
        {
            if (w < 0 || w > 20) {
                throw new Exception("Значение W должно быть в интервале [0, 20]");
            }
            for (int i = 0; i < w; i++) {
                sb.Append("a");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("b");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("c");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("d");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("e");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("f");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("g");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("h");
            }
            return sb;
        }

        public static StringBuilder Task5568(StringBuilder sb, int w)
        {
            if (w < 0 || w > 20) {
                throw new Exception("Значение W должно быть в интервале [0, 20]");
            }
            int i = 0;
            while (i <= 9) {
                int j = 0;
                while (j < w)
                {
                    sb.Append(i);
                    j++;
                }
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static StringBuilder Task2592(StringBuilder sb, String s, int w, int h)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            if (w == 0 || h == 0) {
                return sb;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++)
                {
                    sb.Append(s);
                }
                sb.Append("\n");
            }
            return sb;
        }

        public static StringBuilder Task4075(StringBuilder sb, int w)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (w < 2) {
                return sb.Append("\n\n");
            }
            sb.Append("+");
            for (int i = 1; i < w - 1; i++) {
                sb.Append("-");
            }
            sb.Append("+\n|");
            for (int i = 1; i < w - 1; i++) {
                sb.Append(".");
            }
            sb.Append("|\n+");
            for (int i = 1; i < w - 1; i++) {
                sb.Append("-");
            }
            sb.Append("+");
            return sb;
        }

        public static StringBuilder Task7517(StringBuilder sb, int w, int h)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            if (w == 0 || h == 0) {
                return sb;
            }
            sb.Append(" ");
            for (int i = 0; i < w; i++) {
                sb.Append(i);
            }
            sb.Append("\n");
            for (int j = 0; j < h; j++) {
                sb.Append(j);
                for (int i = 0; i < w; i++)
                {
                    sb.Append(" ");
                }
                sb.Append("|\n");
            }
            sb.Append(" ");
            for (int i = 0; i < w; i++) {
                sb.Append("-");
            }
            return sb;
        }

        public static StringBuilder Task5448(StringBuilder sb, String s, int h)
        {
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            for (int i = 1; i <= h; i++) {
                for (int j = 0; j < i; j++)
                {
                    sb.Append(s);
                }
                sb.Append("\n");
            }
            return sb;
        }

        public static StringBuilder Task6572(StringBuilder sb, int a, int b)
        {
            int i = 0, n, min;
            if (a < b)
            {
                n = b - a;
                min = a;
            }
            else {
                n = a - b;
                min = b;
            }
            if (min % 2 == 0)
            {
                min++;
            }
            while (i <= n)
            {
                for (int j = 0; j < i / 2; j++)
                {
                    sb.Append(".");
                }
                sb.Append(i + min);
                sb.Append("\n");
                i += 2;
            }
            return sb;
        }

        public static StringBuilder Task5238(StringBuilder sb, int w, int h)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            if (w == 0 || h == 0) {
                return sb;
            }
            for (int i = 0; i < h; i++) {
                int j = 0;
                while (j < w - i)
                {
                    sb.Append("+");
                    j++;
                }
                while (j < w)
                {
                    sb.Append("#");
                    j++;
                }
                sb.Append("\n");
            }
            return sb;
        }

        public static StringBuilder Task2084(StringBuilder sb, int a, int b)
        {
            if (a == b)
            {
                return sb.Append(a);
            }
            else if (a < b)
            {
                int i = a + 2;
                if (a % 2 == 0)
                {
                    sb.Append(a + 1);
                    i++;
                }
                else {
                    sb.Append(a);
                }
                while (i <= b)
                {
                    sb.Append(", ");
                    sb.Append(i);
                    i += 2;
                }
                return sb;
            }
            else {
                int i = a - 2;
                if (a % 2 == 0)
                {
                    sb.Append(a - 1);
                    i--;
                }
                else {
                    sb.Append(a);
                }
                while (i >= b)
                {
                    sb.Append(", ");
                    sb.Append(i);
                    i -= 2;
                }
                return sb;
            }
        }

        public static StringBuilder Task5411(StringBuilder sb, int p, int q)
        {
            int i = 1, n, min;
            if (p < q)
            {
                min = p;
                n = q - p;
            }
            else {
                min = q;
                n = p - q;
            }
            sb.Append(min);
            while (i <= n / 2)
            {
                sb.Append("&lt;");
                sb.Append(i + min);
                i++;
            }
            while (i <= n)
            {
                sb.Append("&gt;");
                sb.Append(i + min);
                i++;
            }
            return sb;
        }

        public static StringBuilder Task5171(StringBuilder sb, String s1, String s2, int w, int h)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            if (w == 0 || h == 0) {
                return sb;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++)
                {
                    if (i % 2 == 0)
                    {
                        sb.Append(s1);
                    }
                    else {
                        sb.Append(s2);
                    }
                }
                sb.Append("\n");
            }
            return sb;
        }

        public static StringBuilder Task1862(StringBuilder sb, String s1, String s2, int w, int h)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            if (w == 0 || h == 0) {
                return sb;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++)
                {
                    if (j % 2 == 0)
                    {
                        sb.Append(s1);
                    }
                    else {
                        sb.Append(s2);
                    }
                }
                sb.Append("\n");
            }
            return sb;
        }
    }
}

