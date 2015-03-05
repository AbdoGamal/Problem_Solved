package codeforce;

import java.util.Scanner;

public class Mashmokh_and_Lights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int m=in.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<m;i++){
    	   int k=in.nextInt();
    	   for(int j=k-1;j<n;j++){
    		   if(arr[j]==0){
    	//	System.out.println("yes");
    			   arr[j]=k;
    	   }}
       }
       for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
