package root.tasks.use_std_lib;

public class Task9279 extends root.tasks.OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дана фиксированная строка \"abcabcabbacbacbaaac\". Пользователь вводит комбинацию из двух символов. Вывести первые три индекса, на которых встречается введенная подстрока.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("ab");
        appendCheckValuesRow("bc");
        appendCheckValuesRow("ac");
        appendCheckValuesRow("bb");
        appendCheckValuesRow("xz");
        appendCheckValuesRow("cde");
        appendCheckValuesRow("a");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.length() != 2) {
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }
        String data = "abcabcabbacbacbaaac";
        System.out.println("Записываю значение '" + data + "' в переменную data");
        System.out.println("Записываю значение '" + value + "' в переменную value");
        int firstOccurrence = data.indexOf(value);
        if (firstOccurrence >= 0) {
            System.out.println("Первая подстрока находится на индексе " + firstOccurrence);
            System.out.println("Ищу вторую начиная с индекса " + (firstOccurrence + 1));
            System.out.println("Записываю индекс первой подстроки в переменную firstOccurrence");
            System.out.println("Использую перегрузку метода с двумя аргументами. Вызов метода выглядит так:");
            System.out.println("int secondOccurrence = data.indexOf(value, firstOccurrence + 1);");
            int secondOccurrence = data.indexOf(value, firstOccurrence + 1);
            System.out.println("Переменная secondOccurrence содержит " + secondOccurrence + ", значит");
            if (secondOccurrence >= 0) {
                System.out.println("Вторая подстрока находится на индексе " + secondOccurrence);
                System.out.println("Ищу третью начиная с индекса " + (secondOccurrence + 1));
                System.out.println("Вызов метода выглядит так:");
                System.out.println("int thirdOccurrence = data.indexOf(value, secondOccurrence + 1);");
                int thirdOccurrence = data.indexOf(value, secondOccurrence + 1);
                if (thirdOccurrence >= 0) {
                    System.out.println("Третья подстрока находится на индексе " + thirdOccurrence);
                } else {
                    System.out.println("Указанная подстрока '" + value + "' встречается только дважды");
                }
            } else {
                System.out.println("Указанная подстрока '" + value + "' встречается только один раз");
            }
        } else {
            System.out.println("Указанная подстрока '" + value + "' не найдена");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task9279().getContent());
    }
}
