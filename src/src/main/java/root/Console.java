package root;

public class Console {
    public static void WriteLine(String line) {
        System.out.println(line);
    }
    public static void WriteLine(long line) {
        System.out.println(line);
    }
    public static void Write(String line) {
        System.out.print(line);
    }
    public static void WriteLine(String template, Object... args) {
        String actualTemplate =template.replaceAll("\\{\\d}", "%s")
                .replaceAll("\\{\\d:F\\d}", "%.4f") + "\n" ;
        System.out.printf(actualTemplate, args);
    }
}
