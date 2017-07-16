using Methods;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace task8787
{
    class Lab15Task8787
    {
        static void Main(string[] args)
        {
            Step7991();
            Step2321();
            Step5053();
            Step8418();
        }

        private static void Step7991() {
            Console.WriteLine();
            Console.WriteLine("7991");
            double[] in7991x = { 6.35, 4.71, 19.99, -2.28 };
            double[] in7991y = { 2.7, 2.59, -1.57, 16.92 };
            double[] in7991z = { 5.08, -18.55, 2.75, 6.14 };
            for (int i = 0; i < in7991x.Length; i++)
            {
                IList<double> result = Lab05.task7991(in7991x[i], in7991y[i], in7991z[i]);
                Console.WriteLine(String.Join(" ", result));
            }
        }

        private static void Step2321()
        {
            Console.WriteLine();
            Console.WriteLine("2321");
            Console.WriteLine(String.Join(" ", Lab06.task2321(8, 13)));
            Console.WriteLine(String.Join(" ", Lab06.task2321(691, 702)));
            Console.WriteLine(String.Join(" ", Lab06.task2321(23, 11)));
}

        private static void Step5053()
        {
            Console.WriteLine();
            Console.WriteLine("5053");
            Console.WriteLine(String.Join(" ", Lab06.task5053(8, 13)));
            Console.WriteLine(String.Join(" ", Lab06.task5053(691, 702)));
            Console.WriteLine(String.Join(" ", Lab06.task5053(27, 17)));
        }

        private static void Step8418()
        {
            Console.WriteLine();
            Console.WriteLine("8418");
            int[] in8418 = { 6, 385, -9 };
            for (int i = 0; i < in8418.Length; i++)
            {
                try
                {
                    var result = Lab06.task8418(in8418[i]);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step9279()
        {
            Console.WriteLine();
            Console.WriteLine("9279");
            String[] in9279 = { "ab", "bc", "ac", "xz", "cde", "a" };
            for (int i = 0; i < in9279.Length; i++)
            {
                try
                {
                    StringBuilder sb = new StringBuilder();
                    IList<int> result = Lab07.task9279(in9279[i]);
                    foreach (int item in result)
                    {
                        sb.Append(item);
                        sb.Append(" ");
                    }
                    Console.WriteLine(sb.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step1223()
        {
            Console.WriteLine();
            Console.WriteLine("1223");
            String[] in1223 = {
                "1 2 3 4 1",
                "1 2 3 4 1 2 3 4 1 2",
                ""};
            for (int i = 0; i < in1223.Length; i++)
            {
                var result = String.Join(" ", Lab08.task1223(in1223[i]));
                Console.WriteLine(result);
            }

            Console.WriteLine();
            Console.WriteLine("1223");

            String[] in1223t1 = { "1", "2", "3", "4", "1" };
            Lab08.task1223(in1223t1);
            Console.WriteLine(String.Join(" ", in1223t1));

            String[] in1223t2 = { "1", "2", "3", "4", "1", "2", "3", "4", "1", "2" };
            Lab08.task1223(in1223t2);
            Console.WriteLine(String.Join(" ", in1223t2));

            String[] in1223t3 = { };
            Lab08.task1223(in1223t3);
            Console.WriteLine(String.Join(" ", in1223t3));
        }

        private static void Step3940()
        {
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
                    var result = Lab08.task3940(in3940l[i], in3940r[i]);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step8311()
        {
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
                    var result = Lab08.task8311(in8311b[i], in8311e[i], in8311data[i]);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step3134()
        {
            Console.WriteLine();
            Console.WriteLine("3134");
            int[] in3134p = { 0, 2, 4, -1, 2, 19, 1 };
            int[] in3134q = { 3, 5, 2, 5, 17, 2, -5 };
            String in3134data = "1 2 3 4 1 2";
            for (int i = 0; i < in3134p.Length; i++)
            {
                try
                {
                    var result = Lab08.task3134(in3134p[i], in3134q[i], in3134data);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step9774()
        {
            Console.WriteLine();
            Console.WriteLine("9774");
            int[] in9774m = { 31, -3 };
            String in9774data = "1 2 3 4 1 2";
            for (int i = 0; i < in9774m.Length; i++)
            {
                var result = Lab08.task9774(in9774m[i], in9774data);
                Console.WriteLine(String.Join(" ", result));
            }
        }

        private static void Step9711()
        {
            Console.WriteLine();
            Console.WriteLine("9711");
            String[] in9711 = {
                "1 2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 4",
                ""};
            for (int i = 0; i < in9711.Length; i++)
            {
                var result = Lab08.task9711(in9711[i]);
                Console.WriteLine(String.Join(" ", result));
            }
        }

        private static void Step3333()
        {
            Console.WriteLine();
            Console.WriteLine("3333");
            int[] in3333s = { 1, 3, 6, 8, 99, -2, -9 };
            String in3333data = "1 2 3 4 1 2";
            for (int i = 0; i < in3333s.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<int> result = Lab08.task3333(in3333s[i], in3333data);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        private static void Step9271()
        {
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
                IList<int> result = Lab08.task9271(in9271[i]);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        private static void Step4497()
        {
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
                IList<int> result = Lab08.task4497(in4497x[i], in4497y[i], in4497data);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        private static void Step8820()
        {
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
                IList<string> result = Lab08.task8820(in8820[i]);
                foreach (string item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        private static void Step3218()
        {
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
                IList<int> result = Lab08.task3218(in3218[i]);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        private static void Step7703()
        {
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
                IList<int> result = Lab08.task7703(in7703[i]);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }
    }
}
