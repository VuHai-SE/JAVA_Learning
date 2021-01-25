package data;

public class Rectangle {
    protected String owner;
    protected String color;
    protected double height;
    protected double width;
    
    public Rectangle (String owner, String color, double height, double width){
        this.owner = owner;
        this.color= color;
        this.height= height;
        this.width= width;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getPerimeter (){ //tu ham dem xuong, khong can nhap
        return (height+width)*2;
    }
    
    public double getArea(){
        return height*width;
    }

    public void paint(){
        System.out.printf ("| Rectangle |%10s|%10s|%6.2f|%6.2f|%6.2f|%6.2f\n", owner, color,height, width, getArea(), getPerimeter());
    }
}
