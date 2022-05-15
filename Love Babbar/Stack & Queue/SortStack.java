/**
 * SortStack
 */
import java.util.*;
public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);
        Stack<Integer> sorted= sort(s);
        System.out.println(s);
        System.out.println(sorted);
    }
    public static Stack<Integer> sort(Stack<Integer> s)
	{
		return s;
	}
}