package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class GiftComposite extends AGiftBase implements IGiftOperation {
    private List<AGiftBase> _gifts;

    public GiftComposite(String name, int price)
    {
        super(name, price);
        this._gifts = new ArrayList<AGiftBase>();
    }

    @Override
    public void add(AGiftBase gift) {
        this._gifts.add(gift);
    }

    public int getTotalPrice() {
        int totalPrice = 0;

        for (AGiftBase gift : _gifts) {
            totalPrice += gift.getTotalPrice();
        }

        return totalPrice;
    }
    
}
