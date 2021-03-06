package ru.job4j.tracker;

public class DeleteAction implements  UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Delete item");
        int id = input.askInt("Enter id: ");
        boolean rsl = tracker.delete(id);
        if (rsl) {
            out.println("Successful");
        } else {
            out.println("id not found");
        }
        return true;
    }
}
