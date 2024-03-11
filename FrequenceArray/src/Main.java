import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        int[] arr={10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);
        int first=arr[0];
        int cnt=0;
        for(int i:arr){
            if(i==first){
                cnt++;
            }
            else{
                System.out.println(first+" is "+cnt+" times repeated.");
                cnt=1;
                first=i;
            }
        }
        System.out.println(first+" is "+cnt+" times repeated.");
    }
}