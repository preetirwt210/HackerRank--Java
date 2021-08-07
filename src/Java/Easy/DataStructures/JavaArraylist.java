package Java.Easy.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<ArrayList<Integer>> myList=new ArrayList<>();

          for (int i=0;i<n;i++) {
              int d = sc.nextInt();
              ArrayList<Integer> list = new ArrayList();
              for (int j = 0; j < d; j++) {
                  int item = sc.nextInt();
                  list.add(item);
              }
              myList.add(list);
          }
        int q=sc.nextInt();
        for(int k=0;k<q;k++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            try
            {
                System.out.println(myList.get(x-1).get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }

}
