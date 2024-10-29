package ua.ucu.edu.apps.lab8_forever.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "flowers")
public class Flower extends Item{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String color;
    private double price;
    private boolean available;

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return toString();
    }
}
