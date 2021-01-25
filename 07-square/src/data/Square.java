package data;

import java.io.PrintStream;

public class Square {
    String owner;
    String color;
    double edge;
    
    // tao constructor taoj pheu
    public Square (String owner, String color, double edge){
        this.owner = owner;
        this.color = color;
        this.edge = edge;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    //tao ham
    public double getArea (){ //tu ham dem xuong, khong can nhap
        return edge*edge;
    }
    public double getPerimeter(){
        return edge*4;
    }
    public void paint(){
        System.out.printf ("| Square    |%10s|%10s|%6.2f|%6.2f|%6.2f\n", owner, color,edge, getArea(),  getPerimeter());
    }
}