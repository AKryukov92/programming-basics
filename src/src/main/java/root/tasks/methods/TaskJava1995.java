package root.tasks.methods;

public class TaskJava1995 extends TaskCs1995 {
    @Override
    protected void logic(String firstValue) {
        int[] standard = new int[]{5, 4, 3, 2, 1};
        int[] array = new int[]{5, 4, 3, 2, 1};
        System.out.println(Library.compareArrays(standard, array));
        array = new int[]{5, 4, 3};
        System.out.println(Library.compareArrays(standard, array));
        System.out.println(Library.compareArrays(
                new int[]{9, 8, 7, 6},
                new int[]{9, 8, 7, 6, 5}
        ));
        standard = new int[]{9, 8, 7, 6, 5};
        array = new int[]{9, 111, 7};
        System.out.println(Library.compareArrays(standard, array));
        array = new int[]{6, 5, 4, 3, 2, 1};
        System.out.println(Library.compareArrays(
                new int[]{6, 5, 0, 3},
                array
        ));
    }
}
