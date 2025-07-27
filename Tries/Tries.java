package Tries;
import java.util.*;

public class Tries {
    static class Node{
        Node childeren[]=new Node[26]; 
        boolean eow=false; //eow=EndofWord

        Node(){
            for (int i = 0; i < childeren.length; i++) {
                childeren[i]=null;
            }
        }

    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if (curr.childeren[idx]==null) {
                curr.childeren[idx]=new Node();
                
            }
            curr=curr.childeren[idx];
        }
        curr.eow=true;

    }

    public static void main(String[] args) {
        String words[]={"the","a","there","any","three"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);

        }

    }
    
}
