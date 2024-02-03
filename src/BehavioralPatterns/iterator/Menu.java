package BehavioralPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Item> menuItems = new ArrayList<>();
 
    public void addItem(Item item) {
        menuItems.add(item);
    }
 
    public IItemIterator<Item> iterator() {
        return new MenuItemIterator();
    }
 
    class MenuItemIterator implements IItemIterator<Item> {
        private int currentIndex = 0;
 
        @Override
        public boolean hasNext() {
            return currentIndex < menuItems.size();
        }
 
        @Override
        public Item next() {
            return menuItems.get(currentIndex++);
        }
    }
}
