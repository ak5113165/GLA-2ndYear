package DSAGLA;

import java.util.Scanner;

public class NCL2 {
    public static void main(String[] args) {

        // swap two numbers,
        // area of rectangle,
        // area of triangle
        // area of circle
        // even odd checker
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two Number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Number after swapping");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Enter length and width");
        int length=sc.nextInt();
        int width=sc.nextInt();
        int area=length*width;
        System.out.println(area);

        System.out.println("Enter base and height");
        int base= sc.nextInt();
        int height=sc.nextInt();
        int area1=(base*height)/2;
        System.out.println("Area of triangle is");
        System.out.println(area1);

        System.out.println("Enter the radius");
        int radius=sc.nextInt();
        double area2=3.14*radius*radius;
        System.out.println(area);

        System.out.println("Enetr the number");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("ODD");
        }


    }
}
