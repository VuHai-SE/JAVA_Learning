/*
    Quản lý hệ thống chăm sóc thú cưng (chó mèo)
    Gồm các chức năng sau:
    Menu
    1. Add a new dog profile
    2. Add a new cat profile
    3. Search a pet profile by id
    4. Update a pet profile by id
    5. Delete a pet profile by id
    6. Print the pet list ascending by id
    7. Print the pet list ascending by name
    8. Quit

    nhập id cho pet: có ròi thì ép nhập lại
    nhập id cho pet phải theo chuẩn format
    nhập ìd cho chó thì phải có chữ D ở đầu và 6 số sau
    trong quá trình sử dụng phần mềm, nếu nhập sai thì phải bắt nhập lại ngay
*/
package runtime;

import data.Cabinet;
import ui.Menu;

public class Program {
    public static void main(String[] args) {
        Menu menu = new Menu("The Pet Care System");
        menu.addNewOption("1. Add a new dog profile");
        menu.addNewOption("2. Add a new cat profile");
        menu.addNewOption("3. Search a pet profile by id");
        menu.addNewOption("4. Update a pet profile by id");
        menu.addNewOption("5. Delete a pet profile by id");
        menu.addNewOption("6. Print the pet list ascending by id");
        menu.addNewOption("7. Print the pet list ascending by name");
        menu.addNewOption("8. Quit");
        
        Cabinet cage = new Cabinet();
        int choice;
        do{
            menu.printMenu();
            choice= menu.getChoice();
            switch(choice){
                case 1: {
                    System.out.println("You are preparign to" + "input a new dog profile");
                    cage.addNewDog();
                    break;
                }
                case 2: {
                    System.out.println("You are preparign to" + "input a new cat profile");
                    cage.addNewCat();
                    break;
                }
                case 3: {
                    System.out.println("You are preparign to" + "input a pet id to search profile");
                    cage.searchPetID();
                    break;
                }
                case 4: {
                    System.out.println("You are preparign to" + "input a pet id to updtae profile");
                    cage.updatePet();
                    break;
                }
                case 5: {
                    System.out.println("You are preparign to" + "input a pet id to remove profile");
                    cage.removePet();
                    break;
                }
                case 6: {
                    System.out.println("You are preparign to" + "print a pet list asdcending by id");
                    cage.printPetListAscendingByID();
                    break;
                }
                case 7: {
                    System.out.println("You are preparign to" + "print a pet list asdcending by name");
                    cage.printPetListAscendingByName();
                    break;
                }
                case 8: {
                    System.out.println("see ya!!!!");
                    break;
                }
            }
        }while (choice != 8);
    }
}
