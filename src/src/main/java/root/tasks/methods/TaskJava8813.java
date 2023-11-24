package root.tasks.methods;

public class TaskJava8813 extends TaskCs8813 {

    @Override
    protected void logic(String s1, String s2) {
        Library.task8813("Джеймс", "Бонд");
        Library.task8813("капитан", "Джек Воробей");
        String firstName = "Александр";
        String lastName = "Крюков";
        Library.task8813(firstName, lastName);
    }
}
