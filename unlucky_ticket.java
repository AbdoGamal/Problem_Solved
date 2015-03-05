import java.util.Arrays;
import java.util.Scanner;


public class unlucky_ticket {

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int n = in.nextInt();
		int[] l = new int[n], r = new int[n];

		String s = in.next(); in.close();
		for(int i=0; i<n; ++i) l[i] = s.charAt(i)-'0';
		for(int i=0; i<n; ++i) r[i] = s.charAt(n+i)-'0';

		Arrays.sort(l); 
		Arrays.sort(r);
		boolean t = true, tt = true;
		for(int i=0; i<n; i++) {
			if(l[i] <= r[i]) t = false;
			if(l[i] >= r[i]) tt = false;
		}

		if(t || tt) System.out.println("YES");
		else System.out.println("NO");
	
	}
}
