package runtime;
import data.Star;

public class Program {
    public static void main(String[] args) {
        Star sonTung = new Star ("Son Tung M-TP" ,1994, "Nang am xa dan");
        sonTung.showInfor();
        Star chiPu = new Star ("Chi Pu", 1993, "o o o o");
        chiPu.showInfor();
        sonTung.setName ("Tung nui");
        sonTung.showInfor ();
    }
}
