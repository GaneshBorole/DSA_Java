package Graphs.Graph_5;
import java.*;

public class Floodfill {
      public void  helper(int [][]image,int sc,int sr,int color,boolean vis[][],int orgCol){
        if (sc < 0 || sr < 0 || sr >=image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }
        //left
        helper(image, sc-1, sr, color, vis, orgCol);
        //right
        helper(image, sc+1, sr, color, vis, orgCol);
        //up
        helper(image, sc, sr-1, color, vis, orgCol);
        //down
        helper(image, sc, sr+1, color, vis, orgCol);

      }
    public int [][] floodfill(int [][]image,int sc,int sr,int color){
        boolean vis[][]=new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sc][sr]);
        return image;
    }
    public static void main(String[] args) {
        
    }
    
}
