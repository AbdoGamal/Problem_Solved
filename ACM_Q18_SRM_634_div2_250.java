package codeforce;
//nameOfClass MountainRanges
import java.util.Scanner;

public class ACM_Q18_SRM_634_div2_250 {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in=new Scanner(System.in);
           int arr[]={2,5,3,7,2,8,1,3,1};
           int count=0;
           if(arr.length==1)System.out.println(1);
           else{
           for(int i=0;i<arr.length;i++){
        	   if(i==0){
        	//	   System.out.println("==0");
        	   if(arr[i]>arr[i+1])count++;   
                }
        	   if(i==arr.length-1){
        	//	   System.out.println("==size");
            	   if(arr[i]>arr[i-1])count++;   
               }
        	   else if(i>0&&i<arr.length-1){
        	//	   System.out.println("else");
        		   if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]) count++;
        	   }
           }
	
	System.out.println(count)heights
	
	
	}
*/
           
           public static int countPeaks(int[] heights){
        	   int count=0;
               if(heights.length==1)return 1; 
               else{
               for(int i=0;i<heights.length;i++){
            	   if(i==0){
            	//	   System.out.println("==0");
            	   if(heights[i]>heights[i+1])count++;   
                    }
            	   if(i==heights.length-1){
            	//	   System.out.println("==size");
                	   if(heights[i]>heights[i-1])count++;   
                   }
            	   else if(i>0&&i<heights.length-1){
            	//	   System.out.println("else");
            		   if(heights[i]>heights[i-1]&&heights[i]>heights[i+1]) count++;
            	   }
               }
    	
    	return count;
           }
           
           
           
           
	}}
