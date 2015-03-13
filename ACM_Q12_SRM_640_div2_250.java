package codeforce;

import java.util.Scanner;
//NameOfClass ChristmasTreeDecorationDiv2 
public class ACM_Q12_SRM_640_div2_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]={9,1,1};
    int arr1[]={3,2};
    int arr2[]={2,1};
		System.out.println(solve(arr,arr1,arr2 ));
		
		
		/*    Scanner in =new Scanner(System.in);
       int n=in.nextInt();
       int m=in.nextInt();
       
       int arr[]=new int [n];
       int arr1[]=new int [n];
       int arr2[]=new int [n];
       for(int i=0;i<n;i++) arr[i]=in.nextInt();
       for(int i=0;i<m;i++){
    	   arr1[i]=in.nextInt();
    	  
       }
       for(int i=0;i<m;i++)
       arr2[i]=in.nextInt();
       int co=0;
      for(int i=0;i<m;i++){
    	  System.out.print(arr[arr1[i]-1]);
    	  System.out.print("  "+arr[arr2[i]-1]+" ");
    	  int k=arr[arr1[i]-1];
    	  int kk=arr[arr2[i]-1];
    	  if(k!=kk)
          co++;
      }
	
	
	System.out.println();
	System.out.println(co);*/
	}
  public static int solve(int[] col, int[] x, int[] y){
      int co=0;
     for(int i=0;i<x.length;i++){
   	 // System.out.print(arr[arr1[i]-1]);
   //	  System.out.print("  "+arr[arr2[i]-1]+" ");
   	  int k=col[x[i]-1];
   	  int kk=col[y[i]-1];
   	  if(k!=kk)
         co++;
     }
	
     return co;
	  
	  
  }
}
