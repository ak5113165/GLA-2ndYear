package DSAGLA;

import java.util.Scanner;

public class LAB3 {
    public static void main(String[] args) {

//        //Find the sum of all the digits in the number
//        //You need to take a input from the user.
//        //print the sum of all the digits of the number.
//        // int num=675  ouput:-18
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Number");
//        int num=sc.nextInt();
//        int sum=0;
//        while(num>0)
//        {
//            int digit=num%10;
//            sum=sum+digit;
//            num=num/10;
//        }
//        System.out.println(sum);
//        //Reverse the digits 675    576
//        int n=sc.nextInt();
//        int rev=0;
//        while(n>0)
//        {
//            int digit=n%10;
//            rev=rev*10+digit;
//            n=n/10;
//        }
//        System.out.println(rev);
//
//        // 1234567  find the :LArgest and smallest digit of a number.
//        int x=sc.nextInt();
//        int largest=0;
//        int smallest=9;
//        while(x>0)
//        {
//            int digit=x%10;
//            if(digit>largest)
//            {
//                largest=digit;
//            }
//            if(digit<smallest)
//            {
//                smallest=digit;
//            }
//            x=x/10;
//        }
//        System.out.println(smallest);
//        System.out.println(largest);

        //print the nth fibonacci number
        // 0 1 1 2 3 5 8 13 ......
        //n=5
        int fib=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(b);
        for(int i=1;i<fib;i++)
        {
            int c=a+b;
//            System.out.println(c + " ");
            a=b;
            b=c;
        }
        System.out.println(b);

        // int num=36 divisor 1 2 3 4 6 9 12 18 36
        int num1=sc.nextInt();
        int count=0;
        for(int i=1;i*i<=num1;i++)
        {
            if(num1%i==0)
            {
                if(i==num1/i)
                {
                    count++;
                    System.out.println(i);
                }
                else
                {
                    System.out.println(i);
                    System.out.println(num1/i);
                    count+=2;
                }
            }
        }
        System.out.println(count);
//        i=1 count=2;
//        i=2 count=4;
//        i=3 count=6;
//        i=4 count=8;
//        i=5 count=8;
//        i=6 count=9




    }
}
