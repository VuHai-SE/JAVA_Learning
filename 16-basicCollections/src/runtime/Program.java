package runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        playWithInteger();
        sortInteger();
        swapInsideList();
        playWithSet();
    }
    
    public static void playWithSet(){
        //Set là cái giỏ cấm trùng, không cho phép nhiều hơn 1 con trỏ trong giỏ cùng vùng new
        //không chấp nhận chuyện 2 chàng trỏ 1 nàng
        Set<Integer> ds= new HashSet<>();
        ds.add(10000);
        ds.add(2000);
        ds.add(-10);
        ds.add(700);
        ds.add(500);
        System.out.println("mang ne: " + ds);
        //tk này vào ra lộn xộn không có thứ tự
        //vì nó lộn xộn nên không có method get
        //HASH MD5 SHA SHA-512
        //HashSet phải sử dụng cặp bài trùng equal
        //phải compare để điều khiển các object bên trong
        
        //Map là 1 giỏ ánh xạ: bỏ 1 con trỏ vào thì phải thêm nhận dạng
        //Tại sao Map lại bị cho ra rìa khỏi Collections
        //Collections là bộ sưu tập chứa nhiều con trỏ
        //List/ Set chỉ chứa 1 loại con trỏ dùng để nhận diện vùng new ---> nhiều theo đơn 
        //Map nó lại đòi đến 2 con trỏ, con trỏ nhận dạng vùng new và con trỏ nhận dạng con trỏ ---> nhiều theo cặp
    }
    
    public static void swapInsideList(){
        List<Integer>ds= new ArrayList<Integer>();
        ds.add(10000);
        ds.add(50);
        System.out.println("mang ne: " + ds);
        //toString là 1 hàm đặc biệt dùng để show hết tất cả các properties của object
        //bên C mà in ra con trỏ thì chỉ ra địa chỉ
        //List: vào thứ tự nào ra thứ tự đó
        //Hash: vào trước nhưng có thể ra sau, lộn xộn
        //comparable: đố kị, nó tự sắp xếp theo sự đố kị của nó, vì đố kị nên nó muốn độc tôn
        //comparator: dựa trên tiêu chí là so sánh 2 object
        
        //nhưng giờ anh muốn in ra 50 và 10000
        //cụ thể là anh muốn ds[0]=50 và ds[1]=1000
        //bạn swap như nào
        
        Integer tmp = ds.get(0);
        ds.set(0, ds.get(1));
        ds.set(1,tmp);
        
        System.out.println("mang sau ne: " + ds);
        
    }
    
    public static void sortInteger(){
        ArrayList<Integer>ds= new ArrayList<>();
        //ArrayList ds2 = new ArrayList<>();
        //thích cái gì chuaws cái đó, miễn là object là add được
        //không quan tâm cha con
        //không hay ho đâu
        
        List<Integer> ds3=new ArrayList<>();
        ds3.add(1);
        ds3.add(-1);
        ds3.add(15);
        ds3.add(19);
        ds3.add(20);
        ds3.add(30);
        ds3.add(40);
        System.out.println("\ntruoc khi sort" + ds3);
        Collections.sort(ds3);//auto unboxing, tự lấy lõi tự so sánh
        //còn nếu là object bthg như con người thì không thể so sánh 1 cách sơ xài như vậy được mà phải dựa trên tiêu chí gì đó
        Collections.reverse(ds3);
        System.out.println("sau khi sort" + ds3);
    }
    
    public static void playWithInteger(){
        int fb1[]={1,1,2,3,5,8,13,21};
        //đây là cách tạo mảng primitive bình thường
        int fb2[]= new int[8];
        //wrapper
        Integer fb3[]= {1,1,2,3,5,8,13,21};
        //boxing 
        //fb3[0]=1 // new ngầm Integer[1]
        //Mảng object mà là mảng con trỏ integer
        //Hao ram vì nó cần new cho từng phần tử
        //Mảng này là mảng chứa object nhưng không có khả năng co giãn,
        //bị giới hạn về mặt kích thước khi khởi tạo
        
        //Collections
        ArrayList<Integer> fb = new ArrayList<Integer>();
        //vì nó co giãn nên khi khởi tạo không cần liệt kê phần tử 
        //                  không cần báo số phần tử kèm theo
        //Collection chơi với object thôi
        //nên ArrayList<int>fb = new ArrayList<>();//khoong ddc
        //fb của mình sẽ trỏ tới một vùng new chà bá nên nó quản lý 1 đống các con trỏ trỏ tới những vùng new rời rạc
        fb.add(new Integer(1));//cứ new đi rồi đưa các vùng nhớ đó cho tao để tao trỏ
        fb.add(1);//lưu vùng nhớ của con số 1 này chứ không hề lưu giá trị 1
        //auto unboxuing nên khi gọi nó không trả ra địa chỉ mà trả luôn ra core
        fb.add(2);
        fb.add(3);
        fb.add(5);
        fb.add(8);
        fb.add(13);
        fb.add(21);
        
        
        for (Integer o : fb) {
            System.out.println(o);
        }
        
        System.out.println(fb);
        
        for (int i=0; i<= fb.size()-1; i++){
            System.out.print(fb.get(i)+" ");
            //trả ra toạ độ thứ i trong value
            //nhưng mà nó có cơ chế unboxing nên nó mới show ra value core của nó
            //không chơi với primitive chỉ chơi với object
            //FI FO
        } 
    }
}
