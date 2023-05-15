package root.tasks.write_files;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task7940 extends StreamInputLayout {
    //логика сложнее, чем хочется от такой задачи
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит день недели, час и минуту начала занятия, час и минуту конца занятия. Нужно проверить, что в расписании отсутствуют пересекающиеся занятия.");
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        if (source.hasNext()) {
            String current = source.next();


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

        public boolean startsAfter(TimeTableItem item) {
            return this.startHour > item.startHour ||
                    this.startHour == item.startHour && this.startMinute >= item.startMinute;
        }

        public boolean endsBefore(TimeTableItem item) {
            return this.endHour < item.endHour ||
                    this.endHour == item.endHour && this.endMinute <= item.endMinute;
        }

        public boolean intersects(TimeTableItem item) {
            return this.startsAfter(item) && this.endsBefore(item) ||
                    this.startsAfter(item) && item.endsBefore(this) ||
                    item.startsAfter(this) && item.endsBefore(this) ||
                    item.startsAfter(this) && this.endsBefore(item);
        }
    }

    public static void main(String[] args) {
        TimeTableItem from10to12 = new TimeTableItem("mon,10,00,12,00");
        TimeTableItem from11to13 = new TimeTableItem("mon,11,00,13,00");
        TimeTableItem from14to15 = new TimeTableItem("mon,14,00,15,00");

        System.out.println(from10to12.startsAfter(from10to12));//true
        System.out.println(from10to12.endsBefore(from10to12));//true
        System.out.println(from10to12.endsBefore(from11to13));//true
        System.out.println(from10to12.endsBefore(from14to15));//true
        System.out.println(from10to12.startsAfter(from11to13));//false
        System.out.println(from10to12.startsAfter(from14to15));//false
        System.out.println("------");


        System.out.println(from11to13.startsAfter(from10to12));
        System.out.println(from11to13.endsBefore(from11to13));




        System.out.println(from14to15.startsAfter(from11to13));



    }
}
