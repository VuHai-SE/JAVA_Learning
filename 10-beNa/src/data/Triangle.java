package data;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle( String owner, String color,double a, double b, double c) {
        super(owner, color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getPetrimeter() {
        return a+b+c;
    }

    @Override
    public void paint() {
        System.out.printf("|TRIANGLE  |%-10s|%-10s|%6.2f|%6.2f|%6.2f|%6.2f|%6.2f\n", owner, color, a,b, c, getArea(), getPetrimeter());
    }
    
    
}
