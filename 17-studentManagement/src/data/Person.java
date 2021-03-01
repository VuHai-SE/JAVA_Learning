//tạo class person gồm name, gender, yob
//tạo hàm đối số và không đối số
//getter and setter
//tạo InputInfo() để nhắc người dùng nhập thông tin
//tạo method showInfo

package data;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String gender;
    protected int yob;

    //không đối số
    public Person() {
    }

    //có đối số
    public Person(String name, String gender, int yob) {
        this.name = name;
        this.gender = gender;
        this.yob = yob;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public void inputInfor(){
        //khi mà muốn nhập thì cần có bộ scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        this.gender=scanner.nextLine();
        System.out.println("Nhập năm sinh: ");
        this.yob =scanner.nextInt();
    }
    
    public void showInfor (){
        System.out.printf("\n%-10s|%-10s|%4d", name, gender, yob);
    }
}
