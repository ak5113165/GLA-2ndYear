//package DSAGLA;
//
//public class Lab10 {
//    public static void main(String[] args) {
//
//
//        //[1,1,2, 4, 8, 9, 5, 10, 23], target = 23
//        // 1 1 1 1 1   target=1
//        int []nums={1,1,2,4,8,9,10,23};
//        int target=23;
//        int i=0;
//        int j=0;
//        int sum=0;
//        int n= nums.length;
//        while(j<n)
//        {
//            sum+=nums[j];
//            if(sum==target)
//            {
//                System.out.println(i+1 + " " + j+1);
//            }
//            else if(sum>target)
//            {
//                while(sum>target)
//                {
//                    sum-=nums[i];
//                    i++;
//                }
//                if(sum==target)
//                {
//                    System.out.println(i+1 + " " + j+1);
//                }
//            }
//            j++;
//        }
//
////        [1, 2, 3, 4] , target = 6;
//        int i=0;
//        int j=0;
//        int prod=1;
//        while(j<n)
//        {
//            prod=prod*nums[j];
//            if(prod==target)
//            {
//                System.out.println(i+1 + " " + j+1);
//
//            }
//            else if(prod>target)
//            {
//                while(prod>target)
//                {
//                    prod=prod/nums[i];
//                    i++;
//                }
//                if(prod==target)
//                {
//                    System.out.println(i+1 + " " + j+1);
//                }
//            }
//            j++;
//        }/        // 1 2 3 4 24
////        // 1 ,1 2, 1 2 3, 1 2 3 4
//        int i=0;
//        int j=0;
//        int prod=1;
//        int ans=0;
//        while(j<n)
//        {
//            prod=prod*nums[j];
//            while(prod>=k)
//            {
//                prod=prod/nums[i];
//                i++;
//            }
//            ans=ans+(j-i+1);
//            j++;
//        }
//        // i=0 j=0 prod=1 ans=1;
//        // i=0 j=1 prod=2 ans=3
//        // i=0 j=2 prod=6 ans=6
//        // i=0 j=3 prod 24 i=0 prod =24 i=1 prod=12 i=2 prod=3 i=3
//
//
//        // 1 0 1 0 1 0 1  k=4
////
////
//    }
//}
