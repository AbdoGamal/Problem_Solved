import java.util.Arrays;
import java.util.Scanner;


public class sortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] orig = new int[N];
        for (int i=0; i<N; i++)
        orig[i] = in.nextInt();
        int[] sort = Arrays.copyOf(orig, N);
        Arrays.sort(sort);
        int s = N-1;
        int e = N-1;
        for (int i=0; i<N; i++)
                if (orig[i] != sort[i]) {
                if (s == N-1)
                s = i;
                e = i;
                }
        for (int i=s; i<=e; i++)
            if (orig[i] != sort[e-(i-s)]) {
               System.out.println("no");
               return;
            }
            System.out.println("yes\n" + (s+1) + " " + (e+1));
}
}