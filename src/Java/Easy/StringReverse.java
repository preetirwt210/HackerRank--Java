package Java.Easy;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //Preeti
        /* Enter your code here. Print output to STDOUT. */
        String temp="";
           for(int i=A.length()-1;i>=0;i--){ //i=5 ;i=i:
               temp+=A.charAt(i);
           }
           if(A.equals(temp)){
               System.out.println("Pallindrome");
           }else{
               System.out.println("Not Pallindrome");
           }
    }
}
