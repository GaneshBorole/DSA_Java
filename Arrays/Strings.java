package Arrays;

import java.util.*;

public class Strings {

    // public static void printletters(String str) {
    //     for (int i = 0; i < str.length(); i++) {
    //         System.out.print(str.charAt(i) + " ");

    //     }
    //     System.out.println();
    // }


    // public static boolean isPalindrome(String str){
    //     for(int i=0;i<str.length()/2;i++){
    //         int n= str.length();
    //         if(str.charAt(i) != str.charAt(n-1-i)){ //not a palindrome
    //             return false;


    //         }

    //     }
        
    //     return true;
    // }


    //getShortest path

    // public static float getShortestPath(String str){
    //     int x=0,y=0;

    //     for(int i=0;i<str.length();i++){
    //         char dir=str.charAt(i);

    //         if(dir == 'S'){ //South
    //             y--;
    //         }else if(dir == 'N'){ //North
    //             y++;
    //         }else if(dir == 'W'){ //West
    //             x--;
    //         }else{ //East
    //             x++;
    //         }
    //     }
    //     int X2=x*x;
    //     int Y2=y*y;
    //     return(float) Math.sqrt(X2+Y2);

    // }


       //ToUppercase Conversion
    //    public static String ToUppercase(String str) {
    //     StringBuilder sb = new StringBuilder("");
    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);
    
    //     for (int i = 1; i < str.length(); i++) {
    //         if (str.charAt(i) == ' ' && i < str.length() - 1) {
    //             sb.append(' ');
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         } else {
    //             sb.append(str.charAt(i));
    //         }
    //     }
    
    //     return sb.toString();
    // }
    

    public static String compressString(String str){
        String newStr=" ";
        for(int i=0;i<str.length();i++){
            Integer count=1;
        while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
            count++;
            i++;
                
            }
            newStr +=str.charAt(i);
            if(count > 1){
                newStr +=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your string");
        String str;
        str= sc.nextLine();
        System.out.println("compressed string is :");

        // print string length
        // String fullname="Ganesh Borole";
        // System.out.println(fullname.length());

        // CharAt method
        // String firstname = "Ganesh";
        // String lastname = "Borole";
        // String fullname = firstname + " " + lastname;

        // printletters(fullname);


        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter your String");
        // String str=sc.nextLine();
        // // System.out.println(isPalindrome(str));
        // System.out.println("The Shortest Path is :");
        // System.out.println(getShortestPath(str));
        // System.out.println(ToUppercase(str));
        System.out.println(compressString(str));


        //Find out the largest string in the array By alphabetical order

    //     String fruits[]={"apple","mango","banana"}; 
    //     String largest=fruits[0];
    //     for(int i=1; i<fruits.length; i++){
    //         if(largest.compareTo(fruits[i])< 0){
    //             largest =fruits[i];

    //         }
    //     }
    //     System.out.print("Largest String in the array is : ");
    //     System.out.println(largest);

    


//         StringBuilders
//     StringBuilder sb=new StringBuilder();
//     for(char ch='a';ch<='z';ch++){
//         sb.append(ch);

//     }
//     System.out.println(sb.length());


}


     




}