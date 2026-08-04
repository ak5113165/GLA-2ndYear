package OOPSGLA;

import java.util.Scanner;

public class LAB4 {

    public static int sum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int countdigit(int x)
    {
        int count=0;
        while(x>0)
        {
            count++;
            x=x/10;
        }
        return count;
    }
    public static char grade(int marks)
    {
        if(marks>=90)
        {
            return 'A';
        }
        else if(marks>=80)
        {
            return 'B';
        }
        else if(marks>=70)
        {
            return 'C';
        }
        else if (marks>=60)
        {
            return 'D';
        }
        else {
            return 'F';
        }
    }
    public static boolean isplaindrome(int num)
    {
        int rev=0;
        int temp=num;
        while(temp>0)
        {
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        if(num==temp)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        // How to take input from the user as an array
        //question1:- Create a method to find the sum of all array elements
        //Question2:-Create a Method to count the number of digits
        //question3:-create a method that return the grade based marks
        //marks>90 Grade A marks>=80 Grade B marks>=70 Grade C
        //marks>=60 Grade D
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            arr[i]=num;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(sum(arr));

        System.out.println("Enter the number");
        int number=sc.nextInt();
        System.out.println(countdigit(number));

        System.out.println("Enter the Marks");
        int marks=sc.nextInt();
        System.out.println(grade(marks));

        //Create a Method to check the number is pallindrome or not
        System.out.println("Enetr the number");
        int pal=sc.nextInt();

        if(isplaindrome(pal)==true)
        {
            System.out.println("it is a pllindrome");
        }
        else
        {
            System.out.println("it is not pallindrome");
        }


    }
}
