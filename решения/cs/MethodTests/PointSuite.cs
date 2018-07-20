using Classes.Task5449;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodTests
{
    [TestClass]
    public class PointSuite
    {
        [TestMethod]
        public void PointEqualsItself()
        {
            Point p = new Point(3, 5);
            Assert.IsTrue(p.Equals(p));
        }

        [TestMethod]
        public void PointInstanceComparison()
        {
            Point a1 = new Point(10, 15),
                a2 = new Point(10, 15),
                b1 = new Point(10, 3),
                b2 = new Point(1, 15),
                b3 = new Point(0, 0);
            Point[] arrA = { a1, a2 };
            Point[] arrB = { b1, b2, b3 };
            Assert.IsTrue(a1.Equals(a2));
            Assert.IsTrue(a2.Equals(a1));
            foreach (Point a in arrA)
            {
                foreach (Point b in arrB)
                {
                    Assert.IsFalse(a.Equals(b));
                    Assert.IsFalse(b.Equals(a));
                }
            }
        }

        [TestMethod]
        public void PointNotEqualNull()
        {
            Point p = new Point(0, 0);
            Assert.IsFalse(p.Equals(null));
        }

        [TestMethod]
        public void PointNotEqualOtherClass()
        {
            Point p = new Point(0, 0);
            Assert.IsFalse(p.Equals("not a point"));
        }

    }
}
