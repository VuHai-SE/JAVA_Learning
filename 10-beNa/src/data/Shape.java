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
    //Việc định nghĩa 
    //no ke thua cac ham cuia minh thi no phai implement (implicit)
    //co truong hop class ke thua abtract class nhung laij khong muon implement cac abtract method
    //=> con se bi khuyet tata, khong tao dc object bhtg
    
    //abtract class co the chua methofd bthg va abtract method
    //nhung maf mot classs bthg ma co abtract method thi 100% laf abtract class
    //abtract class van tao dc object bthg nhung pahi thong qua anonymours class (class vo hinh)
    
    public abstract double getArea();
    public abstract double getPetrimeter();
    public abstract void paint();

}
