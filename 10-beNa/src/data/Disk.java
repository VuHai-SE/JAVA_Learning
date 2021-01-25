package data;

/*
 0. tạo class con trước
 1. thuộc tính chung của con cha giữ
 2. thuộc tính riêng thì con giữ
 3. con nhận cha bằng extends
 4. nếu cùng kiểu xài thì thôi, khác kiểu xài thì override
 5. hàm được overrride thì cha không thấy được
 6. nếu kế thừa từ 1 abstract class thì phải implement all abstract method nhưng
    nếu bạn lười bạn ngoan cố không làm thì class con sẽ bị abstract
*/

public class Disk extends Shape{
    public static final double PI = 3.14;
    //public cho ai cũng xài được chỉ cần Disk.PI
    //static cho mọi object tạo ra từ Disk đều có PI
    //fianl cho không ai fix value lại được (hằng số)
    //hằng số thì phải viết in hoa
    private double radius;

    public Disk(String owner, String color, double radius) {
        super(owner, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*Math.pow(radius, 2);
    }

    @Override
    public double getPetrimeter() {
        return 2*PI*radius;
    }

    @Override
    public void paint() {
        System.out.printf("|DISK   |%-10s|%-10s|%6.2f|%6.2f|%6.2f\n", owner, color, radius, getArea(), getPetrimeter());
    } 
}
