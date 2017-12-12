using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Methods
{
    public class Lab08
    {
        public static String STR = "abcdefwxyz";
        public static String STR2 = "abcdacadbacdaabaadc";

        public static int Task9631(String s)
        {
            if (!STR.Contains(s))
            {
                throw new Exception("Значение S отсутствует в строке");
            }
            return STR.Length - STR.IndexOf(s) - 1;
        }

        public static int Task9812(String a, String b)
        {
            if (!STR.Contains(a))
            {
                throw new Exception("Значение A отсутствует в строке");
            }
            if (!STR.Contains(b))
            {
                throw new Exception("Значение B отсутствует в строке");
            }
            int indexA = STR.IndexOf(a);
            int indexB = STR.IndexOf(b);
            if (indexA < indexB)
            {
                return indexB - indexA - 1;
            }
            else
            {
                return indexA - indexB - 1;
            }
        }

        public static IList<int> Task9279(string x)
        {
            if (x.Length != 2)
            {
                throw new Exception("Вводимая строка должна содержать ровно 2 символа");
            }
            IList<int> ret = new List<int>();
            int i = STR2.IndexOf(x);
            while (i != -1)
            {
                ret.Add(i);
                i = STR2.IndexOf(x, i + 1);
            }
            return ret;

        }

        public static String Task4845(int a, int b)
        {
            if (a < 0 || a >= STR.Length)
            {
                throw new Exception("Значение A должно быть в интервале [0,длина строки)");
            }
            if (b < 0 || b >= STR.Length)
            {
                throw new Exception("Значение B должно быть в интервале [0,длина строки)");
            }
            if (a > b)
            {
                return STR.Substring(b, a - b + 1);
            }
            else
            {
                return STR.Substring(a, b - a + 1);
            }
        }

        public static String Task5728(String a, String b)
        {
            if (!STR.Contains(a))
            {
                throw new Exception("Значение A отсутствует в строке");
            }
            if (!STR.Contains(b))
            {
                throw new Exception("Значение B отсутствует в строке");
            }
            int indexA = STR.IndexOf(a);
            int indexB = STR.IndexOf(b);
            if (indexA < indexB)
            {
                return STR.Substring(indexA + 1, indexB - indexA - 1);
            }
            else {
                return STR.Substring(indexB + 1, indexA - indexB - 1);
            }
        }

        public static bool Task7491(String x)
        {
            return STR.Contains(x);
        }

        public static String Task7222(String code)
        {
            if (code.Length != 13)
            {
                throw new Exception("Некорректная длина штрих-кода");
            }
            String country = code.Substring(0, 2);
            String manufacturer = code.Substring(3, 3);
            String product = code.Substring(7, 4);
            String checksum = code.Substring(12, 1);
            return "Код страны: " + country +
                    "\nКод изготовителя: " + manufacturer +
                    "\nКод товара: " + product +
                    "\nКонтрольное число: " + checksum;
        }

        public static String Task5923(int a, int b)
        {
            if (a < 0 || a >= STR.Length)
            {
                throw new Exception("Значение A должно быть в интервале [0, длина строки)");
            }
            if (b < 0)
            {
                throw new Exception("Значение B должно быть неотрицательно");
            }
            if ((a + b) >= STR.Length)
            {
                throw new Exception("Сумма значений A и B должна быть меньше длины строки");
            }
            return STR.Substring(0, a) + STR.Substring(a + b);
        }

        public static String Task4265(String s)
        {
            if (s.StartsWith("s"))
            {
                return s.ToLower();
            }
            else if (s.StartsWith("U"))
            {
                return s.ToUpper();
            }
            else {
                return s;
            }
        }

        public static String Task2166(String s)
        {
            if (s.Length != 2)
            {
                throw new Exception("Вводимая строка должна содержать ровно 2 символа");
            }
            return STR2.Replace(s, " ");
        }

        public static String Task9116(String s)
        {
            if (!s.StartsWith("\"") || !s.EndsWith("\""))
            {
                throw new Exception("Строка должна начинаться и заканчиваться кавычкой");
            }
            return s.Substring(1, s.Length - 2).Trim();
        }

        public static int Task9925(String s)
        {
            return s.Split(',').Length;
        }

        public static void Task1618(String line)
        {
            Console.WriteLine(line);
            int openIndex;
            int depth = 0;
            int closeIndex;
            int lastIndex = 0;
            while (lastIndex < line.Length)
            {
                closeIndex = line.IndexOf("}", lastIndex);
                openIndex = line.IndexOf("{", lastIndex);
                if (openIndex >= 0 && openIndex < closeIndex)
                {
                    depth++;
                    lastIndex = openIndex;
                }
                if (openIndex >= 0 && closeIndex < 0)
                {
                    depth++;
                    lastIndex = openIndex;
                }
                if (openIndex >= 0 && openIndex > closeIndex && closeIndex >= 0)
                {
                    depth--;
                    lastIndex = closeIndex;
                }
                if (openIndex < 0 && closeIndex >= 0)
                {
                    depth--;
                    lastIndex = closeIndex;
                }
                if (openIndex < 0 && closeIndex < 0)
                {
                    break;
                }
                if (depth < 0)
                {
                    throw new Exception("Неожиданный символ '}'");
                }
                Console.Write(depth);
                lastIndex++;
            }
            if (depth > 0)
            {
                throw new Exception("Неожиданный конец строки");
            }
            Console.WriteLine();
        }


        public static IList<int> Task3657(String a)
        {
            if (a.Length != 1)
            {
                throw new Exception("Нужно ввести ровно один символ");
            }
            String input = "jijjbjjcidihddbjbcjdjhjdjijjahahdhjcfjcghcjgjgbjdcijibgjbajhdbjhjacgbdijjbdjdjhjigjjgigjahbjjihgiccaaijjajjjijjiiidfgfhgbjjdjajjfhdjajffjhbjghjijabfihbgjjibdjbcgjhjjjbdjibjhjccjjjfjicjjjdjdjjjfjhjhjffjjfbfhhfdhjdjibdjgadcajdjdajhjcijghgijjgchdjadjjdgfbibjjaaijfjcjgjdafcjbhabiggigdccjccjghjadaacffjajicfdijfacjcdfjhhigbjhhhjcbhhfcicbadjgjjddbhhfjfhgjjbbgijijcjgjjccdjifcjjcgfjjhcdhcabggfiabchjjfbbdbjjjgfcdiadcfffjjgbdjjdahhjjaijjdjfddhahjabaacdhahafghjaajchjcdjaihijjdcajhdigiaafhjiijgjfhdjijigjchbhdabacijcajjhfjfgjahffjbahfjjdjgiiahjajjdjfggihajjgjffgjjdhajjjjhcjdjbgjjdjbjjaadhdfhdijaijhaijfhibdadibjcjdfbjigjcjhaijfghbfcjfjagchjhcadjbdbbjhjgdhbjjjfjihchjahgjajgaficjjfjjdjhjjdjajaadgfbdccgjhhajicjdahcjjajjgjjjijbijigbjbaihjgiahjfhjbjjajbjcfcjcajjdjcghicdjdjgbcjijfcacjccjijjffdjigjjhjfcdhbbjhgjfhjgajjgjhdiachhjjjdajjidgbigicjdbjjhdgjihdjcjgijjdgfjgjaaghjjgddjhcfddaajjbjbiahijdajjjbfaachjgidgcjjahfdhcabdfjhjjaifhjjbbgjchjicjjcajhbbcjbgjjjabhdgjcggajhhddbgajjfjajfcccifaibagjcbfjaihdhhbdfijjf";
            IList<int> ret = new List<int>();
            int next = input.IndexOf(a);
            while (next >= 0)
            {
                ret.Add(next);
                next = input.IndexOf(a, next + 1);
            }
            return ret;
        }

        public static String Task6599(String s)
        {
            String escaped = s.Replace("[", "\\[").Replace("]", "\\]");
            bool outside = true;
            int next = escaped.IndexOf("\"");
            int current = 0;
            StringBuilder result = new StringBuilder();
            while (next >= 0)
            {
                String part = escaped.Substring(current, next - current);
                result.Append(part);
                if (outside)
                {
                    result.Append("[");
                }
                else
                {
                    result.Append("]");
                }
                outside = !outside;
                current = next + 1;
                next = escaped.IndexOf("\"", current);
            }
            if (current < escaped.Length)
            {
                String part = escaped.Substring(current);
                result.Append(part);
            }
            return result.ToString();
        }

        public static String Task1703(String s)
        {
            int ltSignPos = s.IndexOf("<");
            int ltSignPosEnd = s.LastIndexOf("<");
            int gtSignPos = s.IndexOf(">");
            int gtSignPosEnd = s.LastIndexOf(">");
            int signPos;
            String description;
            if (ltSignPos >= 0)
            {
                if (gtSignPos > 0 || ltSignPosEnd != ltSignPos)
                {
                    throw new Exception("В выражении должен быть только один знак сравнения");
                }
                description = "меньше";
                signPos = ltSignPos;
            }
            else if (gtSignPos >= 0)
            {
                if (gtSignPosEnd != gtSignPos)
                {
                    throw new Exception("В выражении должен быть только один знак сравнения");
                }
                description = "больше";
                signPos = gtSignPos;
            }
            else
            {
                throw new Exception("Отсутствует знак сравнения");
            }
            String var = s.Substring(0, signPos).Trim();
            if (String.IsNullOrEmpty(var))
            {
                throw new Exception("Слева от знака сравнения ожидается переменная");
            }
            if (var.Contains(" "))
            {
                String statement = var.Substring(0, var.LastIndexOf(" "));
                String variable = var.Substring(var.LastIndexOf(" ") + 1);
                throw new Exception("Неожиданное выражение \"" + statement + "\" слева от переменной \"" + variable + "\"");
            }
            String value, special;
            if (s.Substring(signPos + 1).StartsWith("="))
            {
                value = s.Substring(signPos + 2).Trim();
                special = "либо равно числу";
            }
            else
            {
                value = s.Substring(signPos + 1).Trim();
                special = "числа";
            }
            if (String.IsNullOrEmpty(value))
            {
                throw new Exception("Справа от знака сравнения ожидается ограничение");
            }
            if (value.Contains(" "))
            {
                String constraint = value.Substring(0, value.LastIndexOf(" "));
                String statement = value.Substring(value.LastIndexOf(" ") + 1);
                throw new Exception("Неожиданное выражение \"" + statement + "\" слева от переменной \"" + constraint + "\"");
            }
            return String.Format("Значение переменной {0} {1} {2} {3}", var, description, special, value);
        }
    }
}