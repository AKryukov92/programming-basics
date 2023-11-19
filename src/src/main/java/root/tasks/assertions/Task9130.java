package root.tasks.assertions;

import root.tasks.MultipleInputValLayout;

public class Task9130 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Определить силу тяжести, которая действует на спутник массой satelliteMass, поблизости от планеты массой planetMass и радиусом radius.\n" +
                "\t<formula>\n" +
                "\t\tforce=g\n" +
                "\t\t<fraction>\n" +
                "\t\t\t<numerator>planetMass*satelliteMass</numerator>\n" +
                "\t\t\t<denominator>radius<sup>2</sup></denominator>\n" +
                "\t\t</fraction>\n" +
                "\t</formula>, где g - <a href=\"https://ru.wikipedia.org/wiki/%D0%A3%D1%81%D0%BA%D0%BE%D1%80%D0%B5%D0%BD%D0%B8%D0%B5_%D1%81%D0%B2%D0%BE%D0%B1%D0%BE%D0%B4%D0%BD%D0%BE%D0%B3%D0%BE_%D0%BF%D0%B0%D0%B4%D0%B5%D0%BD%D0%B8%D1%8F\">ускорение свободного падения</a>, приблизительно равное 9,8067. Результат вывести по шаблону");
        appendCheckSingleNonEscaped("На спутник действует сила тяжести $force Ньютон");
        appendTaskDescNonEscaped("Обратите внимание, что масса планеты дана в научной нотации. В некоторых источниках это называется экспоненциальной записью <a href=\"https://ru.wikipedia.org/wiki/%D0%AD%D0%BA%D1%81%D0%BF%D0%BE%D0%BD%D0%B5%D0%BD%D1%86%D0%B8%D0%B0%D0%BB%D1%8C%D0%BD%D0%B0%D1%8F_%D0%B7%D0%B0%D0%BF%D0%B8%D1%81%D1%8C\">(ссылка на страницу Википедии)</a>. Этот формат по-умолчанию поддерживается обычными командами ввода действительных чисел. Для того, чтобы вывести на экран число в такой нотации в Java нужно применить команду:");
        appendCheckSingleNonEscaped("System.out.printf(\"На спутник действует сила тяжести %e Ньютон\\n\", force);");
        appendTaskDescEscaped("В C# команда будет выглядеть так:");
        appendCheckSingleNonEscaped("Console.WriteLine(\"На спутник действует сила тяжести {0:E} Ньютон\", force);");
        appendCheckValuesHeader("planetMass", "satelliteMass", "radius");
        appendCheckValuesRow("5.972E24", "10000", "6371");
        appendCheckValuesRow("6.39E23", "10000", "3396.2");
        appendCheckValuesRow("6.39E23", "15000", "3396.2");
        appendCheckValuesRow("6.39E23", "15000", "-20000");
        appendCheckValuesRow("6.39E23", "-2000", "3396.2");
        appendCheckValuesRow("-6.39E23", "10000", "3396.2");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        double planetMass = Double.parseDouble(args[0]);
        double satelliteMass = Double.parseDouble(args[1]);
        double radius = Double.parseDouble(args[2]);
        if (radius <= 0) {
            System.out.println("Радиус планеты должен быть положительным");
        }
        if (planetMass <= 0) {
            System.out.println("Масса планеты должна быть положительна");
        }
        if (satelliteMass <= 0) {
            System.out.println("Масса спутника должна быть положительна");
        }
        if (radius > 0) {
            if (planetMass > 0) {
                if (satelliteMass > 0) {
                    double g = 9.8067;
                    double force = g * planetMass * satelliteMass / radius / radius;
                    System.out.printf("На спутник действует сила тяжести %e Ньютон\n", force);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task9130());
    }
}
