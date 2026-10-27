package DSAGLA;

import java.util.ArrayList;
import java.util.stream.Gatherer;
import java.util.Collections;

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
        return ispalindrome(s, start +1, end-1);
    }

    static int factorial(int n)
    {
        if(n==0) return 1;

        return n*factorial(n-1);
    }
    static int product(int n)
    {
        if(n==0) return 1;

        return n%10 * product(n/10);
    }

    static int count(int n)
    {
        if(n==0) return 0;
        return 1+count(n/10);
    }
    static int sumofn(int n)
    {
        if(n==0) return 0;
        return n+sumofn(n-1);
    }
    static boolean checksorted(int []arr,int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return checksorted(arr,i+1);
    }

    static int fib(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }


    static void subset(int []arr, ArrayList<Integer>currentset, int i,ArrayList<ArrayList<Integer>> res)
    {
        if(i==arr.length)
        {
            res.add(currentset);
            return;
        }

        //choose
        currentset.add(arr[i]);
        subset(arr,currentset,i+1,res);
        currentset.removeLast();
        subset(arr,currentset,i+1,res);
    }


    static void printbinarystring(char[] s,int i,ArrayList<String>res)
    {
        if(i==s.length)
        {
            res.add(new String(s));
            return ;
        }
        s[i]='0';
        printbinarystring(s,i+1,res);
        s[i]='1';
        printbinarystring(s,i+1,res);
    }

    public static void recurPermute(int index, StringBuilder s, ArrayList<String> res) {
        if (index == s.length()) {
            res.add(s.toString());
            return;
        }

        for (int i = index; i < s.length(); i++) {
            char temp = s.charAt(index);
            s.setCharAt(index, s.charAt(i));
            s.setCharAt(i, temp);

            // fix current position and recurse
            recurPermute(index + 1, s, res);

            // backtrack
            temp = s.charAt(index);
            s.setCharAt(index, s.charAt(i));
            s.setCharAt(i, temp);
        }
    }

    public static long recursiveExponentiation(long A, long N) {
        if (N == 0) {
            // Base case: A^0 = 1
            return 1;
        } else if (N % 2 == 0) {
            // If N is even, recursively compute A^(N/2) and square it
            long temp = recursiveExponentiation(A, N / 2);
            return temp * temp;
        } else {
            // If N is odd, recursively compute A^(N-1) and multiply by A
            return A * recursiveExponentiation(A, N - 1);
        }
    }

    static int Euclideon(int a,int b)
    {
        if(a==b)
        {
            return a;
        }
        if(a>b)
        {
            return Euclideon(a-b,b);
        }
        else
        {
            return Euclideon(a,b-a);
        }
    }
    static int findGCD(int a, int b) {
        if (a == 0)
            return b;
        return findGCD(b % a, a);
    }

    static int countpaths(int n,int m,int i,int j)
    {
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        if(i>n-1 || j>m-1)
        {
            return 0;
        }
        return countpaths(n,m,i,j+1)+countpaths(n,m,i+1,j);
    }

    static void towerOfHanoi(int n, char fromRod,char toRod, char auxRod){
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Disk " + n + " moved from "+ fromRod + " to " + toRod);
        towerOfHanoi(n - 1,  auxRod, toRod, fromRod);
    }
    static boolean Linearsearch(int[]arr,int target,int i)
    {
        if(i==arr.length) return false;
        if(arr[i]==target) return true;

        return Linearsearch(arr,target,i+1);

    }
    static boolean Binarysearch(int[]arr,int low,int high,int target)
    {
        if(low>high) return false;
        int mid=(low+high)/2;
        if(arr[mid]==target) return true;
        if(arr[mid]>target)
        {
            return Binarysearch(arr,low,mid-1,target);
        }
        else {
            return Binarysearch(arr,mid+1,high,target);
        }
    }
    public static void main(String[] args) {

        print(99);

        int[]arr={1,2,4,6,8};
        printarray(arr,0);

        //int n=1234;
        // find the sum of all digits ussing recursion
        ArrayList<String> res = new ArrayList<>();

        String s="ABCDE";
        recurPermute(0,new StringBuilder(s),res);
        System.out.println(res);

        System.out.println(recursiveExponentiation(2,16));

        System.out.println(Euclideon(35,15));
        System.out.println(findGCD(60,36));

        System.out.println(countpaths(2,3,0,0));
    }
}
