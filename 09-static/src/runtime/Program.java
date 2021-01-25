package runtime;

import data.Star;

public class Program {
    public static void main(String[] args) {
        Star sonTung = new Star ("Nguyen Thanh Tung", 1994, "Nam", "Chung ta cua hien tai");
        sonTung.showInfo();
        Star ngocTrinh = new Star ("Ngoc Trinh", 1989, "Nu", "Vong em 56");
        ngocTrinh.showInfo();
        sonTung.showInfo();
        Star vkt = new Star("Vu Khac Tiep", 1982, "Nam", "Ong hoang cach ly");
        System.out.println("Sau:");
        sonTung.showInfo();
        ngocTrinh.showInfo();
        vkt.showInfo();
    }
}
