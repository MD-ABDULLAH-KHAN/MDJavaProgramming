package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1) return 0;
        else if(n==2) return 1;
        else return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
