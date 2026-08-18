//package DSAGLA;
//
//public class Lab7 {
//
//    public static int removeduplicates(int nums[])
//    {
//
//        int k=1;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i] != nums[i-1]){
//                nums[k]=nums[i];
//                k++;
//            }
//        }
//        return k;
//
//    }
//    public static boolean check(int arr[])
//    {
//        for(int i=0;i<nums.length-1;i++)
//        {
//            if(arr[i]>arr[i+1])
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static int pivotIndex(int[] nums) {
//        int []prefix=new int[nums.length];
//        prefix[0]=nums[0];
//        for(int i=1;i<nums.length;i++)
//        {
//            prefix[i]=prefix[i-1]+nums[i];
//        }
//        for(int i=0;i<nums.length;i++)
//        {
//            int leftsum=0;
//            int rightsum=0;
//            if(i==0)
//            {
//                leftsum=0;
//            }
//            leftsum=prefix[i-1];
//            rightsum=prefix[nums.length-1]-prefix[i];
//            if(leftsum==rightsum)
//            {
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static int[] arrange(int arr[])
//    {
//        int j=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]<0)
//            {
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                j++;
//            }
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        System.out.println(pivotIndex({1,2,3,4,5,}));
//
////        input {-12, 11, -13, -5, 6, -7, 5, -3, -6}
////            i=0 j=0 -12, 11, -13, -5, 6, -7, 5, -3, -6
////            i=1 j=1
////            i=2 j=1; -12 -13 11 -5 6 -7 5 -3 -6
////            i=3 j=2; -12 -13 -5 11 6 -7 5 -3 -6
////            i=4 j=3
////            i=5 j=3  -12 -13 -5 -7 11 6 5 -3 -6
////            i=6 j=4
////            i=7 j=4  -12 -13 -5 -7 -3 11 6 5 -6;
////            i=8 j=5  -12 -13 -5 -7 -3 -6 11 6 5
//        // check array is sorted or not
//        input {-12, 11, -13, -5, 6, -7, 5, -3, -6}
//
//        // 1 1 2 2 3 3
//        // 1 2 3
//
//
//
//    }
//}
