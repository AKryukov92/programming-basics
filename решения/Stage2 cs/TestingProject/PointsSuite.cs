using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CodeProject;

namespace TestingProject
{
    [TestClass]
    public class PointsSuite
    {
        [TestMethod]
        public void DistanceBetweenIntsTest()
        {
            Assert.AreEqual(3.6056, Point.DistanceBetween(1, 1, 3, 4), 0.0001);
            Assert.AreEqual(17.2046, Point.DistanceBetween(-2, 4, 8, -10), 0.0001);
            Assert.AreEqual(8.6023, Point.DistanceBetween(0, 0, -5, -7), 0.0001);
            Assert.AreEqual(0, Point.DistanceBetween(0, 0, 0, 0), 0.0001);
            Assert.AreEqual(12.3693, Point.DistanceBetween(-1, -3, 2, 9), 0.0001);
        }

        [TestMethod]
        public void DistanceBetweenPointsTest()
        {
            Point src, dest;
            src = new Point(1, 1);
            dest = new Point(3, 4);
            Assert.AreEqual(3.6056, Point.DistanceBetween(src, dest), 0.0001);
            src.SetCoordinates(-2, 4);
            dest.SetCoordinates(8, -10);
            Assert.AreEqual(17.2046, Point.DistanceBetween(src, dest), 0.0001);
            src.SetCoordinates(0, 0);
            dest.SetCoordinates(-5, -7);
            Assert.AreEqual(8.6023, Point.DistanceBetween(src, dest), 0.0001);
            src.SetCoordinates(0, 0);
            dest.SetCoordinates(0, 0);
            Assert.AreEqual(0, Point.DistanceBetween(src, dest), 0.0001);
            src.SetCoordinates(-1, -3);
            dest.SetCoordinates(2, 9);
            Assert.AreEqual(12.3693, Point.DistanceBetween(src, dest), 0.0001);
        }

        [TestMethod]
        public void DistanceToIntsTest()
        {
            Point src = new Point(1, 1);
            Assert.AreEqual(3.6056, src.DistanceTo(3, 4), 0.0001);
            src.SetCoordinates(-2, 4);
            Assert.AreEqual(17.2046, src.DistanceTo(8, -10), 0.0001);
            src.SetCoordinates(0, 0);
            Assert.AreEqual(8.6023, src.DistanceTo(-5, -7), 0.0001);
            Assert.AreEqual(0, src.DistanceTo(0, 0), 0.0001);
            src.SetCoordinates(-1, -3);
            Assert.AreEqual(12.3693, src.DistanceTo(2, 9), 0.0001);
        }

        [TestMethod]
        public void DistanceToPointTest()
        {
            Point src, dest;
            src = new Point(1, 1);
            dest = new Point(3, 4);
            Assert.AreEqual(3.6056, src.DistanceTo(dest), 0.0001);
            src.SetCoordinates(-2, 4);
            dest.SetCoordinates(8, -10);
            Assert.AreEqual(17.2046, src.DistanceTo(dest), 0.0001);
            src.SetCoordinates(0, 0);
            dest.SetCoordinates(-5, -7);
            Assert.AreEqual(8.6023, src.DistanceTo(dest), 0.0001);
            dest.SetCoordinates(0, 0);
            Assert.AreEqual(0, src.DistanceTo(dest), 0.0001);
            src.SetCoordinates(-1, -3);
            dest.SetCoordinates(2, 9);
            Assert.AreEqual(12.3693, src.DistanceTo(dest), 0.0001);
        }

        [TestMethod]
        public void PointEqualsItself()
        {
            Point p = new Point(0, 0);
            Assert.IsTrue(p.Equals(p));
        }
        [TestMethod]
        public void PointInstanceComparison()
        {
            Point a1, a2, b1, b2, b3, b4, b5, b6, b7;
            a1 = new Point(10, 15); a1.SetColor("red");
            a2 = new Point(10, 15); a2.SetColor("red");
            b1 = new Point(0, 0); b1.SetColor("green");
            b2 = new Point(10, 3); b2.SetColor("green");
            b3 = new Point(1, 15); b3.SetColor("green");
            b4 = new Point(5, 7); b4.SetColor("red");
            b5 = new Point(10, 15); b5.SetColor("green");
            b6 = new Point(10, 3); b6.SetColor("red");
            b7 = new Point(2, 15); b7.SetColor("red");
            Point[] arrA = new Point[] { a1, a2 };
            Point[] arrB = new Point[] { b1, b2, b3, b4, b5, b6, b7 };
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
