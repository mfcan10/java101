import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.Random;
public class Main{
    public static Scanner input = new Scanner(System.in);
    public static void partO(){
        System.out.println("Enter a sentence : ");
        String sentence=input.nextLine();
        int i, len = sentence.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            if(Character.isLetter(sentence.charAt(i)) ||Character.isDigit(sentence.charAt(i))) {
                dest.append(sentence.charAt(i));
            }
        }
        String reversedOne=dest.toString();
        System.out.println("Reverse alphanumeric characters : "+reversedOne);
    }
    public static String mix(String a,String b){
        int lenA=a.length(),lenB=b.length();
        int min=0,max=0,cnt=0;
        char ch;
        String result="",minS="",maxS="";
        if (lenA<=lenB){
            min=lenA;
            max=lenB;
            minS=a;
            maxS=b;
        }
        else{
            min=lenB;
            max=lenA;
            minS=b;
            maxS=a;
        }
        for(int i=0;i<min;i++){
            result+=maxS.charAt(i);
            result+=minS.charAt(i);
            cnt++;
        }
        result+=maxS.substring(cnt);
        return result;
    }
    public static String common(String a,String b){
        String removedA = "",removedB = "",max="",min="",result="";
        for (int i = 0; i < a.length(); i++) {
            if(!removedA.contains(String.valueOf(a.charAt(i)))) {
                removedA += String.valueOf(a.charAt(i));
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(!removedB.contains(String.valueOf(b.charAt(i)))) {
                removedB += String.valueOf(b.charAt(i));
            }
        }
        if(removedA.length()<=removedB.length()){
            min=removedA;
            max=removedB;
        }
        else{
            min=removedB;
            max=removedA;
        }
        for (int i=0;i<max.length();i++){
            if(min.indexOf(max.charAt(i))!=-1){
                result+=max.charAt(i);
            }
        }
        return result;
    }
    public static Double randomNumbers(int low,int up,int cnt){
        Random rand = new Random();
        int count=0;
        double sum =0.0;
        System.out.print("Random numbers are : ");
        for(int i =1;i<=cnt;i++){
            int n = rand.nextInt(up-low+1)+low;
            System.out.print(n+" ");
            count+=1;
            sum+= (double)n;
        }
        System.out.println();
        double average = sum/count;
        return average;

    }
    public static void main(String[] args) {
        partO();
        System.out.println("Enter a first sentence : ");
        String sentenceF=input.nextLine();
        System.out.println("Enter a second sentence : ");
        String sentenceS=input.nextLine();
        System.out.println("Mixed string is : "+mix(sentenceF,sentenceS));
        System.out.println("Enter a first string : ");
        String p1=input.nextLine();
        System.out.println("Enter a second string : ");
        String p2=input.nextLine();
        System.out.println("String with common characters is : "+common(p1,p2));
        System.out.println("Enter a lowest number : ");
        int low=input.nextInt();
        System.out.println("Enter a highest number : ");
        int high=input.nextInt();
        System.out.println("Enter a number of numbers : ");
        int n=input.nextInt();
        System.out.println("Average = "+randomNumbers(low,high,14));
    }
}