/**
 * Represents a task with a specific start date and end date.
 */
public class Event extends Task{
    private String start;
    private String end;
    /**
     * Constructs an event task with the given description, start date, and end date.
     *
     * @param description The description of the task.
     * @param start The start date of the event.
     * @param end The end date of the event.
     */
    public Event(String description, String start, String end) {
        super(description);
        this.start = start;
        this.end = end;
    }

    /**
     * Returns the type of the task as a string.
     *
     * @return A string "E " representing the event type.
     */
    @Override
    public String getType() {
        return "E ";
    }

    /**
     * Returns the event dates as a string.
     *
     * @return A string representing the start and end dates of the event.
     */

    @Override
    public String getDates() {
        return "| " + this.start + " - " + this.end;
    }


    /**
     * Returns a string representation of the event task.
     *
     * @return A string in the format "[E] description (by: start to: end)".
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + this.start + " to: " + this.end + ")";
    }
}
