using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit2
{
    public class Task39
    {
        public void task39()
        {
            string temp;
            int h, m, s;
            temp = Console.ReadLine();
            h = int.Parse(temp);
            if (h < 0 || h > 23)
            {
                Console.WriteLine("H должно быть в диапазоне от 0 до 23 включительно");
                return;
            }
            temp = Console.ReadLine();
            m = int.Parse(temp);
            if (m < 0 || m > 59)
            {
                Console.WriteLine("M должно быть в диапазоне от 0 до 59 включительно");
                return;
            }
            temp = Console.ReadLine();
            s = int.Parse(temp);
            if (s < 0 || s > 59)
            {
                Console.WriteLine("M должно быть в диапазоне от 0 до 59 включительно");
                return;
            }
            double hAngle, mAngle, sAngle;
            hAngle = 360d / 12d * (h % 12);
            mAngle = 360d / 12d / 60d * m;
            sAngle = 360d / 12d / 60d / 60d * s;
            double angle = hAngle + mAngle + sAngle;
            Console.WriteLine("{0:F4}", angle);
        }
    }
}
