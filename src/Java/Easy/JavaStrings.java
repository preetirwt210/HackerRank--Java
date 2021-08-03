package Java.Easy;

import java.util.Locale;
import java.util.Scanner;

public class JavaStrings {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int aLength=A.length();
        int bLength=B.length();

        System.out.println(aLength+bLength);
        if(A.compareTo(B)>0){
             System.out.println("Yes");
        }else{System.out.println("No");}

        System.out.println( A.substring(0,1).toUpperCase()+A.substring(1)
                + " "+ B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
