using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Unit1.PlainArithmetics;

namespace Unit1Tests.PlainArithmetics
{
    [TestClass()]
    public class Task13Tests : ConsoleTest
    {
        Task13 obj = new Task13();

        [TestMethod()]
        public void task1_13a_printTextTest()
        {
            obj.task1_13a_printText();
            Assert.AreEqual("2 кг\r\n13 17", Output);
        }

        [TestMethod()]
        public void task1_13b_printTextTest()
        {
            FakeInput("7703");
            FakeInput("7699");
            Begin();
            obj.task1_13b_printText();
            Assert.AreEqual("7703 1\r\n19 7699", Output);
        }

        [TestMethod()]
        public void task1_13b_printTextIllegalInput1Test()
        {
            FakeInput("task1_13b");
            FakeInput("7691");
            Begin();
            obj.task1_13b_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_13b' в целое число", Output);
        }

        [TestMethod()]
        public void task1_13b_printTextIllegalInput2Test()
        {
            FakeInput("7687");
            FakeInput("task1_13b");
            Begin();
            obj.task1_13b_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_13b' в целое число", Output);
        }

        [TestMethod()]
        public void task1_13c_printTextTest()
        {
            FakeInput("7681");
            FakeInput("7673");
            Begin();
            obj.task1_13c_printText();
            Assert.AreEqual("7681 7673\r\n5 7673", Output);
        }

        [TestMethod()]
        public void task1_13c_printTextIllegalInput1Test()
        {
            FakeInput("task1_13c");
            FakeInput("7669");
            Begin();
            obj.task1_13c_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_13c' в целое число", Output);
        }

        [TestMethod()]
        public void task1_13c_printTextIllegalInput2Test()
        {
            FakeInput("7649");
            FakeInput("task1_13c");
            Begin();
            obj.task1_13c_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_13c' в целое число", Output);
        }
    }
}
