package root.tasks;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public abstract class LayoutMaker {
    protected static final String utf8 = StandardCharsets.UTF_8.name();
    protected boolean headerOpened = false;
    protected boolean tableOpened = false;
    PrintStream writer = System.out;
    private int nextOrderedIndex = 1;

    protected String methodExample() {
        throw new NotImplementedException();
    }
    public int getId() {
        String className = this.getClass().getName();
        return Integer.parseInt(className.substring(className.length() - 4));
    }

    public String getContent() {
        if (tableOpened) {
            throw new RuntimeException("Заголовок таблицы не закрыт. Вызовите метод appendCheckValuesFooter. Задача " + this.getClass().getName());
        }
        if (headerOpened) {
            throw new RuntimeException("Тэг задания не закрыт. Вызовите метод appendFooter. Задача " + this.getClass().getName());
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            this.writer = new PrintStream(baos, true, utf8);
            makeLayout();
            if (tableOpened && !headerOpened) {
                throw new RuntimeException("Заголовок таблицы не закрыт. Вызовите метод appendCheckValuesFooter. Задача " + this.getClass().getName());
            }
            if (tableOpened) {
                appendCheckValuesFooter();
            }
            if (headerOpened) {
                appendFooter();
            }
            this.writer.close();
            return baos.toString(utf8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract void makeLayout();

    protected void appendHeader() {
        appendTaskId();
        appendTaskHeader();
    }

    protected void appendTaskId() {
        headerOpened = true;
        writer.println("<div id='task" + getId() + "' class='task_block'>");
    }

    protected void appendTaskHeader() {
        writer.println("<div class='task_id'>" + getId() + "</div>");
        writer.println("<h3>Задача</h3>");
    }

    protected void appendSubheading(String headerText) {
        writer.print("<h4>");
        writer.print(headerText);
        writer.println("</h4>");
    }

    protected void appendOrderedNonEscaped(String... elements) {
        writer.print("<ol start='" + nextOrderedIndex + "'>");
        for (String element : elements) {
            if (!element.isEmpty()) {
                writer.print("<li>");
                writer.print(element);
                writer.print("</li>");
                nextOrderedIndex++;
            }
        }
        writer.print("</ol>");
    }

    protected void appendOrderedEscaped(String... elements) {
        writer.print("<ol start='" + nextOrderedIndex + "'>");
        for (String element : elements) {
            writer.print("<li>");
            writer.print(escapeHtmlSymbols(element));
            writer.print("</li>");
            nextOrderedIndex++;
        }
        writer.print("</ol>");
    }

    protected void resetOrdered() {
        nextOrderedIndex = 1;
    }

    public static String escapeHtmlSymbols(String nonEscaped) {
        return nonEscaped
                .replace("<", "&lt;")
                .replace(">", "&gt;");
    }

    protected void appendTaskDescEscaped(String taskDescription) {
        appendTaskDescNonEscaped(escapeHtmlSymbols(taskDescription));
    }

    protected String replaceCustomTags(String description){
        return description
                .replaceAll("<zoom>","<span class='zoom'>")
                .replaceAll("</zoom>", "</span>");
    }

    protected void appendTaskDescNonEscaped(String taskDescription) {
        writer.println("<div class='task_desc'>");
        writer.println(replaceCustomTags(taskDescription));
        writer.println("</div>");
    }

    protected void appendCheckSingleNonEscaped(String text) {
        writer.print("<div class='check_single preformatted'>");
        writer.print(text);
        writer.println("</div>");
    }

    protected void appendCheckValuesFooter() {
        tableOpened = false;
        writer.println("</table>");
    }

    protected void appendFooter() {
        headerOpened = false;
        writer.println("</div>");
    }

    protected static String linkToTask(int id) {
        return "<a href=\"#task" + id + "\" target=\"_blank\">ЛР#" + id + "(открыть в новой вкладке)</a>";
    }

    protected static String linkToTask(String className) {
        String id = className.substring(className.length() - 4);
        return "<a href=\"#task" + id + "\" target=\"_blank\">ЛР#" + id + "(открыть в новой вкладке)</a>";
    }

    protected String linkToFile(String filename) {
        boolean downloadableExtension = filename.endsWith(".csv") ||
                filename.endsWith(".db") ||
                filename.endsWith(".exe") ||
                filename.endsWith(".jar");
        if (downloadableExtension) {
            String filenamePart = filename.substring(filename.lastIndexOf("/") + 1);
            return "<a href=\"" + filename + "\" target=\"_blank\">скачать " + filenamePart + "</a>";
        } else {
            return "<a href=\"" + filename + "\" target=\"_blank\">открыть в новой вкладке<br>" + filename + "</a>";
        }
    }

    public void appendImage(String src) {
        writer.println("<img src=\"" + src + "\"/>");
    }

    /**
     * Находит java решение задачи с указанным taskName в директории с задачами.
     * Извлекает из найденного решения код метода protected void logic
     *
     * @param taskName идентификатор задачи
     * @return тело метода logic
     */
    public String getLogic(String taskName) {
        return getCodeByMethodName(taskName, "logic");
    }
    public String getCodeByMethodName(String taskName, String methodName) {
        File basePath = new File("src\\main\\java\\root\\tasks\\");
        //System.err.println(basePath.getAbsolutePath());
        String[] elements = basePath.list();
        for (String el : elements) {
            File file = new File(basePath + "\\" + el + "\\" + taskName + ".java");
            //System.err.println(file.getAbsolutePath());
            if (file.exists()) {
                try (Scanner s = new Scanner(file)) {
                    while (s.hasNext()) {
                        String line = s.nextLine();
                        if (line.startsWith("    protected void " + methodName)) {
                            break;
                        }
                    }
                    StringBuilder result = new StringBuilder();
                    while (s.hasNext()) {
                        String line = s.nextLine();
                        if (line.equals("    }")) {
                            break;
                        } else {
                            result.append(line.replaceFirst("^\\s{8}", ""));
                            result.append("\n");
                        }
                    }

                    return result.toString();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        throw new RuntimeException("Task was not found");
    }

    /**
     * Извлекает из указанного файла код метода Main. Ожидается код на cs.
     *
     * @param taskName имя файла с решением
     * @return тело метода Main
     */
    public String getMain(String taskName) {
        File target = new File("cs_src\\" + taskName + ".cs");
        try (Scanner s = new Scanner(target)) {
            while (s.hasNext()) {
                String line = s.nextLine();
                if (line.startsWith("        static void Main")) {
                    break;
                }
            }
            StringBuilder result = new StringBuilder();
            while (s.hasNext()) {
                String line = s.nextLine();
                if (line.equals("        {")) {
                    //skip
                } else if (line.equals("        }")) {
                    break;
                } else {
                    result.append(line.replaceFirst("^\\s{12}", ""));
                    result.append("\n");
                }
            }
            return result.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return getContent();
    }
}
