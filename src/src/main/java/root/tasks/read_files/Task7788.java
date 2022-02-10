package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7788 extends OneInputValLayout {
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
                "<li>department_id - код отдела</li>" +
                "</ol>" +
                "Нужно вывести только фамилию, код должности, дату приема и код сотрудника. Первой колонкой должен быть код струдника. Порядок вывода соответствует содержимому файла. После списка сотрудников нужно вывести фразу \"Всего сотрудников\" и количество записей в файле.");
        appendCheckSingleWithFile("files/task7788/employees.csv");
        appendFooter();
    }

    @Override
    protected void logic(String file) {
        File target = new File(file);
        try (Scanner scanner = new Scanner(target)) {
            int count = 0;
            System.out.println("employee_id, last_name, job_id, hire_date");
            while (scanner.hasNext()) {
                String entry = scanner.nextLine();
                String[] attributes = entry.split(",");
                System.out.printf(
                        "%s %s %s %s\n",
                        attributes[0],
                        attributes[2],
                        attributes[6],
                        attributes[5]
                );
                count++;
            }
            System.out.println("Всего сотрудников: " + count);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7788().getContent());
    }
}
