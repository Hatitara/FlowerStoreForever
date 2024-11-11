package ua.ucu.edu.apps.lab8_forever.model;

import ua.ucu.edu.apps.lab8_forever.model.delivery.Delivery;
import ua.ucu.edu.apps.lab8_forever.model.payment.Payment;

import java.util.LinkedList;
import java.util.List;

public class Order {

    LinkedList<Item> items;
    List<User> users;
    Payment payment;
    Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0.0;
        for (Item item : items) {
            price += item.price();
        }
        return price;
    }

    public boolean processOrder() {;
        payment.pay(calculateTotalPrice() + delivery.deliver(items));
        return true;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(Item item) {
        for (Item currentItem : items) {
            if (currentItem.equals(item)) {
                items.removeFirstOccurrence(item);
                return true;
            }
        }
        return false;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update(user.toString());
        }
    }

    public void order() {
        notifyUsers();
    }
}
