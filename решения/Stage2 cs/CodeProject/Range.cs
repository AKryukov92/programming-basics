using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject
{
    public class Range
    {
        private int from;
        private int to;

        public Range(int from, int to)
        {
            if (to < from)
            {
                throw new ArgumentException("Значение A должно быть меньше значения B");
            }
            this.from = from;
            this.to = to;
        }

        public void Init(int from, int to)
        {
            if (to < from)
            {
                throw new ArgumentException("Значение A должно быть меньше значения B");
            }
            this.from = from;
            this.to = to;
        }

        public static bool HasIntersection(int leftA, int leftB, int rightA, int rightB)
        {
            if (leftA < 0)
            {
                throw new Exception("Значение A должно быть неотрицательным");
            }
            if (leftB < 0)
            {
                throw new Exception("Значение B должно быть неотрицательным");
            }
            if (rightA < 0)
            {
                throw new Exception("Значение C должно быть неотрицательным");
            }
            if (rightB < 0)
            {
                throw new Exception("Значение D должно быть неотрицательным");
            }
            if (leftB < leftA || rightB < rightA)
            {
                throw new ArgumentException("Значение A должно быть меньше значения B");
            }
            return leftA < rightA && rightA < leftB || rightA < leftA && leftA < rightB;
        }

        public static bool HasIntersection(Range left, Range right)
        {
            return HasIntersection(left.from, left.to, right.from, right.to);
        }

        public bool Intersects(int rightA, int rightB)
        {
            if (this.to < this.from)
            {
                throw new InvalidOperationException("Значение A должно быть меньше значения B");
            }
            return HasIntersection(this.from, this.to, rightA, rightB);
        }

        public bool Intersects(Range right)
        {
            if (this.to < this.from)
            {
                throw new InvalidOperationException("Значение A должно быть меньше значения B");
            }
            return HasIntersection(this.from, this.to, right.from, right.to);
        }

        public void Shift(int d)
        {
            this.from += d;
            this.to += d;
        }

        public void Squeeze(int d)
        {
            if (d > this.to - this.from)
            {
                throw new ArgumentException("Невозможно сжать интервал на указанную величину");
            }
            this.to -= d;
        }

        public override bool Equals(object other)
        {
            if (other == null) return false;
            if (this == other) return true;
            if (GetType() != other.GetType()) return false;
            Range range = (Range)other;
            if (from == range.from && to == range.to) return true;
            return false;
        }

        public override string ToString()
        {
            return String.Format("[{0};{1}]", from, to);
        }
    }
}