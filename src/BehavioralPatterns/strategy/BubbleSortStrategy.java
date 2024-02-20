package BehavioralPatterns.strategy;

public class BubbleSortStrategy implements ISortStrategy {
    @Override
    public void sort(int[] data) {
        System.out.println("Sorting using bubble sort!");
    }
    
}
