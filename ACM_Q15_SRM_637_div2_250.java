package codeforce;

import java.util.Scanner;
//nameOfClass GreaterGameDiv2
public class ACM_Q15_SRM_637_div2_250 {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int [n];
		
		for(int i=0;i<n;i++)arr[i]=in.nextInt();
		for(int i=0;i<n;i++)arr1[i]=in.nextInt();		
		int co=0;
		for(int i=0;i<n;i++){
			if(arr[i]>arr1[i]) co++;
		}

		
		System.out.print(co);
		
	}*/
	public static int calc(int[] snuke, int[] sothe){	
		int co=0;
		for(int i=0;i<snuke.length;i++){
			if(snuke[i]>sothe[i]) co++;
		}

		
		return co;
	}
}
