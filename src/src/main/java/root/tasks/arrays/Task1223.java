package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task1223 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            return;
        }
        String[] arr = value.split(",");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - символы, разделенные символом \",\" (запятая). Вывести данные в обратном порядке в строчку без запятых.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("q,w,e,r,t,y");
        appendCheckValuesRow("q,w,e,r,t,y,q,w,e,r");
        appendCheckValuesRow("as,df,gh,jk");
        appendCheckValuesRow("zxcv");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task1223().getContent());
    }
}
