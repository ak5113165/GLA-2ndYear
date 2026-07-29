package OOPSGLA;

import java.util.Scanner;

public class LAB4 {

    public static int sum(int a[])
    {
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
        }
        return s;
    }
    public static int countdigit(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }

    public static String Grade(int marks)
    {
        if(marks>=90)
        {
            return "Grade A";
        }
        else if(marks>=80)
        {
            return "Grade B";
        }
        else if(marks>=70)
        {
            return "Grade C";
        }
        else if(marks>=60)
        {
            return "Grade D";
        }
        else {
            return "Grade F";
        }
    }
    public static void main(String[] args) {
        //question1:- Create a method to find the sum of all array elements
        //Question2:-Create a Method to count the number of digits
        //question3:-create a method that return the grade based marks
        //marks>90 Grade A marks>=80 Grade B marks>=70 Grade C
        //marks>=60 Grade D
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Plez enter the" + (i+1) + "number");
            int x=sc.nextInt();
            arr[i]=x;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(sum(arr));
        System.out.println("Enetr the Number");
        int num=sc.nextInt();
        System.out.println(countdigit(num));
        System.out.println(Grade(76));


    }
}
