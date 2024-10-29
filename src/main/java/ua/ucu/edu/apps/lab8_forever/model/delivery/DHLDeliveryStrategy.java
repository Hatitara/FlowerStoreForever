package ua.ucu.edu.apps.lab8_forever.model.delivery;

import ua.ucu.edu.apps.lab8_forever.model.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{

    private final double DELIVERY_PRICE_MULTIPLIER = 0.1;

    @Override
    public double deliver(List<Item> items) {
        double sum = 0.0;
        for (Item item : items) {
            sum += item.price();
        }
        return DELIVERY_PRICE_MULTIPLIER * sum;
    }
}

