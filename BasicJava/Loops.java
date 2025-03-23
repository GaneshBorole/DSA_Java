import java.util.*;
public class Loops {
    public static void main(String[] args) {

        // while loop
    //  int counter=0;
    //  while (counter < 10) {
    //     System.out.println("Hello world");
    //     counter++;
        
    //  }

    // print number from 1 to 10;
    // int num=1;
    // while (num <= 10) {
    //     System.out.print(" "+num);
    //     num++;
        
    // }


          // print number from 1 to n
    // int num=1;
    // Scanner sc= new Scanner(System.in);
    // System.out.println("enter your range" +"  ");
    // int range=sc.nextInt();

    // while (num <= range) {
    //     System.out.print(range +" ");
    //     num++;
        
    // }

          //sum of n natural number
         
                //   Scanner scanner = new Scanner(System.in);
                  
                //   System.out.print("Enter a positive integer: ");
                //   int n = scanner.nextInt();
                  
                //   int sum = 0;
                //   int i = 1;
                  
                //   while (i <= n) {
                //       sum += i;
                //       i++;
                //   }
                  
                //   System.out.println("Sum of first " + n + " natural numbers is: " + sum);
                  
                //   scanner.close();



                //For loop

                // for(int i=1; i<=4;i++){
                //     System.out.println ("* * * *");
                // }


                // Scanner sc=new Scanner(System.in);
                // System.out.println("enter your number");
                // int n= sc.nextInt();

                // while (n>0) 
                // {
                //     int last=n%10;
                //     System.out.print(last );
                //     n=n/10;
                    
                // }
               
                // int n=1;
                // do{
                //     System.out.println("hello");
                //     n++;
                // } while(n <=5);

                // Scanner sc= new Scanner(System.in);
                // do{
                //     System.out.println("enter your number");
                //     int n= sc.nextInt();

                //     if(n%10==0){
                //         break;
                //     }
                //     System.out.println(n);
                    
                // }while(true);


                Scanner sc= new Scanner(System.in);
                int n= sc.nextInt();

                boolean isPrime = true;
                if(n==2){
                    System.out.println("num is prime");
                }else{
                    for(int i=2;i<=n-1; i++){
                        if(n%i== 0){
                           isPrime=false;

                        }
                    }

                }
                if(isPrime ==true){
                    System.out.println("n is prime");
                }else{
                    System.out.println("not prime");
                }



              }
          }
          

    
