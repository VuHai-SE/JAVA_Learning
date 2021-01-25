package runtime;

import data.*;
import java.util.Random;

public class Program {
    //Duong dua bay h bat dau
    public static void main(String[] args) {
        
        Pet d1 = new Dog("vang oi", 1945,10.0);
        Pet d2 = new Dog("Be To", 2010, 8.0);
        
        Cat c1 = new Cat("Kitty", 1974, 0);
        Pet h1 = new Hamster ("Mickey", 1928, 0);
        
        Pet racer[] = {d1, d2, c1, h1};
        // co 4 doi thu
        
        //for (Pet pet: racer){
        //    pet.showRecord();
        //}
        
        //ban rieng ve nah pet
        //dang dua buoi toi 
        //xuat hien mot con vat j do, chay phia sau
        //cung nho thoi nhung vi toi qua nen khon biet la con gi
        //dung sung ban toc do do duoc
        //nhung khon gbiet con gi
        Pet x = new Pet("xxx", 2020,5){
            @Override
            public double run() {
                return new Random().nextDouble()*50;
            }

            @Override
            public void showRecord() {
                System.out.printf("XXX    |%-10s|%4d|%6.2f|%6.2f\n", name, yob, weight, run());
            } 
        };
        //x.showRecord();
        
        Motor ex = new Motor ("exciter2021", 2021, 155, "56F8-2204");
        Motor winner = new Motor("winnerX", 2019, 150, "56F8-6789");
        
        //ex.showRecord();
        //winner.showRecord();
        DeadRacer racerls [] = new DeadRacer[4];
        racerls[0]= ex;
        racerls[1]= (Dog)d1;
        racerls[2]= (Dog)d2;
        
        racerls[3]= new DeadRacer () {
            @Override
            public double runToDead() {
                return  new Random().nextDouble()*60*3;
            }

            @Override
            public void showToQuocGhiCong() {
                System.out.printf("MM CTT|%-10s|%4d|%6.2f\n", "Mẫn Mẫn",2014,runToDead());
            }
            
        };
        
        for (DeadRacer o: racerls){
            o.showToQuocGhiCong();
        }
    }
}
