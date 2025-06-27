package Stack;
import java.util.*;

public class stack2 {
    //1.valid Parentheses check
    public static boolean isValid(String str ){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           //opening
           if(ch=='('|| ch =='['||ch=='{'){
            s.push(ch);
           }else{
            //closing
            if(s.isEmpty()){
                return false;
            }
            if( (s.peek()== '('&& ch ==')')
            ||(s.peek()=='['&& ch==']')
            || (s.peek()== '{'&& ch=='}') ){
                s.pop();
            }else{
                return  false; 
            }
           }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    //2.Duplicate parentheses check
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //closing
            if(ch==')') {
                int count=0;
                while (s.peek()!= '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;//duplicate exist   
                }else{
                    s.pop();
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    //3.area of a Histogram 
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];

        //Next smaller right
        Stack<Integer> s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty()&& arr[s.peek()] >= arr[i]) {
                s.pop();
                
            }if(s.isEmpty()){
                nsr[i]=arr.length-1;
            }else{
                nsr[i]=s.peek();

            }
            s.push(i);
        }

        //next smaller left
         s=new Stack<>();

        for(int i=0 ;i<arr.length;i++){
            while (!s.isEmpty()&& arr[s.peek()] >= arr[i]) {
                s.pop();
                
            }if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();

            }
            s.push(i);
        }


        //current area
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height * width;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("max area in Histogram is = "+maxArea);

    }


    public static void main(String[] args) {
        // String str1="((a+b))";//true
        // String str2="(a-b)";//false
        // System.out.println(isDuplicate(str2));

        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
    
}
