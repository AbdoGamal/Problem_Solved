import java.util.HashSet;
import java.util.Scanner;


public class Valera_and_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char c[][] = new char[n][];
		for(int i=0;i<n;i++)
		{
			String in= sc.next();
			c[i] = in.toCharArray();
		}
		char d=c[0][0];
		char nd = c[0][1];
		if(d==nd){
			System.out.println("NO");
			return;
		}
		for(int i=0;i<n;i++){
			if(c[i][0+i]!=d || c[i][n-1-i]!=d){
				System.out.println("NO");
				return;
			}

			for(int j=0;j<n;j++){
				if(j!=(0+i) && j!=(n-1-i)){
					if(c[i][j]!=nd){
						System.out.println("NO");
						return;
					}
				}
			}
		}

		System.out.println("YES");

	  
	}

}
