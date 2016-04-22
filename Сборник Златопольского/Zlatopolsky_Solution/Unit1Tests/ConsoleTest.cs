using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading;

namespace Unit1Tests
{
    public class ConsoleTest
    {
        public ConsoleTest()
        {
            Thread.CurrentThread.CurrentCulture = new CultureInfo("ru-ru");
        }

        protected StringWriter consoleOut;

        protected void FakeInput(String text)
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
    }
}
