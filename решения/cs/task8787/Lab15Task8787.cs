using Methods;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace task8787
{
    class Lab15Task8787
    {
        static void Main(string[] args)
        {
            Step7991();
            Step2321();
            Step5053();
            Step8418();
            Step9279();

            Step3657();
            Step6599();
            Step1223();
            Step3940();
            Step8311();

            Step3134();
            Step9774();
            Step9711();
            Step3333();
            Step9271();

            Step4497();
            Step8820();
            Step3218();
            Step7703();
        }

        private static void Step7991()
        {
            Console.WriteLine();
            Console.WriteLine("7991");
            double[] in7991x = { 6.35, 4.71, 19.99, 10, -2.28 };
            double[] in7991y = { 2.7, 2.59, -1.57, 10, 16.92 };
            double[] in7991z = { 5.08, -18.55, 2.75, 10, 6.14 };
            for (int i = 0; i < in7991x.Length; i++)
            {
                IList<double> result = Lab05.Task7991(in7991x[i], in7991y[i], in7991z[i]);
                Console.WriteLine(String.Join(" ", result));
            }
        }

        private static void Step2321()
        {
            Console.WriteLine();
            Console.WriteLine("2321");
            Console.WriteLine(String.Join(" ", Lab06.Task2321(8, 13)));
            Console.WriteLine(String.Join(" ", Lab06.Task2321(691, 702)));
            Console.WriteLine(String.Join(" ", Lab06.Task2321(23, 11)));
        }

        private static void Step5053()
        {
            Console.WriteLine();
            Console.WriteLine("5053");
            Console.WriteLine(String.Join(" ", Lab06.Task5053(8, 13)));
            Console.WriteLine(String.Join(" ", Lab06.Task5053(691, 702)));
            Console.WriteLine(String.Join(" ", Lab06.Task5053(27, 17)));
        }

        private static void Step8418()
        {
            Console.WriteLine();
            Console.WriteLine("8418");
            int[] in8418 = { 6, 385, -9 };
            for (int i = 0; i < in8418.Length; i++)
            {
                try
                {
                    var result = Lab06.Task8418(in8418[i]);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step9279()
        {
            Console.WriteLine();
            Console.WriteLine("9279");
            String[] in9279 = { "ab", "bc", "ac", "xz", "cde", "a" };
            for (int i = 0; i < in9279.Length; i++)
            {
                try
                {
                    StringBuilder sb = new StringBuilder();
                    IList<int> result = Lab08.Task9279(in9279[i]);
                    foreach (int item in result)
                    {
                        sb.Append(item);
                        sb.Append(" ");
                    }
                    Console.WriteLine(sb.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step1223()
        {
            Console.WriteLine();
            Console.WriteLine("1223");
            String[] in1223 = {
                "q w e r t y",
                "q w e r t y q w e r",
                "as df gh jk",
                ""};
            for (int i = 0; i < in1223.Length; i++)
            {
                var result = String.Join(" ", Lab07.Task1223(in1223[i]));
                Console.WriteLine(result);
            }

            Console.WriteLine();
            Console.WriteLine("1223");

            String[] in1223t1 = { "q", "w", "e", "r", "t", "y" };
            Lab07.Task1223(in1223t1);
            Console.WriteLine(String.Join(" ", in1223t1));

            String[] in1223t2 = { "q", "w", "e", "r", "t", "y", "q", "w", "e", "r" };
            Lab07.Task1223(in1223t2);
            Console.WriteLine(String.Join(" ", in1223t2));

            String[] in1223t3 = { "as", "df", "gh", "jk" };
            Lab07.Task1223(in1223t3);
            Console.WriteLine(String.Join(" ", in1223t3));

            String[] in1223t4 = { };
            Lab07.Task1223(in1223t4);
            Console.WriteLine(String.Join(" ", in1223t4));
        }

        private static void Step3940()
        {
            Console.WriteLine();
            Console.WriteLine("3940");
            String[] in3940l = {
                "1 2 3 4 1",
                "1 2 3 4 1 3 4 4 4 4",
                "1 2 3",
                "1 2 3"};
            String[] in3940r = {
                "2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 4",
                "3 4",
                "3 4 1 2"};
            for (int i = 0; i < in3940l.Length; i++)
            {
                try
                {
                    var result = Lab07.Task3940(in3940l[i], in3940r[i]);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step8311()
        {
            Console.WriteLine();
            Console.WriteLine("8311");
            int[] in8311b = { 0, 1, 2, 3, 2, 8, 11, -1, 8 };
            int[] in8311e = { 3, 3, 3, 10, 2, 2, 8, 5, 50 };
            String[] in8311data = {
                "z x c v b",
                "z x c v b",
                "z x c v b",
                "z x c v b a s d f g h",
                "z x c v b a s d f g h",
                "z x c v b a s d f g h",
                "z x c v b a s d f g h",
                "z x c v b a s d f g h",
                "z x c v b a s d f g h"};
            for (int i = 0; i < in8311b.Length; i++)
            {
                try
                {
                    var result = Lab07.Task8311(in8311b[i], in8311e[i], in8311data[i]);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step3134()
        {
            Console.WriteLine();
            Console.WriteLine("3134");
            int[] in3134p = { 0, 2, 4, -1, 2, 19, 1 };
            int[] in3134q = { 3, 5, 2, 5, 17, 2, -5 };
            String in3134data = "q w e r t y";
            for (int i = 0; i < in3134p.Length; i++)
            {
                try
                {
                    var result = Lab07.Task3134(in3134p[i], in3134q[i], in3134data);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step9774()
        {
            Console.WriteLine();
            Console.WriteLine("9774");
            int[] in9774m = { 31, -3, 11, 73 };
            String[] in9774data = {
                "9 8 7 6 5 4",
                "9 8 7 6 5 4",
                "98 76 54",
                ""};
            for (int i = 0; i < in9774m.Length; i++)
            {
                var result = Lab07.Task9774(in9774m[i], in9774data[i]);
                Console.WriteLine(String.Join(" ", result));
            }
        }

        private static void Step9711()
        {
            Console.WriteLine();
            Console.WriteLine("9711");
            String[] in9711 = {
                "q w e r t y",
                "a s d f g h j k l m",
                "zx cv bn m",
                ""};
            for (int i = 0; i < in9711.Length; i++)
            {
                var result = Lab07.Task9711(in9711[i]);
                Console.WriteLine(String.Join(" ", result));
            }
        }

        private static void Step3333()
        {
            Console.WriteLine();
            Console.WriteLine("3333");
            int[] in3333s = { 1, 3, 6, 8, 99, -2, -9 };
            String in3333data = "q w e r t y";
            for (int i = 0; i < in3333s.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<String> result = Lab07.Task3333(in3333s[i], in3333data);
                foreach (String item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        private static void Step9271()
        {
            Console.WriteLine();
            Console.WriteLine("9271");
            String[] in9271 = {
                "1 2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 1 2",
                "4 2 3 4 3 2",
                "4 4 4 4 4 3 2 1",
                "4 4 4 4",
                "4 3"};
            for (int i = 0; i < in9271.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<int> result = Lab07.Task9271(in9271[i]);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        private static void Step4497()
        {
            Console.WriteLine();
            Console.WriteLine("4497");
            int[] in4497x = { 1, 3, 5 };
            int[] in4497y = { 33, 55, 1 };
            String in4497data = "1 2 3 4 1 2";
            String[] out4497 = {
                "33 2 3 4 33 2",
                "1 2 55 4 1 2",
                "1 2 3 4 1 2"};
            for (int i = 0; i < in4497x.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<int> result = Lab07.Task4497(in4497x[i], in4497y[i], in4497data);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        private static void Step8820()
        {
            Console.WriteLine();
            Console.WriteLine("8820");
            String[] in8820 = {
                "q w e r t y",
                "as df gh",
                "q w e r t y a s d f g"};
            for (int i = 0; i < in8820.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<string> result = Lab07.Task8820(in8820[i]);
                foreach (string item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        private static void Step3218()
        {
            Console.WriteLine();
            Console.WriteLine("3218");
            String[] in3218 = {
                "4 1 1 1",
                "1 4 2 1",
                "3 4 1 5",
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3"};
            String[] out3218 = {
                "1 1 1 4",
                "1 1 2 4",
                "1 3 4 5",
                "1 1 2 2 3 4",
                "1 1 1 2 2 2 3 3 3 4 4"};
            for (int i = 0; i < in3218.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<int> result = Lab07.Task3218(in3218[i]);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
                Console.WriteLine(out3218[i]);
                Console.WriteLine();
            }
        }

        private static void Step7703()
        {
            Console.WriteLine();
            Console.WriteLine("7703");
            String[] in7703 = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3",
                "3 2 2 2 2 2",
                "4 4 4 4 4 4"};
            String[] out7703 = {
                "2 2 1 1 2 2",
                "3 3 3 2 3 3 3 2 3 3 3",
                "1 5 5 5 5 5",
                "6 6 6 6 6 6"};
            for (int i = 0; i < in7703.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                IList<int> result = Lab07.Task7703(in7703[i]);
                foreach (int item in result)
                {
                    sb.Append(item);
                    sb.Append(" ");
                }
                Console.WriteLine(sb.ToString());
                Console.WriteLine(out7703[i]);
                Console.WriteLine();
            }
        }


        static void Step3657()
        {
            Console.WriteLine();
            Console.WriteLine("3657");
            String[] in3657 = { "a", "b", "j", "z", "xy", "" };
            String[] out3657 = {
                "28 30 57 65 88 99 100 104 125 132 145 218 221 226 244 256 257 267 273 290 292 293 298 307 333 382 388 407 421 426 436 439 441 442 446 448 453 454 462 470 477 478 501 503 508 517 523 533 536 546 558 577 578 587 591 599 616 628 635 659 663 666 682 684 685 697 703 708 725 731 740 749 771 804 812 820 856 857 871 872 879 884 890 891 902 908 916 934 946 955 963 968 976 979 986",
                "4 14 16 46 53 56 61 68 73 90 120 138 146 150 155 158 166 170 203 214 251 253 271 274 318 325 332 341 351 352 383 389 395 396 398 416 440 498 502 522 568 574 597 602 608 622 638 640 641 648 689 717 722 724 737 742 764 794 795 826 833 875 877 888 909 922 923 937 938 941 947 961 978 983 992",
                "0 2 3 5 6 15 18 20 22 24 26 27 34 37 42 44 47 51 55 58 62 64 71 72 75 77 79 82 83 87 91 92 102 103 105 106 107 109 110 121 122 124 126 127 131 133 136 139 142 144 152 153 157 161 163 164 165 168 171 173 176 177 178 180 183 184 185 187 189 190 191 193 195 197 200 201 210 212 216 222 224 227 229 232 237 238 243 246 247 254 255 259 261 263 265 270 283 286 289 297 299 305 309 313 319 323 335 337 338 345 349 350 355 357 359 361 362 366 370 371 375 376 392 393 399 400 401 413 414 418 419 424 425 428 429 431 438 452 455 458 461 466 467 471 481 484 486 490 492 495 506 509 510 513 516 521 526 527 529 535 537 538 540 547 548 550 554 555 559 560 561 562 565 567 570 571 573 575 576 586 589 593 603 605 609 612 614 618 625 627 632 637 642 644 649 650 651 653 658 662 664 670 671 673 674 676 678 679 681 683 694 698 701 706 707 709 710 712 713 714 716 719 723 728 733 736 738 739 741 743 747 750 751 753 760 762 766 768 773 776 778 779 783 786 787 789 796 799 802 805 806 808 816 817 818 821 822 831 834 835 839 843 845 848 849 853 855 860 861 865 873 874 876 882 885 886 887 894 900 901 912 914 915 920 921 925 928 931 932 935 940 943 944 945 951 956 964 965 967 969 981 985 996 997",
                "",
                "ожидается исключение",
                "ожидается исключение"
            };
            for (int i = 0; i < in3657.Length; i++)
            {
                try
                {
                    StringBuilder sb = new StringBuilder();
                    IList<int> result = Lab08.Task3657(in3657[i]);
                    foreach (int item in result)
                    {
                        sb.Append(item);
                        sb.Append(" ");
                    }
                    if (out3657[i].Equals(sb.ToString().Trim()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else
                    {
                        sb.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(sb.ToString());
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        static void Step6599()
        {
            Console.WriteLine();
            Console.WriteLine("6599");
            String[] in6599 = {"a",
                "\"b\"",
                "\"c",
                "d\"",
                "\"e\"e",
                "f\"f\"f",
                "\"abc\" \"defgh\" \"i\" \"jklm\"",
                "abc\" \"def\" \"ghi\" \"jk\" \"lm\"",
                "\"[abc\"def] \"[ghijklm]\""};
            for (int i = 0; i < in6599.Length; i++)
            {
                try
                {
                    Console.WriteLine(Lab08.Task6599(in6599[i]));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step6497()
        {
            Console.WriteLine();
            Console.WriteLine("6497");
            String[] in6497 = {
                "9 8 9 1 1 5 1 1",
                "5 5 5 5 5",
                "",
                "1000000 1 1"
            };
            for (int i = 0; i < in6497.Length; i++)
            {
                StringBuilder sb = new StringBuilder();
                List<Double> result = Lab07.task6497(in6497[i]);
                foreach (Double item in result)
                {
                    sb.Append(String.Format("{0}", item));
                    sb.Append("  ");
                }
                Console.WriteLine(sb.ToString());
            }
        }

        private static void Step5648()
        {
            Console.WriteLine();
            Console.WriteLine("5648");
            String[] in5648 = {
                "9 8 9 1 1 5 1 1",
                "5 5 5 5 5",
                "",
                "1000000 1 1"
            };
            for (int i = 0; i < in5648.Length; i++)
            {
                try
                {
                    double sigma = Lab07.task5648(in5648[i]);
                    Console.WriteLine("{0}", sigma);
                }
                catch (ArgumentException e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }
    }
}
