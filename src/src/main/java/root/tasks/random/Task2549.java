package root.tasks.random;

import root.tasks.OneInputValLayout;

import java.util.Random;

public class Task2549 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран в столбик 50 случайных чисел от 400 до 999 включительно.");
        appendCheckSingleNonEscaped("Числа от 400 до 999:" +
                "663\n" +
                "761\n" +
                "440\n" +
                "459\n" +
                "504\n" +
                "510\n" +
                "944\n" +
                "971\n" +
                "719\n" +
                "816\n" +
                "685\n" +
                "449\n" +
                "873\n" +
                "629\n" +
                "531\n" +
                "681\n" +
                "526\n" +
                "745\n" +
                "871\n" +
                "777\n" +
                "708\n" +
                "710\n" +
                "415\n" +
                "808\n" +
                "924\n" +
                "580\n" +
                "674\n" +
                "788\n" +
                "402\n" +
                "894\n" +
                "743\n" +
                "800\n" +
                "627\n" +
                "555\n" +
                "962\n" +
                "678\n" +
                "943\n" +
                "406\n" +
                "761\n" +
                "598\n" +
                "933\n" +
                "747\n" +
                "700\n" +
                "515\n" +
                "654\n" +
                "485\n" +
                "843\n" +
                "518\n" +
                "825\n" +
                "961");
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        //intentionally nothing
    }

    public static void main(String[] args) {
        Random gen = new Random();
        int i = 0;
        while (i < 50) {
            System.out.println(gen.nextInt(600) + 400);
            i ++;
        }
    }
}
