package algorithms.chapter1.part1;

import edu.princeton.cs.algs4.*;

public class Ex13 {
    public static void main(String[] args) {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        double[][] a = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = StdRandom.uniform(0.0,100.0);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                StdOut.printf("%.2f", a[i][j]);
                StdOut.print('\t');
            }
            StdOut.print('\n');
        }

        StdOut.print('\n');
        StdOut.print('\n');


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                StdOut.printf("%.2f", a[j][i]);
                StdOut.print('\t');
            }
            StdOut.print('\n');
        }



    }
}
