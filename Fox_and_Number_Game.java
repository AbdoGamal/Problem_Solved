package codeforce;

import java.util.Scanner;
//gcd greater common divisor 
//to calculate min sum 
public class Fox_and_Number_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = in.nextInt();
		for(int i = 0; i < n-1; i++)
			sum = gcd(sum, in.nextInt());
		System.out.println(sum*n);
	//	System.out.println(gcd(10,15));
	}
	
	static public int gcd(int a,int b){
		if(b == 0) return a;
		return gcd(b, a%b);
		
	}

}
