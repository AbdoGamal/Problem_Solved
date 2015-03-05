import java.io.*;
import java.util.*;

public class Dragon {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[][] d = new int[n][2];
        for (int i = 0; i < n; i++) {
            d[i][0] = in.nextInt();
            d[i][1] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (d[i][0] < s) {
                s += d[i][1];
                d[i] = d[n - 1];
                i = -1;
                n--;
            }
        }
        if (n == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}