package DSAGLA;
import java.util.Scanner;
public class NCL1 {

    public static void main(String[] args) {

        //insertion in an array
        //1 2 3 4
        //size of the array is 5
        // idx =2  value=5
        //1 2 5 3 4
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        System.out.println("Enter the index");
        int idx=sc.nextInt();
        System.out.println("Enetr the value");
        int value=sc.nextInt();
        int size=arr.length;
        for(int i=size-1;i>idx;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[idx]=value;

        // 1 2 3 4 5
        //idx =1
        //delete the element at idx;
        //1 3 4 5
        for(int i=idx;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        }

        for(int i=0;i<size-1;i++)
        {
            System.out.println(arr[i]);
        }

        int nums[]={1,0,2,0,3,4,0};
        int n= nums.length;
        int []nums1=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums1[k]=nums[i];
                k++;
            }
        }
        while(k<n)
        {
            nums1[k]=0;
            k++;
        }
//        // 1 0 2 0 3 4 0
//        i=0,k=0 // 1
//        i=1,k=1
//        i=2,k=1 //1 2
//        i=3 k=2
//         i=4 k=2 // 1 2 3
//        i=5 k=3 // 1 2 3 4
//        i=6 k=4
//            i=7 k=4;
//
//        k=4 // 1 2 3 4 0
//        k=5 // 1 2 3 4 0 0
//        k=6 //1 2 3 4 0 0 0
//        k=7
//        1 0 2 0 3 4 0
//        i=0 j=0// 1 0 2 0 3 4 0
//        i=1 j=1//
//        i=2 j=1 // 1 2 0 0 3 4 0
//        i=3 j=2;// 1 2 0 0 3 4 0
//        i=4 j=2;// 1 2 3 0 0 4 0
//        i=5 j=3;// 1 2 3 4 0 0 0
//        i=6;
        int j=0;
        for(int i=0;i<size;i++)
        {
            if(nums[i]!=0)
            {
                nums[i]=nums[j];
                j++;
            }
        }

    }
}
