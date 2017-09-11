import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author akryukov
 *         08.09.2017
 */
public class Lab10 {
    private static final int VIEWPORT_WIDTH = 800;
    private static final int VIEWPORT_HEIGHT = 600;

    public static void main(String[] args) {
        step6409();
    }

    private static void step9300() {
        System.out.println("9300");
        int[] in9300cx = {0, 400, 600, 254, 400, 300, 100, 300, 600, 900};
        int[] in9300cy = {0, 300, 400, 356, 300, 300, 100, 250, 800, 200};
        int[] in9300r = {20, 200, 60, 100, 50, 0, 150, 80, 50, 51};
        int[] in9300strokeWidth = {5, 0, 10, 80, 100, 25, 20, 162, 100, 102};
        for (int i = 0; i < in9300cx.length; i++) {
            try {
                task9300(in9300cx[i], in9300cy[i], in9300r[i], in9300strokeWidth[i], i + 1);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void step3951() {
        System.out.println("3951");
        int[] in3951x = {400, 135, 400, 200, 120, 200, 400, 1200, 601};
        int[] in3951y = {300, 100, 100, 200, 120, 200, 300, 600, 601};
        int[] in3951width = {250, 350, 200, 1, 0, 100, 420, 50, 51};
        int[] in3951height = {250, 100, 300, 100, 180, 0, 100, 100, 101};
        for (int i = 0; i < in3951x.length; i++) {
            try {
                task3951(in3951x[i], in3951y[i], in3951width[i], in3951height[i], i);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void step7343() {
        System.out.println("7343");
        int[] in7343x = {200, 150, 200, 250, 200, 700, 300, 25, 700, -10, 100};
        int[] in7343y = {200, 180, 200, 250, 120, 100, 300, 25, 500, 810, 650};
        int[] in7343width = {300, 120, 100, 0, 120, 150, 200, 100, 99, 100, 80};
        int[] in7343height = {100, 300, 100, 100, 0, 200, 200, 100, 102, 100, 80};
        int[] in7343r = {40, 50, 120, 20, 25, 20, 0, 50, 3, 100, 45};
        for (int i = 0; i < in7343x.length; i++) {
            try {
                task7343(in7343x[i], in7343y[i], in7343width[i], in7343height[i], in7343r[i], i);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void step7060() {
        System.out.println("7060");
        int[] in7060x1 = {10, 25, 500, 60, 100, 150, 100, 5, 200, 102, 105, 150, 0};
        int[] in7060y1 = {10, 25, 200, 70, 100, 150, 0, 0, 200, 200, 5, 150, 0};
        int[] in7060w1 = {200, 200, 100, 120, 200, 150, 100, 10, 100, 100, 10, 50, 802};
        int[] in7060h1 = {100, 200, 200, 200, 200, 300, 500, 10, 100, 20, 10, 300, 200};
        int[] in7060x2 = {50, 225, 10, 50, 200, 150, 0, 0, 900, 0, 100, 100, 0};
        int[] in7060y2 = {50, 225, 400, 50, 200, 150, 200, 5, 200, 500, 0, 100, 0};
        int[] in7060w2 = {300, 200, 100, 120, 50, 150, 700, 10, 100, 100, 10, 300, 610};
        int[] in7060h2 = {350, 200, 120, 200, 50, 300, 100, 10, 10, 120, 30, 200, 610};
        for (int i = 0; i < in7060x1.length; i++) {
            try {
//                System.out.printf("<tr>\n" +
//                    "    <td></td>\n" +
//                    "    <td>%d</td>\n" +
//                    "    <td>%d</td>\n" +
//                    "    <td>%d</td>\n" +
//                    "    <td>%d</td>\n" +
//                    "    <td>%d</td>\n" +
//                    "    <td>%d</td>\n" +
//                    "    <td>%d</td>\n" +
//                    "    <td>%d</td>\n", in7060x1[i], in7060y1[i], in7060w1[i], in7060h1[i], in7060x2[i], in7060y2[i], in7060w2[i], in7060h2[i]);
                task7060(in7060x1[i], in7060y1[i], in7060w1[i], in7060h1[i], in7060x2[i], in7060y2[i], in7060w2[i], in7060h2[i], i + 1);
//                System.out.println("    <td><img src=\"images/task7060/test" + (i + 1) + ".png\" class=\"example_image\"/></td>");
            } catch (IllegalArgumentException ex) {
//                System.out.print("    <td>");
                System.out.print(ex.getMessage());
//                System.out.println("</td>");
            }
//            System.out.println("</tr>");
        }
    }

    private static void step6409() {
        System.out.println("6409");
        int[] in6409x = {5, 300, 100, 25, 100, 600, 200, 200, 807};
        int[] in6409y = {5, 20, 200, 25, 102, 100, 200, 640, 120};
        int[] in6409a = {500, 20, 200, 0, 200, 210, 200, 120, 200};
        int[] in6409l = {300, 200, 200, 110, 0, 100, 100, 240, 300};
        for (int i = 0; i < in6409a.length; i++) {
            try {
                task6409(in6409x[i], in6409y[i], in6409a[i], in6409l[i], i + 1);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void writeToHtml(String fn, String content) {
        String filename = "out/" + fn;
        try (PrintWriter writer = new PrintWriter(filename, "UTF-8")) {
            writer.println("<!DOCTYPE html>" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>\n" +
                "<h1>");
            writer.println(filename);
            writer.println("</h1>\n" +
                "<svg width=\"800\" height=\"600\">");
            writer.println(content);
            writer.println("</svg>\n" +
                "</body>\n" +
                "</html>");
            Desktop.getDesktop().open(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task6409(int x, int y, int a, int l, int i) {
        if (a == 0) {
            throw new IllegalArgumentException("Длина основания должна быть положительна");
        }
        if (l == 0) {
            throw new IllegalArgumentException("Длина боковой стороны должна быть положительна");
        }
        if (a >= l * 2) {
            throw new IllegalArgumentException("Невозможно сформировать треугольник с данными длинами сторон");
        }
        int x1 = x + a;
        int y1 = y;
        int half = a / 2;
        int x2 = x + half;
        int y2 = y + (int) Math.sqrt(l * l - half * half);
        if(x > VIEWPORT_WIDTH || x1 > VIEWPORT_WIDTH || x2 > VIEWPORT_WIDTH){
            throw new IllegalArgumentException("Фигура не помещается внутри рисунка");
        }
        if(y > VIEWPORT_HEIGHT || y1 > VIEWPORT_HEIGHT || y2 > VIEWPORT_HEIGHT){
            throw new IllegalArgumentException("Фигура не помещается внутри рисунка");
        }
        String lineString = "<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\" stroke=\"blue\" stroke-width=\"1\"/>";
        String line1 = String.format(lineString, x, y, x1, y1);
        String line2 = String.format(lineString, x, y, x2, y2);
        String line3 = String.format(lineString, x1, y1, x2, y2);
        String filename = "task6409_" + i + ".html";
        String result = line1 + line2 + line3;
        System.out.println(result);
        writeToHtml(filename, result);
    }

    public static void task9300(int cx, int cy, int r, int strokeWidth, int testId) {
        if (r < 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным");
        }
        if (cx < r) {
            throw new IllegalArgumentException("Левая точка круга должна иметь неотрицательные координаты");
        }
        if (cy < r) {
            throw new IllegalArgumentException("Верхняя точка круга должна иметь неотрицательные координаты");
        }
        if (cy + r > VIEWPORT_HEIGHT) {
            throw new IllegalArgumentException("Нижняя точка круга должна быть в пределах рисунка");
        }
        if (cx + r > VIEWPORT_WIDTH) {
            throw new IllegalArgumentException("Правая точка круга должна быть в пределах рисунка");
        }
        if (r * 2 < strokeWidth) {
            throw new IllegalArgumentException("Толщина обводки должна быть меньше диаметра круга");
        }
        String str = String.format("<circle cx=\"%d\" cy=\"%d\" r=\"%d\" stroke=\"green\" stroke-width=\"%d\" fill=\"yellow\" />", cx, cy, r, strokeWidth);
        System.out.println(str);
        String filename = "task9300_" + testId + ".html";
        writeToHtml(filename, str);
    }

    public static void task3951(int x, int y, int width, int height, int testId) {
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина прямоугольника должна быть положительной");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Высота прямоугольника должна быть положительной");
        }
        if (x + width > VIEWPORT_WIDTH) {
            throw new IllegalArgumentException("Правая сторона прямоугольника должна быть в пределах рисунка");
        }
        if (y + height > VIEWPORT_HEIGHT) {
            throw new IllegalArgumentException("Нижняя сторона прямоугольника должна быть в пределах рисунка");
        }
        String filename = "task3951_" + testId + ".html";
        String str = String.format("<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\" fill=\"red\" stroke=\"blue\"/>", x, y, width, height);
        writeToHtml(filename, str);
    }

    public static void task7343(int x, int y, int width, int height, int r, int testId) {
        if (x < r) {
            throw new IllegalArgumentException("Верхняя точка круга должна быть положительной");
        }
        if (y < r) {
            throw new IllegalArgumentException("Левая точка круга должна быть положительной");
        }
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина прямоугольника должна быть положительной");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Высота прямоугольника должна быть положительной");
        }
        if (r <= 0) {
            throw new IllegalArgumentException("Радиус круга должен быть положительным");
        }
        if (x + width + r > VIEWPORT_WIDTH) {
            throw new IllegalArgumentException("Правая точка круга должна быть в пределах рисунка");
        }
        if (y + height + r > VIEWPORT_HEIGHT) {
            throw new IllegalArgumentException("Нижняя точка круга должна быть в пределах рисунка");
        }
        String filename = "task7343_" + testId + ".html";
        String circleString = "<circle cx=\"%d\" cy=\"%d\" r=\"%d\" opacity=\"0.5\" fill=\"yellow\" />";
        String rectangleString = "<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\" fill=\"red\" opacity=\"0.5\"/>\"";
        String rect = String.format(rectangleString, x, y, width, height);
        String circle1 = String.format(circleString, x + width, y, r);
        String circle2 = String.format(circleString, x, y + height, r);
        String circle3 = String.format(circleString, x + width, y + height, r);
        String circle4 = String.format(circleString, x, y, r);
        String result = circle1 + "\n" + circle2 + "\n" + circle3 + "\n" + circle4 + "\n" + rect;
        System.out.println(result);
        writeToHtml(filename, result);
    }

    public static void task7060(int x1, int y1, int w1, int h1, int x2, int y2, int w2, int h2, int testId) {
        String filename = "task7060_" + testId + ".html";
        String rectangleString = "<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\" fill=\"%s\" />\"";
        if (x1 < 0 || x2 < 0) {
            throw new IllegalArgumentException("Левая сторона прямоугольника должна быть в пределах рисунка");
        }
        if (y1 < 0 || y2 < 0) {
            throw new IllegalArgumentException("Верхняя сторона прямоугольника должна быть в пределах рисунка");
        }
        if (w1 <= 0 || w2 <= 0) {
            throw new IllegalArgumentException("Ширина прямоугольника должна быть положительной");
        }
        if (h1 <= 0 || h2 <= 0) {
            throw new IllegalArgumentException("Высота прямоугольника должна быть положительной");
        }
        if (x1 + w1 > VIEWPORT_WIDTH || x2 + w2 > VIEWPORT_WIDTH) {
            throw new IllegalArgumentException("Правая сторона прямоугольника должна быть в пределах рисунка");
        }
        if (y1 + h1 > VIEWPORT_HEIGHT || y2 + h2 > VIEWPORT_HEIGHT) {
            throw new IllegalArgumentException("Нижняя сторона прямоугольника должна быть в пределах рисунка");
        }
        Lab05.Rectangle r1 = Lab05.makeRectangleByXYHW(x1, y1, h1, w1);
        Lab05.Rectangle r2 = Lab05.makeRectangleByXYHW(x2, y2, h2, w2);
        String result = String.format(rectangleString, x1, y1, w1, h1, "blue");
        result += String.format(rectangleString, x2, y2, w2, h2, "red");
        if (Lab05.task1438check(r1, r2)) {
            Lab05.Rectangle r3 = Lab05.task1438intersect(r1, r2);
            result += String.format(rectangleString, r3.x, r3.y, r3.w, r3.h, "yellow");
        }
        writeToHtml(filename, result);
    }
}
