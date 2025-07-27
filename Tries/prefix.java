package Tries;
import java.util.*;

public class prefix {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq = 0;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.freq++; // ✅ increment freq on every visit
        }
        curr.eow = true;
    }

    public static void findPrefixes(Node node, String ans) {
        if (node == null) return;

        // ✅ Print prefix when frequency is 1
        if (node.freq == 1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                findPrefixes(node.children[i], ans + (char)(i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for (String word : arr) {
            insert(word);
        }

        findPrefixes(root, "");
    }
}
