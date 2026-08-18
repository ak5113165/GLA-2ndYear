package DSAGLA;

import java.util.Scanner;

public class Lecture8 {
    public static void main(String[] args) {

        // prefix sum
//        1 2 3 4 5
//        0 1 2 3 4
//        //prefix sum
//        1 3 6 10 15
//
//        l=1;
//        r=3;
//        sum=9;

        int arr[]={1,2,3,4,5};

        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        int suffix[]=new int[n];
        suffix[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]+arr[i];
        }
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(l==0)
            {
                System.out.println(prefix[r]);
            }
            else {
                 System.out.println(prefix[r]-prefix[l-1]);
            }
        }





    }
}
