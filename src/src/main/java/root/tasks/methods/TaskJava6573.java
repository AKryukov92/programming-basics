package root.tasks.methods;

public class TaskJava6573 extends TaskCs6573{
    @Override
    protected void logic(String value) {
        long result;
        result = Library.task6573(8, 13);
        System.out.println(result);
        result = Library.task6573(13, 8);
        System.out.println(result);
        int from, to;
        from = 159;
        to = 161;
        result = Library.task6573(from, to);
        System.out.println(result);
        from = -2;
        to = 600;
        System.out.println(Library.task6573(from, to));
        System.out.println(Library.task6573(648, 648));
        System.out.println(Library.task6573(35, 24));
    }
}
