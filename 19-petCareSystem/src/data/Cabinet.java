package data;
//cái tủ dùng để chứa cái công cụ sử lý hồ sơ
//và cái tủ lưu hồ sơ của pet

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import util.MyToys;


public class Cabinet {
    private ArrayList<Pet> petList = new ArrayList();
    
    private Scanner sc = new Scanner (System.in);
    
    ////
    public  int searchPetByID(String petID){
        if(petList.isEmpty()){
            return -1;
        }
        for(int i=0; i<= petList.size()-1; i++){
            if(petID.equalsIgnoreCase(petList.get(i).getId())){
                return i;
            }
        }
        return -1;
    }
    
    public Pet searchPetObjectByID (String petID){
        if(petList.isEmpty()){
            return null;
        }
        for (Pet o : petList) {
            if(o.getId().equalsIgnoreCase(petID)){
                return o;
            }
        }
        return null;
    }
    
    public void searchPetID(){
        String id;
        Pet x;
        id= MyToys.getString("Input Pet ID", "Pet ID is !!!");
        x= searchPetObjectByID(id);
        if(x== null){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Here is the pet" + "that you want to search");
            x.showProfile();
        }
    }
     
    //
    public void addNewDog(){
        String id, name;
        int yob;
        double weight;
        int pos;
        do{
            id = MyToys.getID("Input Dog id (DXXXXX)", "the format of id is DXXXXX(X stand for a digit): ", "^[D|d]\\d{5}$");
            pos = searchPetByID(id);
            if(pos >= 0){
                System.out.println("The dog is is already exist" + "input another one!");
            }
        }while(pos != -1);
        
        name = MyToys.getString("Input Dog name: ", "The dog name is required!");
        yob= MyToys.getRightInt("Input dog yob(2000-2020)", "Yob is from 2020 - 2020",2000,2020);
        weight = MyToys.getRightDouble("Input dog weight(0.1-99.0)", "Weight is from 0.1 to 99.0", 0.1, 99.0);
        petList.add(new Dog(id, name, yob, weight));
        System.out.println("A Dog profile is added successfully");       
    }
    
    //
    public void addNewCat(){
        String id, name;
        int yob;
        double weight;
        int pos;
        do{
            id = MyToys.getID("Input Cat id (CXXXXX)", "the format of id is DXXXXX(X stand for a digit): ", "^[C|c]\\d{5}$");
            pos = searchPetByID(id);
            if(pos >= 0){
                System.out.println("The cat is is already exist" + "input another one!");
            }
        }while(pos != -1);
        
        name = MyToys.getString("Input Cat name: ", "The cat name is required!");
        yob= MyToys.getRightInt("Input cat yob(2000-2020)", "Yob is from 2020 - 2020",2000,2020);
        weight = MyToys.getRightDouble("Input cat weight(0.1-99.0)", "Weight is from 0.1 to 99.0", 0.1, 99.0);
        petList.add(new Dog(id, name, yob, weight));
        System.out.println("A Cat profile is added successfully");       
    }
    
    public void updatePet(){
        String id;
        String tmpName;
        Pet x;
        id = MyToys.getString("input pet id", "pet id is required");
        x= searchPetObjectByID(id);
        System.out.println("searchpetbytd======");
        if(x== null){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Here is the pet" + "bẻoeupdatin");
            x.showProfile();
            tmpName= MyToys.getString("Inputnewname: ","Name is required");
            x.setName(tmpName);
            System.out.println("The pet info is updated successfully");
        }
    }
    
    //remove
    public void removePet(){
        String id;
        int pos;
        id = MyToys.getString("input pet id", "pet id is required");
        pos = searchPetByID(id);
        System.out.println("======");
        if(pos== -1){
            System.out.println("NOT FOUND");
        }else{
            petList.remove(pos);
            System.out.println("The pet info is updated successfully");
        }
    }
    
    //hàm in petList theo chiều tăng dần của ID
    public void printPetListAscendingByID(){
        if(petList.isEmpty()){
            System.out.println("The cage is empty. Nothing to print");
            return;
        }
        Collections.sort(petList);
        System.out.println("----------------------------------");
        System.out.println("Here is the pet list");
        String header = String.format("%-6s|%-15s|%4s|%4s|%4s", "ID", "NAME", "YOB", "WGHT", "SPD");
        System.out.println("header");
        for(Pet o: petList){
            o.showProfile();
        }
    }
    
    public void printPetListAscendingByName(){
        if(petList.isEmpty()){
            System.out.println("The cage is empty. Nothing to print");
            return;
        }
        Collections.sort(petList, new Comparator<Pet>() {
            @Override
            public int compare(Pet p1, Pet p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        });
        System.out.println("----------------------------------");
        System.out.println("Here is the pet list");
        String header = String.format("%-6s|%-15s|%4s|%4s|%4s", "ID", "NAME", "YOB", "WGHT", "SPD");
        System.out.println("header");
        for(Pet o: petList){
            o.showProfile();
        }
    }
}
