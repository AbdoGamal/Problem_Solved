package codeforce;

import java.util.Scanner;

public class ACM_Q3_SRM_648_div2_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		int n=in.nextInt();
		
		int sum=0;
		int count=0;
		int i=0;
		while(true){
			sum+=(Math.pow(2,i)*k);
			count++;
			System.out.println(sum);
			if(sum==n) break;
			else

			i++;
		}
System.out.println(count);
	}

}
