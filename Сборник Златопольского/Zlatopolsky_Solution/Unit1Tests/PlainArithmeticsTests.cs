using Microsoft.VisualStudio.TestTools.UnitTesting;
using Unit1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace Unit1.Tests
{
    [TestClass()]
    public class PlainArithmeticsTests
    {
        PlainArithmetics obj = new PlainArithmetics();
        StringWriter consoleOut;

        private void FakeInput(String text)
        {
            StringReader reader = new StringReader(text);
            Console.SetIn(reader);
        }

        [TestInitialize()]
        public void startup()
        {
            consoleOut = new StringWriter();
            Console.SetOut(consoleOut);
        }

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

        [TestMethod()]
        public void task1_12a_printTextTest()
        {
            obj.task1_12a_printText();
            Assert.AreEqual("5 10\r\n5 см\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_12b_printTextTest()
        {
            FakeInput("7789\n7759");
            obj.task1_12b_printText();
            Assert.AreEqual("100 7789\r\n1949 7759\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_12b_printTextIllegalInput1Test()
        {
            FakeInput("task1_12b\n7757");
            obj.task1_12b_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_12b' в целое число\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_12b_printTextIllegalInput2Test()
        {
            FakeInput("7753\ntask1_12b");
            obj.task1_12b_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_12b' в целое число\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_12c_printTextTest()
        {
            FakeInput("7741\n7727");
            obj.task1_12c_printText();
            Assert.AreEqual("7741 25\r\n7741 7727\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_12c_printTextIllegalInput1Test()
        {
            FakeInput("task1_12c\n7723");
            obj.task1_12c_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_12c' в целое число\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_12c_printTextIllegalInput2Test()
        {
            FakeInput("7717\ntask1_12c");
            obj.task1_12c_printText();
            Assert.AreEqual("Не удалось преобразовать строку 'task1_12c' в целое число\r\n", consoleOut.ToString());
        }

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

        [TestMethod()]
        public void task1_14aTest()
        {
            FakeInput("7643");
            obj.task1_14a();
            Assert.AreEqual("15286\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_14bTest()
        {
            FakeInput("7639");
            obj.task1_14b();
            Assert.AreEqual("0,9816\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_14cTest()
        {
            FakeInput("7621");
            obj.task1_14c();
            Assert.AreEqual("58079641\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_14dTest()
        {
            FakeInput("7606");
            obj.task1_14d();
            Assert.AreEqual("87,2124\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_14dIllegalInputTest()
        {
            FakeInput("-7603");
            obj.task1_14d();
            Assert.AreEqual("x не может быть отрицательным\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_14ePositiveTest()
        {
            FakeInput("7591");
            obj.task1_14e();
            Assert.AreEqual("7591\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_14eNegativeTest()
        {
            FakeInput("-7589");
            obj.task1_14e();
            Assert.AreEqual("7589\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_14fTest()
        {
            FakeInput("7583");
            obj.task1_14f();
            Assert.AreEqual("4,6025\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_14gTest()
        {
            FakeInput("7577");
            obj.task1_14g();
            Assert.AreEqual("-430581967,5\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_14hTest()
        {
            FakeInput("7573");
            obj.task1_14h();
            Assert.AreEqual("261,0690\r\n", consoleOut.ToString());
        }

        [TestMethod()]
        public void task1_14hIllegalValueTest()
        {
            FakeInput("-7561");
            obj.task1_14h();
            Assert.AreEqual("x не может быть отрицательным\r\n", consoleOut.ToString());
        }
    }
}