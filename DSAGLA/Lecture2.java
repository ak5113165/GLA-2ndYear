package DSAGLA;

import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {
        System.out.println("hello world");

        //find the factorial of a number
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of " + n + " is " + fact);
//        n=5
//        i=1 fact=1;
//        i=2 fact=2;
//        i=3 fact=6;
//        i=4 fact=24;
//        i=5 fact=120;
        //Check number is prime or not
        boolean istrue=false;
        int count=0;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                istrue=true;
                break;
            }
        }
       if(istrue==true)
       {
           System.out.println(" it is not a prime");
       }
       else
       {
           System.out.println("it is prime");
       }


    }
}
