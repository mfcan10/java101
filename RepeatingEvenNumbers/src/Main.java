import java.util.Arrays;
public class Main{
    static int[] x={444,23,4,52,3,6,75,444,332,52,66,63,66,4,5};
    static int[] repeatedArr={444,23,4,52,3,6,75,444,332,52,66,63,66,4,5};
    static int[] freq(int[] arr){
        Arrays.sort(arr);
        Arrays.fill(repeatedArr,0);
        int first=arr[0];
        int cnt=0;
        if ((first==arr[1])&&(first%2==0)){
            repeatedArr[cnt]=first;
            cnt++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]%2==0){
                if(i<(arr.length)-1){
                    if(arr[i]==arr[i+1]){
                        repeatedArr[cnt]=arr[i];
                        cnt++;
                    }
                }
            }
        }
        return repeatedArr;
    }
    static void print(int[] arr){
        for(int i:arr){
            if(i!=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        print(freq(x));
    }
}