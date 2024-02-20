package BehavioralPatterns.strategy;

public class QuickSortStrategy implements ISortStrategy {
    @Override
    public void sort(int[] data) {
        System.out.println("Sorting using quick sort!");
    }
    
}
