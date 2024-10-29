package ua.ucu.edu.apps.lab8_forever.model;

import lombok.ToString;

@ToString
public class RomashkaFlower extends Flower{

    public RomashkaFlower() {
        setColor("White");
    }

    @Override
    public String getDescription() {
        return toString();
    }
}
