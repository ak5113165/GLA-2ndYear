package OOPSGLA;

public class Lecture2 {

    public  static void greet()
    {
        System.out.println("hello world");
        int a=10;
        int arr[]={1,2,3,4,5};
    }
    public static int square(int n)
    {
        return n*n;
    }
    public static int table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + "x" + i + "=" + (n*i));
        }
        return 0;
    }
    public static void main(String[] args) {
        // create a method to print square of the number
        int a=square(4);
        System.out.println(a);
        System.out.println(square(6));

        // create a method print the table of a number
        table(2);
        System.out.println(table(3));

    }
}
