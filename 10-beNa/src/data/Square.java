package data;

public class Square extends Rectangle{

    public Square(String owner, String color, double edge) {
        super( owner, color,edge, edge);
    }

    @Override
    public void paint() {
        System.out.printf("|SQUARE  |%-10s|%-10s|%6.2f|%6.2f|%6.2f|%6.2f\n", owner, color, width, height, getArea(), getPetrimeter());
    }
    
    public void draw (){
        System.out.println("draw");
    }
    
}
