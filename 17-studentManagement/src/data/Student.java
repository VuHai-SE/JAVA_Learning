//tạo class student kế thừa person(id, gpa, email)
//tạo constructor (không đối số)
//tạo getter/ setter cấm bỏ trống khi nhập thông tin SV, email phải có @ và không được có khoảng cách
//showInfo

package data;

import java.util.Scanner;

public class Student extends Person {
    private String id;
    private float gpa;
    private String email;

    //constructor không đối số
    public Student() {
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if (id!= null){
            this.id=id;
            return true;
        }else{
            System.err.println("Điền vào thông tin: ");
            return false;
        }
    }

    public float getGpa() {
        return gpa;
    }

    public boolean setGpa(float gpa) {
        if (gpa>=0 && gpa <=10){
            this.gpa=gpa;
            return true;
        }else{
            System.err.println("vui lòng nhập từ 0-10 nha ");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email!= null && email.contains("@")&& !email.contains(" ")){
            this.email=email;
            return true;
        }else{
            System.err.println("email phải có @, không có khoảng trắng, không bỏ trống");
            return false;
        }
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

    @Override
    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfor();
        System.out.println("nhập ID:");
//        while (true){
//            String inputID= scanner.nextLine();
//            boolean check = setId (inputID);
//            if(check){
//                break;
//            }
//        }
//    }
        while (!setId(scanner.nextLine()));
        System.out.println("nhập GPA:");
        while (!setGpa(Float.parseFloat(scanner.nextLine())));
        System.out.println("nhập Email:");
        while (!setEmail(scanner.nextLine()));
    }
    
    @Override
    public void showInfor(){
        System.out.printf("\n%-10s|%-10s|%-10s|%3.1f|%4d|%-10s\n", id, name , gender, gpa, yob, email);
    }
    
    public boolean checkScholarship(){
        if(this.getGpa() > 8){
            return true;
        }
        return false;
    }
}