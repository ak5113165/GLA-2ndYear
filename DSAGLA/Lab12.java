//package DSAGLA;
//
//public class Lab12 {
//    public static void main(String[] args) {
//
//        int arr[]={5,4,3,2,1};
//
//        for(int i=0;i<n-1;i++)
//        {
//            int flag=0;
//            for(int j=0;j<n-i-1;j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    flag=1;
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//            if(flag==0)
//            {
//                break;
//            }
//        }
//
//        // insertion sort
//
//        for(int i=1;i<n;i++)
//        {
//            int key=arr[i];
//            int j=i-1;
//            while(j>=0&&arr[j]>key)
//            {
//                arr[j+1]=arr[j];
//                j=j-1;
//            }
//            arr[j+1]=key;
//        }
//
//        //selection sort;
//
//        for(int i=0;i<n-1;i++)
//        {
//            int min_idx=i;
//            for(int j=i+1;j<n;j++)
//            {
//                if(arr[j]<arr[min_idx])
//                {
//                    min_idx=j;
//                }
//            }
//            int temp=arr[i];
//            arr[i]=arr[min_idx];
//            arr[min_idx]=temp;
//        }
//
//        //solved problem number 75 and 905 and 922 && 912
//    }
//}
