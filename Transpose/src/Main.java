import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static int row;
    public static int col;
    public static int[][] matrix;
    public static int[][] transpose;
    static void preProcess(){
        int n=1;

        for(int i=0;i<matrix.length;i++){
            int[] r =matrix[i];
            for(int j=0;j<r.length;j++){
                r[j]=n;
                n++;
            }
        }
    }
    static void takeTranspose(){
        transpose = new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
    }
    public static void print(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a row number ");
        row = input.nextInt();
        System.out.println("Enter a col number ");
        col = input.nextInt();
        matrix = new int[row][col];
        preProcess();
        takeTranspose();
        print(transpose);
    }

}