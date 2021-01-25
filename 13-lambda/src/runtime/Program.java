//lambda
package runtime;

public class Program {
    public static void main(String[] args) {
        //đang dùng annonymous
        Math sum = new Math(){
            @Override
            public int calcu (int a, int b){
                return a+b;
            }
        };
        // sum.calcu(5,7);
        Math sub = (int a, int b) ->{
        return a-b;
        };
        sum.calcu(5, 2);
        
        Math mul = (a,b)-> a*b; //(1)
    }
}

/*
lambda chỉ xuất hiện sau bản jdk8
nhiệm vụ lớn nhất của lambda là viết code tạo object từ interface, nhanh và gọn
vì ta quy ước trong interface chỉ được chứa 1 abstract method

-tại sao mình nên dùng lambda
1. cung cấp bản thực hiện giao diện chức năng
2. viết code ít hơn
 (argument list) -> {body}
 (argument list): parameter
arrow token: điều hướng para truyền vào body
body là code

Nếu body là 1 dòng return duy nhất thì khỏi cần viết return (1)
*/

@FunctionalInterface
interface Math{
    public int calcu (int a, int b);
    //public int calcu2 (int a, int b);
}