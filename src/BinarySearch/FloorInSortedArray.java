package BinarySearch;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        int n = arr.length;
        int i=0;
        int j= n-1;
        int index = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>x) j = mid-1;
            else {
                index=mid;
                i=mid+1;
            }
        }
        System.out.println(index);
    }
}
