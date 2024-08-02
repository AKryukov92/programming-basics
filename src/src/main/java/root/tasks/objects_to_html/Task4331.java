package root.tasks.objects_to_html;

import root.tasks.OneInputValLayout;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Task4331 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Реализуйте метод task4331 в классе Library, который принимает экземпляр класса Circle в качестве аргумента и возвращает текст.");
        appendTaskDescEscaped("Реализуйте класс Circle");
        appendCheckSingleNonEscaped("public static class Circle {\n" +
                "        public int cx;\n" +
                "        public int cy;\n" +
                "        public int r;\n" +
                "        public String stroke;\n" +
                "        public int strokeWidth;\n" +
                "        public String fill;\n" +
                "    }");
        appendTaskDescEscaped("Реализуйте класс Program4331 с методом main. Скопируйте фрагмент кода ниже и вставьте его в метод main класса Program4331.");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescEscaped("При запуске метода main класса Program4331 должен получиться следующий результат:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(wrapLogic("")));
        appendTaskDescEscaped("Это задание очень похоже на " + linkToTask(9300) + ". Сейчас важно заполнить шаблон текста данными из полей класса.");
        appendFooter();
    }

    public static class Circle {
        public int cx;
        public int cy;
        public int r;
        public String stroke;
        public int strokeWidth;
        public String fill;
    }

    public static class Library {
        public static String task4331(Circle c) {
            return "<circle cx=\"" + c.cx + "\" cy=\"" + c.cy + "\" r=\"" + c.r +
                    "\" stroke=\"" + c.stroke + "\" stroke-width=\"" + c.strokeWidth +
                    "\" fill=\"" + c.fill + "\" />";
        }
    }

    @Override
    protected void logic(String value) throws SQLException, FileNotFoundException {
        Circle c = new Circle();
        c.cx = 50;
        c.cy = 40;
        c.r = 30;
        c.stroke = "green";
        c.strokeWidth = 4;
        c.fill = "yellow";
        String html = Library.task4331(c);
        System.out.println(html);
    }

    public static void main(String[] args) {
        System.out.println(new Task4331());
    }
}
