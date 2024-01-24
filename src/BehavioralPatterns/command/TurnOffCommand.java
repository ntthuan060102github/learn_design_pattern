package BehavioralPatterns.command;

public class TurnOffCommand implements Command{
    private Buld _buld;

    public TurnOffCommand(Buld buld)
    {
        this._buld = buld;
    }

    @Override
    public void execute() {
        this._buld.turnOff();
    }

    @Override
    public void undo() {
        this._buld.turnOn();
    }

    @Override
    public void redo() {
        this.execute();
    }
    
}
