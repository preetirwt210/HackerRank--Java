package Java.Easy.Advanced;

import java.util.Scanner;

public class Singleton {
  private Singleton(){}
    public String str;
    private static final Singleton INSTANCE = new Singleton();
   static Singleton getSingleInstance(){
      return INSTANCE;
    }
    public static void main(String[] args){

       System.out.println(getSingleInstance());
    }
}
