package ArrayList;
import java.util.*;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
       System.out.println(list.size());
        
        Get operation
        int element=list.get(0);
       System.out.println(element);

        Delete operation
       int deleteEle=list.remove(2);
        System.out.println(deleteEle);

        set element at index
        list.set(2, 7);
        System.out.println(list);

        contains
        System.out.println(list.contains(9));

        //print reverse numbers
        for(int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    
    }
    
}
