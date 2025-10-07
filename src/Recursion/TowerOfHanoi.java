package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }

    public static void hanoi(int n, char src, char helper, char dest) {
        if(n==0) return;

        hanoi(n-1,src,dest,helper); //n-1 disks from A to B via C

        System.out.println(src+"-->"+dest); //largest from A to C

        hanoi(n-1,helper,src,dest); //n-1 disks from B to C via A
    }

}
