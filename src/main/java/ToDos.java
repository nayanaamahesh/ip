/**
 * Represents a task without any deadline attached to it.
 */
public class ToDos extends Task{
    /**
     * Constructs a task with the given description.
     * Todos are tasks without any deadline attached to it
     *
     * @param description The description of the task.
     */
    public ToDos(String description) {
        super(description);
    }

    /**
     * Returns the type of task as "T ".
     *
     * @return A string representing the task type.
     */
    @Override
    public String getType() {
        return "T ";
    }

    /**
     * Returns a string representation of the task.
     *
     * @return A string in the format "[T] description".
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
