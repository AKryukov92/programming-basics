using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Methods;

namespace MethodTests
{
    [TestClass]
    public class Lab12Suite
    {
        [TestMethod]
        public void Task4411test()
        {
            Assert.AreEqual(18.13, Lab02.Task4411(11.13), 0.0001);
            Assert.AreEqual(-7912, Lab02.Task4411(-7919), 0.0001);
            Assert.AreEqual(7, Lab02.Task4411(0), 0.0001);
        }

        [TestMethod]
        public void Task2790Test()
        {
            Assert.AreEqual(0.9205, Lab02.Task2790(6997), 0.0001);
            Assert.AreEqual(0.8572, Lab02.Task2790(31), 0.0001);
            Assert.AreEqual(0, Lab02.Task2790(90), 0.0001);
            Assert.AreEqual(1, Lab02.Task2790(0), 0.0001);
            Assert.AreEqual(1, Lab02.Task2790(180), 0.0001);
        }

        [TestMethod]
        public void Task5662Test()
        {
            Assert.AreEqual("Вещественных корней уравнения 1x^2 + 2x + 3 = 0 нет", Lab05.Task5662(1, 2, 3));
            Assert.AreEqual("Вещественных корней уравнения 11x^2 + 13x + 19 = 0 нет", Lab05.Task5662(11, 13, 19));
            Assert.AreEqual("У уравнения 3x^2 + 17x + 5 = 0 два вещественных корня", Lab05.Task5662(3, 17, 5));
            Assert.AreEqual("У уравнения 5x^2 + 31x + 29 = 0 два вещественных корня", Lab05.Task5662(5, 31, 29));
            Assert.AreEqual("Уравнение 3x^2 + 6x + 3 = 0 имеет один корень", Lab05.Task5662(3, 6, 3));
            Assert.AreEqual("Уравнение 1x^2 + 2x + 1 = 0 имеет один корень", Lab05.Task5662(1, 2, 1));
            Assert.AreEqual("Данное уравнение не является квадратным", Lab05.Task5662(0, 7, 13));
        }

        [TestMethod]
        public void Task3669Test()
        {
            Assert.AreEqual(1235520, Lab06.Task3669(8, 13));
            Assert.AreEqual(1235520, Lab06.Task3669(13, 8));
            Assert.AreEqual(4095840, Lab06.Task3669(159, 161));
            Assert.AreEqual(648, Lab06.Task3669(648, 648));
            Assert.AreEqual(0, Lab06.Task3669(-2, 600));
            Assert.AreEqual(399703747322880000, Lab06.Task3669(35, 24));
        }

        [TestMethod]
        public void Task1292Test()
        {
            Assert.AreEqual("a", Lab07.Task1292('a'));
            Assert.AreEqual("ab", Lab07.Task1292('b'));
            Assert.AreEqual("abcd", Lab07.Task1292('d'));
            Assert.AreEqual("abcdefgh", Lab07.Task1292('h'));
            Assert.AreEqual("abcdefgh", Lab07.Task1292('i'));
        }

        [TestMethod]
        public void Task3946Test()
        {
            Assert.AreEqual(2.2, Lab07.Task3946(new int[] { 1, 2, 3, 4, 1 }));
            Assert.AreEqual(3, Lab07.Task3946(new int[] { 1, 2, 3, 4, 1, 3, 4, 4, 4, 4 }));
            Assert.AreEqual(0, Lab07.Task3946(new int[] { }));
        }

        [TestMethod]
        public void Task4283Test()
        {
            Assert.AreEqual(1, Lab07.Task4283(3, new int[] { 1, 2, 3, 4, 1, 2 }));
            Assert.AreEqual(0, Lab07.Task4283(5, new int[] { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3 }));
            Assert.AreEqual(5, Lab07.Task4283(2, new int[] { 3, 2, 2, 2, 2, 2 }));
            Assert.AreEqual(0, Lab07.Task4283(1, new int[] { 4, 4, 4, 4, 4, 4 }));
        }

        [TestMethod]
        public void Task6497Test()
        {
            CollectionAssert.AreEqual(
                new double[] { 4.6250, 3.6250, 4.6250, 3.3750, 3.3750, 0.6250, 3.3750, 3.3750 },
                Lab07.Task6497(new int[] { 9, 8, 9, 1, 1, 5, 1, 1 })
                );
            CollectionAssert.AreEqual(
                new double[] { 0, 0, 0, 0, 0 },
                Lab07.Task6497(new int[] { 5, 5, 5, 5, 5 })
                );
            CollectionAssert.AreEqual(new double[] { }, Lab07.Task6497(new int[] { }));
            CollectionAssert.AreEqual(
                new double[] { 666666, 333333, 333333 },
                Lab07.Task6497(new int[] { 1000000, 1, 1 })
                );
        }

        [TestMethod]
        public void Task9774Test()
        {
            int[] arr = { 9, 8, 7, 6, 5, 4 };
            Lab07.Task9774(31, arr);
            CollectionAssert.AreEqual(new int[] { 279, 248, 217, 186, 155, 124 }, arr);
            arr = new int[] { 9, 8, 7, 6, 5, 4 };
            Lab07.Task9774(-3, arr);
            CollectionAssert.AreEqual(new int[] { -27, -24, -21, -18, -15, -12 }, arr);
            arr = new int[] { 98, 76, 54 };
            Lab07.Task9774(11, arr);
            CollectionAssert.AreEqual(new int[] { 1078, 836, 594 }, arr);
        }

        [TestMethod]
        public void Task9271Test()
        {
            double[] arr = { 5, 4, 6, 2, 3, 1 };
            Lab07.Task9271(arr);
            CollectionAssert.AreEqual(new double[] { 4, 3, 5, 1, 2, 0 }, arr);
            arr = new double[] { 1, 2, 3, 4, 1, 2 };
            Lab07.Task9271(arr);
            CollectionAssert.AreEqual(new double[] { 0, 1, 2, 3, 0, 1 }, arr);
            arr = new double[] { 3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2 };
            Lab07.Task9271(arr);
            CollectionAssert.AreEqual(new double[] { 2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1 }, arr);
            arr = new double[] { 4, 2, 3, 4, 3, 2 };
            Lab07.Task9271(arr);
            CollectionAssert.AreEqual(new double[] { 2, 0, 1, 2, 1, 0 }, arr);
            arr = new double[] { 4, 4, 4, 4, 4, 3, 2, 1 };
            Lab07.Task9271(arr);
            CollectionAssert.AreEqual(new double[] { 3, 3, 3, 3, 3, 2, 1, 0 }, arr);
            arr = new double[] { 4, 4, 4, 4 };
            Lab07.Task9271(arr);
            CollectionAssert.AreEqual(new double[] { 0, 0, 0, 0 }, arr);
            arr = new double[] { 4, 3 };
            Lab07.Task9271(arr);
            CollectionAssert.AreEqual(new double[] { 1, 0 }, arr);
        }

        [TestMethod]
        public void Task4847Test()
        {
            Assert.IsFalse(Lab05.Task4847(31, 59, 83));
            Assert.IsTrue(Lab05.Task4847(19, 19, 41));
            Assert.IsTrue(Lab05.Task4847(7, 11, 11));
            Assert.IsTrue(Lab05.Task4847(67, -67, 67));
            Assert.IsTrue(Lab05.Task4847(1, 1, 1));
        }

        [TestMethod]
        public void Task6740Test()
        {
            double[] in6740xPos = { 1, 2, 3, 1, 2, 3, 1, 2, 3 };
            double[] in6740yPos = { -1, -1, -1, -1.5, -1.5, -1.5, -2, -2, -2 };
            double[] in6740xNeg = { 0, 1, 2, 3, 4, 0, 4, 0, 4, 0, 4, 0, 1, 2, 3, 4 };
            double[] in6740yNeg = { 0, 0, 0, 0, 0, -1, -1, -1.5, -1.5, -2, -2, -3, -3, -3, -3, -3 };

            for (int i = 0; i < in6740xPos.Length; i++)
            {
                Assert.IsTrue(Lab05.Task6740(in6740xPos[i], in6740yPos[i]));
            }
            for (int i = 0; i < in6740xNeg.Length; i++)
            {
                Assert.IsFalse(Lab05.Task6740(in6740xNeg[i], in6740yNeg[i]));
            }
        }
    }
}
