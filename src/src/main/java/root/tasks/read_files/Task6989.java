package root.tasks.read_files;

import root.tasks.TwoInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6989 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Исходный файл содержит записи о сотрудниках. Каждая строка содержит атрибуты одного сотрудника, перечисленные через запятую \",\". Атрибуты записаны в следующем порядке:");
        appendOrdered(
                "employee_id - код сотрудника",
                "first_name - имя",
                "last_name - фамилия",
                "email - адрес почты без домена",
                "phone_number - телефонный номер",
                "hire_date - дата найма",
                "job_id - код должности",
                "salary - заработная плата",
                "commission_pct - ставка коммиссии",
                "manager_id - код руководителя",
                "department_id - код отдела"
        );
        appendTaskDesc("Пользователь вводит число - код сотрудника. Нужно вывести имя, фамилию и код отдела сотрудника, у которого код равен введенному числу. Если такой сотрудник отсутствует, сообщить об этом.");
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
                                    "код отдела: %s",
                            attributes[1],
                            attributes[2],
                            attributes[10]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Сотрудник с кодом " + employeeId + " не найден");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6989().getContent());
    }
}
