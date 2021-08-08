package Java.Easy.DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String,Integer> hasMap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            hasMap.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(hasMap.containsKey(s)){
                System.out.println(s + "=" + hasMap.get(s));
            }else {
                System.out.println("Not Found");
            }
        }
    }
}
