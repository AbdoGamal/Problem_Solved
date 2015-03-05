package codeforce;

import java.util.Scanner;

public class Domino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count1=0;
		int count2=0;
		for(int i=0;i<n;i++){
			int p=in.nextInt();
			int c=in.nextInt();
			if(p%2!=0)count1++;
			if(c%2!=0)count2++;
		}
	//	System.out.print(count1+" "+count2);
	
		if(count1%2==0&&count2%2==0)
			System.out.println("0");
		else if(count1%2==0&&count2%2!=0) 
			System.out.println("-1");
		else if(count2%2==0&&count1%2!=0) 
			System.out.println("-1");
		else if(count2%2!=0&&count1%2!=0&&n==1) 
			System.out.println("-1");
		
		else System.out.println("1");
	}

}
