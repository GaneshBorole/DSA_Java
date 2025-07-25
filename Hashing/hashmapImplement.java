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
            int bi = hashFunction(key); // bi =bucket index
            int di = searchLL(key, bi); // di=data index

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

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revmap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revmap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!revmap.containsKey(key)) {
                return key;
            }
        }
        return null;

    }

    public static void main(String[] args) {
        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("India", 125);
        // hm.put("China", 150);
        // hm.put("US", 50);
        // hm.put("Nepal", 5);

        // ArrayList<String> keys = hm.keySet();
        // for (String key : keys) {
        // System.out.println(key + " -> " + hm.get(key));
        // }

        // LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>(); // keys are inserted
        // in ordered
        // lhm.put("india", 100);
        // lhm.put("china", 150);
        // lhm.put("Us", 50);

        // System.out.println(lhm);

        // TreeMap<String,Integer> tm = new TreeMap<>(); // keys are sorted in ordered
        // tm.put("us", 80);
        // tm.put("eng", 40);
        // tm.put("india", 100);
        // System.out.println(tm);

        String s = "race";
        String t = "care";
        System.out.println(isAnagram(s, t));

        // Hashset concept
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        System.out.println(set);
        System.out.println(set.size());
        // set.remove(2);
        if (set.contains(2)) {
            System.out.println("set contains 2");

        }

        // iteration on hashset
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("pune");
        cities.add("Delhi");
        Iterator itr = cities.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        for (String city : cities) {
            System.out.println(city);

        }

        // LinkedHashset
        LinkedHashSet<String> lhm = new LinkedHashSet<>();
        lhm.add("Mumbai");
        lhm.add("pune");
        lhm.add("Delhi");
        System.out.println(lhm);

        // treeset
        TreeSet<String> trs = new TreeSet<>();
        trs.add("mumbai");
        trs.add("pune");
        trs.add("Bengluru");
        System.out.println(trs);

        // 1 count Distinct element in array
        int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        HashSet<Integer> sets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            sets.add(nums[i]);

        }
        System.out.println("ans = " + sets.size());

        // 2 Union & Intersection of 2 arrays
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set1.add(arr2[i]);
        }
        System.out.println("union of array = " + set1.size());

        set1.clear();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                count++;
                set1.remove(arr2[i]);

            }

        }
        System.out.println("intersection of array =" + count);

        // 3.find Itinerary from ticket

        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "Bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("Goa", "chennai");
        tickets.put("delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);

        while (tickets.containsKey(start)) {
            String next = tickets.get(start);
            System.out.print(" -> " + next);
            start = next;
        }

        System.out.println();

        // 1. find elements that appear more than(n/3) times
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);

            }
        }

        // 4. find out largest subArray with 0 sum
        int array[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        HashMap<Integer, Integer> maps = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int j = 0; j < array.length; j++) {
            sum += array[j];

            if (sum == 0) {
                maxLen = j + 1; // subarray from 0 to j
            }

            if (maps.containsKey(sum)) {
                maxLen = Math.max(maxLen, j - maps.get(sum));
            } else {
                maps.put(sum, j);
            }
        }

        System.out.println("Length of the largest subarray with sum 0: " + maxLen);



        // 5.subarray sum equal to k
        int arrays[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1); // to handle the case when prefix sum itself is k

        int summ = 0;
        int ans = 0;

        for (int j = 0; j < arrays.length; j++) {
            summ += arrays[j];

            if (hm.containsKey(summ - k)) {
                ans += hm.get(summ - k);
            }
            int val = 0;
            if (hm.containsKey(summ)) {
                val = hm.get(summ);
            }
            hm.put(summ, val + 1);
        }

        System.out.println(ans);
    }
}
