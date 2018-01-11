package algorithms.chapter1.part1;

import edu.princeton.cs.algs4.*;

public class Ex14 {
    int n = StdIn.readInt();
    System.out.println(lg(n));
    public static int lg(int n) {
        if (n < 1) {
            return 0;

        }
        else {
            int j = 1;
            int i = 0;
            for (; j < n; i++)
                j = 10 * j;
            return i;
        }
    }


    /*
    public static int x2(int n) {
        int result;
        if (n == 0) {
            result = 1;
        }
        else {
            result = 10 * x2(--n);
        }
        return result;
    }
    */
}
