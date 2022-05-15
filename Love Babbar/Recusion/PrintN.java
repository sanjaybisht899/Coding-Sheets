
public class PrintN {
    public static void main(String[] args) {
        printnum(10);
    }
    public static void printnum(int x){
        if(x==1){
            System.out.println(x);
        }
        else{
            printnum(x-1);
            System.out.println(x);
        }
    }
}