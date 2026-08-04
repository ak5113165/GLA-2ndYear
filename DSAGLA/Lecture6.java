package DSAGLA;

public class Lecture6 {

    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans=ans^nums[i];
            System.out.println(ans);
        }
        return ans;
    }
    public int fib(int n) {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return b;

    }
    public static void main(String[] args) {

        System.out.println("LEcture 6");
    }
}
