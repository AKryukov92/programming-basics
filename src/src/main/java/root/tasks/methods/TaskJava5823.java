package root.tasks.methods;

public class TaskJava5823 extends TaskCs5823 {
    @Override
    protected void logic(String args) {
        int coordinateX = 50;
        Library.task5823(coordinateX, 50, 40, "yellow");
        coordinateX = 400;
        Library.task5823(coordinateX, 300, 200, "green");
        coordinateX = 254;
        String colorOrange = "#cc6600";
        Library.task5823(coordinateX, 356, 100, colorOrange);
    }
}
