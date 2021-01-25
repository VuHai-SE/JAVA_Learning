package data;

//cho con nhận cha bằng từ khoá extends

public class Square extends Rectangle {

    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);// new cha (new Rectangle) |sử dụng contructor
    }
    
    @Override // khi con muốn vượt mặt cha nhưng không muốn cha xài hàm đó, tính đa hình ánh xạ
    public void paint(){
        System.out.printf ("| Square |%10s|%10s|%6.2f|%6.2f|%6.2f|%6.2f\n", owner, color,height, width, getArea(), getPerimeter());
    }

}
