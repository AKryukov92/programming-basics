package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task8665 extends OneInputValLayout {

    private String employeesFile = "files/task8665/employees.csv";
    private String departmentsFile = "files/task8665/departments.csv";

    @Override
    protected void logic(String departmentName) {
        File dFile = new File(departmentsFile);
        boolean dFound = false;
        try (Scanner dScanner = new Scanner(dFile)) {
            while (dScanner.hasNext()) {
                String dEntry = dScanner.nextLine();
                String[] dAttributes = dEntry.split(",");
                if (dAttributes[1].equals("'" + departmentName + "'")) {
                    dFound = true;
                    String departmentId = dAttributes[0];
                    System.out.println("Код отдела " + departmentName + " равен " + departmentId);

                    File eFile = new File(employeesFile);
                    try (Scanner scanner = new Scanner(eFile)) {
                        int count = 0;
                        while (scanner.hasNext()) {
                            String eEntry = scanner.nextLine();
                            String[] eAttributes = eEntry.split(",");
                            if (eAttributes[10].equals(departmentId)) {
                                System.out.printf(
                                        "%d Имя: %s\n" +
                                                "Фамилия: %s\n" +
                                                "Телефонный номер: %s\n",
                                        count,
                                        eAttributes[1],
                                        eAttributes[2],
                                        eAttributes[4]
                                );
                                count++;
                            }
                        }
                        if (count == 0) {
                            System.out.println("В данном отделе отсутвуют сотрудники");
                        }
                    } catch (FileNotFoundException ex) {
                        System.out.println("Файл '" + eFile.getAbsolutePath() + "' не существует");
                    }
                    break;
                }
            }

            if (!dFound) {
                System.out.println("Отдел с наименованием " + departmentName + " не найден");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + dFile.getAbsolutePath() + "' не существует");
        }
    }

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
                "Пользователь вводит наименование отдела." +
                " Нужно вывести код отдела, а также имя, фамилию и телефонный номер сотрудников," +
                " которые работают в данном отделе." +
                " Если такие отсутствуют, сообщить об этом." +
                " Пронумеруйте сотрудников при выводе.");
        appendCheckValuesHeader("Наименование отдела");
        appendCheckValuesRow("Administration");
        appendCheckValuesRow("Sales");
        appendCheckValuesRow("Military");
        appendCheckValuesRow("Cleaning");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task8665().getContent());
    }
}
