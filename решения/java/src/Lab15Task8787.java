import java.util.List;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Lab15Task8787 {
    public static void main(String[] args) {
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

    static void Step7991() {
        System.out.println();
        System.out.println("7991");
        double[] in7991x = {6.35, 4.71, 19.99, 10, -2.28};
        double[] in7991y = {2.7, 2.59, -1.57, 10, 16.92};
        double[] in7991z = {5.08, -18.55, 2.75, 10, 6.14};
        for (int i = 0; i < in7991x.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Double> result = Lab05.task7991(
                    in7991x[i], in7991y[i], in7991z[i]);
            for (Double item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    static void Step8418() {
        System.out.println();
        System.out.println("8418");
        int[] in8418 = {6, 385, -9};
        for (int i = 0; i < in8418.length; i++){
            try {
                StringBuilder sb = new StringBuilder();
                List<Integer> result = Lab06.task8418(in8418[i]);
                for (Integer item : result) {
                    sb.append(item);
                    sb.append(" ");
                }
                System.out.println(sb.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step5053() {
        System.out.println();
        System.out.println("5053");
        int[] in5053a = {8, 691, 27};
        int[] in5053b = {13, 702, 17};
        for (int i = 0; i < in5053a.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = Lab06.task5053(in5053a[i], in5053b[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    static void Step2321() {
        System.out.println();
        System.out.println("2321");
        int[] in2321a = {8, 691, 23};
        int[] in2321b = {13, 702, 11};
        for (int i = 0; i < in2321a.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = Lab06.task2321(in2321a[i], in2321b[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    private static void Step9279() {
        System.out.println();
        System.out.println("9279");
        String[] in9279 = {"ab","bc","ac","xz","cde","a"};
        for (int i = 0; i < in9279.length; i++){
            try {
                StringBuilder sb = new StringBuilder();
                List<Integer> result = Lab08.task9279(in9279[i]);
                for(Integer item : result){
                    sb.append(item);
                    sb.append(" ");
                }
                System.out.println(sb);
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step3657() {
        System.out.println();
        System.out.println("3657");
        String[] in3657 = {"a","b","j","z","xy", ""};
        String[] out3657 = {
            "28 30 57 65 88 99 100 104 125 132 145 218 221 226 244 256 257 267 273 290 292 293 298 307 333 382 388 407 421 426 436 439 441 442 446 448 453 454 462 470 477 478 501 503 508 517 523 533 536 546 558 577 578 587 591 599 616 628 635 659 663 666 682 684 685 697 703 708 725 731 740 749 771 804 812 820 856 857 871 872 879 884 890 891 902 908 916 934 946 955 963 968 976 979 986",
            "4 14 16 46 53 56 61 68 73 90 120 138 146 150 155 158 166 170 203 214 251 253 271 274 318 325 332 341 351 352 383 389 395 396 398 416 440 498 502 522 568 574 597 602 608 622 638 640 641 648 689 717 722 724 737 742 764 794 795 826 833 875 877 888 909 922 923 937 938 941 947 961 978 983 992",
            "0 2 3 5 6 15 18 20 22 24 26 27 34 37 42 44 47 51 55 58 62 64 71 72 75 77 79 82 83 87 91 92 102 103 105 106 107 109 110 121 122 124 126 127 131 133 136 139 142 144 152 153 157 161 163 164 165 168 171 173 176 177 178 180 183 184 185 187 189 190 191 193 195 197 200 201 210 212 216 222 224 227 229 232 237 238 243 246 247 254 255 259 261 263 265 270 283 286 289 297 299 305 309 313 319 323 335 337 338 345 349 350 355 357 359 361 362 366 370 371 375 376 392 393 399 400 401 413 414 418 419 424 425 428 429 431 438 452 455 458 461 466 467 471 481 484 486 490 492 495 506 509 510 513 516 521 526 527 529 535 537 538 540 547 548 550 554 555 559 560 561 562 565 567 570 571 573 575 576 586 589 593 603 605 609 612 614 618 625 627 632 637 642 644 649 650 651 653 658 662 664 670 671 673 674 676 678 679 681 683 694 698 701 706 707 709 710 712 713 714 716 719 723 728 733 736 738 739 741 743 747 750 751 753 760 762 766 768 773 776 778 779 783 786 787 789 796 799 802 805 806 808 816 817 818 821 822 831 834 835 839 843 845 848 849 853 855 860 861 865 873 874 876 882 885 886 887 894 900 901 912 914 915 920 921 925 928 931 932 935 940 943 944 945 951 956 964 965 967 969 981 985 996 997",
            "",
            "ожидается исключение",
            "ожидается исключение"
        };
        for (int i = 0; i < in3657.length; i++){
            try {
                StringBuilder sb = new StringBuilder();
                List<Integer> result = Lab08.task3657(in3657[i]);
                for(Integer item : result){
                    sb.append(item);
                    sb.append(" ");
                }
                if (out3657[i].equals(sb.toString().trim())){
                    System.out.println("Задача решена верно");
                } else {
                    sb.insert(0, "Неверно. Результат:\n");
                    System.out.println(sb.toString());
                }
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step6599() {
        System.out.println();
        System.out.println("6599");
        String[] in6599 = {"a",
            "\"b\"",
            "\"c",
            "d\"",
            "\"e\"e",
            "f\"f\"f",
            "\"abc\" \"defgh\" \"i\" \"jklm\"",
            "abc\" \"def\" \"ghi\" \"jk\" \"lm\"",
            "\"[abc\"def] \"[ghijklm]\""
        };
        for (int i = 0; i < in6599.length; i++) {
            try {
                System.out.println(Lab08.task6599(in6599[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step7703() {
        System.out.println();
        System.out.println("7703");
        String[] in7703 = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3",
                "3 2 2 2 2 2",
                "4 4 4 4 4 4"
        };
        String[] out7703 = {
            "2 2 1 1 2 2",
            "3 3 3 2 3 3 3 2 3 3 3",
            "1 5 5 5 5 5",
            "6 6 6 6 6 6"};
        for (int i = 0; i < in7703.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = Lab07.task7703(in7703[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
            System.out.println(out7703[i]);
            System.out.println();
        }
    }

    private static void Step3218() {
        System.out.println();
        System.out.println("3218");
        String[] in3218 = {
                "4 1 1 1",
                "1 4 2 1",
                "3 4 1 5",
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3"
        };
        String[] out3218 = {
            "1 1 1 4",
            "1 1 2 4",
            "1 3 4 5",
            "1 1 2 2 3 4",
            "1 1 1 2 2 2 3 3 3 4 4"};
        for (int i = 0; i < in3218.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = Lab07.task3218(in3218[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
            System.out.println(out3218[i]);
            System.out.println();
        }
    }

    private static void Step8820() {
        System.out.println();
        System.out.println("8820");
        String[] in8820 = {
            "q w e r t y",
            "as df gh",
            "q w e r t y a s d f g"
        };
        String[] out8820 = {
            "y t r e w q",
            "gh df as",
            "g f d s a y t r e w q"
        };
        for (int i = 0; i < in8820.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<String> result = Lab07.task8820(in8820[i]);
            for (String item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
            System.out.println(out8820[i]);
            System.out.println();
        }
    }

    private static void Step4497() {
        System.out.println();
        System.out.println("4497");
        int[] in4497x = {1, 3, 5};
        int[] in4497y = {33, 55, 1};
        String in4497data = "1 2 3 4 1 2";
        for (int i = 0; i < in4497x.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = Lab07.task4497(
                    in4497x[i], in4497y[i], in4497data);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    private static void Step9271() {
        System.out.println();
        System.out.println("9271");
        String[] in9271 = {
                "1 2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 1 2",
                "4 2 3 4 3 2",
                "4 4 4 4 4 3 2 1",
                "4 4 4 4",
                "4 3"
        };
        for (int i = 0; i < in9271.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = Lab07.task9271(in9271[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    private static void Step3333() {
        System.out.println();
        System.out.println("3333");
        int[] in3333s = {1, 3, 6, 8, 99, -2, -9};
        String in3333data = "q w e r t y";
        for (int i = 0; i < in3333s.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<String> result = Lab07.task3333(in3333s[i], in3333data);
            for (String item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    private static void Step9711() {
        System.out.println();
        System.out.println("9711");
        String[] in9711 = {
            "q w e r t y",
            "a s d f g h j k l m",
            "zx cv bn m",
            ""
        };
        for (int i = 0; i < in9711.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<String> result = Lab07.task9711(in9711[i]);
            for (String item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    private static void Step9774() {
        System.out.println();
        System.out.println("9774");
        int[] in9774m = {31, -3, 11, 73};
        String[] in9774data = {"9 8 7 6 5 4",
            "9 8 7 6 5 4",
            "98 76 54",
            ""};
        for (int i = 0; i < in9774m.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = Lab07.task9774(in9774m[i], in9774data[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    private static void Step3134() {
        System.out.println();
        System.out.println("3134");
        int[] in3134p = {0, 2, 4, -1, 2, 19, 1};
        int[] in3134q = {3, 5, 2, 5, 17, 2, -5};
        String in3134data = "q w e r t y";
        for (int i = 0; i < in3134p.length; i++) {
            try {
                StringBuilder sb = new StringBuilder();
                List<String> result = Lab07.task3134(
                        in3134p[i], in3134q[i], in3134data);
                for (String item : result) {
                    sb.append(item);
                    sb.append(" ");
                }
                System.out.println(sb.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step8311() {
        System.out.println();
        System.out.println("8311");
        int[] in8311b = {0, 1, 2, 3, 2, 8, 11, -1, 8};
        int[] in8311e = {3, 3, 3, 10, 2, 2, 8, 5, 50};
        String[] in8311data = {
            "z x c v b",
            "z x c v b",
            "z x c v b",
            "z x c v b a s d f g h",
            "z x c v b a s d f g h",
            "z x c v b a s d f g h",
            "z x c v b a s d f g h",
            "z x c v b a s d f g h",
            "z x c v b a s d f g h"
        };
        for (int i = 0; i < in8311b.length; i++) {
            try {
                StringBuilder sb = new StringBuilder();
                List<String> result = Lab07.task8311(
                        in8311b[i], in8311e[i], in8311data[i]);
                for (String item : result) {
                    sb.append(item);
                    sb.append(" ");
                }
                System.out.println(sb.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step3940() {
        System.out.println();
        System.out.println("3940");
        String[] in3940l = {
                "1 2 3 4 1",
                "1 2 3 4 1 3 4 4 4 4",
                "1 2 3",
                "1 2 3"
        };
        String[] in3940r = {
                "2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 4",
                "3 4",
                "3 4 1 2"
        };
        for (int i = 0; i < in3940l.length; i++) {
            try {
                StringBuilder sb = new StringBuilder();
                List<Integer> result = Lab07.task3940(in3940l[i], in3940r[i]);
                for (Integer item : result) {
                    sb.append(item);
                    sb.append(" ");
                }
                System.out.println(sb.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step1223() {
        System.out.println();
        System.out.println("1223");
        String[] in1223 = {
                "q w e r t y",
                "q w e r t y q w e r",
                "as df gh jk",
                ""
        };
        for (int i = 0; i < in1223.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<String> result = Lab07.task1223(in1223[i]);
            for (String item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}
