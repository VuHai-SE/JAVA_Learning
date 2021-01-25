package runtime;

public class Program {
    //wrapper class, class trai bao
    public static void main(String[] args) {
        int a=10; //tạo biến a có kiểu dữ liệu là int, gán 10 vào biến a|4 byte
        //4 byte này được on of tạo thành 10 dưới dạng thập phân
        //a.  không được (4 byte thì không chứa hàm gì, method
        Integer b = new Integer(10); //nhét số 10 vào trong lõi của object b, nó được bao bọc bởi hàm nên được gọi là class trai bao
        // object b
        //vậy nó rất là lớn về mặt kích thước, hao ram
        //boxing xảy ra khi mà bạn muốn gán số nào đó vào b
        b=a;
        
        System.out.println(a);
        System.out.println(b);// gọi thầm tên em, hướng về core
        //đồi với những cái khác thì cần .string để in nhưng wrapper thì k cần
        int c=b; //unboxing 
        //mở box ra lấy cái core đổ vào c
        //primitive = wrapper class
        //tạo object từ wrapper class phải dùng new, quá dài dòng => bỏ luôn
        //có new sẽ được tạo trên vùng nhớ heap
        Integer d=2000;//vùng nhớ pool
        //wrapper class có cơ chế auto boxing/ unboxing nên không cần phân biệt quá nhiều về heap và pool
       //mặc dù là con trỏ nhưng object có thể tự unboxing
       d=b;
       if(b.equals(d)){//equal trả ra true vs false. compareTo trả ra 0, dương hoặc âm (do lấy b-d)
           System.out.println("bằng");
       }else{
           System.out.println("k bằng");
       }
       
       //2 object bình thường không thể so sánh bằng equal hay compareTo được vì sự thắng bại dựa trên nhiều tiêu chí khác
       
       //riêng wrapper class nó chỉ là 1 con số và còn có auto boxing/ unboxing nên nó có thể so sánh như bình thường
       //hoặc là dùng equal hay compareTo 
       //cấm tuyệt đối so sánh 2 object bằng toán tử
        
    }
}
