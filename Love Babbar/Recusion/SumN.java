public class SumN {
    public static void main(String[] args) {
        int sum=sumnum(4);
        System.out.println(sum);
    }
    public static int sumnum(int n){
        if(n==1){
            return 1;
        }
        return n+sumnum(n-1);
    }
}