package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6170 extends OneInputValLayout {
    private final String employeesFile = "files/task6170/employees.csv";
    private final String departmentsFile = "files/task6170/departments.csv";

    @Override
    protected void makeLayout() {
        appendHeader();
        appendNonEscaped("Дано два исходных файла: список сотрудников и список отделов." +
                "В файле " + linkToFile(departmentsFile, "departments.csv") + " содержатся записи об отделах. Каждая строка содержит атрибуты одного отдела, перечисленные через запятую \",\". Атрибуты записаны в следующем порядке:");
        appendOrdered(
                "department_id - код отдела",
                "department_name - наименование отдела",
                "manager_id - код сотрудника-руководителя",
                "location_id - код офиса"
        );
        appendNonEscaped("В файле " + linkToFile(employeesFile, "employees.csv") + " содержатся записи о сотрудниках. Каждая строка содержит атрибуты одного сотрудника, перечисленные через запятую \",\". Атрибуты записаны в следующем порядке:");
        resetOrdered();
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
        appendTaskDesc("Пользователь вводит число - код сотрудника. Нужно вывести имя, фамилию и НАИМЕНОВАНИЕ отдела сотрудника, у которого код равен введенному числу. Если такой сотрудник отсутствует, сообщить об этом.");
        appendCheckValuesHeader("Код сотрудника");
        appendCheckValuesRow("100");
        appendCheckValuesRow("107");
        appendCheckValuesRow("149");
        appendCheckValuesRow("202");
        appendCheckValuesRow("404");
        appendCheckValuesRow("500");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String employeeId) {
        File target = new File(employeesFile);
        try (Scanner scanner = new Scanner(target)) {
            boolean found = false;
            while (scanner.hasNext()) {
                String entry = scanner.nextLine();
                String[] attributes = entry.split(",");
                if (attributes[0].equals(employeeId)) {
                    found = true;
                    System.out.printf(
                            "Имя: %s\n" +
                                    "Фамилия: %s\n" +
                                    "Отдел: ",
                            attributes[1],
                            attributes[2]
                    );
                    String departmentId = attributes[10];
                    File dFile = new File(departmentsFile);
                    boolean dFound = false;
                    try (Scanner dScanner = new Scanner(dFile)) {
                        while (dScanner.hasNext()) {
                            String dEntry = dScanner.nextLine();
                            String[] dAttributes = dEntry.split(",");
                            if (dAttributes[0].equals(departmentId)) {
                                dFound = true;
                                System.out.println(dAttributes[1]);
                                break;
                            }
                        }
                    }
                    if (!dFound) {
                        System.out.println("с кодом " + departmentId + " не найден");
                    }
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
        System.out.println(new Task6170().getContent());
    }
}
