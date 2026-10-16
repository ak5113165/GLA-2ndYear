package DSAGLA;

public class Lecture11 {

    public static void main(String[] args) {

        int arr[]={1,5,6,9,12,13};
        int low=0;
        int target=5;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                System.out.println("Element found");
                break;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

    }
}
