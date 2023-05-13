package root.tasks.methods;

import root.tasks.MethodsDictationHelper;
import root.tasks.MultipleInputValLayout;

public class Task2772 extends MultipleInputValLayout implements MethodsDictationHelper {
    private String langAbbreviation;

    public Task2772(String langAbbreviation) {
        this.langAbbreviation = langAbbreviation;
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading(implementMethodToSolve(7474));
        appendOrderedNonEscaped(
                implementStatic("Library", "task7474")
        );
        appendFooter();
    }

    @Override
    public boolean isJs() {
        return langAbbreviation.equals("js");
    }

    @Override
    public boolean isCs() {
        return langAbbreviation.equals("java");
    }

    @Override
    public boolean isJava() {
        return langAbbreviation.equals("cs");
    }

    @Override
    protected void logic(String... args) {
        String a = args[0];
        String b = args[1];
        String c = args[2];
        System.out.printf("Квадратное уравнение %s*x*x + %s*x + %s = 0.\n" +
                "Его дискриминант вычисляется по формуле: d = %s*%s - 4*%s*%s\n", a, b, c, b, b, a, c);
    }
}
