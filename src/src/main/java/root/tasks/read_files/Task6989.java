package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6989 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Исходный файл " + linkToFile("files/task6989/composers.csv", "composers.csv") + " содержит записи о композиторах. Первая строка содержит заголовки столбцов. Каждая строка содержит атрибуты одного композитора, перечисленные через точку с запятой \";\". Атрибуты записаны в следующем порядке:");
        appendOrderedNonEscaped(
                "composer_id - идентификатор композитора",
                "first_name - имя",
                "last_name - фамилия",
                "birth_date - дата рождения",
                "birth_place - место рождения",
                "death_date - дата смерти",
                "death_place - место смерти",
                "wiki_page - ссылка на страницу Википедии"
        );
        appendTaskDescEscaped("Пользователь вводит число - идентификатор композитора. Нужно вывести имя, фамилию и место рождения композитора, у которого идентификатор равен введенному числу. Если композитор с нужным идентификатором отсутствует, сообщить об этом.");
        appendCheckValuesHeader("composer_id", "ссылка на файл");
        appendCheckValuesRow("9");
        appendCheckValuesRow("6");
        appendCheckValuesRow("3");
        appendCheckValuesRow("2");
        appendCheckValuesRow("404");
        appendCheckValuesRow("composer_id");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String employeeId) {
        File target = new File("files/task6989/composers.csv");
        try (Scanner scanner = new Scanner(target)) {
            boolean found = false;
            scanner.nextLine();
            while (scanner.hasNext()) {
                String entry = scanner.nextLine();
                String[] attributes = entry.split(";");
                if (attributes[0].equals(employeeId)) {
                    System.out.printf("Имя: %s\n" +
                                    "фамилия: %s\n" +
                                    "место рождения: %s",
                            attributes[1],
                            attributes[2],
                            attributes[4]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Композитор с кодом " + employeeId + " не найден");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6989().getContent());
    }
}
