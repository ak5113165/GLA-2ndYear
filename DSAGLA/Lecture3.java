package DSAGLA;

public class Lecture3 {

    static void reverse(int[]arr,int l,int r)
    {
        int left=l;
        int right=r;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {

        //left rotate by k
        //Example:- 1 2 3 4 5 K=3
        //Output:-  4 5 1 2 3
        //k=1 2 3 4 5 1
        //k=2 3 4 5 1 2

        int arr[]={1,2,3,4,5};
        int k=3;
        if(k>arr.length)
        {
            k=k%arr.length;
        }
        for(int j=0;j<k;j++)
        {
            int first=arr[0];
            for(int i=0;i< arr.length-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=first;
        }
//        j=0 first=1;// 2 3 4 5 1
//        j=1 first=2;//3 4 5 1 2
//        j=2 first=3;//4 5 1 2 3

//        1 2 3 4 5 k=3
//            //reverse starting k-1 element
//        3 2 1 4 5
//            //reverese remaining element
//        3 2 1 5 4
//            //reverse the whole array
//        4 5 1 2 3
        reverse(arr,0,k-1);
        reverse(arr,k, arr.length-1);
        reverse(arr,0, arr.length-1);
        System.out.println(2);

    }
}
