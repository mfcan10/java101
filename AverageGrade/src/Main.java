import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        final int LIMIT = 55;
        int mat,phy,turk,chem,mus,aver=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your math grade : ");
        mat=input.nextInt();
        System.out.println("Please enter your physics grade : ");
        phy=input.nextInt();
        System.out.println("Please enter your turkish grade : ");
        turk=input.nextInt();
        System.out.println("Please enter your chemistry grade : ");
        chem=input.nextInt();
        System.out.println("Please enter your music grade : ");
        mus=input.nextInt();
        if (0<mat && mat<=100)
            aver+=mat;
        if (0<phy && phy<=100)
            aver+=phy;
        if (0<turk && turk<=100)
            aver+=turk;
        if (0<chem && chem<=100)
            aver+=chem;
        if (0<mus && mus<=100)
            aver+=mus;
        aver = aver/5;
        if (LIMIT<=aver)
            System.out.println("You passed the class, your average grade is : "+aver);
        else
            System.out.println("You failed the class, your average grade is : "+aver);
    }
}