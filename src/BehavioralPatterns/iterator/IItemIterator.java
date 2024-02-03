package BehavioralPatterns.iterator;

public interface IItemIterator<T> {
    public boolean hasNext();
    T next();
}
