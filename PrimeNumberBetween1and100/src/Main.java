
public class Main{
    public static void main(String[] args) {
        boolean prime=true;
        System.out.println("Prime numbers between 1 and 100 : ");
        for(int i=2;i<100;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime=false;
                }
            }
            if(prime){
                System.out.print(i+" ");
            }
            prime=true;
        }
    }
}