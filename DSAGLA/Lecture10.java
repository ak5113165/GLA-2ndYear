package DSAGLA;

public class Lecture10 {
    public static void main(String[] args) {

        int arr[]={5,4,3,2,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int flag=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                     flag=1;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag==0)
            {
                break;
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
