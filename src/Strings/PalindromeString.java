package Strings;

import java.util.Scanner;

public class PalindromeString {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine().toLowerCase();

        int i = 0, j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome)
            System.out.println("A Palindrome");
        else
            System.out.println("Not A Palindrome");
        System.out.println("abdullah"+10+20);
    }
}
