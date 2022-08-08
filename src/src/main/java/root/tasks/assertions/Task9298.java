package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class Task9298 extends OneInputValLayout {

    @Override
    protected void logic(String value) {
        int edge = Integer.parseInt(value);
        if (edge <= 0) {
            System.out.println("Значение edge должно быть положительным");
            return;
        }
        int result = 6 * edge * edge;
        System.out.print(result);
    }

    @Override
    protected void makeLayout() {
        appendSubheading("Общий план работы программы:");
        appendOrdered(
                "Получаем исходные данные.",
                "Проверяем корректность исходных данных.",
                "Если не корректны, то завершаем работу программы и сообщаем пользователю об ошибке.",
                "Если данные корректны, то выполняем полезные действия.",
                "Сообщаем пользователю результат."
        );
        appendCheckSingle("Представьте, что вы пишете программное обеспечение для банкомата. Полезным действием будет выдача банкнот." +
                " Пользователь пришел к банкомату, вставил карту, увидел что на счету 10 тысяч, нажал 'снять деньги' и ввел миллион." +
                " Банкомат выдал ему миллион, а затем написал сообщение 'недостаточно средств на счету'." +
                " Правильно ли сработал банкомат?" +
                " Именно поэтому мы проверяем исходные данные перед тем, как совершаем полезные действия."
        );
        appendCheckSingle("Сообщение об ошибке должно быть написано так, чтобы пользователь мог понять какие значения или действия от него ожидались." +
                " В некоторых случаях к сообщению добавляют код ошибки."
        );
        appendHeader();
        appendTaskDesc("Дана длина ребра куба. Найти площадь его боковой поверхности по формуле <formula>area=6*edge<sup>2</sup></formula>.");
        appendCheckValuesHeader("edge");
        appendCheckValuesRow("1");
        appendCheckValuesRow("5");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-2");
        appendCheckValuesFooter();
        appendFooter();
    }
}
