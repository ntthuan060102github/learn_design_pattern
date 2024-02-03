package BehavioralPatterns.observer;

import java.util.List;
import java.util.ArrayList;

public class Subject {
    private List<IObserver> _observers = new ArrayList<IObserver>();

    public Subject()
    {
        
    }

    public void attach(IObserver observer)
    {
        this._observers.add(observer);
    }

    public void detach(IObserver observer)
    {
        this._observers.remove(observer);
    }

    public void notifyChange(String message)
    {
        for(IObserver observer : this._observers)
        {
            observer.update(message);
        }
    }
}
