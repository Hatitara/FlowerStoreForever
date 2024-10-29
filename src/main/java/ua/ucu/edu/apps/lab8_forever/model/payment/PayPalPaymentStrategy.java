package ua.ucu.edu.apps.lab8_forever.model.payment;

public class PayPalPaymentStrategy implements Payment{

    private final double DISCOUNTED_MULTIPLIER = 0.95;

    @Override
    public boolean pay(double price) {
        double toBePayed = DISCOUNTED_MULTIPLIER * price;
        // Here it has to minus it somehow.
        return true;
    }
}
