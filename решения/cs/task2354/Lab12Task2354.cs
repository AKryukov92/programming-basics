using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Methods;

namespace tfa
{
    class Lab12Task2354
    {
        static void Main(string[] args)
        {
            Step4411();
            Step8428();
            Step1262();
            Step2790();
            Step9164();

            Step5789();
            Step5980();
            Step8174();
            Step5662();
            Step3770();

            Step9562();
            Step6580();
            Step8731();
            Step4082();
            Step3669();

            Step5969();
            Step4265();
            Step3946();
            Step4283();
            Step9182();

            Step5063();
            Step7711();
            Step3832();
            Step5895();
            Step7457();

            Step9865();
            Step3558();
            Step4366();
            Step9925();
        }

        static void Step4411()
        {
            Console.WriteLine();
            Console.WriteLine("4411");
            double r = Lab02.Task4411(11.13);
            Console.WriteLine("{0:F15} ({1:F15})", r, 18.13);
            r = Lab02.Task4411(-7919);
            Console.WriteLine("{0:F15} ({1:F15})", r, -7912);
            r = Lab02.Task4411(0);
            Console.WriteLine("{0:F15} ({1:F15})", r, 7);
        }

        static void Step8428()
        {
            Console.WriteLine();
            Console.WriteLine("8428");
            double r = Lab02.Task8428(45);
            Console.WriteLine("{0:F6} ({1:F6})", r, 0.7854);
            r = Lab02.Task8428(1125);
            Console.WriteLine("{0:F6} ({1:F6})", r, 19.6350);
            Console.WriteLine("{0:F6} ({0})", Lab02.Task8428(0), 0);
            r = Lab02.Task8428(360);
            Console.WriteLine("{0:F6} ({1:F6})", r, 6.2832);
            r = Lab02.Task8428(90);
            Console.WriteLine("{0:F6} ({1:F6})", r, 1.5708);
            r = Lab02.Task8428(2000);
            Console.WriteLine("{0:F6} ({1:F6})", r, 34.9066);
        }

        static void Step1262()
        {
            Console.WriteLine();
            Console.WriteLine("1262");
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task1262(7583), 4.6025);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task1262(200), -4.6985);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task1262(360), 5);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task1262(90), 0);
        }

        static void Step2790()
        {
            Console.WriteLine();
            Console.WriteLine("2790");
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task2790(6997), 0.9205);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task2790(31), 0.8572);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task2790(0), 1.0000);
        }

        static void Step9164()
        {
            Console.WriteLine();
            Console.WriteLine("9164");
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task9164(90, 90), 0.0);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task9164(90, 0) , 1.0);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task9164(7559, 7549), -0.2079);
        }

        static void Step5789()
        {
            Console.WriteLine();
            Console.WriteLine("5789");
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task5789(1, 1, 3, 4), 3.6055);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task5789(-2, 4, 8, -10), 17.2046);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task5789(0, 0, -5, -7), 8.6023);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task5789(0, 0, 0, 0), 0);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task5789(-1, -3, 2, 9), 12.3693);
        }

        static void Step5980()
        {
            Console.WriteLine();
            Console.WriteLine("5980");
            Console.WriteLine("{0} ({1})", Lab05.Task5980(9), 3.0);
            Console.WriteLine("{0} ({1})", Lab05.Task5980(0), 0.0);
            Console.WriteLine("{0} ({1})", Lab05.Task5980(-7), 49.0);
        }

        static void Step8174()
        {
            Console.WriteLine();
            Console.WriteLine("8174");
            Console.WriteLine("{0} ({1})", Lab05.Task8174(-5), 5);
            Console.WriteLine("{0} ({1})", Lab05.Task8174(-11), 11);
            Console.WriteLine("{0} ({1})", Lab05.Task8174(7), 7);
            Console.WriteLine("{0} ({1})", Lab05.Task8174(13), 13);
            Console.WriteLine("{0} ({1})", Lab05.Task8174(0), 0);
        }

        static void Step5662()
        {
            Console.WriteLine();
            Console.WriteLine("5662");
            Console.WriteLine(Lab05.Task5662(1, 2, 3));
            Console.WriteLine(Lab05.Task5662(11, 13, 19));
            Console.WriteLine(Lab05.Task5662(3, 17, 5));
            Console.WriteLine(Lab05.Task5662(5, 31, 29));
            Console.WriteLine(Lab05.Task5662(3, 6, 3));
            Console.WriteLine(Lab05.Task5662(1, 2, 1));
            Console.WriteLine(Lab05.Task5662(0, 7, 13));
        }

        static void Step3770()
        {
            Console.WriteLine();
            Console.WriteLine("3770");
            Console.WriteLine("{0} ({1})", Lab05.Task3770(1, 2, 3), 3);
            Console.WriteLine("{0} ({1})", Lab05.Task3770(7, 4, -2), 7);
            Console.WriteLine("{0} ({1})", Lab05.Task3770(0, 5, -7), 5);
        }

        static void Step9562()
        {
            Console.WriteLine();
            Console.WriteLine("9562");
            Console.WriteLine("{0} ({1})", Lab06.Task9562(15, 27), 273);
            Console.WriteLine("{0} ({1})", Lab06.Task9562(13, 2), 90);
            Console.WriteLine("{0} ({1})", Lab06.Task9562(25, 44), 690);
            Console.WriteLine("{0} ({1})", Lab06.Task9562(80, 100), 1890);
            Console.WriteLine("{0} ({1})", Lab06.Task9562(3000, 24), 4501224);
        }

        static void Step3669()
        {
            Console.WriteLine();
            Console.WriteLine("3669");
            Console.WriteLine("{0} ({1})", Lab06.Task3669(8, 13), 1235520);
            Console.WriteLine("{0} ({1})", Lab06.Task3669(159, 161), 4095840);
            Console.WriteLine("{0} ({1})", Lab06.Task3669(648, 648), 648);
            Console.WriteLine("{0} ({1})", Lab06.Task3669(-2, 600), 0);
            Console.WriteLine("{0} ({1})", Lab06.Task3669(35, 24), 399703747322880000);
        }

        static void Step8731()
        {
            Console.WriteLine();
            Console.WriteLine("8731");
            String[] in8731 = {
                "501 501",
                "0 0 1001",
                "400 400 200 1",
                "190 190 190 190 190 190 190 190 190 190 190",
                "130 130 130 130 130 130 130 130 130 130 130",
                "129 179 89 155 188 163 94 66"};
            int[] out8731 = { 2, 3, 4, 6, 8, 8 };
            for (int i = 0; i < in8731.Length; i++)
            {
                int result = Lab06.Task8731(in8731[i]);
                Console.WriteLine("{0} ({1})", result, out8731[i]);
            }
        }

        static void Step4082()
        {
            Console.WriteLine();
            Console.WriteLine("4082");
            String[] in4082 = {
                "10 20 100",
                "300 400 100",
                "1000 1000 83 150",
                "1 1 1 1 1 1 1 1 199 90"
            };
            String[] out4082 = {
                "Количество слева: 2, количество справа: 0",
                "Количество слева: 0, количество справа: 2",
                "Количество слева: 1, количество справа: 2",
                "Количество слева: 8, количество справа: 1"};
            for (int i = 0; i < in4082.Length; i++)
            {
                String result = Lab06.Task4082(in4082[i]);
                Console.WriteLine(result);
                Console.WriteLine(out4082[i]);
                Console.WriteLine();
            }
        }

        static void Step6580()
        {
            Console.WriteLine();
            Console.WriteLine("6580");
            Console.WriteLine("{0} ({1})", Lab06.Task6580(15, 27), 5915);
            Console.WriteLine("{0} ({1})", Lab06.Task6580(25, 44), 24470);
            Console.WriteLine("{0} ({1})", Lab06.Task6580(80, 100), 170870);
            Console.WriteLine("{0} ({1})", Lab06.Task6580(3000, 24), 9004496176);
        }

        static void Step5969()
        {
            Console.WriteLine();
            Console.WriteLine("5969");
            Console.WriteLine("{0} ({1})", Lab06.Task5969(8, 13), 0);
            Console.WriteLine("{0} ({1})", Lab06.Task5969(25, 44), 105);
            Console.WriteLine("{0} ({1})", Lab06.Task5969(80, 100), 273);
            Console.WriteLine("{0} ({1})", Lab06.Task5969(3000, 24), 642600);
        }

        static void Step4265()
        {
            Console.WriteLine();
            Console.WriteLine("4265");
            Console.WriteLine(Lab08.Task4265("sABCD"));
            Console.WriteLine(Lab08.Task4265("Uxyz"));
            Console.WriteLine(Lab08.Task4265("s"));
            Console.WriteLine(Lab08.Task4265("F123"));
            Console.WriteLine(Lab08.Task4265("Sopqr"));
        }

        static void Step3946()
        {
            Console.WriteLine();
            Console.WriteLine("3946");
            String[] in3946 = {
                "1 2 3 4 1",
                "1 2 3 4 1 3 4 4 4 4",
                ""};
            double[] out3946 = { 2.2, 3, 0 };
            for (int i = 0; i < in3946.Length; i++)
            {
                double result = Lab07.Task3946(in3946[i]);
                Console.WriteLine("{0:F6} ({0:F6})", result, out3946[i]);
            }
        }

        static void Step4283()
        {
            Console.WriteLine();
            Console.WriteLine("4283");
            int[] in4283k = { 3, 5, 2, 1 };
            String[] in4283s = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3",
                "3 2 2 2 2 2",
                "4 4 4 4 4 4"};
            int[] out4283 = { 1, 0, 5, 0 };
            for (int i = 0; i < in4283k.Length; i++)
            {
                int result = Lab07.Task4283(in4283k[i], in4283s[i]);
                Console.WriteLine("{0} ({1})", result, out4283[i]);
            }
        }

        static void Step9182()
        {
            Console.WriteLine();
            Console.WriteLine("9182");
            String[] in9182 = {
                "1 2 3 4 5 6",
                "1 2 3 1 2 6",
                "1 1 1 1 1 1"};
            int[] out9182 = { 6, 4, 1 };
            for (int i = 0; i < out9182.Length; i++)
            {
                int result = Lab07.Task9182(in9182[i]);
                Console.WriteLine("{0} ({1})", result, out9182[i]);
            }
        }

        static void Step5063()
        {
            Console.WriteLine();
            Console.WriteLine("5063");
            Console.WriteLine("{0} ({1})", Lab02.Task5063(365), 5);
            Console.WriteLine("{0} ({1})", Lab02.Task5063(45), 45);
            Console.WriteLine("{0} ({1})", Lab02.Task5063(1125), 45);
            Console.WriteLine("{0} ({1})", Lab02.Task5063(1500), 60);
            Console.WriteLine("{0} ({1})", Lab02.Task5063(2000), 200);
            Console.WriteLine("{0} ({1})", Lab02.Task5063(0), 0);
            Console.WriteLine("{0} ({1})", Lab02.Task5063(360), 0);
        }

        static void Step7711()
        {
            Console.WriteLine();
            Console.WriteLine("7711");
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task7711(45), 0.7071);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task7711(1125), 0.7071);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task7711(7639), 0.9816);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task7711(360), 0.0000);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task7711(90), 1.0000);
        }

        static void Step3832()
        {
            Console.WriteLine();
            Console.WriteLine("3832");
            Console.WriteLine("{0} ({1})", Lab02.Task3832(7451, 7433, 7417), 165777911);
            Console.WriteLine("{0} ({1})", Lab02.Task3832(3, 7, 11), 131);
            Console.WriteLine("{0} ({1})", Lab02.Task3832(-2, -2029, 0), 4058);
        }

        static void Step5895()
        {
            Console.WriteLine();
            Console.WriteLine("5895");
            double result5895 = Lab02.Task5895(7109, 7103, 7079);
            Console.WriteLine("{0:F6} ({1:F6})", result5895, 12369.4955);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task5895(3, 7, 13), 4.1324);
        }

        static void Step7457()
        {
            Console.WriteLine();
            Console.WriteLine("7457");
            Console.WriteLine("{0} ({1})", Lab02.Task7457(6883), 331609180);
            Console.WriteLine("{0} ({1})", Lab02.Task7457(-6871), 330495106);
            Console.WriteLine("{0} ({1})", Lab02.Task7457(0), 6);
        }

        static void Step9865()
        {
            Console.WriteLine();
            Console.WriteLine("9865");
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task9865(6869), 566245999.0000);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task9865(-6863), 565161171.0000);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task9865(0), -16.0000);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task9865(-1.482634), 0.0000);
        }

        static void Step3558()
        {
            Console.WriteLine();
            Console.WriteLine("3558");
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task3558(45, 90), 0.0);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task3558(200, 45), -1.3636);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task3558(7523, 7517), 1.8148);
        }

        static void Step4366()
        {
            Console.WriteLine();
            Console.WriteLine("4366");
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task4366(7459, 7457), 10547.2048);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task4366(-3, -7), 7.6158);
            Console.WriteLine("{0:F6} ({1:F6})", Lab02.Task4366(0, 0), 0.0);
        }

        static void Step9925()
        {
            Console.WriteLine();
            Console.WriteLine("9925");
            int result9925 = Lab08.Task9925("один, два, три, четыре, пять");
            Console.WriteLine("{0} ({1})", result9925, 5);
            Console.WriteLine("{0} ({1})", Lab08.Task9925("янв,фев,март"), 3);
            Console.WriteLine("{0} ({1})", Lab08.Task9925("один"), 1);
        }
    }
}
