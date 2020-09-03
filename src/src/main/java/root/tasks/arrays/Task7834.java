package root.tasks.arrays;

import root.tasks.CodedTask;

import java.io.PrintWriter;

public class Task7834 extends CodedTask {
    public Task7834(int id, String srcDirectory, boolean isExample) {
        super(id, srcDirectory, isExample);
    }

    @Override
    protected String getContent() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - символы, разделенные символом \",\"(точка с запятой). Вывести на экран элементы на индексах 0, 2, 3, 5 в столбик. Если элемент отсутствует, вывести сообщение \"нет элемента на индексе X\".");
        appendCheckValuesHeader("arr", "");
        appendCheckValuesRow("a,s,d,f,g,h,j,k");
        appendCheckValuesRow("q,w,e,r,t,y,u");
        appendCheckValuesRow("q,w,e,r,t,y");
        appendCheckValuesRow("qa,ws,ed,rf,tg");
        appendCheckValuesRow("za,xs,cd,vf");
        appendCheckValuesRow("qaz,wsx,edc");
        appendCheckValuesRow("qwerty,asdfg");
        appendCheckValuesRow("zxcvbnm");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
        return collectLayout();
    }

    @Override
    protected void logic(String value, PrintWriter out) {
        if (value.isEmpty()) {
            out.println("Исходная строка пуста");
            return;
        }
        String[] arr = value.split(",");
        out.println("Значение элемента на индексе 0 это " + arr[0]);
        if (arr.length <= 2) {
            out.println("Элемент на индексе 2 отсутстствует");
        } else {
            out.println("Значение элемента на индексе 2 это " + arr[2]);
        }
        if (arr.length <= 3) {
            out.println("Элемент на индексе 3 отсутстствует");
        } else {
            out.println("Значение элемента на индексе 3 это " + arr[3]);
        }
        if (arr.length <= 5) {
            out.println("Элемент на индексе 5 отсутстствует");
        } else {
            out.println("Значение элемента на индексе 5 это " + arr[5]);
        }
    }
}
