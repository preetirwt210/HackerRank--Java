package Java.Easy.DataStructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
         Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         List<Integer> list=new LinkedList<>();
         for (int i=0;i<n;i++){
             int value=sc.nextInt();
             list.add(value);
         }
         int q=sc.nextInt();
         for(int j=0;j<q;j++){
              String num=sc.next();
              if(num.equals("Insert")){
                  int x=sc.nextInt();
                  int y=sc.nextInt();
                  list.add(x,y);
              }else if(num.equals("Delete")){
                    int index=sc.nextInt();
                    list.remove(index);
              }
         }
         for(int L: list){
             System.out.print( L+ " " );
         }
    }
}
