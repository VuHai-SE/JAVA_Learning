package data;

import java.util.Random;

public class Motor implements DeadRacer{
    public static final double MAX_SPEED= 150;
    private String model;
    private int yob;
    private double volume;
    private String vin; // vehicle identifier number

    public Motor(String model, int yob, double volume, String vin) {
        this.model = model;
        this.yob = yob;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
    
    public double run(){
        return new Random().nextDouble()*MAX_SPEED;
    }
    
    public void showRecord(){
        System.out.printf("|MOTOR  |%-10s|%4d|%6.2f|%-12s|%6.2f\n", model, yob,volume, vin, run());
    }

    @Override
    public double runToDead() {
        return run()*3;
    }

    @Override
    public void showToQuocGhiCong() {
        System.out.printf("|MOTOR  |%-10s|%4d|%6.2f|%-12s|%6.2f|%6.2f\n", model, yob,volume, vin, run(), runToDead());
    }
}
