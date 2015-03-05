package codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class Codeforce_Appleman_and_Card_Game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long k = in.nextLong();
		String str = in.next();
		long [] s = new long[26];
		for(int i=0;i<n;i++) {
			s[str.charAt(i)-'A']++;
		//	System.out.println(s[str.charAt(i)-'A']);
		}
		Arrays.sort(s);
		long sum=0;
		for(int i=25;i>=0;i--) {
			if(k-s[i]<0) {
				sum+=k*k;
				k=0;
				break;
			}
			sum+=s[i]*s[i];
			k-=s[i];
		}
		System.out.println(sum);
	}
}