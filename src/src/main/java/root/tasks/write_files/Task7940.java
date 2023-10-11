package root.tasks.write_files;

import root.tasks.StreamInputLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7940 extends StreamInputLayout {
    //логика сложнее, чем хочется от такой задачи
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит день недели, час и минуту начала занятия, час и минуту конца занятия. Все значения в одну строчку через запятую. Нужно проверить, что в расписании отсутствуют пересекающиеся занятия.");
        appendCheckValuesHeader();
        appendCheckValuesRow(
                "пон,9,0,11,0",
                "пон,13,0,14,0",
                "вт,9,0,11,0"
        );
        appendCheckValuesRow(
                "пон,9,0,11,0",
                "пон,8,0,10,0"
        );
        appendCheckValuesRow(
                "вт,9,0,11,0",
                "вт,10,0,12,0"
        );
        appendCheckValuesRow(
                "ср,9,0,14,0",
                "ср,10,0,13,0"
        );
        appendCheckValuesRow(
                "чт,10,0,11,0",
                "чт,9,0,12,0"
        );
        appendCheckValuesRow(
                "пт,11,0,9,0"
        );
        appendCheckValuesRow(
                "пон,9,0,11,0",
                "пон,11,0,13,0",
                "вт,11,0,13,0",
                "вт,9,0,11,0"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner source = new Scanner(Systemin);
        List<TimeTableItem> items = new ArrayList<>();
        if (source.hasNext()) {
            TimeTableItem current = new TimeTableItem(source.next());
            for (TimeTableItem item : items) {
                if (item.weekDay.equals(current.weekDay)) {
                    if (item.intersects(current)) {
                        System.out.println("Не удается добавить занятие. Оно пересекается с " + item);
                    } else {
                        System.out.println("Занятие успешно добавлено");
                        items.add(current);
                    }
                }
            }
            items.add(current);
        }
    }

    private static class TimeTableItem {
        int startHour;
        int startMinute;
        int endHour;
        int endMinute;
        String weekDay;

        public TimeTableItem(String line) {
            String[] arr = line.split(",");
            weekDay = arr[0];
            startHour = Integer.parseInt(arr[1]);
            startMinute = Integer.parseInt(arr[2]);
            endHour = Integer.parseInt(arr[3]);
            endMinute = Integer.parseInt(arr[4]);
        }

        public boolean startsAfterStart(TimeTableItem item) {
            return this.startHour > item.startHour ||
                    this.startHour == item.startHour && this.startMinute >= item.startMinute;
        }

        public boolean endsBeforeEnd(TimeTableItem item) {
            return this.endHour < item.endHour ||
                    this.endHour == item.endHour && this.endMinute <= item.endMinute;
        }

        public boolean intersects(TimeTableItem item) {
            return this.startsAfterStart(item) && this.endsBeforeEnd(item) ||
                    this.startsAfterStart(item) && item.endsBeforeEnd(this) ||
                    item.startsAfterStart(this) && item.endsBeforeEnd(this) ||
                    item.startsAfterStart(this) && this.endsBeforeEnd(item);
        }
    }

    public static void main(String[] args) {
        TimeTableItem from10to12 = new TimeTableItem("mon,10,00,12,00");
        TimeTableItem from11to13 = new TimeTableItem("mon,11,00,13,00");
        TimeTableItem from14to15 = new TimeTableItem("mon,14,00,15,00");

        System.out.println(from10to12.startsAfterStart(from10to12));//true
        System.out.println(from10to12.endsBeforeEnd(from10to12));//true
        System.out.println(from10to12.endsBeforeEnd(from11to13));//true
        System.out.println(from10to12.endsBeforeEnd(from14to15));//true
        System.out.println(from10to12.startsAfterStart(from11to13));//false
        System.out.println(from10to12.startsAfterStart(from14to15));//false
        System.out.println("------");


        System.out.println(from11to13.startsAfterStart(from10to12));
        System.out.println(from11to13.endsBeforeEnd(from11to13));




        System.out.println(from14to15.startsAfterStart(from11to13));



    }
}
