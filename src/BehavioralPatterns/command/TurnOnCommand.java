package BehavioralPatterns.command;

public class TurnOnCommand implements Command{
    private Buld _buld;

    public TurnOnCommand(Buld buld)
    {
        this._buld = buld;
    }

    @Override
    public void execute() {
        this._buld.turnOn();
    }

    @Override
    public void undo() {
        this._buld.turnOff();
    }

    @Override
    public void redo() {
        this.execute();
    }
    
}
