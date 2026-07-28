package DSAGLA;

public class Lecture4 {

    public static void main(String[] args) {
        // you have  an array considering the all the numbers from 0 to n
        //except one you need to find the missing number
        // example:- 0 1 2 4 value is n=4; 4 1 2 0  n=3 0 1 3  n=1
        // output :- 3            0 1 2 4
        int arr[]={0,1,2,4};
        int n=arr.length;
        int sum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum-arr[i];
        }
        System.out.println(sum);
//        sum=10;
//        i=0; sum=10;
//        i=1 sum=9;
//        i=2 sum=7;
//        i=3 sum=3;
        // 1 1 1 1 3 4 5 6 1 1    x=1
        int nums[]={1,1,1,1,2,3,4,5,1,1};
        int x=1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==x)
            {
                count=count+1;
            }
        }
        System.out.println(count);



    }

}
