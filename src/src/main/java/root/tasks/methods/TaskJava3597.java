package root.tasks.methods;

public class TaskJava3597 extends TaskCs3597 {
    @Override
    protected void logic(String value) {
        String result;
        result = Library.task3597(1, 2, 3);
        System.out.println(result);
        result = Library.task3597(11, 13, 19);
        System.out.println(result);
        double a, b, c;
        a = 3;
        b = 17;
        c = 5;
        System.out.println(Library.task3597(a, b, c));
        a = 5;
        b = 31;
        c = 29;
        System.out.println(Library.task3597(a, b, c));
        System.out.println(Library.task3597(3, 6, 3));
        System.out.println(Library.task3597(1, 2, 1));
        System.out.println(Library.task3597(0, 7, 13));
    }
}
