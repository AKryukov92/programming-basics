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
    public class RangeSuite
    {
        [TestMethod]
        public void HasIntersectionIntsTest()
        {
            Assert.IsFalse(Range.HasIntersection(2, 3, 5, 7));
            Assert.IsTrue(Range.HasIntersection(11, 17, 13, 19));
            Assert.IsTrue(Range.HasIntersection(23, 37, 29, 31));
            Assert.IsTrue(Range.HasIntersection(43, 53, 41, 47));
            Assert.IsTrue(Range.HasIntersection(5, 15, 0, 30));
            Assert.IsFalse(Range.HasIntersection(67, 71, 59, 61));
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void HasIntersectionIntsAssertionWrongLeft()
        {
            Range.HasIntersection(79, 73, 83, 89);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void HasIntersectionIntsAssertionWrongRight()
        {
            Range.HasIntersection(97, 101, 107, 103);
        }

        [TestMethod]
        public void HasIntersectionRangesTest()
        {
            Range left, right;
            left = new Range(2, 3);
            right = new Range(5, 7);
            Assert.IsFalse(Range.HasIntersection(left, right));
            left.Init(11, 17);
            right.Init(13, 19);
            Assert.IsTrue(Range.HasIntersection(left, right));
            left.Init(23, 37);
            right.Init(29, 31);
            Assert.IsTrue(Range.HasIntersection(left, right));
            left.Init(43, 53);
            right.Init(41, 47);
            Assert.IsTrue(Range.HasIntersection(left, right));
            left.Init(5, 15);
            right.Init(0, 30);
            Assert.IsTrue(Range.HasIntersection(left, right));
            left.Init(67, 71);
            right.Init(59, 61);
            Assert.IsFalse(Range.HasIntersection(left, right));
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void HasIntersectionRangesAssertionWrongLeft()
        {
            Range left, right;
            left = new Range(79, 73);
            right = new Range(83, 89);
            Range.HasIntersection(left, right);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void HasIntersectionRangesAssertionWrongRight()
        {
            Range left, right;
            left = new Range(97, 101);
            right = new Range(107, 103);
            Range.HasIntersection(left, right);
        }

        [TestMethod]
        public void IntersectsIntsTest()
        {
            Range left = new Range(2, 3);
            Assert.IsFalse(left.Intersects(5, 7));
            left.Init(11, 17);
            Assert.IsTrue(left.Intersects(13, 19));
            left.Init(23, 37);
            Assert.IsTrue(left.Intersects(29, 31));
            left.Init(43, 53);
            Assert.IsTrue(left.Intersects(41, 47));
            left.Init(5, 15);
            Assert.IsTrue(left.Intersects(0, 30));
            left.Init(67, 71);
            Assert.IsFalse(left.Intersects(59, 61));
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void IntersectsIntWrongLeftTest()
        {
            Range left = new Range(79, 73);
            left.Intersects(83, 89);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void IntersectsIntWrongRightTest()
        {
            Range left = new Range(97, 101);
            left.Intersects(107, 103);
        }

        [TestMethod]
        public void IntersectsRangeTest()
        {
            Range left, right;
            left = new Range(2, 3);
            right = new Range(5, 7);
            Assert.IsFalse(left.Intersects(right));
            left.Init(11, 17);
            right.Init(13, 19);
            Assert.IsTrue(left.Intersects(right));
            left.Init(23, 37);
            right.Init(29, 31);
            Assert.IsTrue(left.Intersects(right));
            left.Init(43, 53);
            right.Init(41, 47);
            Assert.IsTrue(left.Intersects(right));
            left.Init(5, 15);
            right.Init(0, 30);
            Assert.IsTrue(left.Intersects(right));
            left.Init(67, 71);
            right.Init(59, 61);
            Assert.IsFalse(left.Intersects(right));
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void IntersectsRangeTestWrongLeftTest()
        {
            Range left, right;
            left = new Range(79, 73);
            right = new Range(83, 89);
            left.Intersects(right);
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void IntersectsRangeTestWrongRightTest()
        {
            Range left, right;
            left = new Range(97, 101);
            right = new Range(107, 103);
            left.Intersects(right);
        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void ConstructorWrongTest()
        {
            Range range = new Range(15, 5);
        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void InitWrongTest()
        {
            Range range = new Range(0, 0);
            range.Init(15, 5);
        }

        [TestMethod]
        public void RangeEqualsItself()
        {
            Range r = new Range(0, 0);
            Assert.IsTrue(r.Equals(r));
        }
        [TestMethod]
        public void RangeInstanceComparison()
        {
            Range r1, r2, i1, i2, i3;
            r1 = new Range(10, 15);
            r2 = new Range(10, 15);
            i1 = new Range(10, 20);
            i2 = new Range(0, 15);
            i3 = new Range(0, 20);
            Range[] arrR = new Range[] { r1, r2 };
            Range[] arrI = new Range[] { i1, i2, i3 };

            Assert.IsTrue(r1.Equals(r2));
            Assert.IsTrue(r2.Equals(r1));
            foreach (var r in arrR)
            {
                foreach (var i in arrI)
                {
                    Assert.IsFalse(r.Equals(i));
                    Assert.IsFalse(i.Equals(r));
                }
            }
        }
        [TestMethod]
        public void RangeNotEqualNull()
        {
            Range r = new Range(0, 0);
            Assert.IsFalse(r.Equals(null));
        }
        [TestMethod]
        public void RangeNotEqualOtherClass()
        {
            Range r = new Range(0, 0);
            Assert.IsFalse(r.Equals("Not a range"));
        }

        [TestMethod]
        public void Task8265test1()
        {
            Range actual = new Range(3, 5);
            actual.Shift(7);
            Range expected = new Range(10, 12);
            Assert.IsTrue(actual.Equals(expected));
        }
        [TestMethod]
        public void Task8265test2()
        {
            Range actual = new Range(31, 43);
            actual.Shift(-6);
            Range expected = new Range(25, 37);
            Assert.IsTrue(actual.Equals(expected));
        }
        [TestMethod]
        public void Task8265test3()
        {
            Range actual = new Range(10, 50);
            actual.Squeeze(30);
            Range expected = new Range(10, 20);
            Assert.IsTrue(actual.Equals(expected));
        }
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Task8265test4()
        {
            Range actual = new Range(23, 51);
            actual.Squeeze(100);
        }
        [TestMethod]
        public void Task8265test5()
        {
            Range actual = new Range(19, 29);
            actual.Squeeze(-5);
            Range expected = new Range(19, 34);
            Assert.IsTrue(actual.Equals(expected));
        }
    }
}
