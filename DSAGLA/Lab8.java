package DSAGLA;

public class Lab8 {

    public static void main(String[] args) {

        //Sliding window.
        //Maximum Sum of a Subarray with K Elements
        //Input  : arr[] = [5, 2, -1, 0, 3], k = 3
        //Output : 6
        // 1 2 3
        // 1
        // 1 2
        // 1 2 3
        // 2
        // 2 3
        // 3
        int max_sum = Integer.MIN_VALUE;
        int []nums={5,2,-1,0,3};
        for(int i=0;i< nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int currentsum=0;
                for(int k=i;k<=j;k++)
                {
                    currentsum+=nums[k];
                }
                System.out.println(" ");
                max_sum=Math.max(max_sum,currentsum);
            }
        }
//
////
////
        // Consider all blocks starting with i.
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];

            // Update result if required.
            max_sum = Math.max(current_sum, max_sum);
        }
//        i=0 j=0,1,2
//            i=1 j=0 1 2
//            i=2 j=0 1 2
        //[5, 2, -1, 0, 3]
////        return max_sum;
//
        int n= nums.length;
        int k=3;
        int sum=0;
        int i=0;
        int j=0;
        while(j<n)
        {
            sum+=nums[j];
            if(j-i+1==k)
            {
                max_sum=Math.max(max_sum,sum);
            }
            else if(j-i+1>k)
            {
                sum-=nums[i];
                i++;
                if(j-i+1==k)
                {
                    max_sum=Math.max(max_sum,sum);
                }
            }
            j++;
        }
//
//      5 2 -1 0 3
        // i=0 j=0 sum=5
        // i=0 j=1 sum=7
        // i=0 j=2 sum=6
        // i=0 j=3 sum=6 i=1 sum=1
        // i=1 j=4 sum=4 i=2 sum 2




    }
}
