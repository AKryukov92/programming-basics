using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Unit1.PlainArithmetics;

namespace Unit1Tests.PlainArithmetics
{
    [TestClass()]
    public class Task17Tests : ConsoleTest
    {
        Task17 obj = new Task17();

        [TestMethod()]
        public void task1_17aTest()
        {
            FakeInput("7459");
            FakeInput("7457");
            Begin();
            obj.task1_17a();
            Assert.AreEqual("10547,2048", Output);
        }

        [TestMethod()]
        public void task1_17bTest()
        {
            FakeInput("7451");
            FakeInput("7433");
            FakeInput("7417");
            Begin();
            obj.task1_17b();
            Assert.AreEqual("165777911", Output);
        }

        [TestMethod()]
        public void task1_17cTest()
        {
            FakeInput("7411");
            FakeInput("7393");
            FakeInput("7369");
            Begin();
            obj.task1_17c();
            Assert.AreEqual("201436475863,5", Output);
        }

        [TestMethod()]
        public void task1_17dTest()
        {
            FakeInput("7351");
            FakeInput("7349");
            FakeInput("7333");
            Begin();
            obj.task1_17d();
            Assert.AreEqual("199034301591,6160", Output);
        }

        [TestMethod()]
        public void task1_17eTest()
        {
            FakeInput("7331");
            FakeInput("7321");
            Begin();
            obj.task1_17e();
            Assert.AreEqual("0,0003", Output);
        }

        [TestMethod()]
        public void task1_17eIllegalInput1Test()
        {
            FakeInput("0");
            FakeInput("7307");
            Begin();
            obj.task1_17e();
            Assert.AreEqual("R1 не может быть равна нулю", Output);
        }

        [TestMethod()]
        public void task1_17eIllegalInput2Test()
        {
            FakeInput("7309");
            FakeInput("0");
            Begin();
            obj.task1_17e();
            Assert.AreEqual("R2 не может быть равна нулю", Output);
        }

        [TestMethod()]
        public void task1_17fTest()
        {
            FakeInput("7297");
            FakeInput("7283");
            Begin();
            obj.task1_17f();
            Assert.AreEqual("8720,9080", Output);
        }

        [TestMethod()]
        public void task1_17gTest()
        {
            FakeInput("7253");
            Begin();
            obj.task1_17g();
            Assert.AreEqual("45571,9430", Output);
        }

        [TestMethod()]
        public void task1_17hTest()
        {
            FakeInput("7247");
            FakeInput("7243");
            FakeInput("7229");
            Begin();
            obj.task1_17h();
            Assert.AreEqual("-156919579,0000", Output);
        }

        [TestMethod()]
        public void task1_17iTest()
        {
            FakeInput("7219");
            FakeInput("7213");
            FakeInput("7211");
            FakeInput("7207");
            Begin();
            obj.task1_17i();
            Assert.AreEqual("7229,0200", Output);
        }

        [TestMethod()]
        public void task1_17iIllegalInputTest()
        {
            FakeInput("7193");
            FakeInput("7187");
            FakeInput("7177");
            FakeInput("0");
            Begin();
            obj.task1_17i();
            Assert.AreEqual("При данных значениях, знаменатель равен нулю", Output);
        }

        [TestMethod()]
        public void task1_17jTest()
        {
            FakeInput("7159");
            FakeInput("7151");
            Begin();
            obj.task1_17j();
            Assert.AreEqual("366497910431,0000", Output);
        }

        [TestMethod()]
        public void task1_17kTest()
        {
            FakeInput("7129");
            FakeInput("7127");
            FakeInput("7121");
            Begin();
            obj.task1_17k();
            Assert.AreEqual("-49874889,8998", Output);
        }

        [TestMethod()]
        public void task1_17lTest()
        {
            FakeInput("7109");
            FakeInput("7103");
            FakeInput("7079");
            Begin();
            obj.task1_17l();
            Assert.AreEqual("12369,4955", Output);
        }

        [TestMethod()]
        public void task1_17mTest()
        {
            FakeInput("7069");
            FakeInput("7043");
            FakeInput("7039");
            FakeInput("7057");
            Begin();
            obj.task1_17m();
            Assert.AreEqual("49885933,9938", Output);
        }

        [TestMethod()]
        public void task1_17mIllegalInput1Test()
        {
            FakeInput("0");
            FakeInput("7043");
            FakeInput("7039");
            FakeInput("7027");
            Begin();
            obj.task1_17m();
            Assert.AreEqual("При данных значениях, знаменатель равен нулю", Output);
        }

        [TestMethod()]
        public void task1_17mIllegalInput2Test()
        {
            FakeInput("7019");
            FakeInput("7013");
            FakeInput("7001");
            FakeInput("0");
            Begin();
            obj.task1_17m();
            Assert.AreEqual("При данных значениях, знаменатель равен нулю", Output);
        }

        [TestMethod()]
        public void task1_17nTest()
        {
            FakeInput("6997");
            Begin();
            obj.task1_17n();
            Assert.AreEqual("0,9205", Output);
        }

        [TestMethod()]
        public void task1_17oTest()
        {
            FakeInput("6991");
            FakeInput("6983");
            FakeInput("6977");
            FakeInput("6961");
            Begin();
            obj.task1_17o();
            Assert.AreEqual("0,0000", Output);
        }

        [TestMethod()]
        public void task1_17o2Test()
        {
            FakeInput("11");
            FakeInput("13");
            FakeInput("17");
            FakeInput("19");
            Begin();
            obj.task1_17o();
            Assert.AreEqual("0,0154", Output);
        }

        [TestMethod()]
        public void task1_17oIllegalInput1Test()
        {
            FakeInput("-6959");
            FakeInput("6949");
            FakeInput("6947");
            FakeInput("6917");
            Begin();
            obj.task1_17o();
            Assert.AreEqual("При данных значениях, подкоренное выражение отрицательно", Output);
        }

        [TestMethod()]
        public void task1_17oIllegalInput2Test()
        {
            FakeInput("0");
            FakeInput("0");
            FakeInput("0");
            FakeInput("0");
            Begin();
            obj.task1_17o();
            Assert.AreEqual("При данных значениях, знаменатель равен нулю", Output);
        }

        [TestMethod()]
        public void task1_17pTest()
        {
            FakeInput("6911");
            Begin();
            obj.task1_17p();
            Assert.AreEqual("1,0000", Output);
        }

        [TestMethod()]
        public void task1_17p2Test()
        {
            FakeInput("3");
            Begin();
            obj.task1_17p();
            Assert.AreEqual("0,9856", Output);
        }

        [TestMethod()]
        public void task1_17p3Test()
        {
            FakeInput("0,9");
            Begin();
            obj.task1_17p();
            Assert.AreEqual("При данных значениях, подкоренное выражение отрицательно", Output);
        }

        [TestMethod()]
        public void task1_17q1Test()
        {
            FakeInput("6907");
            Begin();
            obj.task1_17q();
            Assert.AreEqual("13815,0000", Output);
        }

        [TestMethod()]
        public void task1_17q2Test()
        {
            FakeInput("-1");
            Begin();
            obj.task1_17q();
            Assert.AreEqual("1,0000", Output);
        }

        [TestMethod()]
        public void task1_17q3Test()
        {
            FakeInput("-2");
            Begin();
            obj.task1_17q();
            Assert.AreEqual("3,0000", Output);
        }

        [TestMethod()]
        public void task1_17r1Test()
        {
            FakeInput("6899");
            Begin();
            obj.task1_17r();
            Assert.AreEqual("6898,0000", Output);
        }

        [TestMethod()]
        public void task1_17r2Test()
        {
            FakeInput("0,9");
            Begin();
            obj.task1_17r();
            Assert.AreEqual("0,1000", Output);
        }
    }
}
