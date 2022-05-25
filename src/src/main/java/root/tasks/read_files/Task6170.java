package root.tasks.read_files;

import root.tasks.OneInputValLayout;
import root.tasks.TwoInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6170 extends OneInputValLayout {
    private String employeesFile = "files/task6170/employees.csv";
    private String departmentsFile = "files/task6170/departments.csv";

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дано два исходных файла: список сотрудников и список отделов." +
                "В файле " + linkToFile(departmentsFile, "departments.csv") + " содержатся записи об отделах. Каждая строка содержит атрибуты одного отдела, перечисленные через запятую \",\". Атрибуты записаны в следующем порядке:" +
                "<ol>" +
                "<li>department_id - код отдела</li>" +
                "<li>department_name - наименование отдела</li>" +
                "<li>manager_id - код сотрудника-руководителя</li>" +
                "<li>location_id - код офиса" +
                "</ol>" +
                "В файле " + linkToFile(employeesFile, "employees.csv") + " содержатся записи о сотрудниках. Каждая строка содержит атрибуты одного сотрудника, перечисленные через запятую \",\". Атрибуты записаны в следующем порядке:" +
                "<ol>" +
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
                "Пользователь вводит число - код сотрудника. Нужно вывести имя, фамилию и <b>наименование</b> отдела сотрудника, у которого код равен введенному числу. Если такой сотрудник отсутствует, сообщить об этом.");
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
            if(!found) {
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
