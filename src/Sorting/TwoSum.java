package Sorting;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {7, 0, 4, 3, 2, 8, 10};
        int target = 9;

        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                i++;
                j--;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
    }
}

