using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Unit1.PlainArithmetics;
using Unit1Tests;

namespace Unit1Tests.PlainArithmetics
{
    [TestClass()]
    public class Task12Tests : ConsoleTest
    {
        Task12 obj = new Task12();

        [TestMethod()]
        public void task1_12a_printTextTest()
        {
            obj.task1_12a_printText();
            Assert.AreEqual("5 10\r\n5 см", Output);
        }

        [TestMethod()]
        public void task1_12b_printTextTest()
        {
            FakeInput("7789");
            FakeInput("7759");
            Begin();
            obj.task1_12b_printText();
            Assert.AreEqual("100 7789\r\n1949 7759", Output);
        }

        [TestMethod()]
        public void task1_12b_printTextIllegalInput1Test()
        {
            FakeInput("task1_12b");
            FakeInput("7757");
            Begin();
            obj.task1_12b_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_12b' в целое число", Output);
        }

        [TestMethod()]
        public void task1_12b_printTextIllegalInput2Test()
        {
            FakeInput("7753");
            FakeInput("task1_12b");
            Begin();
            obj.task1_12b_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_12b' в целое число", Output);
        }

        [TestMethod()]
        public void task1_12c_printTextTest()
        {
            FakeInput("7741");
            FakeInput("7727");
            Begin();
            obj.task1_12c_printText();
            Assert.AreEqual("7741 25\r\n7741 7727", Output);
        }

        [TestMethod()]
        public void task1_12c_printTextIllegalInput1Test()
        {
            FakeInput("task1_12c");
            FakeInput("7723");
            Begin();
            obj.task1_12c_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_12c' в целое число", Output);
        }

        [TestMethod()]
        public void task1_12c_printTextIllegalInput2Test()
        {
            FakeInput("7717");
            FakeInput("task1_12c");
            Begin();
            obj.task1_12c_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_12c' в целое число", Output);
        }

    }
}
