package runtime;

public class Program {
    public static void main(String[] args) {
        //        System.out.println("Hello World");
        int age = 18;
        boolean check = true;
        char c = 65;
        System.out.println("c = " + c);
//        ta có byte là kiểu dữ liệu mới
//        nó là int nhưng không được quá giới hạn của 1 byte , tức là k quá 127
        byte numberByte = 127;
        System.out.println("numberByte = " + numberByte );
        int numberInt = 200;
//        numberInt = numberByte;
        float numberFloat = 5.6f;
        double numberDouble = 5.6;
        String name = "hello" ;
        System.out.println("character = " + name);
        
        long money = 1_000_000_000_000_000_000L;
    }
    
}


/*
    * Modifier:

    _ AccessModifier
+ public : ai cũng truy cập được
+ protected : phải là mối qh cha con thì mới được dùng
+ default : chỉ những thẳng nằm trong cùng một package mới được xài
+ private : cá nhân hoá, không cho ai xài chung

    _ Non-AccessModifier
+ final: Nếu dành cho classs có nghĩa là không kế thừa được
         Thuộc tính thì là hằng số
+ static: tĩnh
          dùng chung
          1 class mà có thuộc tính là static thì tất cả object đều xài chung thuộc tính đó
+ abstract : trừu tượng
    1 class mà có abstract method thì nó là abstract
    nhưng 1 abstract class thì chưa chắc có abstract method

khi đặt tên vui lòng tránh những từ khoá sau đây:
    for while do if else void case switch try catch default final
    this import synchronized throw throws package enum assert
    super extends implements continue break return new
*/