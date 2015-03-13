package codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class ACM_Q5_SRM_646_div2_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int arr[]=new int[n];
       int k=in.nextInt();
       
       for(int i=0;i<n;i++) arr[i]=in.nextInt();
       Arrays.sort(arr);
       System.out.println(find(arr,k));
       //  for(int i=0;i<n;i++)System.out.print(arr[i]+" ");
     
       int min=Integer.MAX_VALUE;
       if(k==1) System.out.println("0");
       else {
       for(int i=0;i<n;i++){
    	   for(int j=i+1;j<n;j++){
    	//	  System.out.println(arr[i]+"  "+arr[j]+"  ");
    		   min=Math.min(min,(Math.abs(arr[i]-arr[j])-1));
    		  //System.out.println(Math.abs(arr[i]-arr[j]));
    		    System.out.println(min);
    	   }
       }
   //    System.out.println(min);
	}
	}
 static public int find(int[] numbers, int k){
     Arrays.sort(numbers);
   //  for(int i=0;i<n;i++)System.out.print(arr[i]+" ");
   
     int min=Integer.MAX_VALUE;
     if(k==1) return 0;
     else {
     for(int i=0;i<numbers.length;i++){
  	   for(int j=i+1;j<numbers.length;j++){
  
  		   min=Math.min(min,(Math.abs(numbers[i]-numbers[j])-1));
  		  
  	   }
     }
	}
	return min;
 }
}
