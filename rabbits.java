import java.util.Scanner;

public class rabbits{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int best = Integer.MIN_VALUE;
		while (n-- > 0)
			best = Math.max(best, in.nextInt()
					- Math.max(0, in.nextInt() - k));
		System.out.println(best);
	}
}