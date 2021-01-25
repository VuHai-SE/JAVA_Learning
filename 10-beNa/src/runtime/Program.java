package runtime;

import data.*;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Shape ds[] = new Shape[4];
        ds[0]= new Disk("tia", "huong", 2.0);
        ds[1]= new Rectangle ("huong", "hong", 2,3);
        ds[2]= new Square ("luc", "xanh", 3);
        Triangle tr1 =new Triangle ("mo", "do", 3,4,5);
        ds[3]=tr1;
        
        for (Shape o:ds){
            o.paint();
        }
        
        /*
        Muốn có object không quan tâm class con hay cha hay độc lập
        Khuôn (phễu/constructor)
        New dùng để gọi phễu
        Biến con trỏ = new Dog(...)
        Bản thân object là con trỏ
        Dog example = new Dog(...)
        Nói riêng về các class có mối quan hệ cha con 
        Như đã nói ở trên: muốn tạo object từ 2 thằng đó
        Square vuong = new Square();
        */
               
        /*
        Tuy nhiên nếu nhìn sâu vào vùng nhớ của con thì có nhiều điểm khác biệt
        => New con thì gọi constructor con nhưng bên trong constructor của con lại có super (bên trong con lại có new cha)
        => Vùng nhớ của con nhiều hơn vùng nhớ của cha

        Vùng code cảu riêng con (cha không được xài)

        * Mục đích, ý nghĩa của việc trong new con có new cha là gì?:
        + Phục hồi lại mọi thứ của con khi chưa kế thừa
        + Làm được những việc như khi một mình
        + Những gì người khác làm tốt rồi thì không làm lại nhưng những j ngta làm chưa tốt cho mình thì mình overrride (độ lại).

        Object con nhìn sâu vào bên trong sẽ là:
        Square s1 = new Square(...);
                    new Rectangle();
        => Con chỉ là new cha + code cảu riêng con 
                    super
                    di truyền  extends
                    inherit
        */
        
        //khai cha, new cha
        Rectangle s1 = new Rectangle ("tia", "huong",2,3);
        //khai con, new con
        Square s2= new Square ("con", "hong",2);
        //khai cha new con
        Rectangle s3= new Square ("con", "hong",2);
        //Nếu có hàm chung thì new nào xài hàm đó
        //Nếu như thằng new không có thì xài thằng cha

        
        //s1.draw: không được do trong cha không có bộ nhớ draw
        //s2.draw: được
        //s3.draw: không được
        
        //Drift pointer: bẻ lái con trỏ
        Square tmp =(Square)s3;
        tmp.draw();
        
        ((Square)s3).draw();
        
        /*
        
        Vậy abstract class thì sao (bthg không đúc được object)
            Muốn tạo object phải thông qua class trung gian
        new cha + đoạn code của riêng con
            làm implement (bổ sung)/explicit (làm rõ ràng, minh bạch)
        Nhưng mà nếu anh lười, ngại không muốn toạ class mà vẫn muốn có object từ abstract class thì phải làm sao?
        => Thì ta có thể dùng kĩ thuật: mượn gió bẻ măng, dùng abstract class tạo object không thông qua class trung gian,
           là kĩ thuật takeaway/handmade: chỉ xài được một lần, không thể xài thêm được nữa, nếu muốn phải copy
        vd khách mời, cướp ngân hàng
        
        *Ưu điểm của abstract class:
            Một class bthg có một abstract method bên trong class đó thì class đó chính là abstract class
            Một abstract class có thể có method bthg và abstract method
            Các abstract method được xem là một khái niệm mà abstract class không cần phải định nghĩa (không có body)
            Không thể tự tạo ra class mà phải thông qua class trung gian với điều kiện là implement all method, nếu
        class trung gian không làm chuyện đó thì nó là 1 abstrct class
            Nếu mà bạn lười thì sd kth anonymous
            Ưu điểm của anonymous class là nhanh, gọn nhưng khong tái sd đc.
        
        *Dùng anonymous class khi muốn tạo object từ abstract class nhưng không muốn thông qua class trung gian
        
        *Inheritance:
            Cha chỉ được chứa những thuộc tính chung của con
            Con được kế thừa tất cả nhưng chỉ được sd protected,...
            Con thừa hưởng những method của cha nhưng có thể độ lại
            Tính đơn kế thừa: 1 con chỉ có duy nhất 1 cha, nhưng cha có thể có nhiều con
            New nào xài hàm độ ấy, phá luật xài drift
            Tính đa hình: con độ lại hàm cha (override)
        
        *Override chỉ appear trong mối quan hệ cha con 
        
        */
        
        Shape x = new Shape("xxx", "do"){ //class anonymous
            @Override
            public double getArea() {
                Random rd = new Random();
                return rd.nextDouble()*17;
            }

            @Override
            public double getPetrimeter() {
                return new Random().nextDouble()*20;
            }

            @Override
            public void paint() {
                System.out.printf("|SQUARE  |%-10s|%-10s|%6.2f|%6.2f\n", owner, color, getArea(), getPetrimeter());
            }
        }; //class anonymous
        
        x.paint();
    }
    
}
