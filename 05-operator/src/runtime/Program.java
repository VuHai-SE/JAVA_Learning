package runtime;

public class Program {
    public static void main(String[] args) {
/* 
        + - * / : math operator
        
        shift Operator: <<>>
        // muốn chơi được toán tử này phải chuyển từ hệ 10 sang nhị phân
*/
        
        int number = 8;
        number = number << 2;
        System.out.println("number = " + number);
        
        // & giống nhân
        // | gặp 1 thì lấy
        // ^ khác nhau thì 1, giống thì 0
        // ~ not
    }
}