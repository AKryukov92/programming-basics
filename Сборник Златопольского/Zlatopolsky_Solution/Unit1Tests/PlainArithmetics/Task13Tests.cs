using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Unit1.PlainArithmetics;

namespace Unit1Tests.PlainArithmetics
{
    [TestClass()]
    class Task13Tests : ConsoleTest
    {
        Task13 obj = new Task13();

        [TestMethod()]
        public void task1_13a_printTextTest()
        {
            obj.task1_13a_printText();
            Assert.AreEqual("2 кг\r\n13 17\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_13b_printTextTest()
        {
            FakeInput("7703\n7699");
            obj.task1_13b_printText();
            Assert.AreEqual("7703 1\r\n19 7699\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_13b_printTextIllegalInput1Test()
        {
            FakeInput("task1_13b\n7691");
            obj.task1_13b_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_13b' в целое число\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_13b_printTextIllegalInput2Test()
        {
            FakeInput("7687\ntask1_13b");
            obj.task1_13b_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_13b' в целое число\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_13c_printTextTest()
        {
            FakeInput("7681\n7673");
            obj.task1_13c_printText();
            Assert.AreEqual("7681 7673\r\n5 7673\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_13c_printTextIllegalInput1Test()
        {
            FakeInput("task1_13c\n7669");
            obj.task1_13c_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_13c' в целое число\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_13c_printTextIllegalInput2Test()
        {
            FakeInput("7649\ntask1_13c");
            obj.task1_13c_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_13c' в целое число\r\n", consoleOut.ToString());
        }
    }
}
