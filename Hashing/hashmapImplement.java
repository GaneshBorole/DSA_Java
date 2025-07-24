package Hashing;
import java.util.*;

public class hashmapImplement {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // total nodes
        private int N; // total buckets
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() { 
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int di = 0; di < ll.size(); di++) {
                if (ll.get(di).key.equals(key)) {
                    return di;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        // rehash()
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            N = N * 2;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;
            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        // put element code
        public void put(K key, V value) {
            int bi = hashFunction(key); //bi =bucket index
            int di = searchLL(key, bi); //di=data index

            if (di != -1) {
                buckets[bi].get(di).value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }
    
        // remove element code
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            return null;
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);
            return di != -1;
        }


        // Get element code
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di != -1) {
                return buckets[bi].get(di).value;
            }
            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }


     // 2.check if Two strings are Anagram or Not
   public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of characters in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Decrease count based on characters in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }



    public static void main(String[] args) {
        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("India", 125);
        // hm.put("China", 150);
        // hm.put("US", 50);
        // hm.put("Nepal", 5);

        // ArrayList<String> keys = hm.keySet();
        // for (String key : keys) {
        //     System.out.println(key + " -> " + hm.get(key));
        // }


        // LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>(); // keys are inserted in ordered
        // lhm.put("india", 100);
        // lhm.put("china", 150);
        // lhm.put("Us", 50);

        // System.out.println(lhm);



        // TreeMap<String,Integer> tm = new TreeMap<>(); // keys are sorted in ordered
        // tm.put("us", 80);
        // tm.put("eng", 40);
        // tm.put("india", 100);
        // System.out.println(tm);


        String s="race";
        String t= "care";
        System.out.println(isAnagram(s, t));



    // Hashset concept
    HashSet<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(4);
    set.add(2);
    System.out.println(set);
    System.out.println(set.size());
    //set.remove(2);
    if (set.contains(2)) {
        System.out.println("set contains 2");
        
    }

    //iteration on hashset
    HashSet<String> cities=new HashSet<>();
    cities.add("Mumbai");
    cities.add("pune");
    cities.add("Delhi");
    Iterator itr=cities.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
        
    }
    for (String city : cities) {
        System.out.println(city);
        
    }


        //1. find elements that appear more than(n/3) times
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
               map.put(arr[i], map.get(arr[i]) + 1); 
                
            }else{
                map.put(arr[i], 1);
            }
        }
        
        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length/3) {
                System.out.println(key);
                
            }
        }
     
       

    }
}
