package Java.Easy.BigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
        if(n.isProbablePrime(100)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        sc.close();
    }
}
