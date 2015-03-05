import java.util.Scanner;


public class police {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s=0;
		int sum=0;
		int x=0;
		for (int i=0;i<n;i++){
			x=in.nextInt();
			s+=x;
			if (s<0){
				sum+=s;
				s=0;
				
			}
		}
		System.out.println(sum*-1);
	}

}
