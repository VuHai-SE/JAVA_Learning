package data;
//cha chua nhung cái chung của đám con
//cha chua prop: owner, color
//       method: getArea(), getPetrimeter(), paint()

public abstract class Shape {
    
    protected String owner;
    protected String color;

    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    //Mình sẽ tạo ra những khái niệm tính chu vi hay diện tích thôi nhưng ko cần định nghĩa (implement)
    //Việc định nghĩa mình nhường lại cho thằng con của mình
    //nó kế thừa hàm của mình thì nó phải implement (implicit)
    //có trường hợp class kế thừa abstract class nhưng lại không muốn implement các abstract method
    //=> con sẽ bị khuyết tật, không tạo đc object bhtg
    
    //abstract class có thể chứa method bthg va abstract method
    //nhưng mà một classs bthg mà có abstract method thì 100% là abstract class
    //abstract class vân tạo được object bthg nhưng phải thông qua annonymous class (class vô danh)
    
    public abstract double getArea();
    public abstract double getPetrimeter();
    public abstract void paint();

}
