package Java.Easy.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        /* Enter your code here.
         Read input from STDIN. Print output to STDOUT.
         Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x,y;
        try{
            x=sc.nextInt();
            y= sc.nextInt();
            System.out.println(x/y);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
