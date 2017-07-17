﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task7297
{
    public class Interval
    {
        public int a;
        public int b;
        public bool contains(int t)
        {
            if (a > b)
            {
                throw new InvalidOperationException("Корректность интервала была нарушена");
            }
            return a < t && t < b;
        }
    }
}
