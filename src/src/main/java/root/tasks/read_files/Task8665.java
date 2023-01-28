package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task8665 extends OneInputValLayout {

    private final String employeesFile = "files/task8665/employees.csv";
    private final String departmentsFile = "files/task8665/departments.csv";

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
        appendNonEscaped("Дано два исходных файла: список сотрудников и список отделов." +
                "В файле " + linkToFile(departmentsFile, "departments.csv") + " содержатся записи об отделах. Каждая строка содержит атрибуты одного отдела, перечисленные через запятую \",\". Атрибуты записаны в следующем порядке:");
        appendOrdered(
                "department_id - код отдела",
                "department_name - наименование отдела",
                "manager_id - код сотрудника-руководителя",
                "location_id - код офиса"
        );
        appendNonEscaped("В файле " + linkToFile(employeesFile, "employees.csv") + " содержатся записи о сотрудниках. Каждая строка содержит атрибуты одного сотрудника, перечисленные через запятую \",\". Атрибуты записаны в следующем порядке:");
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
        appendTaskDesc("Пользователь вводит наименование отдела." +
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
