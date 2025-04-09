package Arrays;

import java.util.*;

public class Strings {

    // public static void printletters(String str) {
    //     for (int i = 0; i < str.length(); i++) {
    //         System.out.print(str.charAt(i) + " ");

    //     }
    //     System.out.println();
    // }


    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){ //not a palindrome
                return false;


            }

        }
        
        return true;
    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // String name;
        // name= sc.nextLine();
        // System.out.println(name);

        // print string length
        // String fullname="Ganesh Borole";
        // System.out.println(fullname.length());

        // CharAt method
        // String firstname = "Ganesh";
        // String lastname = "Borole";
        // String fullname = firstname + " " + lastname;

        // printletters(fullname);


        Scanner sc= new Scanner(System.in);
        System.out.println("enter your String");
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));

    }

}
