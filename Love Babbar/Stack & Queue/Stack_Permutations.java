/**
 * Stack_Permutations
 */
import java.util.*;
public class Stack_Permutations {
    public static void main(String[] args) {
    int n=3;
    int A[]= {2,4,3,1};
    int B[]= {3,4,1,2};
    int y=0;
    Stack <Integer> S= new Stack<>();
    for (int i = 0; i < A.length; i++) {
        S.push(A[i]);
        while(!S.isEmpty() && S.peek()==B[y]){
            S.pop();
            y++;
        }
    }
    
    }
}