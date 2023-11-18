package root.tasks.methods;

public class TaskJava8307 extends TaskCs8307 {
    @Override
    protected void logic(String value) {
        //вызов метода task1860 из класса Library
        Library.task1860("знаниям");//литерал "знаниям" передан в качестве аргумента
        String goal = "цели";
        //значение переменной goal передано в качестве аргумента
        Library.task1860(goal);//внутри метода это значение будет доступно под именем value
        Library.task1860("результату");
    }
}
