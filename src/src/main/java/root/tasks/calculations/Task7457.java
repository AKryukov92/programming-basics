package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task7457 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дана скорость в километрах/час. Найти значение этой скорости в метрах/секунду. Выведите ответ по шаблону \"$velocityInKmH км/ч это $velocityInMS м/с\". Точность чисел составляет 2 знака после запятой.");
        appendCheckValuesHeader("velocityInKmH");
        appendCheckValuesRow("60");
        appendCheckValuesRow("200");
        appendCheckValuesRow("5");
        appendCheckValuesRow("0");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Все реальные расчеты так или иначе связаны с единицами измерения. При этом стандартные единицы измерения в разных странах могут отличаться. Из за этого могут случаться аварии. Показательным примером является зонд Mars Climate Orbiter, потерпевший крушение 23 сентября 1999 года.");
        appendTaskDescEscaped("Цитата из книги \"Совершенный код\" Часть III. Глава 32.5 Методики комментирования");
        appendTaskDescEscaped("Указывайте единицы измерения численных величин Если число представляет длину, укажите единицы представления: дюймы, футы, метры или километры. Если речь идет о времени, поясните, в чем оно выражено: в секундах, прошедших с 1 января 1980 года, миллисекундах, прошедших с момента запуска программы, или как-то иначе. Если это координаты, напишите, что они представляют (ширину, долготу и высоту) и в чем они выражены (в радианах или градусах), укажите систему координат и т. д. Не предполагайте, что единицы измерения очевидны — для нового программиста они такими не будут. Для кого-то, кто работает над другой частью системы, они такими не будут. После значительного изменения программы они тоже очевидными не будут. Единицы измерения часто следует указывать в именах переменных, а не в комментариях. Например, выражение вида distanceToSurface = marsLanderAltitude выглядит корректным, тогда как distanceToSurfaceInMeters = marsLanderAltitudeInFeet ясно указывает на ошибку.");
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double velocityInKmH = Double.parseDouble(value);
        double velocityInMH = velocityInKmH * 1000;
        double velocityInMmin = velocityInMH / 60;
        double velocityInMS = velocityInMmin / 60;
        System.out.printf("%.2f км/ч\n", velocityInKmH);
        System.out.printf("%.2f м/ч\n", velocityInMH);
        System.out.printf("%.2f м/мин\n", velocityInMmin);
        System.out.printf("%.2f м/с\n", velocityInMS);
    }

    public static void main(String[] args) {
        System.out.println(new Task7457());
    }
}
