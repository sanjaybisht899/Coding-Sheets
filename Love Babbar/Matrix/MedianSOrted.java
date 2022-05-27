/**
 * SpiralMatrix
 */
import java.util.*;
public class MedianSOrted {

    public static void main(String[] args) {
        int R = 3, C = 3;
        int M[][]= {
            {1,3,5},
            {2,6,9},
            {3,6,9}
        };
        int left=0;
        int right=2000;
        while(left<=right){
            int mid=left+(right-left)/2;
            int x=checkforthis(mid);
            if(x==1){
                break;
            }
        }
    }
}