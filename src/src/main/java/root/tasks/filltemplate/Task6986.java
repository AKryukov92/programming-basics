package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task6986 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран текст");
        appendCheckSingleNonEscaped("Длина волны (λ) вычисляется по формуле: λ=2πν/ω, где:\n" +
                "π - (пи) математическая константа\n" +
                "ν - (ню) фазовая скорость\n" +
                "ω - (омега) угловая частота");
        appendFooter();
    }
}
