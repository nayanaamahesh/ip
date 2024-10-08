package nayana.command;

import java.util.ArrayList;

import nayana.NayanaException;
import nayana.Storage;
import nayana.TaskList;
import nayana.Ui;
import nayana.task.Task;

/**
 * Represents a command to remind user of upcoming tasks.
 */
public class RemindCommand extends Command {
    /**
     * Executes the command with the given task list, user interface, and storage.
     *
     * @param tasks   The task list to be manipulated by the command.
     * @param ui      The user interface for displaying messages.
     * @param storage The storage for saving tasks.
     * @throws NayanaException If an error occurs while executing the command.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws NayanaException {
        ArrayList<Task> upcomingTasks = tasks.getUpcomingTasks();
        ui.printReminders(upcomingTasks);
    }

    /**
     * Determines if this command is an exit command.
     *
     * @return true if this command is an exit command, false otherwise.
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
