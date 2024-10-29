package ua.ucu.edu.apps.lab8_forever.model;

import lombok.ToString;

@ToString
public class CactusFlower extends Flower{

    public CactusFlower() {
        setColor("Green");
    }

    @Override
    public String getDescription() {
        return toString();
    }
}
