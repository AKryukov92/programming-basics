using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Unit2;

namespace Unit2Tests
{
    [TestClass()]
    public class Task39Test : ConsoleTest
    {
        Task39 obj = new Task39();

        [TestMethod()]
        public void allZeroesTest()
        {
            FakeInput("0");
            FakeInput("0");
            FakeInput("0");
            Begin();
            obj.task39();
            Assert.AreEqual("0,0000", Output);
        }

        [TestMethod()]
        public void hoursBelow12minutesAndSecondsZeroTest()
        {
            FakeInput("6");
            FakeInput("0");
            FakeInput("0");
            Begin();
            obj.task39();
            Assert.AreEqual("180,0000", Output);
        }

        [TestMethod()]
        public void hoursAbove12minutesAndSecondsZeroTest()
        {
            FakeInput("15");
            FakeInput("0");
            FakeInput("0");
            Begin();
            obj.task39();
            Assert.AreEqual("90,0000", Output);
        }

        [TestMethod()]
        public void hoursBelow12Minutes30SecondsZeroTest()
        {
            FakeInput("3");
            FakeInput("30");
            FakeInput("0");
            Begin();
            obj.task39();
            Assert.AreEqual("105,0000", Output);
        }

        [TestMethod()]
        public void hoursAbove12MinutesZeroSeconds30Test()
        {
            FakeInput("21");
            FakeInput("0");
            FakeInput("17");
            Begin();
            obj.task39();
            Assert.AreEqual("270,1417", Output);
        }
    }
}
