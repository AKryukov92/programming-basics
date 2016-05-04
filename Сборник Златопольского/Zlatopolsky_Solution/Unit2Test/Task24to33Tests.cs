using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Unit2;
using Unit2Tests;

namespace Unit2Test
{
    [TestClass()]
    public class Task24to33Tests : ConsoleTest
    {
        Task24to33 obj = new Task24to33();

        [TestMethod()]
        public void task25Test()
        {
            FakeInput("237");
            Begin();
            obj.task25();
            Assert.AreEqual("372", Output);
        }

        [TestMethod()]
        public void task25revTest()
        {
            FakeInput("372");
            Begin();
            obj.task25rev();
            Assert.AreEqual("237", Output);
        }

        [TestMethod()]
        public void task26Test()
        {
            FakeInput("791");
            Begin();
            obj.task26();
            Assert.AreEqual("179", Output);
        }

        [TestMethod()]
        public void task26revTest()
        {
            FakeInput("179");
            Begin();
            obj.task26rev();
            Assert.AreEqual("791", Output);
        }

        [TestMethod()]
        public void task27revTest()
        {
            FakeInput("541");
            Begin();
            obj.task27rev();
            Assert.AreEqual("451", Output);
        }
    }
}
