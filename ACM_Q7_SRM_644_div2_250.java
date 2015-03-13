package codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class ACM_Q7_SRM_644_div2_250 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in =new Scanner(System.in);
        int count=0;
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=in.nextInt();
        Arrays.sort(arr);
        int k=in.nextInt();
        
        for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        
		if(Math.abs(arr[i]-arr[j])<=k) count++;		
        	}
        }
       System.out.println(count); 		
	}*/
	static public int count(int[] osize, int K){
	        int count=0;
	        Arrays.sort(osize);
	        for(int i=0;i<osize.length;i++){
	        	for(int j=i+1;j<osize.length;j++){
	        
			if(Math.abs(osize[i]-osize[j])<=K) count++;		
	        	}
	        }
	      
		return count;
		
	}
}
