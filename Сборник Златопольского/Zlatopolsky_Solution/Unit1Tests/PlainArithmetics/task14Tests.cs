using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Unit1.PlainArithmetics;

namespace Unit1Tests.PlainArithmetics
{
    [TestClass()]
    public class Task14Tests : ConsoleTest
    {
        Task14 obj = new Task14();

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
