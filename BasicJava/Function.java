import java.util.*;

public class Function {
    // public static void printHello(){
    //     System.out.println("Hello world");
    // }


    // public static int  Sum(int num1, int num2){ //parameters
    //     int sum = num1+num2;
    //     return sum;
        
        

    // }
    // public static void main(String[] args) {
    // //     Scanner sc= new Scanner(System.in);
    // //     int a= sc.nextInt();
    // //     int b= sc.nextInt();
    // //    int sum = Sum(a,b); //Arguments
    // //    System.out.println("sum is "+ sum);
        
        
    // }


    //Swapping of two numbers
// public static void swap(int a, int b){
//     //swap
//     int temp= a;
//     a=b;
//     b=temp;
//      System.out.println("a = " +a);
//      System.out.println("b = "+b);

// }
//     public static void main(String[] args) {
//         int a= 5;
//         int b=10;
//         swap(a, b);
//     }




// public static int Multiply(int a, int b){
//     int product= a*b;
//     return product;
// }
// public static void main(String[] args) {
//     int a= 3;
//     int b= 7;
//     int ans=Multiply(a, b);
//     System.out.println("ans is "+ans);
    
// }


//Factorial of a number

// public static int Factorial( int num){
//     int fact=1;
//     for (int i=1 ;i<=num ;i++){
//         fact=fact*i;
//     }
//     return fact;
// }
// public static void main(String[] args) {
//     int res=Factorial(4);
//     System.out.println("factorial is :"+res);
    
// }

    //find  Binomial Coefficient

    // public static int binCoeff(int n, int r){
    //     int fact_n=Factorial(n);
    //     int fact_r= Factorial(r);
    //     int fact_nmr=Factorial(n-r);

    //     int binCoeff= fact_n/(fact_r*fact_nmr);
    //     return binCoeff;



    // }
    // public static void main(String[] args) {
    //     System.out.println( binCoeff(5, 2));
    // }



    //Function Overloading
    // public static int sum(int a, int b, int c ){
    //     return a+b+c;
    // }
    // public static int sumTwo(int a, int b){
    //     return a+b;
    // }
    
    // public static int sum(int a,int b){
    //     return a+b;

    // }

    //overloading using data types
    // public static float sum(int a, int b){
    //     return a+b;
    // }
    // public static float sum(float a,float b){
    //     return a+b;
    // }
    // public static void main(String[] args) {
    //     System.out.println(sum(3,5));
    //     System.out.println(sum(2.5f,2.5f));
        
    // }


    // public static boolean isPrime(int n){
       
    //     boolean isPrime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n % i ==0){
    //             isPrime=false;
    //             break;
    //         }
    //     }
    //     return isPrime;
        
    // }

    // public static void primesInrange(int n){
    //     for(int i=2; i<=n;i++){
    //         if(isPrime(i)){
    //             System.out.println(i +" ");
    //         }
    //     }
    //     System.out.println();
    // }


    //Binary to Decimal
    // public static void binToDec(int binNum){
    //     int pow = 0;
    //     int decNum = 0;

    //     while (binNum > 0) {
    //         int lastDigit = binNum % 10;
    //         decNum += lastDigit * Math.pow(2, pow);
    //         pow++;
    //         binNum /= 10;
    //     }

    //     System.out.println("Decimal number is: " + decNum);
    // }
    // public static void main(String[] args) {
    //       binToDec(101);
    // }

    //Decimal to binary
    public static  void DecToBin(int n){
        int mynum=n; 
        int pow=0;
        int binNum=0;

        while (n> 0) {
            int rem=n %2;
            binNum=binNum +(rem * (int)Math.pow(10,pow) );
             
            pow++;
            n=n/2;
            
        }
        System.out.println("binary form of "+mynum+ " = "+binNum);
    }
    public static void main(String[] args) {
        DecToBin(10);
    }
}
