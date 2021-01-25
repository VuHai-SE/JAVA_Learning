package runtime;

import data.Rectangle;
import data.Square;

public class Program {
    public static void main(String[] args) {
        Rectangle ds[] = new Rectangle[2];
        
        ds[0] = new Rectangle ("cha", "cam", 2, 3);
        ds[1] = new Square ("con", "do", 3);
        
        for (Rectangle o: ds){  //for cải tiến
            o.paint();
        }
    }
    
}
