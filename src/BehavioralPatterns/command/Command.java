package BehavioralPatterns.command;

public interface Command {
    public void execute();
    public void undo();
    public void redo();
}
