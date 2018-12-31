using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CodeProject;

namespace TestingProject
{
    [TestClass]
    public class ComparatorSuite
    {
        [TestMethod]
        public void Comparator8258Test()
        {
            Comparator8258 comparator = new Comparator8258();
            Assert.AreEqual(-1, comparator.Compare(5, 10));
            Assert.AreEqual(1, comparator.Compare(10, 5));
            Assert.AreEqual(-1, comparator.Compare(4, 20));
            Assert.AreEqual(1, comparator.Compare(50, 20));
            Assert.AreEqual(0, comparator.Compare(15, 15));
            Assert.AreEqual(0, comparator.Compare(5, 7));
        }
        [TestMethod]
        public void Comparator8258SortTest()
        {
            List<int> expected, actual;
            Comparator8258 cmp = new Comparator8258();
            expected = new List<int>() { 7, 3, 10, 1 };
            actual = new List<int>() { 1, 3, 7, 10 };
            actual.Sort(cmp);
            CollectionAssert.AreEqual(expected, actual);
            expected = new List<int>() { 6, 5, 7, 4, 8, 3, 9, 2, 10, 1, 0, -1, -2, -3, -4, -5 };
            actual = new List<int>() { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            actual.Sort(cmp);
            CollectionAssert.AreEqual(expected, actual);
            expected = new List<int>() { 5, 5, 5, 5, 5 };
            actual = new List<int>() { 5, 5, 5, 5, 5 };
            actual.Sort(cmp);
            CollectionAssert.AreEqual(expected, actual);
        }
        [TestMethod]
        public void Comparator7186Test()
        {
            Comparator7186 cmp = new Comparator7186(100);
            Assert.AreEqual(-1, cmp.Compare(99, 1));
            Assert.AreEqual(1, cmp.Compare(1, 99));
            Assert.AreEqual(0, cmp.Compare(50, 150));
            Assert.AreEqual(0, cmp.Compare(5, 5));
            cmp = new Comparator7186(47);
            Assert.AreEqual(1, cmp.Compare(9, 57));
            Assert.AreEqual(-1, cmp.Compare(57, 9));
            Assert.AreEqual(0, cmp.Compare(53, 41));
            Assert.AreEqual(0, cmp.Compare(60, 60));
        }
        [TestMethod]
        public void Comparator7186SortTest()
        {
            List<int> expected, actual;
            actual = new List<int>() { 1, 3, 7, 10 };
            expected = new List<int>() { 7, 3, 10, 1 };
            actual.Sort(new Comparator7186(6));
            CollectionAssert.AreEqual(expected, actual);
            actual = new List<int>() { 1, 3, 7, 10 };
            expected = new List<int>() { 10, 7, 3, 1 };
            actual.Sort(new Comparator7186(10));
            CollectionAssert.AreEqual(expected, actual);
            actual = new List<int>() { 1, 3, 7, 10 };
            expected = new List<int>() { 3, 1, 7, 10 };
            actual.Sort(new Comparator7186(4));
            CollectionAssert.AreEqual(expected, actual);
            actual = new List<int>() { -49, -55, -60, -60, 15, -28, 22, -16, 4, 61, 74, -39, -55, -14, -12, 66, 80, -47, 1, -65 };
            expected = new List<int>() { -49, -47, -55, -55, -60, -60, -39, -65, -28, -16, -14, -12, 1, 4, 15, 22, 61, 66, 74, 80 };
            actual.Sort(new Comparator7186(-50));
            CollectionAssert.AreEqual(expected, actual);
        }
        [TestMethod]
        public void Comparator4061Test()
        {
            List<int> expected, actual;
            actual = new List<int>() { -10, 1, -3, 7, 5 };
            expected = new List<int>() { 1, -3, 5, 7, -10 };
            actual.Sort(new Comparator4061());
            CollectionAssert.AreEqual(expected, actual);
            actual = new List<int>() { 3, -3, 3, -3, -3, 3 };
            expected = new List<int>() { -3, -3, -3, 3, 3, 3 };
            actual.Sort(new Comparator4061());
            CollectionAssert.AreEqual(expected, actual);
            actual = new List<int>() { 13, -2, 25, -37, 10000, 0, 2 };
            expected = new List<int>() { 0, -2, 2, 13, 25, -37, 10000 };
            actual.Sort(new Comparator4061());
            CollectionAssert.AreEqual(expected, actual);
        }
    }
}
