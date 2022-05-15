import java.util.*;

/**
 * SlidingWindowMax
 */
public class SlidingWindowMax {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> max = new ArrayList<>();
        ArrayDeque <Integer> q = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!q.isEmpty() && arr[q.peekLast()]<=arr[i]){
                q.removeLast();
            }
            q.addLast(i);
        }
        for(int i=k;i<n;i++){
            max.add(arr[q.peek()]);
            while(!q.isEmpty() && q.peek()<=i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && arr[q.peekLast()]<=arr[i]){
                q.removeLast();
            }
            q.addLast(i);
        }
        max.add(arr[q.peek()]);
        return max;
    }
    public static void main(String[] args) {

       int  n = 9, k = 3;
       int  arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
       ArrayList <Integer> max = max_of_subarrays(arr,n,k);
       System.out.println(max);
    }
}