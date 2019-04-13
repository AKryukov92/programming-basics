import java.util.Optional;

public class TaskBookFinder {
    private TaskBook[] taskBooks;

    public TaskBookFinder(TaskBook[] taskBooks) {
        this.taskBooks = taskBooks;
    }

    public Optional<TaskBook> getFirstTaskbookFilenameWithTask(String id) {
        try {
            int refTaskId = Integer.parseInt(id);
            for (TaskBook taskBook : taskBooks){
                if (taskBook.hasTask(refTaskId)) {
                    System.out.println("Reference id " + id + " was found in taskbook " + taskBook.getFilenameForLink());
                    return Optional.of(taskBook);
                }
            }
            return Optional.empty();
        } catch (NumberFormatException f){
            System.out.println("Reference has incorrect id " + id);
            return Optional.empty();
        }
    }
}
