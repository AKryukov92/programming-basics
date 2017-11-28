package common;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Utils {
    public static final int SCREEN_WIDTH = 500;
    public static final int SCREEN_HEIGHT = 350;
    public static final int SHIFT_X = 0;
    public static final int SHIFT_Y = 1;
    public static final int STRETCH_X = 2;
    public static final int STRETCH_Y = 3;
    public static final int CIRCLE = 4;
    public static final int RECTANGLE = 5;

    public static void writeToHtml(String filename, String content) {
        try (PrintWriter writer = new PrintWriter(filename, "UTF-8")) {
            writer.println("<!DOCTYPE html>" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>");
            writer.println(content);
            writer.println("</body>\n" +
                "</html>");
            Desktop.getDesktop().open(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToHtml(String filename, int width, int height, String description, String content) {
        try (PrintWriter writer = new PrintWriter(filename, "UTF-8")) {
            writer.println("<!DOCTYPE html>" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>\n" +
                "<h1>");
            writer.println(filename);
            writer.println("</h1>");
            writer.println(description);
            writer.println(String.format("<svg width=\"%d\" height=\"%d\">", width, height));
            writer.println(content);
            writer.println("</svg>\n" +
                "</body>\n" +
                "</html>");
            Desktop.getDesktop().open(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
