package codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class Squars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		long[] a=new long[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		if(k>n) System.out.println("-1");
		else System.out.println(a[n-k]+" 0");
		
	}

}
