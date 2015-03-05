import java.util.Scanner;


public class fedyaAndMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new Scanner(System.in).next();
		if (s.length() > 1)
			s = s.substring(s.length() - 2);
		int x = Integer.valueOf(s);
		System.out.println((x % 4 == 0) ? 4 : 0);
	}

}
