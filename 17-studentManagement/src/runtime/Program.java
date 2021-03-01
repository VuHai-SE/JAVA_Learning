//tạo class person gồm name, gender, yob
//tạo hàm đối số và không đối số
//getter and setter
//tạo InputInfo() để nhắc người dùng nhập thông tin
//tạo method showInfo

//tạo class student kế thừa person(id, gpa, email)
//tạo constructor (không đối số)
//tạo getter/ setter cấm bỏ trống khi nhập thông tin SV, email phải có @ và không được có khoảng cách
//showInfo

//Hàm Program:
//xây dựng menu gồm:
//1. nhập vào vùng student
//2. hiển thị thông tin SV
//3. hiển thị max min theo điểm trung bình
//4. tìm kiếm theo mã SV
//5. sort từ a-z theo tên và hiện thị ra màn hình
//6. hiển thị các SV được học bổng từ cao xuống thấp giảm dần (gpa>=8)
//7. thoát

package runtime;

import data.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        
        int choose;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            showMenu();
            System.out.println("Vui long nhap lựa chọn: ");
//          choose=scanner.nextInt();
            choose = Integer.parseInt(scanner.nextLine());
            
            switch(choose){
                case 1:{
                    System.out.println("Nhập SV:");
                    Student newStudent = new Student();
                    newStudent.inputInfor();
                    studentList.add(newStudent);
                    break;
                }
                case 2:{
                    for (Student o: studentList){
                        o.showInfor();
                    }   
                    break;
                }
                case 3:{
                    Student max = new Student();
                    Student min = new Student();
                    max=studentList.get(0);
                    min=studentList.get(0);
                    
                    for(int i=0; i<= studentList.size()-1;i++){
                        if(studentList.get(i).getGpa()<min.getGpa()){
                            min = studentList.get(i);
                        }
                        if(studentList.get(i).getGpa() > max.getGpa()){
                            max = studentList.get(i);
                        }
                    }
                    
                    System.out.println("Sinh viên có điểm lớn nhất:");
                    for(Student student : studentList){
                        if(student.getGpa()==max.getGpa()){
                            student.showInfor();
                        }
                    }
                    
                    System.out.println("Sinh viên có điểm bé nhất:");
                    for(Student student : studentList){
                        if(student.getGpa()==min.getGpa()){
                            student.showInfor();
                        }
                    }
                    break;
                }
                case 4:{
                    String key;
                    System.out.println("Nhập mã mà bạn muốn tìm");
                    key = scanner.nextLine();
                    int count = 0;
                    
                    for (Student o: studentList){
                        if(o.getId().equalsIgnoreCase(key)){
                            o.showInfor();
                            count++;
                        }
                    }
                    
                    if(count == 0){
                        System.out.println("Không có SV nào!!");
                    }
                    break;
                }
                case 5:{
                    /*
                    Comparator sortByName = new Comparator<Student>() {
                        @Override
                        public int compare(Student s1, Student s2) {
                            if(s1.getName().compareToIgnoreCase(s2.getName())>0){
                                return 1;
                            }
                            return -1;
                        }
                    };
                    
                    Collections.sort(studentList, sortByName);
                    */
                    
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student s1, Student s2) {
                            if(s1.getName().compareToIgnoreCase(s2.getName())>0){
                                return 1;
                            }
                            return -1;
                        }
                    });
                    
                    for (Student o: studentList){
                        o.showInfor();
                    }
                    break;
                }
                case 6:{
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student s1, Student s2) {
                            if(s1.getGpa() < s2.getGpa()){
                                return 1;
                            }
                            return -1;
                        }
                    });
                    
                    for (Student o: studentList){
                        if(o.checkScholarship()){
                           o.showInfor(); 
                        }
                    }
                    break;
                }
                case 7:{
                    System.out.println("BOODBYE!!!");
                    break;
                }
                default:{
                    System.out.println("Vui lòng nhập từ 1-7 thôi!!!");
                    break;
                }
            }
        }while(choose!=7);
       
    }
    public static void showMenu() {
        System.out.println("-------Menu quản lí SV-------");
        System.out.println("1. nhập vào vùng student");
        System.out.println("2. hiển thị thông tin SV");
        System.out.println("3. hiển thị max min theo điểm trung bình");
        System.out.println("4. tìm kiếm theo mã SV");
        System.out.println("5. sort từ a-z theo tên và hiện thị ra màn hình");
        System.out.println("6. hiển thị các SV được học bổng từ cao xuống thấp giảm dần (gpa>=8)");
        System.out.println("7. thoát");
        
    }
}
