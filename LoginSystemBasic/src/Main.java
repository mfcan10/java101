import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        String id,pass,newpass;
        int process=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a username : ");
        id = input.nextLine();
        System.out.println("Please enter a password : ");
        pass = input.nextLine();
        if (id.equals("mfc")&& pass.equals("123")){
            System.out.println("Authentication Confirmed");
        }
        else{
            System.out.println("Wrong id or password");
            System.out.println("Do you want to reset your password :  \n1-Yes 2-No");
            process=input.nextInt();
            newpass=input.nextLine();
            switch(process){
                case 1:
                    System.out.println("Please enter a new password");
                    newpass=input.nextLine();
                    if (newpass.equals(pass))
                        System.out.println("New password generated");
                    else
                        System.out.println("Password can't generated, please use another password");
                    break;
                case 2:
                    break;
                default:
                    break;
            }
            input.close();
        }

    }
}