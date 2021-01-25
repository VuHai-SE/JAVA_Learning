package runtime;

import java.util.StringTokenizer;

public class Program {
    public static void main(String[] args) {
        String str1 = new String ("Do it now string");//heap
        //tạo str2 tham chiếu str1
        String str2 = str1;
        
        //lưu ý: String là immutable class: là khi tác động vào object này sẽ không làm thay đổi object 
        //mà sẽ trá ra object mới mang những thứ đã thay đổi
        //Bất kỳ thao tác nào lên Strinbg đều tạo ra object mới
        str1 = str1.concat(" - Làm Ngay Đi");//hungws hàm
        System.out.println(str1);//str1 trỏ toiws vị trí mới trong khi đó str2 trỏ ở vị trí cũ
        System.out.println(str2);
        
        StringBuilder msg1 = new StringBuilder ("Do it now string");//heap
        StringBuilder msg2 = msg1;
        
        //lưu ý: StringBuilder/ StringBuffer là mutable class: là khi tác động vào object này sẽ làm thay đổi object
        //Bất kỳ thao tác nào lên StrinbgBuilder đều làm thay đổi object
        msg1 = msg1.append(" - Làm Ngay Đi");//hungws hàm
        System.out.println(msg1);//msg1, msg2 trỏ tới vị trí mới 
        System.out.println(msg2);
        
        String title = "Thiều Bảo Trâm nhường sơn tùng cho trà xanh Hải Tú";
        StringTokenizer st = new StringTokenizer (title," ");
        
        //split: kỹ thuật băm chuỗi: hash
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println(st.countTokens());
        System.out.println(title);
        //mã hoá, CEO
        
        playWithStringComparison();
    }
    
    public static void playWithStringComparison(){
        String s0= new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");//heap
        String s1= "BÉ HỨA HỌC HÀNH CHĂM NGOAN";//pool
        String s2= "BÉ HỨA HỌC HÀNH CHĂM NGOAN";//pool
        String s3 = "bé hứa hcoj hành chăm ngoan";//pool
        String s4= new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
        String s5= new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
        
        if(s1==s0){
            System.out.println("bằng");
        }else{
            System.out.println("k bằng");
        }
        String str =s1.toLowerCase().toUpperCase();
        System.out.println(str);
    }
}
