using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using CodeProject;

namespace TestingProject
{
    [TestClass]
    public class TestSuite
    {
        [TestMethod]
        public void Task4411test()
        {
            double actual;
            actual = Methods.Task4411(11.13);
            Assert.AreEqual(18.13, actual, 0.0001);
            actual = Methods.Task4411(-7919);
            Assert.AreEqual(-7912, actual, 0.0001);
            actual = Methods.Task4411(0);
            Assert.AreEqual(7, actual, 0.0001);
        }

        [TestMethod]
        public void Task2790test()
        {
            double actual;
            actual = Methods.Task2790(6997);
            Assert.AreEqual(0.9205, actual, 0.0001);
            actual = Methods.Task2790(31);
            Assert.AreEqual(0.8572, actual, 0.0001);
            actual = Methods.Task2790(90);
            Assert.AreEqual(0, actual, 0.0001);
            actual = Methods.Task2790(0);
            Assert.AreEqual(1, actual, 0.0001);
            actual = Methods.Task2790(180);
            Assert.AreEqual(1, actual, 0.0001);
        }

        [TestMethod]
        public void Task5662test()
        {
            Assert.AreEqual("Вещественных корней уравнения 1x^2 + 2x + 3 = 0 нет", Methods.Task5662(1, 2, 3));
            Assert.AreEqual("Вещественных корней уравнения 11x^2 + 13x + 19 = 0 нет", Methods.Task5662(11, 13, 19));
            Assert.AreEqual("У уравнения 3x^2 + 17x + 5 = 0 два вещественных корня", Methods.Task5662(3, 17, 5));
            Assert.AreEqual("У уравнения 5x^2 + 31x + 29 = 0 два вещественных корня", Methods.Task5662(5, 31, 29));
            Assert.AreEqual("Уравнение 3x^2 + 6x + 3 = 0 имеет один корень", Methods.Task5662(3, 6, 3));
            Assert.AreEqual("Уравнение 1x^2 + 2x + 1 = 0 имеет один корень", Methods.Task5662(1, 2, 1));
            Assert.AreEqual("Данное уравнение не является квадратным", Methods.Task5662(0, 7, 13));
        }

        [TestMethod]
        public void Task3669test()
        {
            Assert.AreEqual(1235520L, Methods.Task3669(8, 13));
            Assert.AreEqual(1235520L, Methods.Task3669(13, 8));
            Assert.AreEqual(4095840L, Methods.Task3669(159, 161));
            Assert.AreEqual(648L, Methods.Task3669(648, 648));
            Assert.AreEqual(0, Methods.Task3669(-2, 600));
            Assert.AreEqual(399703747322880000L, Methods.Task3669(35, 24));
        }

        [TestMethod]
        public void Task1292test()
        {
            Assert.AreEqual("a", Methods.Task1292('a'));
            Assert.AreEqual("ab", Methods.Task1292('b'));
            Assert.AreEqual("abcd", Methods.Task1292('d'));
            Assert.AreEqual("abcdefgh", Methods.Task1292('h'));
            Assert.AreEqual("abcdefgh", Methods.Task1292('i'));
        }

        [TestMethod]
        public void Task3946test()
        {
            int[] data;
            data = new int[] { 1, 2, 3, 4, 1 };
            Assert.AreEqual(2.2, Methods.Task3946(data));
            data = new int[] { 1, 2, 3, 4, 1, 3, 4, 4, 4, 4 };
            Assert.AreEqual(3, Methods.Task3946(data));
            data = new int[] { };
            Assert.AreEqual(0, Methods.Task3946(data));
        }

        [TestMethod]
        public void Task4283test()
        {
            int[] data;
            data = new int[] { 1, 2, 3, 4, 1, 2 };
            Assert.AreEqual(1, Methods.Task4283(3, data));
            data = new int[] { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3 };
            Assert.AreEqual(0, Methods.Task4283(5, data));
            data = new int[] { 3, 2, 2, 2, 2, 2 };
            Assert.AreEqual(5, Methods.Task4283(2, data));
            data = new int[] { 4, 4, 4, 4, 4, 4 };
            Assert.AreEqual(0, Methods.Task4283(1, data));
        }

        [TestMethod]
        public void Task6497test()
        {
            int[] data;
            double[] expected;
            data = new int[] { 9, 8, 9, 1, 1, 5, 1, 1 };
            expected = new double[] { 4.625, 3.625, 4.625, 3.375, 3.375, 0.625, 3.375, 3.375 };
            CollectionAssert.AreEqual(expected, Methods.Task6497(data));
            data = new int[] { 5, 5, 5, 5, 5 };
            expected = new double[] { 0, 0, 0, 0, 0 };
            CollectionAssert.AreEqual(expected, Methods.Task6497(data));
            data = new int[] { };
            expected = new double[] { };
            CollectionAssert.AreEqual(expected, Methods.Task6497(data));
            data = new int[] { 1000000, 1, 1 };
            expected = new double[] { 666666, 333333, 333333 };
            CollectionAssert.AreEqual(expected, Methods.Task6497(data));
        }

        [TestMethod]
        public void Task9774test()
        {
            double[] data;
            double[] expected;
            data = new double[] { 9, 8, 7, 6, 5, 4 };
            expected = new double[] { 279, 248, 217, 186, 155, 124 };
            Methods.Task9774(31, data);
            CollectionAssert.AreEqual(expected, data);

            data = new double[] { 9, 8, 7, 6, 5, 4 };
            expected = new double[] { -27, -24, -21, -18, -15, -12 };
            Methods.Task9774(-3, data);
            CollectionAssert.AreEqual(expected, data);

            data = new double[] { 98, 76, 54 };
            expected = new double[] { 1078, 836, 594 };
            Methods.Task9774(11, data);
            CollectionAssert.AreEqual(expected, data);

            data = new double[] { };
            expected = new double[] { };
            Methods.Task9774(73, data);
            CollectionAssert.AreEqual(expected, data);
        }

        [TestMethod]
        public void Test9271test()
        {
            double[] data;
            double[] expected;
            data = new double[] { 5, 4, 6, 2, 3, 1 };
            expected = new double[] { 4, 3, 5, 1, 2, 0 };
            Methods.Task9271(data);
            CollectionAssert.AreEqual(expected, data);

            data = new double[] { 1, 2, 3, 4, 1, 2 };
            expected = new double[] { 0, 1, 2, 3, 0, 1 };
            Methods.Task9271(data);
            CollectionAssert.AreEqual(expected, data);

            data = new double[] { 3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2 };
            expected = new double[] { 2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1 };
            Methods.Task9271(data);
            CollectionAssert.AreEqual(expected, data);

            data = new double[] { 4, 2, 3, 4, 3, 2 };
            expected = new double[] { 2, 0, 1, 2, 1, 0 };
            Methods.Task9271(data);
            CollectionAssert.AreEqual(expected, data);

            data = new double[] { 4, 4, 4, 4, 4, 3, 2, 1 };
            expected = new double[] { 3, 3, 3, 3, 3, 2, 1, 0 };
            Methods.Task9271(data);
            CollectionAssert.AreEqual(expected, data);

            data = new double[] { 4, 4, 4, 4 };
            expected = new double[] { 0, 0, 0, 0 };
            Methods.Task9271(data);
            CollectionAssert.AreEqual(expected, data);
        }

        [TestMethod]
        public void Task6740test()
        {
            Assert.IsFalse(Methods.Task6740(0, 0));
            Assert.IsFalse(Methods.Task6740(1, 0));
            Assert.IsFalse(Methods.Task6740(2, 0));
            Assert.IsFalse(Methods.Task6740(3, 0));
            Assert.IsFalse(Methods.Task6740(4, 0));

            Assert.IsFalse(Methods.Task6740(0, -1));
            Assert.IsTrue(Methods.Task6740(1, -1));
            Assert.IsTrue(Methods.Task6740(2, -1));
            Assert.IsTrue(Methods.Task6740(3, -1));
            Assert.IsFalse(Methods.Task6740(4, -1));

            Assert.IsFalse(Methods.Task6740(0, -2));
            Assert.IsTrue(Methods.Task6740(1, -2));
            Assert.IsTrue(Methods.Task6740(2, -2));
            Assert.IsTrue(Methods.Task6740(3, -2));
            Assert.IsFalse(Methods.Task6740(4, -2));

            Assert.IsFalse(Methods.Task6740(0, -3));
            Assert.IsFalse(Methods.Task6740(1, -3));
            Assert.IsFalse(Methods.Task6740(2, -3));
            Assert.IsFalse(Methods.Task6740(3, -3));
            Assert.IsFalse(Methods.Task6740(4, -3));
        }

        [TestMethod]
        public void Task9020test()
        {
            double result = Methods.Task9020(0);
            Assert.AreEqual(23.4307, result, 0.0001);
            result = Methods.Task9020(-9);
            Assert.AreEqual(25.0998, result, 0.0001);
            result = Methods.Task9020(61);
            Assert.AreEqual(0, result, 0.0001);
            result = Methods.Task9020(60);
            Assert.AreEqual(3, result, 0.0001);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task9020assertion1()
        {
            Methods.Task9020(62);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task9020assertion2()
        {
            Methods.Task9020(7573);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task9020assertion3()
        {
            Methods.Task9020(75);
        }

        [TestMethod]
        public void Task5871test()
        {
            Assert.AreEqual(0.707107, Methods.Task5871(5), 0.000001);
            Assert.AreEqual(0.881127, Methods.Task5871(6), 0.000001);
            Assert.AreEqual(1, Methods.Task5871(6911), 0.000001);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task5871assertion1()
        {
            Methods.Task5871(2);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task5871assertion2()
        {
            Methods.Task5871(0);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task5871assertion3()
        {
            Methods.Task5871(-4);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task5871assertion4()
        {
            Methods.Task5871(-20);
        }

        [TestMethod]
        public void Task7799test()
        {
            Assert.AreEqual(34.671920, Methods.Task7799(5, 45), 0.000001);
            Assert.AreEqual(61972.336135, Methods.Task7799(7297, 30), 0.000001);
            Assert.AreEqual(0, Methods.Task7799(10, 90), 0.000001);
            Assert.AreEqual(0, Methods.Task7799(7, 91), 0.000001);
            Assert.AreEqual(0, Methods.Task7799(9, 100), 0.000001);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task7799assertion1()
        {
            Methods.Task7799(0, 30);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task7799assertion2()
        {
            Methods.Task7799(-10, 5);
        }

        [TestMethod]
        public void Task9354test()
        {
            Assert.AreEqual(-83, Methods.Task9354(7, 1, 3), 0.0001);
            Assert.AreEqual(-157093203, Methods.Task9354(7247, 7243, 7229), 0.0001);
            Assert.AreEqual(-579, Methods.Task9354(-11, -13, -17), 0.0001);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task9354assertion1()
        {
            Methods.Task9354(0, 1, 3);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task9354assertion2()
        {
            Methods.Task9354(0, 1000, 2000);
        }

        [TestMethod]
        public void Task5170test()
        {
            Assert.IsFalse(Methods.Task5170(6));
            Assert.IsFalse(Methods.Task5170(3219));
            Assert.IsTrue(Methods.Task5170(7));
            Assert.IsTrue(Methods.Task5170(2017));
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task5170assertion()
        {
            Methods.Task5170(-10);
        }
    }
}