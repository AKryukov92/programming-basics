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
    }
}
