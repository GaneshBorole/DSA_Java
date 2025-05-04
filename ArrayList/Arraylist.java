package ArrayList;
import java.util.*;


public class Arraylist {
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //add operation
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(4);

        // int idx1=1 ,idx2=3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);
        System.out.println(list);;
        Collections.sort(list);
        System.out.println(list);
       
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     if(max<list.get(i)){
        //         max=list.get(i);
        //     }
        // }
        // System.out.println(max);


    //    System.out.println(list);
    //    System.out.println(list.size());
        
    //     Get operation
    //     int element=list.get(0);
    //    System.out.println(element);

    //     Delete operation
    //    int deleteEle=list.remove(2);
    //     System.out.println(deleteEle);

    //     set element at index
    //     list.set(2, 7);
    //     System.out.println(list);

    //     contains
    //     System.out.println(list.contains(9));

    //     //print reverse numbers
    //     for(int i= list.size()-1;i>=0;i--){
    //         System.out.print(list.get(i)+" ");
    //     }
    //     System.out.println();
    
    }
    
}
