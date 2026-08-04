package DSAGLA;

import java.util.Scanner;

public class LAB3 {


    public static void main(String[] args) {

//        //Find the sum of all the digits in the number
//        //You need to take a input from the user.
//        //print the sum of all the digits of the number.
//        // int num=675  ouput:-18
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
        //Reverse the digits 675    576
        int n=sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);

        //  calculate 2 to the power n where n is getting from the user
        // using bitwise opearots

//        000000000000000000000000000001<<1
//        000000000000000000000000000010<<1
//        000000000000000000000000000100>>1
//        000000000000000000000000000010
        int pow=sc.nextInt();
        System.out.println(1<<pow);

//        11=0000000000000000000000000001011
//        1=0000000000000000000000000000001
//        10&1=0000000000000000000000000000001

        int oddeven=sc.nextInt();
        if((n&1)==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
//
//
////
//
//        // 1234567  find the :LArgest and smallest digit of a number.

    int num1=sc.nextInt();
        int largest=0;
        int smallest=9;
        while(num1>0)
        {
            int digit=num1%10;
            if(digit>largest)
            {
                largest=digit;
            }
            if(digit<smallest)
            {
                smallest=digit;
            }
            num=num/10;
        }
        System.out.println(smallest);
        System.out.println(largest);


        // int num=36 divisor 1 2 3 4 6 9 12 18 36

        int number=sc.nextInt();
        for(int i=1;i*i<=number;i++)
        {
            if(number%i==0)
            {
                System.out.println(i);
                if(i!=n/i)
                {
                System.out.println(n/i);

                }
            }
        }
//        i=1 1,36
//            i=2 2,18
//            i=3 3 12
//            i=4 4 9
//            i=5x
//            i=6 6 6

//        a<=sqrt(number) b>=sqrt(number)
//            a*b=n
//            b=n/a;
//            a=n/b;
//            i^2<=number
//                    i<=sqrt(number)



    }
}
