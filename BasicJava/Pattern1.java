import java.util.Scanner;

public class Pattern1 {
     public static void main(String[] args) {
        //STAR pattern
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("enter the size of star pattern");
    //     int num= sc.nextInt();
    //   for(int i=1;i<=num; i++){
    //     for(int j=1; j<=i ;j++){
    //         System.out.print("*");

    //         }
    //         System.out.println();
    //     }


         //REVERSE STAR
    // Scanner sc= new Scanner(System.in);
    // System.out.println("enter the size of pattern");
    // int num =sc.nextInt();

    // for(int i=num;i>=1; i--){
    //     for(int j=i;j>=1;j--){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // System.out.println();



        //HALF PYRAMID
    //  Scanner sc= new Scanner(System.in);
    //  int num=sc.nextInt();
     
    //  for(int i=1; i<=num; i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    //  }


    // char ch='A';
    // int n=4;

    // for(int i=1;i<= n;i++){
    //     for(int j=1;j<=i; j++){
    //         System.out.print(ch);
    //         ch++;
    //     }
    //     System.out.println();
    // }

    char ch='H';
    int n=5;
    for( int i=n;i>=1;i--){
        for(int j=i;j>=1;j--)
        System.out.print(ch);
        ch++;
    }
    System.out.println();

      }
}