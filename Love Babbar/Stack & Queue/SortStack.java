/**
 * SortStack
 */
import java.util.*;
public class SortStack {
    static Stack<Integer> sorted;
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);
        sort(s);
        System.out.println(s);
    }
    public static Stack<Integer> sort(Stack<Integer> s)
	{
        sorted=s;
        sortStack();
		return sorted;
	}
    static void sortStack(){
        if(sorted.isEmpty()){
            return;
        }
        int temp=sorted.pop();
        sortStack();
        insertsort(temp);
    }
    static void insertsort(int temp){
        if(sorted.isEmpty() || sorted.peek()<temp){
            sorted.add(temp);
            return;
        }
        int x=sorted.pop();
        insertsort(temp);
        sorted.add(x);
    }
}