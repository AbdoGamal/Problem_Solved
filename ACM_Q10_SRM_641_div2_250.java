package codeforce;

import java.util.ArrayList;
import java.util.Scanner;

public class ACM_Q10_SRM_641_div2_250 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in =new Scanner(System.in);

    int arr[]={11, 62, 55, 35, 62, 26, 34, 4, 68, 24, 27, 21, 14, 67, 8, 16, 34, 32, 36, 8, 43, 62, 46, 34, 48, 23, 46, 20, 58, 9, 23, 17, 65, 21, 43, 47, 27, 47, 50, 46, 13, 57};
    int arr1[]={49, 17, 51, 53, 62, 32, 16, 43, 65, 53, 18, 7, 17, 40, 35, 47, 57, 52, 35, 12, 6, 41, 28, 1, 37, 50, 8, 18, 31, 44, 7, 51, 35, 5, 6, 66, 51, 26, 13, 44, 31, 9};
     int k=68;
     ArrayList<Integer>list=new ArrayList<Integer>();
     int sum=0;
     for(int i=0;i<arr.length;i++){
    	 sum+=arr[i];
    	 if(sum>=k){
    		 sum-=k;
    		 
    		 System.out.print(i+" ");
    		 list.add(i);
    	 }
     }
     int count=0;
     sum=0;
     System.out.println();
     for(int i=0;i<arr1.length ;i++){
    	 sum+=arr1[i];
    	 if(sum>=k){
    		 sum-=k;
    		 if(list.contains(i)){
    			 System.out.print(i+" ");
    			 count++;}
    	 }
     }
	
     System.out.println();
     System.out.println(count);
    

     
	}*/
	public static int meet(int T, int[] Q, int[] P){
	     ArrayList<Integer>list=new ArrayList<Integer>();
	     int sum=0;
	     for(int i=0;i<Q.length;i++){
	    	 sum+=Q[i];
	    	 if(sum>=T){
	    		 sum-=T;
	    		 //System.out.print(i+" ");
	    		 list.add(i);
	    	 }
	     }
	     int count=0;
	     sum=0;
	     System.out.println();
	     for(int i=0;i<P.length;i++){
	    	 sum+=P[i];
	    	 if(sum>=T){
	    		 sum-=T;
	    		 if(list.contains(i)){
	    			 System.out.print(i+" ");
	    			 count++;}
	    	 }
	     }
		
	     System.out.println();
	   return count ;
	     
	     
	}
}
