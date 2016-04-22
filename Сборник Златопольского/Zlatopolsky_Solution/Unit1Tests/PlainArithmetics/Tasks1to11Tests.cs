using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Unit1.PlainArithmetics;

namespace Unit1Tests.PlainArithmetics
{
    [TestClass()]
    public class Tasks1to11Tests : ConsoleTest
    {
        Tasks1to11 obj = new Tasks1to11();

        [TestMethod()]
        public void task1_1_printPiTest()
        {
            obj.task1_1_printPi();
            Assert.AreEqual("3,14", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_2_printExpTest()
        {
            obj.task1_2_printExp();
            Assert.AreEqual("2,7", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_3_printInputPrefixTest()
        {
            FakeInput("7919");
            obj.task1_3_printInputPrefix();
            Assert.AreEqual("Вы ввели число 7919", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_4_printInputPostfixTest()
        {
            FakeInput("7907");
            obj.task1_4_printInputPostfix();
            Assert.AreEqual("7907 - вот какое число Вы ввели", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_5_printNumbersSingleSpaceTest()
        {
            obj.task1_5_printNumbersSingleSpace();
            Assert.AreEqual("1 13 49", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_6_printNumbersDoubleSpaceTest()
        {
            obj.task1_6_printNumbersDoubleSpace();
            Assert.AreEqual("7  15  100", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_7_print3NumbersDoubleSpaceTest()
        {
            FakeInput("7901\n7883\n7879");
            obj.task1_7_print3NumbersDoubleSpace();
            Assert.AreEqual("7901  7883  7879", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_8_print4NumbersSingleSpaceTest()
        {
            FakeInput("7877\n7873\n7867\n7853");
            obj.task1_8_print4NumbersSingleSpace();
            Assert.AreEqual("7877 7873 7867 7853", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_9_print50and10ColumnTest()
        {
            obj.task1_9_print50and10Column();
            Assert.AreEqual("50\n10", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_10_print5and10and21ColumnTest()
        {
            obj.task1_10_print5and10and21Column();
            Assert.AreEqual("5\r\n10\r\n21\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_11_print4NumbersColumntTestTest()
        {
            FakeInput("7841\n7829\n7817\n7793");
            obj.task1_11_print4NumbersColumn();
            Assert.AreEqual("7841\r\n7829\r\n7817\r\n7793\r\n", consoleOut.ToString());
        }
    }
}
