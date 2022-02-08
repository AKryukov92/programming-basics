package root.tasks.read_files;

import root.tasks.TwoInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6989 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Исходный файл содержит записи о сотрудниках. Каждая строка содержит атрибуты одного сотрудника, перечисленные через запятую \",\". Атрибуты записаны в следующем порядке:" +
                "<ol>\n" +
                "<li>employee_id - код сотрудника</li>" +
                "<li>first_name - имя</li>" +
                "<li>last_name - фамилия</li>" +
                "<li>email - адрес почты без домена</li>" +
                "<li>phone_number - телефонный номер</li>" +
                "<li>hire_date - дата найма</li>" +
                "<li>job_id - код должности</li>" +
                "<li>salary - заработная плата</li>" +
                "<li>commission_pct - ставка коммиссии</li>" +
                "<li>manager_id - код руководителя</li>" +
                "<li>department_id - код подразделения</li>" +
                "</ol>" +
                "Пользователь вводит число - код сотрудника. Нужно вывести имя, фамилию и код подразделения сотрудника, у которого код равен введенному числу. Если такой сотрудник отсутствует, сообщить об этом.");
        appendCheckValuesHeader("employee_id", "ссылка на файл");
        appendCheckValuesRowWithFile("100", "files/task6989/employees.csv");
        appendCheckValuesRowWithFile("107", "files/task6989/employees.csv");
        appendCheckValuesRowWithFile("149", "files/task6989/employees.csv");
        appendCheckValuesRowWithFile("202", "files/task6989/employees.csv");
        appendCheckValuesRowWithFile("404", "files/task6989/employees.csv");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String employeeId, String filename) {
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            boolean found = false;
            while (scanner.hasNext()) {
                String entry = scanner.nextLine();
                String[] attributes = entry.split(",");
                if (attributes[0].equals(employeeId)) {
                    System.out.printf("Имя: %s\n" +
                                    "фамилия: %s\n" +
                                    "код подразделения: %s",
                            attributes[1],
                            attributes[2],
                            attributes[10]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Сотрудник с идентификатором " + employeeId + " не найден");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
        }
    }
    public static void main(String[] args) {
        System.out.println(new Task6989().getContent());
    }
}
