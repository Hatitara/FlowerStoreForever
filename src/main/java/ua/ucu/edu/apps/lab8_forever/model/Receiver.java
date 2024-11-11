package ua.ucu.edu.apps.lab8_forever.model;

public class Receiver extends AppUser implements User {
    @Override
    public void update(String status) {
        System.out.println(status);
    }
}
