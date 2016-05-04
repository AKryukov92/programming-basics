using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading;

namespace Unit2Tests
{
    public class ConsoleTest
    {
        public ConsoleTest()
        {
            Thread.CurrentThread.CurrentCulture = new CultureInfo("ru-ru");
        }

        protected StringWriter consoleOut;
        protected StringBuilder inputBuilder;

        protected void FakeInput(String text)
        {
            inputBuilder.Append(text);
            inputBuilder.Append("\n");
        }

        protected void Begin()
        {
            StringReader reader = new StringReader(inputBuilder.ToString());
            Console.SetIn(reader);
        }

        protected string Output { get { return consoleOut.ToString().Trim(); } }

        [TestInitialize()]
        public void startup()
        {
            consoleOut = new StringWriter();
            Console.SetOut(consoleOut);
            inputBuilder = new StringBuilder();
        }
    }
}
