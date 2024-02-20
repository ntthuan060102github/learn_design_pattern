package BehavioralPatterns.strategy;

public class Sorter {
    private ISortStrategy _sorterSmall;
    private ISortStrategy _sorterBig;

    public Sorter(ISortStrategy sorterSmall, ISortStrategy sorterBig)
    {
        this._sorterSmall = sorterSmall;
        this._sorterBig = sorterBig;
    }

    public void sort(int[] data)
    {
        if(data.length >= 5) 
        {
            this._sorterBig.sort(data);
        }
        else 
        {
            this._sorterSmall.sort(data);
        }
    }
}
