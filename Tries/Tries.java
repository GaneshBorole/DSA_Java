package Tries;

import java.util.*;

public class Tries {
    static class Node {
        Node children[] = new Node[26]; // ✅ corrected spelling
        boolean eow = false; // eow = End of Word

       public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();

            }
            curr = curr.children[idx];
        }
        curr.eow = true;

    }

    public static boolean search(String key) {
        Node curr = root; // Initialize curr before using it
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow; 
    }


public static boolean Wordbreak(String key){
    if (key.length()==0) {
        return true;
    }
    for (int i = 1; i <= key.length(); i++) {
       if(search (key.substring(0,i))&& 
       Wordbreak(key.substring(i))){;
        return true;
       }
        
    }
    return false;
}
    public static void main(String[] args) {
        String arr[] = { "i", "like", "sam", "samsung", "mobile","ice" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);

        }
        // System.out.println(search("thee"));
        // System.out.println(search("thor"));
        String key="ilikesamsung";
        System.out.println(Wordbreak(key));
    }

}
