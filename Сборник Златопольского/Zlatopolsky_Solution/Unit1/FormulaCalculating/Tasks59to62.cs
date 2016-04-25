using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1.FormulaCalculating
{
    public class Tasks59to62
    {
        public void task1_59()
        {
            int a = 3, b = 5, t;
            t = a;
            a = b;
            b = t;
        }

        public void task1_60a()
        {
            int a = 3, b = 5, c = 7;
            int t;
            t = c;
            c = a;
            a = b;
            b = t;
        }

        public void task1_60b()
        {
            int a = 3, b = 6, c = 7;
            int t;
            t = a;
            a = c;
            b = a;
            c = t;
        }

        public void task1_61a()
        {
            int a = 3;
            int r;
            r = a * a;
            r = r * r;
        }
    }
}
