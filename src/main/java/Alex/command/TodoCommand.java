package Alex.command;

import Alex.task.Task;
import Alex.task.TaskList;
import Alex.task.Todo;

public class TodoCommand extends Command{
    public static final String COMMAND_WORD = "todo";
    private String description;

    public TodoCommand(String description) {
        this.description = description;
    }
    /**
     * Executes the command and returns the result.
     *
     * @param taskList the taskList that contains all tasks of the user
     * @return CommandResult that will show which task user added and total number of tasks
     */
    @Override
    public CommandResult execute(TaskList taskList) {
        Task t = new Todo(description, COMMAND_WORD.substring(0,1).toUpperCase());
        taskList.setTask(t);
        return new CommandResult("Got it. I've added this task:" + "\n " + t + "\n" +
                "Now you have " + taskList.getNumberOfTasks() + " tasks in the list");
    };
}
