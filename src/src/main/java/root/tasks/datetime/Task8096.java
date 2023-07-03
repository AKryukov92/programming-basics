package root.tasks.datetime;

import root.tasks.OneInputValLayout;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task8096 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит дату." +
                " Эта дата находится в какой-то неделе." +
                " Нужно определить число каждого из дней недели рядом с этой датой." +
                " Для этого определите понедельник этой недели, а затем прибавьте к нему от 1 до 7 дней");
        appendCheckValuesHeader("");
        appendCheckValuesRow("2023-07-03");
        appendCheckValuesRow("2023-07-02");
        appendCheckValuesRow("2000-01-01");
        appendCheckValuesFooter();
    }

    @Override
    protected void logic(String value) {
        DateTimeFormatter yMd = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outFmt = DateTimeFormatter.ofPattern("EEEE это yyyy-MM-dd");
        LocalDate current = LocalDate.parse(value, yMd);
        int ord = current.getDayOfWeek().ordinal();
        System.out.println("Нужно отнять " + ord + " дней чтобы получился понедельник");
        LocalDate mon = current.minusDays(ord);
        int i = 0;
        while (i < 7) {
            LocalDate temp = mon.plusDays(i);
            System.out.println(outFmt.format(temp));
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8096());
    }
}
