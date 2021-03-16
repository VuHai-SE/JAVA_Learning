package data;

import java.util.Random;

public class Cat extends Pet{
    private static final double MAX_SPEED = 30.0;

    public Cat(String id, String name, int yob, double weight) {
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

