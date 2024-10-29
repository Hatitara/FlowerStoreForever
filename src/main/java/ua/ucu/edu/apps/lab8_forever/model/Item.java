package ua.ucu.edu.apps.lab8_forever.model;

import lombok.Getter;

@Getter
public abstract class Item {
    private String description;

    public abstract double price();
}
