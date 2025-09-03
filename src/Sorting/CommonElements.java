package Sorting;
import java.util.*;
public class CommonElements {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                arr.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a = {3, 4, 2, 2, 4};
        int[] b = {3, 2, 2, 7};
        ArrayList<Integer> arr = new ArrayList<>();
        arr=commonElements(a,b);
        System.out.println(arr);
    }
}
