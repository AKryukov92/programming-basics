package root.tasks.methods;

public class TaskJava8307 extends TaskCs8307 {
    @Override
    protected void logic(String value) {
        String result;
        //вызов метода task1860 из класса Library
        result = Library.task8307("знаниям");//литерал "знаниям" передан в качестве аргумента
        System.out.println(result);
        String goal = "цели";
        //значение переменной goal передано в качестве аргумента
        result = Library.task8307(goal);//внутри метода это значение будет доступно под именем value
        System.out.println(result);
        result = Library.task8307("результату");
        System.out.println(result);
    }
}
