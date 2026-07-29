package DSAGLA;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture5 {

    public static boolean prime(int x)
    {
        int count=0;
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                count++;
            }
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
    public static void main(String[] args) {

            //find all the prime numbers in the range 1 to N;
            //Example :-N=10
            // Output:- 2 3 5 7
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=1;i*i<=n;i++)// n*sqrtn
            {
                if(prime(i)==true)
                {
                    System.out.println(i + "it is prime");
                }
            }

            // 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
            // 2 3 5 7 9 11 13 15 17 19
            // 2 3 5 7 11 13 17 19
            boolean[]isprime= new boolean[n+1];
            Arrays.fill(isprime,true);
            isprime[0]=false;
            isprime[1]=false;
            for(int i=2;i*i<=n;i++)
            {
                if(isprime[i]==true)
                {
                    for(int j=i*i;j<=n;j=j+i)
                    {
                        isprime[j]=false;
                    }
                }
            }
            for(int i=0;i< isprime.length;i++)
            {
                if(isprime[i]==true)
                {
                    System.out.println(i);
                }
            }

    }
}
