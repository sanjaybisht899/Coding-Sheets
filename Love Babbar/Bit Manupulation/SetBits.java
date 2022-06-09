//https://practice.geeksforgeeks.org/problems/count-total-set-bits-1587115620/1
import java.util.*;
class SetBits{
    public static void main(String[] args) {
        System.out.println(findPosition(4));
    }
    public static int findPosition(int N){
        int sum=0;
        int lsb=1;
        int count=0;
        while((N&lsb)!=lsb){
            lsb=lsb<<1;
            count++;
        }
        return count; 

    }
    // public static int countSetBits(int n){
    //     int sum=0;
    //     for (int i = 1; i <= n; i++) {
    //         int temp=i;
    //         while(temp!=0){
    //             temp=temp&(temp-1);
    //             sum++;
    //         }
    //     }

    //     return sum;
    // } 
}