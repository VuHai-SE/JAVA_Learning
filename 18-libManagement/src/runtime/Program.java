/*
tạo chương trình quản lý thư viện
gồm 2 class sau
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
Book
    bookName createAt nickName
    tạo có đối số và k có đồi số
    tạo getter anh setter
    tạo hàm input//nếu mà sách này có tác giả mà 
    có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong ds
    thì thêm mới
program:
    menu
    1.Nhập thông tin sách in ra màn hình
    2.Hiển thị thông tin sách ra màn hình
    3.Nhập thông tin tác giả
    4.Tìm kiếm sách theo bút danh
    5.Thoát
 */

package runtime;

import data.Author;
import data.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<Author> authorList= new ArrayList<Author>(); 
        ArrayList<Book> bookList = new ArrayList<Book>();
        int choose;       
        Scanner scanner = new Scanner(System.in);
        
        do{
            showMenu();
            System.out.println("Vui lòng nhập lựa chọn: ");
//          choose=scanner.nextInt();
            choose = Integer.parseInt(scanner.nextLine());
            
            switch(choose){
                case 1:{
                    Book book= new Book();
                    book.input();                   
                    boolean isFind = false;
                    for(Author aut: authorList){
                        if(aut.getNickname().equalsIgnoreCase(book.getNickname())){
                            isFind =true;
                        }
                    }
                    if(isFind){
                        Author author = new Author(book.getNickname());
                        author.input();
                        authorList.add(author);
                    }                  
                    bookList.add(book);
                    break;
                }
                
                case 2:{
                    for (Book b: bookList){
                        b.showInfor();
                    }
                    break;
                }
                
                case 3:{
                    Author newAuthor = new Author();
                    newAuthor.input(authorList);
                    authorList.add(newAuthor);
                    
                    for (Author aut: authorList){
                        aut.showInfor();
                    }
                    break;
                    
                }
                
                case 4:{                  
                    System.out.println("Nhập tên sách mà bạn muốn tìm: ");
                    String findBook = scanner.nextLine();
                    for (Book o: bookList){
                        if(findBook.equalsIgnoreCase(o.getBookName())){
                            o.showInfor();
                        }
                    }
                    break;
                }
                
                case 5:{
                    System.out.println("BYE!!!");
                    break;
                }
            }
        }while(choose!=5);
       
    }
    public static void showMenu() {
        System.out.println("-------Menu quản lí sách-------");
        System.out.println("1.Nhập thông tin sách in ra màn hình");
        System.out.println("2.Hiển thị thông tin sách ra màn hình");
        System.out.println("3.Nhập thông tin tác giả");
        System.out.println("4.Tìm kiếm sách theo bút danh");
        System.out.println("5.Thoát");
        
    }
}
