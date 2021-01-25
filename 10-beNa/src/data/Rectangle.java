package data;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String owner, String color,double width, double height) {
        super(owner, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPetrimeter() {
        return 2*(width+height);
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE  |%-10s|%-10s|%6.2f|%6.2f|%6.2f|%6.2f\n", owner, color, width, height, getArea(), getPetrimeter());
    }
    
    
}
