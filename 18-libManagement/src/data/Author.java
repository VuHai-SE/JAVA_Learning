/*
Author
    name nickname age birthday;
    tạo phểu hàm không đối số
    tạo phểu có đối số 
    tạo phểu có đối số là nickname
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    nhưng nếu tác giả đã tồn tại trong danh sách thì k cho
    ép nhập lại
    tạo hàm showInfor
*/
package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    public  String name;
    public  String nickname;
    public  int old;
    public  String birthday;

    public Author() {
    }

    public Author(String name, String nickname, int age, String birthday) {
        this.name = name;
        this.nickname = nickname;
        this.old = age;
        this.birthday = birthday;
    }

    public Author(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getOld() {
        return old;
    }

    public String getBirthday() {
        return birthday;
    }
    
    public void input(ArrayList<Author> authorList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nickname của tác giả: ");
        while(true){
            this.nickname = sc.nextLine();
            boolean isFind = false;
            for(Author aut: authorList){
                if(aut.getNickname().equalsIgnoreCase(this.nickname)){
                    isFind= true;
                }
            }
            if(!isFind){
                break;
            }else{
                System.err.println("nickname của tác giả đã bị trùng");
                System.out.println("Nhập lại nickname của tác giả: ");
            }
        }
        input();
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        this.name= sc.nextLine();
        System.out.println("Tuổi: ");
        this.old= Integer.parseInt(sc.nextLine());
        System.out.println("Năm sinh: ");
        this.birthday = sc.nextLine();
    }
    
    public void showInfor(){
        System.out.printf("\n%-20s|%-20s|%4d|%-20s\n", name, nickname, old, birthday);
    }
}
