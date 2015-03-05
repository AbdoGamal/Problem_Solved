package codeforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ACM_Q4_SRM_647_div2_250 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=in.nextInt();
 
        int i=0,j=0;
		int fr[]=new int[arr.length];
		int p=0;
		int s=0;
		int t=0;
		Arrays.sort(arr);
		while(i<n)
		{
	//	System.out.println(" "+i);
		for(j=i;j<arr.length;j++)
		{//System.out.println("arr "+arr[i]);
		if(arr[i]==arr[j]){
		 fr[t]++;
		}
		
		else{
			s=0;
			t++;
			break;
		}
		}
		//System.out.println("j "+j+"i "+i);
		i=0;
		i+=j;
		//System.out.println("j "+j+"i "+i);
		}
		int mx=max(fr);
		//System.out.println("max  "+mx);
	 int sum=0;
	for(int i1=0;i1<fr.length;i1++){
		//System.out.println("frequancy "+fr[i1]);
		sum+=fr[i1];
	    }
   
	   sum-=mx;
		//System.out.println("sum "+sum);
		if(sum>=mx||Math.abs(sum-mx)==1) System.out.println("possible");
		else System.out.println("impossible");
		}
	
	
	static public int max(int arr[]){
		int max=0;
		for(int i=0;i<arr.length;i++){
				if(max<arr[i]) max=arr[i];
			}
		//System.out.println(max);
		return max;
	}
}