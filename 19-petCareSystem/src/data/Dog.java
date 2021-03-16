package data;

import java.util.Random;

public class Dog extends Pet{
    private static final double MAX_SPEED = 50.0;

    public Dog(String id, String name, int yob, double weight) {
        super(id, name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble()*MAX_SPEED; 
    }

    @Override
    public void showProfile() {
        String msg = String.format("|%6s|%-15s|%4d|%4.1f|%4.1f", id, name, yob, weight, run());
        System.out.println(msg);
    }
}
