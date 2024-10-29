package ua.ucu.edu.apps.lab8_forever.model.delivery;

import ua.ucu.edu.apps.lab8_forever.model.Item;

import java.util.List;

public interface Delivery {
    double deliver(List<Item> items);
}
