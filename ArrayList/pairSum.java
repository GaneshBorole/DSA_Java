import java.util.*;


public class pairSum {
    //Method1 --> Brute Force
    public static boolean pairSum(ArrayList<Integer> list,int target){

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                } 

            }
        }
        return false;
    }
    //Method2 ---> 2 pointer approach
    public static boolean pairSum1(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;
        while (lp!= rp) {
            if(list.get(lp)+list.get(rp)== target){
                return true;
            } if(list.get(lp)+list.get(rp)< target){
                lp++;
            }else{
                rp--;
            }
            
        }
        return false;
    }


    public static boolean pairSum2(ArrayList<Integer> list,int target){
        int pivot=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)) { //breaking point
                pivot=i;
                break;
              
        }
    }
    int lp=pivot+1;
    int rp=pivot;
    while (lp != rp) {
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }
        if(list.get(lp)+list.get(rp)<target){
            lp=(lp+1)%n;
        }else{
            rp=(n+rp-1)%n;
        }
        
    }
    return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairSum2(list,target));
        
    }
    
}
