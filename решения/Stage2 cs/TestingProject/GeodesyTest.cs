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
    public class GeodesyTest
    {
        public void task4913()
        {
            Methods.ForwardTask(new Point(1, 1), new Direction(5, 30));
            Methods.ForwardTask(new Point(7, 11), new Direction(13, 110));
            Methods.ForwardTask(new Point(17, 19), new Direction(23, 230));
            Methods.ForwardTask(new Point(29, 31), new Direction(3, 290));
            Methods.ForwardTask(new Point(33, 37), new Direction(10, 90));
            Methods.ForwardTask(new Point(33, 37), new Direction(10, 180));
            Methods.ForwardTask(new Point(33, 37), new Direction(10, 270));
            Methods.ForwardTask(new Point(33, 37), new Direction(10, 360));
            Methods.ForwardTask(new Point(1, 1), new Direction(10, 0));
            Methods.ForwardTask(new Point(1, 1), new Direction(-5, 45));
            Methods.ForwardTask(new Point(1, 1), new Direction(0, 45));
            Methods.ForwardTask(new Point(1, 1), new Direction(10, -5));
        }

        [TestMethod]
        public void task3864()
        {
            Methods.BackwardTask(new Point(10, 10), new Point(13, 14));
            Methods.BackwardTask(new Point(24, 4), new Point(3, 17));
            Methods.BackwardTask(new Point(23, 25), new Point(12, 16));
            Methods.BackwardTask(new Point(3, 11), new Point(13, 5));
            Methods.BackwardTask(new Point(5, 5), new Point(5, 10));
            Methods.BackwardTask(new Point(10, 5), new Point(5, 5));
            Methods.BackwardTask(new Point(5, 10), new Point(5, 5));
            Methods.BackwardTask(new Point(5, 5), new Point(10, 5));
        }

        [TestMethod]
        public void rumbNE()
        {
            Point src = new Point(1, 1);
            Point dest = new Point(4, 5);

            Direction dir = Methods.BackwardTask(src, dest);
            Point dest1 = Methods.ForwardTask(src, dir);
            Assert.AreEqual(dest.GetX(), dest1.GetX(), 0.0001);
            Assert.AreEqual(dest.GetY(), dest1.GetY(), 0.0001);
        }

        [TestMethod]
        public void rumbSE()
        {
            Point src = new Point(1, 5);
            Point dest = new Point(4, 1);

            Direction dir = Methods.BackwardTask(src, dest);
            Point dest1 = Methods.ForwardTask(src, dir);
            Assert.AreEqual(dest.GetX(), dest1.GetX(), 0.0001);
            Assert.AreEqual(dest.GetY(), dest1.GetY(), 0.0001);
        }

        [TestMethod]
        public void rumbSW()
        {
            Point src = new Point(4, 5);
            Point dest = new Point(1, 1);

            Direction dir = Methods.BackwardTask(src, dest);
            Point dest1 = Methods.ForwardTask(src, dir);
            Assert.AreEqual(dest.GetX(), dest1.GetX(), 0.0001);
            Assert.AreEqual(dest.GetY(), dest1.GetY(), 0.0001);
        }

        [TestMethod]
        public void rumbNW()
        {
            Point src = new Point(4, 1);
            Point dest = new Point(1, 5);

            Direction dir = Methods.BackwardTask(src, dest);
            Point dest1 = Methods.ForwardTask(src, dir);
            Assert.AreEqual(dest.GetX(), dest1.GetX(), 0.0001);
            Assert.AreEqual(dest.GetY(), dest1.GetY(), 0.0001);
        }

        [TestMethod]
        public void rumbN()
        {
            Point src = new Point(1, 1);
            Point dest = new Point(1, 6);

            Direction direction = Methods.BackwardTask(src, dest);
            Point actual = Methods.ForwardTask(src, direction);
            Assert.AreEqual(dest.GetX(), actual.GetX(), 0.0001);
            Assert.AreEqual(dest.GetY(), actual.GetY(), 0.0001);
        }

        [TestMethod]
        public void rumbE()
        {
            Point src = new Point(1, 1);
            Point dest = new Point(6, 1);

            Direction direction = Methods.BackwardTask(src, dest);
            Point actual = Methods.ForwardTask(src, direction);
            Assert.AreEqual(dest.GetX(), actual.GetX(), 0.0001);
            Assert.AreEqual(dest.GetY(), actual.GetY(), 0.0001);
        }

        [TestMethod]
        public void rumbS()
        {
            Point src = new Point(1, 6);
            Point dest = new Point(1, 1);

            Direction direction = Methods.BackwardTask(src, dest);
            Point actual = Methods.ForwardTask(src, direction);
            Assert.AreEqual(dest.GetX(), actual.GetX(), 0.0001);
            Assert.AreEqual(dest.GetY(), actual.GetY(), 0.0001);
        }

        [TestMethod]
        public void rumbW()
        {
            Point src = new Point(6, 1);
            Point dest = new Point(1, 1);

            Direction direction = Methods.BackwardTask(src, dest);
            Point actual = Methods.ForwardTask(src, direction);
            Assert.AreEqual(dest.GetX(), actual.GetX(), 0.0001);
            Assert.AreEqual(dest.GetY(), actual.GetY(), 0.0001);
        }
    }
}
