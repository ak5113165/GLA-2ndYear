//package DSAGLA;
//
//import static java.util.Collections.swap;
//
//public class Quicksort {
//    static int partition(int[] arr, int low, int high)
//    {
//        int pivot = arr[high];
//        int i = low - 1;
//        for (int j = low; j <= high - 1; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i + 1, high);
//        return i + 1;
//    }
//    static void quicksort(int[] arr ,int low,int high)
//    {
//        if(low>high)
//        {
//            return ;
//        }
//        int pivot=arr[high];
//        int pi=partition(arr,low,high);
//        quicksort(arr,low,pi);
//        quicksort(arr,pi+1,high);
//    }
//    public static void main(String[] args) {
//
//    }
//}
