import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    int col;
    int row;
    int mines;
    String[][] arrMines;
    String[][] arr;
    boolean explosion;
    MineSweeper(int col,int row){
        this.col=col;
        this.row=row;
        this.explosion=false;
        this.mines=(((this.col)*(this.row))/4);
        this.arrMines = new String[row][col];
        this.arr = new String[row][col];

    }
    void createMatris(String[][] matrix ){
        for (int i = 0; i < this.row; i++) {
            Arrays.fill(matrix[i], "-");
        }
    }
    void deployMines(){
        int cnt=1;
        while(cnt<=this.mines){
            int randomRow = (int) Math.floor(Math.random() * this.row);
            int randomCol = (int) Math.floor(Math.random() * this.col);
            if (arrMines[randomRow][randomCol].equals("-")) {
                arrMines[randomRow][randomCol] = "*";
                cnt++;
            }
        }
    }

    public void getArr(String[][] b) {
        String[][] arrToPrint =b;
        for (String[] row : arrToPrint) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
    public int check(int row, int col) {
        if (row < 0 || row >= this.row || col < 0 || col >= this.col) {
            return -1;
        }

        int amountMine = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < this.row && j >= 0 && j < this.col && !(i == row && j == col)) {
                    if (arrMines[i][j].equals("*")) {
                        amountMine++;
                    }
                }
            }
        }
        return amountMine;
    }
    public void run(){
        int cnt=0;
        int moveToWin=((this.row*this.col)-this.mines);
        createMatris(arr);
        createMatris(arrMines);
        deployMines();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the MineSweeper");
        while(!explosion){
            if(cnt==moveToWin){
                break;
            }
            getArr(this.arr);
            System.out.println("Enter a row : ");
            int r=input.nextInt();
            System.out.println("Enter a col : ");
            int c=input.nextInt();
            r--;
            c--;
            if (r < 0 || r >= this.row || c < 0 || c >= this.col) {
                System.out.println("Invalid row or column. Please enter values within the board limits.");
                continue;
            }
            System.out.println("=============================");
            if((!arrMines[r][c].equals("*"))&&arrMines[r][c].equals("-")){
                arrMines[r][c]=String.valueOf(check(r,c));
                arr[r][c]=String.valueOf(check(r,c));
                cnt++;
            }else if(arrMines[r][c].equals("*")){
                this.explosion=true;
                arr[r][c]="*";
                getArr(arrMines);
                System.out.println("=============================");
                System.out.println("You lost !.!.!");
            }
            else{
                System.out.println("Invalid choice,already choosed. Please enter another  value");
            }
        }
        if(!explosion){
            getArr(arrMines);
            System.out.println("=============================");
            System.out.println("Congrats,you win !.!.!");
            System.out.println("=============================");
        }
    }
}
