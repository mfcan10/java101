import java.util.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException
    {
        Scanner kb = new Scanner(System.in);
        String fileName =("C:\\Users\\furkan.can\\IdeaProjects\\Lab_07\\src\\Lab7_cars.txt");
        printAL(readFile(fileName)); // Read and display file
        System.out.println("PART2-***************************");
        System.out.println("Enter a marker:");
        String x = kb.nextLine();
        findMarkPrint(readFile(fileName),x);
        System.out.println("PART3-***************************");
        System.out.println("Enter a km limit :");
        int km = kb.nextInt();
        findKmPrint(readFile(fileName),km);
    } // end main
    private static ArrayList<String> readFile (String fname)
            throws FileNotFoundException {
        // Open file:
        Scanner fileScan = new Scanner(new File(fname));
        ArrayList<String> strings = new ArrayList<String>();
        // Until there is something in the file, read it.
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            strings.add(line);
        }
        fileScan.close();
        return strings;
    }
    public static void printAL(ArrayList<String> liste){
        System.out.println("There are "+liste.size()+" lines\nCars:");
        for(int i =0 ; i<(liste.size());i++){
            System.out.println(liste.get(i));
        }
    }
    public static void findMarkPrint(ArrayList<String> all,String seperator){
        ArrayList<String> strings = new ArrayList<String>();
        for(int i=0;i<all.size();i++){
           String temp = all.get(i);
           if (temp.indexOf(seperator)!=-1){
               strings.add(temp);
           }
       }
        printAL(strings);
    }
    public static void findKmPrint(ArrayList<String> all,int km){
        ArrayList<String> strings = new ArrayList<String>();
        for(int i=0;i<all.size();i++){
            String temp = all.get(i);
            String[] data = temp.split(";");
            int result_km = Integer.parseInt(data[5]);
            if(result_km<km){
                strings.add(temp);
            }
        }
        printAL(strings);
    }
}
