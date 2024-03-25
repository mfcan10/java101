import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main{
    public static Scanner input = new Scanner(System.in);
    public static int count(String st1 ,char ch){
        int count=0;
        for(int i =0;i<st1.length();i++){
            if((st1.charAt(i)==Character.toLowerCase(ch))||(st1.charAt(i)==Character.toUpperCase(ch))){
                count++;
            }
        }
        return count;
    }
    public static boolean checkPassword(String password){
        boolean length=false,letter=false,digit=false,special=false;
        if(password.length()>=8){length=true;}
        if (password.matches(".*[a-zA-Z]+.*")){letter=true;}
        if(password.matches(".*\\d.*")){digit=true;}
        Pattern specialPat = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher hasSpecial = specialPat.matcher(password);
        if(hasSpecial.find()){special=true;}
        return length&&letter&&digit&&special;
    }
    public static String takePassword(){
        while(true){
            System.out.println("Enter your password : ");
            String a = input.nextLine();
            if(checkPassword(a)){
                return a;

            }
            else{
                System.out.println("Sorry, the password does not meet the requirements. Please try again.");
            }


        }
    }
    public static int distanceDart(double x , double y){
        double distance = Math.sqrt(x*x+y*y);
        double distance1= Math.sqrt(1+1);
        double distance5=Math.sqrt(5*5+5*5);
        double distance10=Math.sqrt(10*10+10*10);
        int score=0;
        if(distance<=distance1){
            score+=10;
        } else if (distance<=distance5) {
            score+=5;
        } else if (distance<=distance10) {
            score+=1;
        }
        System.out.println("The distance between your dart and center is : "+ distance);
        return score;
    }
    public static void main(String[] args) {
        System.out.println("Enter a sentence : ");
        String a =input.nextLine();
        System.out.println("Enter a char : ");
        char ch =input.next().charAt(0);
        //" The magician said : Abracadabra"
        System.out.println("Number of case-insensitive : "+count(a,ch));
        input.nextLine();
        System.out.println("Enter a password : ");
        String c =input.nextLine();
        if(checkPassword(c)){   System.out.println("Congratulations! Your password meets the requirements");;}
        else{System.out.println("Sorry, your password does not meet the requirements");}
        String d =takePassword();
        System.out.println(" The valid password entered is : "+ d);
        System.out.println("Enter a x : ");
        Double x =input.nextDouble();
        System.out.println("Enter a y : ");
        Double y =input.nextDouble();
        System.out.println("Your score is : "+distanceDart(x,y));
    }
}