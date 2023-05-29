package root.tasks.method_generalisation;

import root.tasks.LayoutMaker;

public class Task6813 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped(
                "Используйте метод из задачи " + linkToTask(Task9709.class.getSimpleName()) + " в методах к задачам " + linkToTask(Task9309.class.getSimpleName()) + " и к задаче " + linkToTask(Task8862.class.getSimpleName()) + ". Результат не должен измениться."
        );
        appendFooter();
    }
}
