import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Pattern2 {
    // public static void hollow_rectangle(int totalRow,int totalcol){
    //     for(int i=1;i<=totalRow; i++){
    //         for(int j=1;j<=totalcol;j++){
    //         if(i==1 || i==totalRow || j==1 || j==totalcol) {
    //             System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //             }
    //         }
    //             System.out.println();
    //         }
            
    //     }
    
    // public static void main(String[] args) {
    //          hollow_rectangle(4,5);
    
    // }


    // public static void inverted_pyramid(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
        

    // }
    // public static void main(String[] args) {
    //     inverted_pyramid(4);
        
    // }
        

    // public static void inverted_pyramidwitnNum(int n){
    //     for(int i=1;i<=n; i++){
    //         for(int j=1; j<=(n-i+1);j++){
    //             System.out.print(j+" ");
    //         }
           
    //       System.out.println();  
    //     }
        
    // }
    // public static void main(String[] args) {
    //     inverted_pyramidwitnNum(5);
    // }


    // public static void Floyd_triangle(int n){
    //     int counter=1;
    //     for (int i=1;i<=n; i++){
    //         for(int j=1;j<=i; j++){
    //             System.out.print(counter+" ");
    //             counter++;
    //         }
    //         System.out.println();
    //     }

    // }
    // public static void main(String[] args) {
    //     Floyd_triangle(5);
    // }
    
    // 
    
    // public static void Butterfly(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=2*(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
            
    //     }
    //     //2nd half
    //     for(int i=n;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=2*(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
            
    //     }

        
    // }


    // public static void main(String[] args) {
    //     Butterfly(7);
    // }

    // public static void Solid_Rhombus(int n){
    //     for(int i=1;i<=n;i++){
    //       for(int j=1;j<=(n-i);j++){
    //         System.out.print(" ");

    //       }
    //       for(int j=1;j<=n;j++){
    //         System.out.print("*");
    //       }
    //       System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     Solid_Rhombus(5);
    // }

    // public static void hallow_Rhombus(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++){
    //             if(i==1||i==n ||j==1||j==n){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }

    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     hallow_Rhombus(5);
    // }


    public static void  DiamondPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DiamondPattern(4);
    }
}