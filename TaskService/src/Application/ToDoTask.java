package Application;

import java.util.Date;

public class ToDoTask extends Task {

    public ToDoTask(int id, String title, Date date) {
        super(id, title, date);
    }

    public ToDoTask(int id, String title, Date date, String note) {
        super(id, title, date, note);
    }
}