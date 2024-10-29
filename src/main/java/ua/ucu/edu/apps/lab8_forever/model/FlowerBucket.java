package ua.ucu.edu.apps.lab8_forever.model;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class FlowerBucket extends Item{
    List<Flower> flowers;

    public FlowerBucket() {
        this.flowers = new ArrayList<>();
    }

    @Override
    public double price() {
        double sum = 0.0;
        for (Flower flower : flowers) {
            sum += flower.price();
        }
        return sum;
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("Flower Bucket contains ").append(flowers.size()).append(" flowers:\n");
        for (Flower flower : flowers) {
            sb.append(flower.getDescription()).append("\n");
        }
        return sb.toString();
    }

    public void addFlowers(List<Flower> flowers) {
        this.flowers.addAll(flowers);
    }

    public Flower searchFlower(String name) {
        for (Flower flower : flowers) {
            if (flower.getName().contains(name)) {
                return flower;
            }
        }
        return null;
    }
}
