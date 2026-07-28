package OOPSGLA;

public class LAB3 {
    //no parametere,no return type
    public static void Greet()
    {
        System.out.println("hello world");
    }
    // parmeters and no return type
    public static void display(int a)
    {
        System.out.println(a);
    }
    //no parametere but return type
    public static int yashwant()
    {
        return 100;
    }
    public static int add(int a,int b)
    {
        return a+b;
    }
    //parameter as well as return type;
    public static void reverse(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }

    }
    public static int check(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
       Greet();
       display(2);
       int sum=add(2,3);
       int num=yashwant();
       System.out.println(yashwant());
       System.out.println(sum);
       // write a method to the reverse array
        // 1 2 3 4 5  , 5 4 3 2 1
        //take parameter as a array in a reveerse method.
        int arr[]={1,2,3,4,5};
        reverse(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        //method accept two parametres return the maximum among them
        int bigger=check(2,7);
        System.out.println(bigger);
    }
}
