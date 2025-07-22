package Hashing;
import java.util.*;

public class hashmapImplement {
    static class Hashmap<K,V> {
        private class Node {
            K key;
            V value;
        
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
    }
        private int n;
        private int N;
        private LinkedList<Node>bucket[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.bucket=new LinkedList[4];
            for (int i = 0; i <4; i++) {
                this.bucket[i]=new LinkedList<>();
                
            }
        }
        private int hashFunction(k key){
            int hc=key.hashcode();
            return Math.abs(hc)% N;
        }
        private int SearchLL(K key,int bi){
            LinkedList<Node> ll=bucket[bi];
            int di=0;

            for (int i = 0; i < ll.size(); i++) {
                Node node=ll.get(i);
                if (node.key== key) {
                    return di;
                    
                }
                di++; 
                
            }
            return -1;

        }
        private void rehash(){
            LinkedList<Node> oldBuck[]=bucket;
            bucket=new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<bucket.length;i++){
                bucket[i]=new LinkedList<>();
            }

            //nodes -> add in new bucket
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll=oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key,V value){
            int bi=hashfunction(key);//bi= bucket index
            int di=SearchLL(key,bi);//di=data index

            if (di != -1) {
                Node node=bucket[bi].get[di];
                node.value=value;
                
            }else{
                bucket[bi].add(new Node(key,value));
                n++;
            }
            double lambda=(double)n/N;
            if (lambda > 2.0) {
                rehash();
                
            }

        }

        
       public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();
        hm.put("India",125);
        hm.put("china", 150);
        hm.put("us", 50);
        hm.put("Nepal", 5);
        
       }
        
    }

    

