package Backtracking;
import java.util.*;

public class Backtracking {
    ////backtracking with array
    public static void changearr(int arr[],int i,int value){
             //base case
    if(i==arr.length){
        printarr(arr);
        return;
    }
        //recursion
        arr[i]=value;
        changearr(arr, i+1, value+1);//function call step
        arr[i]=arr[i]-2;//backtrack step
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }





    //find subsets
    public static void  findsubsets(String str,String ans,int i){
           //base case
        if(i==str.length()){
            System.out.print(ans);
            return;
        }
             //recursion
        findsubsets(str, ans+str.charAt(i), i+1);
            //yes choice
        findsubsets(str, ans, i+1);

    }





   // //find permutations
    public static void findpermutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String rest=str.substring(0,i)+str.substring(i+1);
            findpermutations(rest, ans+curr);    
        }
    }




    //N-Queens Problems

    
    public static boolean isSafe(char[][] board, int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
    
        return true;
    }
    
public static void nQueens(char board[][],int row){
    //base case
    if(row==board.length){
        printBoard(board);
            return;
    }
    //  column loop
    for(int j=0;j<board.length;j++){
        if(isSafe(board,row,j)){
        board[row][j]='Q';
        nQueens(board, row+1);
        board[row][j]= 'x';
        }
    }
}
public static void printBoard(char board[][]){
    System.out.println("------ chess board ------");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();

    }
}



//Grid ways problem


public static int gridways(int i,int j,int n,int m){
    //base case
    if(i== n-1 && j==m-1){ //condition for last cell
        return 1;
    }else if(i==n || j==m){//boundary cross condition
        return 0;
    }
    int w1=gridways(i+1, j, n, m);
    int w2=gridways(i, j+1, n, m);
    int ways=w1+w2;
    return ways;
}





//sudoko solver problem

public static boolean isSafe(int sudoku[][],int row, int col,int digit){
    //col
    for(int i=0;i<=8;i++){
        if(sudoku[i][col]==digit){
            return false;
        }
    }
    //row
    for(int j=0;j<=8;j++){
        if(sudoku[row][j]==digit){
            return false;
        }
    }
    //grid
    int sr=(row/3)*3;
    int sc=(col/3)*3;

    for(int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
            if(sudoku[i][j]== digit){
                return false;
            }
        }
    }
    return true;
}
public static boolean SudokoSolver(int sudoku[][],int row, int col){
    //base case
    if(row ==9 && col==0){
        return true;
    }
    //recursion
    int nextRow=row ,nextCol=col+1;
    if(col+1==9){
        nextRow=row+1;
        nextCol=0;
    }
    if(sudoku[row][col]!=0){
       return SudokoSolver(sudoku, nextRow,nextCol);
    }
    for(int digit=1; digit<=9;digit++){
        if(isSafe(sudoku, row , col,digit)){
            sudoku[row][col]=digit;
            if (SudokoSolver(sudoku , nextRow,nextCol)){
                return true;
            }
            sudoku[row][col]=0;
        }

    }
    return false;
}

public static void printSudoku(int [][]sudoku){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(sudoku[i][j]+" ");
        }
        System.out.println();
    }
}



    public static void main(String[] args) {
        // int arr[]=new int[5];
        // changearr(arr, 0, 1);
        // printarr(arr);
        
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter your string");
        // String str=sc.nextLine();
        // //findsubsets(str, " ", 0);
        // findpermutations(str, "");

        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter the size");
        // int n=sc.nextInt();
        // char board[][]= new char [n][n];
        // //initialize
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         board[i][j]= 'x';
        //     }
        // }
        // nQueens(board, 0);

        // int n=3 ,m=3;
        // System.out.println("total number of ways :");
        // System.out.println(gridways(0,0, n, m));


        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}
    };
    
    if (SudokoSolver(sudoku, 0,0)){
        System.out.println("solution exists");
        printSudoku(sudoku);
    }else{
        System.out.println("solution does not exist");
    }

    }
    
    
}
