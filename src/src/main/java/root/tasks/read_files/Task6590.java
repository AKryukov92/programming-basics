package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task6590 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Исходный файл " + linkToFile("files/task6590/employees.csv", "employees.csv") + "содержит записи о сотрудниках. Каждая строка содержит атрибуты одного сотрудника, перечисленные через запятую \",\". Атрибуты записаны в следующем порядке:");
        appendOrderedNonEscaped(
                "employee_id - код сотрудника",
                "first_name - имя",
                "last_name - фамилия" ,
                "email - адрес почты без домена",
                "phone_number - телефонный номер",
                "hire_date - дата найма",
                "job_id - код должности",
                "salary - заработная плата",
                "commission_pct - ставка коммиссии",
                "manager_id - код руководителя",
                "department_id - код отдела>"
        );
        appendTaskDescEscaped("Руководителем считается сотрудник, чей идентификатор указан у другого сотрудника в поле manager_id. Для каждого руководителя нужно вывести его фамилию, код должности и идентификаторы подчиненных сотрудников.");
        appendCheckSingleNonEscaped(wrapLogic("files/task6590/employees.csv"));
        appendFooter();
    }

    @Override
    protected void logic(String filename) {
        File target = new File(filename);
        Set<String> managerIds = new HashSet<>();
        try (Scanner scanner = new Scanner(target)) {
            while (scanner.hasNext()) {
                String entry = scanner.nextLine();
                String[] attributes = entry.split(",");
                String managerId = attributes[9];
                if (!managerId.equals("NULL")) {
                    managerIds.add(managerId);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
        }
        for (String managerId : managerIds) {
            try (Scanner manScan = new Scanner(target)) {
                while(manScan.hasNext()) {
                    String manEntry = manScan.nextLine();
                    String[] manAttrs = manEntry.split(",");
                    if (manAttrs[0].equals(managerId)) {
                        System.out.printf(
                                "Фамилия %s\n" +
                                        "Должность %s\n" +
                                        "Подчиненные: ",
                                manAttrs[2],
                                manAttrs[6]
                        );
                        break;
                    }
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
            }
            List<String> emps = new ArrayList<>();
            try (Scanner empScanner = new Scanner(target)) {
                while (empScanner.hasNext()) {
                    String empEntry = empScanner.nextLine();
                    String[] empAttributes = empEntry.split(",");
                    if (empAttributes[9].equals(managerId)) {
                        emps.add(empAttributes[0]);
                    }
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Файл '" + target.getAbsolutePath() + "' не существует");
            }
            System.out.println(String.join(", ", emps));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6590().getContent());
    }
}
