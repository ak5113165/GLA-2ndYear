package DSAGLA;

public class Lecture9 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int size=n+m+1;
        int[] temp = new int[size];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                k++;
                i++;
            } else {
                temp[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(j<n)
        {
            temp[k]=nums2[j];
            j++;
            k++;
        }
        while(i<m)
        {
            temp[k]=nums1[i];
            i++;
            k++;
        }
        for(int len=0;len<n+m;len++)
        {
            nums1[len]=temp[len];
        }

    }
    public static void main(String[] args) {


        // nums1=  1 3 7 9 m=4
        //nums2 = 2 5 6 9 n=4
        //i=0 j=0 k=0 temp {1}
        //i=1 j=0 k=1 temp{ 1,2}
        //i=1 j=1 k=2 temp{1,2,3}
        //i=2 j=1 k=3 temp{1,2,3,5}
        //i=2 j=2 k=4 temp{1,2,3,5,6}
        //i=2 j=3 k=5 temp{1,2,3,5,6,7}
        //i=3 j=3 k=6 temp{1,2,3,5,6,7,9}
        //i=3 j=4 k=7 temp(1,2,3,5,6,7,9,9}

        // 6 7 8 9
        // 1 2 3 4 5
    }
}
