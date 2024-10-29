package ua.ucu.edu.apps.lab8_forever.model.decorators;

import ua.ucu.edu.apps.lab8_forever.model.Item;

public class BasketDecorator extends Decorator{

    private final ua.ucu.edu.apps.lab8_forever.model.Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + fit in basket.";
    }

    @Override
    public double price() {
        return item.price() + 4.0;
    }
}
