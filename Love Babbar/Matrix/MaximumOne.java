
import java.util.*;
public class MaximumOne {
    public static void main(String[] args) {
        int arr[][] = {
            {1,1,1,1,1,1},
            {0,0,0,0,1,1},
            {0,1,1,1,1,1},
            {0,1,1,1,1,1}
        };

        int row=0;
        int n=arr.length;
        int col=arr[0].length-1;
        int index=-1;
        while(row<n && col>=0){
            while((col>=0 && row<n) && arr[row][col]!=1){
                System.out.println(row+" "+col);
                row=row+1;
            }
            while((col>=0 && row<n) && arr[row][col]==1){
                System.out.println(row+" "+col);
                col=col-1;
                index=row;
            }
        }
        System.out.println(index);
    }
}