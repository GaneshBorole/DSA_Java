import java.util.*;

public class Greedy {
    public static void main(String[] args) {
         //1. Activity selection problem //O(n)

        // int start[]={1,3,0,5,8,5};
        // int end[]={2,4,6,7,9,9};

        // //if given array is not sorted
        // int activities[][]=new int[start.length][3];
        // for(int i=0;i<start.length;i++){
        //     activities[i][0]=i;
        //     activities[i][1]=start[i];
        //     activities[i][2]=end[i];
        // }
        // //lambda function -->shortform
        // Arrays.sort(activities,Comparator.comparingDouble(o ->o[2]));

        // int maxAct=0;
        // ArrayList<Integer> ans=new ArrayList<>();
        // //1st activity
        // maxAct=1;
        // ans.add(activities[0][0]);
        // int lastend=activities[0][2];
       
        // for(int i=1;i<end.length;i++){
        //     if (activities[i][1]>=lastend) {
        //         //select activity
        //         maxAct++;
        //         ans.add(activities[i][0]);
        //         lastend=activities[i][2];
                
        //     }
        // }
        // System.out.println("maximum activities "+maxAct);
        // for(int i=0;i<ans.size();i++){
        //         System.out.print("A"+ans.get(i)+" ");
        // }
        // System.out.println();
        
        


        //2.Fractional knapsack 

        // int val []={60,100,120};
        // int weight[]={10,20,30};
        // int W= 50;

        //     double ratio[][]=new double[val.length][2];
        //     //0th column ratio ;1st column =>ratio
        //     //ratio=value/weight
        //     for(int i=0;i<val.length;i++){
        //         ratio[i][0]=i;
        //         ratio[i][1]=val[i]/(double)weight[i];

        //     }
        //     //Ascending order sort
        //     Arrays.sort(ratio,Comparator.comparingDouble(o ->o[1]));
        //     int capacity= W;
        //     int finalVal=0;

        //     for(int i=ratio.length-1;i>=0;i--){
        //         int idx=(int)ratio[i][0];

        //         if(capacity >= weight[idx]){ //full include
        //             finalVal +=val[idx];
        //             capacity -=weight[idx];

        //         }else{
        //             //include fractional item
        //             finalVal += (ratio[i][1]* capacity);
        //             capacity=0;
        //             break;
        //         }

        //     }
        //     System.out.println("final value :"+finalVal);



        //3.Minimum absolute Difference
        // int A[]={1,4,7,8};
        // int B[]={2,3,6,5};

        // Arrays.sort(A);
        // Arrays.sort(B);
        // int Mindiff=0;

        // for(int i=0;i<A.length;i++){
        //     Mindiff +=Math.abs(A[i]-B[i]);
        // }
        // System.out.println("Minimum absolute difference = "+Mindiff);




        //4.Maximum length chain of pairs
        // int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        // Arrays.sort(pairs,Comparator.comparingDouble(o ->o[1]));

        // int ChainLeng=1;
        // int lastEnd=pairs[0][1];

        // for(int i=0;i<pairs.length;i++){
        //     if(pairs[i][0]>lastEnd){
        //         ChainLeng++;
        //         lastEnd=pairs[i][1];
        //     }
        // }
        // System.out.println("Maximum length of chain = "+ChainLeng);


        //Indian Coins
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        int countofCoins=0;
        //int amount=590;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount = ");
        int amount=sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if (coins[i] <= amount) {
                while (coins[i]<= amount) {
                    countofCoins++;
                    ans.add(coins[i]);
                    amount=amount-coins[i];
                    
                }  
            }
        }
        System.out.println("Total (min) coins used = "+countofCoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}