import java.util.*;

/**
 * SlidingWindowMax
 */
public class SlidingWindowMax {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> max = new ArrayList<>();
        Queue <Integer> q = new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!q.isEmpty() && arr[q.peek()]<arr[i]){
                q.poll();
            }
            q.add(i);
        }
        System.out.println(q);

        return max;
    }
    public static void main(String[] args) {

       int  n = 9, k = 3;
       int  arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
       ArrayList <Integer> max = max_of_subarrays(arr,n,k);
       System.out.println(max);
    }
}