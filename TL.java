package codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class TL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          int m=in.nextInt();
          int arr[]=new int [n];
          int arr1[]=new int[m];
          for(int i=0;i<n;i++)
        	  arr[i]=in.nextInt();
          for(int i=0;i<m;i++)
        	  arr1[i]=in.nextInt();
          Arrays.sort(arr);
          Arrays.sort(arr1);
          int max=0;
          if(arr[n-1]<=2*arr[0])
        	  max=2*arr[0];
          else 
        	  max=arr[n-1];
          if(max<arr1[0]){
        	  
        		  System.out.println(max);
        	  
          }
          else System.out.println("-1");
	}

}
