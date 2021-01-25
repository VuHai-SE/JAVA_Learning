package data;

    public class Star {
        String name ;
        int yob;
        static String gender;
        String hitSong;

        public Star (String name, int yob, String gender, String hitSong){
        this.name = name;
        this.yob = yob;
        this.gender=gender;
        this.hitSong = hitSong;
        }
        
        public void showInfo (){
            System.out.printf("|%10s|%4d|%10s|%10s\n", name, yob, gender, hitSong);
        }
        
        
    }
//public final static double pi=3.14;