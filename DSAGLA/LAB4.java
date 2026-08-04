package DSAGLA;

import java.util.Scanner;

public class LAB4 {

    public static boolean canWinNim(int n) {
        if(n%4==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static int hammingWeight(int n) {
        int count=0;
        while(n>0)
        {
            count=count+(n&1);
            n=n>>1;
        }
        return count;
    }
    public static boolean isPowerOfTwo(int n) {
        int count=0;
        while(n>0)
        {
            count=count+(n&1);
            n=n>>1;
        }
        if(count==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isPowerOfThree(int n) {
        if(n<=0)
        {
            return false;
        }
        while(n%3==0)
        {
            n=n/3;
        }
        return n==1;
    }
    public static void main(String[] args) {
        //power of two
        //Power of three
        //fibonacci number
        //nim game
        //ugly Number
//        0000000000000000000000000000000101=5
//        0000000000000000000000000000000010
        Scanner sc =new Scanner(System.in);
        System.out.println("Enetr the number");
        int n=sc.nextInt();
        System.out.println(canWinNim(n));
        System.out.println(isPowerOfTwo(n));
        System.out.println(isPowerOfThree(n));
        System.out.println(hammingWeight(n));


    }

}
