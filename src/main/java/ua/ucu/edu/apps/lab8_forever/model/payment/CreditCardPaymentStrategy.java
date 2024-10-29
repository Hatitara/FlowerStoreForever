package ua.ucu.edu.apps.lab8_forever.model.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        // Here it has to minus it somehow.
        return true;
    }
}
