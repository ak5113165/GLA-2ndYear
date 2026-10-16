package DSAGLA;

public class Recursion {

    static void  print(int n)
    {
        if(n<=0)
        {
            return ;
        }
        print(n-2);
        System.out.println(n);
    }
    static int sumofdigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n%10 + sumofdigits(n/10);
    }

    static int reverse(int n,int rev)
    {
        if(n==0)
        {
            return rev;
        }
        return reverse(n/10,rev*10+n%10);
    }

    static void printarray(int []arr,int i)
    {
        if(i==arr.length)
        {
            return ;
        }
        System.out.println(arr[i]);
        printarray(arr,i+1);
    }
    static int sumofarray(int []arr,int i)
    {
        if(i==arr.length)
        {
            return 0;
        }
        return arr[i]+sumofarray(arr,i+1);
    }

    static void reversearray(int[] arr,int left,int right)
    {
        if(left>right)
        {
            return ;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reversearray(arr,left+1,right-1);
    }
    static boolean ispalindrome(String s,int start, int end)
    {
        if(start>end)
        {
            return true;
        }
        if(s.charAt(start) != s.charAt(end))
        {
            return false;
        }
        ispalindrome(s, start +1, end-1);
    }

    public static void main(String[] args) {

        print(99);

        int[]arr={1,2,4,6,8};
        printarray(arr,0);

        //int n=1234;
        // find the sum of all digits ussing recursion


    }
}
