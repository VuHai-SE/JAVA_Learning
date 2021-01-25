package runtime;
import data.Rectangle;
import data.Square;

public class Program {
    public static void main(String[] args) { 
        Square s1 = new Square("tim" ,"huong",3);
        Square s2 =new Square ("mo","vang",4);
        //int array[MAX]
        Square ds[]=new Square[3];
        ds[0]=s1;
        ds[1]=s2;
        ds[2]= new Square("con", "red",6);
        for(int i=0;i<= ds.length -1;i++){
            ds[i].paint();
        }
       /* for (Square o: ds){  //for cai tien
            o.paint();
        }*/

        Rectangle ds2[]= new Rectangle[2];
        ds2[0] = new Rectangle ("dad","tim", 2,3);
        ds2[1] = new Rectangle ("mom","xanh", 5,6);
        
        for (Rectangle o: ds2){  //for cai tien
            o.paint();
        }
    }
    
}


