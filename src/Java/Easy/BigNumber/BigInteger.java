package Java.Easy.BigNumber;

import java.util.Scanner;

public class BigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        java.math.BigInteger a=sc.nextBigInteger();
        java.math.BigInteger b=sc.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));


    }
}
