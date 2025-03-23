import java.util.*;
public class conditional {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter your age");
        // int age=sc.nextInt();
        // if(age>=18){
        //     System.out.println("you can drive");
        // }
        // else if(age >= 13 && age <18){
        //     System.out.println("teenager");
        // }
        // else{
        //     System.out.println("you can't drive");
        // }

//Even odd check

        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter a number a");
        // int num=sc.nextInt();
        // if(num%2 ==0){
        //     System.out.println("given njumber is even");
        // }
        //     else{
        //         System.out.println("given number is odd");
        //     }

        //Tax calculation
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("enter your Income :");
    //     int Income=sc.nextInt();
    //    if(Income < 50000){
    //     System.out.println("tax 0%");
    //    }
    //    else if(Income >=50000 && Income < 100000){
    //     System.out.println("tax 20%");

    //    }
    //    else if (Income >=1000000){
    //     System.out.println("tax 30%");
    //    }
               

    // Scanner sc= new Scanner(System.in);
    //    System.out.println("enter a number");
    //    int num=sc.nextInt();
    //    String type=((num%2==0))? "even":"odd";
    //    System.out.println(type);




    //Calculator
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of a :");
    int a=sc.nextInt();
    System.out.println("enter the value of b :");
    int b=sc.nextInt();
    System.out.println("enter the operator");
    char operator=sc.next().charAt(0);

    switch (operator) {
        case '+':System.out.println(a+b);
        break;
        case '-':System.out.println(a-b);   
            break;
        case '*':System.out.println(a*b);
            break;
        case '/':System.out.println(a/b);
            break;

        case '%':System.out.println(a%b);
    
        default: System.out.println("wrong operator");
            break;
    }
    

    //
    

        }
    }
    


