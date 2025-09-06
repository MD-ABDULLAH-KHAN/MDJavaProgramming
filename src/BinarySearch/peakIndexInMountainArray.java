package BinarySearch;

public class peakIndexInMountainArray {
    public static int peakIndex(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid+1]>arr[mid]) i=mid+1;
            else if(arr[mid-1]>arr[mid]) j=mid-1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,5,6,7,8,3};
        System.out.println(peakIndex(arr));
    }
}
