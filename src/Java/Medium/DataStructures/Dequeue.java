package Java.Medium.DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt(); //6
        int m = in.nextInt(); //3
        int max = 0;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt(); //

            deque.add(input); //5 3 5 //3 5
            set.add(input); //5 3

            if (deque.size() == m) {
                if (set.size() > max){ //2>0
                    max = set.size(); //max=2
                }
                int first = deque.remove(); //3 5
                if (!deque.contains(first))//
                    set.remove(first);
            }
        }

        System.out.println(max);
    }
}
