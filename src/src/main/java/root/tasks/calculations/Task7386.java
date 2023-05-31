package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task7386 extends OneInputValLayout {
    //Нужна задача длятого, чтобы люди научились писать выражения
    //x = x + 1
    //так ведь не решат правильно. наделают кучу переменных
    //надо будет вручную проверять
    //

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит целое число start. Нужно прибавить к start число 1 и вывести на экран. Затем нужно прибавить к start число 2 и вывести на экран");
        appendFooter();
    }

    @Override
    protected void logic(String value) {

    }
}
