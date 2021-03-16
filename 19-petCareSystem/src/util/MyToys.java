package util;

import java.util.Scanner;

public class MyToys {
    public static Scanner sc= new Scanner(System.in);
    
    //nhập vào số nguyên đích thực
    public static int getAnInteger(String inputMsg, String errorMsg){
        int n;
        while (true){
            try{
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            }catch (Exception e){
                System.err.println(errorMsg);
            }
        }
    }
    
    //hàm nhập vào integer nhưng trong khoảng lowerBound đến upperBound
    public static int getRightInt(String inputMsg, String errorMsg, int lowerBound, int upperBound){
        int n;
        while (true){
            try{ 
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if(n<lowerBound || n>upperBound){
                    throw new Exception();//try catch chỉ nhận lỗi của hệ thống chứ không nhận lỗi logic (khi bạn nhập sai nên nó mới bắt) nên phải "ném"
                }
                return n;
            }catch(Exception e){
                System.err.println(errorMsg);
            }
        }
    }
    
    //nhập vào số thực đích thực
    public static double getADouble(String inputMsg, String errorMsg){
        double n;
        while (true){
            try{
                System.out.println(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            }catch (Exception e){
                System.err.println(errorMsg);
            }
        }
    }
    
    public static double getRightDouble(String inputMsg, String errorMsg, double lowerBound, double upperBound){
        double n;
        while (true){
            try{ 
                System.out.println(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                if(n<lowerBound || n>upperBound){
                    throw new Exception();//try catch chỉ nhận lỗi của hệ thống chứ không nhận lỗi logic (khi bạn nhập sai nên nó mới bắt) nên phải "ném"
                }
                return n;
            }catch(Exception e){
                System.err.println(errorMsg);
            }
        }
    }
    //xây dựng hmaf dùng để lấy ìd và lấy chính xác id theo một chuẩn nào đó
    //regex
    public static String getID (String inputMsg, String errorMsg, String format){
        String id;
        boolean match;
        while (true){
            System.out.println(inputMsg);
            id= sc.nextLine().trim().toUpperCase();
            match = id.matches(format);
            if(id.length()== 0|| id.isEmpty() || /*!match*/ match == false){
                System.out.println(errorMsg);
            }else{
                return id;
            }
        }
    }
    //^[d|D]\\d{6}$
    //^[s|S]\[e|E]\\d{6}
    
    public static String getString(String inputMsg, String errorMsg){
        String id;
        while (true){
            System.out.println(inputMsg);
            id = sc.nextLine().trim();
            if (id.length()==0|| id.isEmpty()){
                System.out.println(errorMsg);
            }else{
                return id;
            }
        }
    }
}
