import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,phy,chem,turk,hist,mus,total,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Math grade : ");
        mat = input.nextInt();
        System.out.println("Please enter your Chemistry grade : ");
        phy = input.nextInt();
        System.out.println("Please enter your Physics grade : ");
        chem= input.nextInt();
        System.out.println("Please enter your Turkish grade : ");
        turk= input.nextInt();
        System.out.println("Please enter your History grade : ");
        hist= input.nextInt();
        System.out.println("Please enter your Music grade : ");
        mus= input.nextInt();
        total = mat+chem+turk+hist+mus;
        result= total/6;
        final String msg = result>= 60 ? "Passed" : "Failed";
        System.out.println(msg);
    }
}