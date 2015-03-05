import java.util.Scanner;


public class DimaAndFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i++)
			sum += in.nextInt();
		n++;
		
		int res = 0;
		for(int i = 1; i <= 5; i++)
			if((sum+i)%n != 1)
				res++;
		System.out.println(res);
	}

}
