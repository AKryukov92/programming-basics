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
            Begin();
            obj.task1_14a();
            Assert.AreEqual("15286", Output);
        }

        [TestMethod()]
        public void task1_14bTest()
        {
            FakeInput("7639");
            Begin();
            obj.task1_14b();
            Assert.AreEqual("0,9816", Output);
        }

        [TestMethod()]
        public void task1_14cTest()
        {
            FakeInput("7621");
            Begin();
            obj.task1_14c();
            Assert.AreEqual("58079641", Output);
        }

        [TestMethod()]
        public void task1_14dTest()
        {
            FakeInput("7606");
            Begin();
            obj.task1_14d();
            Assert.AreEqual("87,2124", Output);
        }

        [TestMethod()]
        public void task1_14dIllegalInputTest()
        {
            FakeInput("-7603");
            Begin();
            obj.task1_14d();
            Assert.AreEqual("x не может быть отрицательным", Output);
        }

        [TestMethod()]
        public void task1_14ePositiveTest()
        {
            FakeInput("7591");
            Begin();
            obj.task1_14e();
            Assert.AreEqual("7591", Output);
        }

        [TestMethod()]
        public void task1_14eNegativeTest()
        {
            FakeInput("-7589");
            Begin();
            obj.task1_14e();
            Assert.AreEqual("7589", Output);
        }

        [TestMethod()]
        public void task1_14fTest()
        {
            FakeInput("7583");
            Begin();
            obj.task1_14f();
            Assert.AreEqual("4,6025", Output);
        }

        [TestMethod()]
        public void task1_14gTest()
        {
            FakeInput("7577");
            Begin();
            obj.task1_14g();
            Assert.AreEqual("-430581967,5", Output);
        }

        [TestMethod()]
        public void task1_14hTest()
        {
            FakeInput("7573");
            Begin();
            obj.task1_14h();
            Assert.AreEqual("261,0690", Output);
        }

        [TestMethod()]
        public void task1_14hIllegalValueTest()
        {
            FakeInput("-7561");
            Begin();
            obj.task1_14h();
            Assert.AreEqual("x не может быть отрицательным", Output);
        }

        [TestMethod()]
        public void task1_14iTest()
        {
            FakeInput("7559");
            FakeInput("7549");
            Begin();
            obj.task1_14i();
            Assert.AreEqual("-0,2079", Output.Trim());
        }

        [TestMethod()]
        public void task1_14jTest()
        {
            FakeInput("7547");
            FakeInput("7541");
            Begin();
            obj.task1_14j();
            Assert.AreEqual("926837,9719", Output.Trim());
        }

        [TestMethod()]
        public void task1_14jIllegalInputTest()
        {
            FakeInput("7537");
            FakeInput("-7529");
            Begin();
            obj.task1_14j();
            Assert.AreEqual("При данных значениях, подкоренное выражение отрицательно", Output.Trim());
        }

        [TestMethod()]
        public void task1_14kTest() 
        {
            FakeInput("7523");
            FakeInput("7517");
            Begin();
            obj.task1_14k();
            Assert.AreEqual("1,8148", Output);
        }

        [TestMethod()]
        public void task1_14lTest()
        {
            FakeInput("7507");
            FakeInput("7499");
            Begin();
            obj.task1_14l();
            Assert.AreEqual("-435,7062", Output);
        }

        [TestMethod()]
        public void task1_14lIllegalInput1Test()
        {
            FakeInput("7489");
            FakeInput("-7487");
            Begin();
            obj.task1_14l();
            Assert.AreEqual("y не может быть отрицательным", Output);
        }

        [TestMethod()]
        public void task1_14lIllegalInput2Test()
        {
            FakeInput("-7481");
            FakeInput("7477");
            Begin();
            obj.task1_14l();
            Assert.AreEqual("При данных значениях, подкоренное выражение отрицательно", Output);
        }
    }
}
