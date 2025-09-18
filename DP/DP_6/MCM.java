package DP.DP_6;

public class MCM {
    public static int mcmRec(int arr[],int i,int j){
        if (i== j) {
            return 0;//single matrics case
        }
        int ans=Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++) {
            int cost1=mcmRec(arr, i, k);// res=arr[i-1].arr[k];
            int cost2=mcmRec(arr, k2+1, j);// res=arr[k].arr[j];
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finaalCost=cost1+cost2+cost3;
            ans=Math.min(ans, finaalCost);

            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n= arr.length;
        System.out.println(mcmRec(arr, 1, n-1));
        
    }
    
}
