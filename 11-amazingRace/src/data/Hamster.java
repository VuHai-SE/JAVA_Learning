package data;

import java.util.Random;

public class Hamster extends Pet{
    //khong co j khac thi thoi, co j rieng thi them vao day, muon do lai ham nao thi viet vao day
    public static final double MAX_SPEED = 15.0;

    public Hamster (String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble()*MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("HAMSTER    |%-10s|%4d|%6.2f|%6.2f\n", name, yob, weight, run());
    }
    
}
