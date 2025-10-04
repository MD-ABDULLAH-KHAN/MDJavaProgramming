package Recursion;
import java.util.*;
public class GCD {
    public  static int recursiveGCD(int a,int b){
        if (a == 0) return b;
        return recursiveGCD(b % a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
//        int n = Math.min(a,b);
//        int gcd=0;
//        for(int i=1;i<=n;i++){
//            if(a%i==0 && b%i==0)
//                gcd=i;
//        }
        System.out.println(recursiveGCD(a,b));
    }
}
