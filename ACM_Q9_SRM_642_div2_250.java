package codeforce;

import java.util.Scanner;

public class ACM_Q9_SRM_642_div2_250 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in=new Scanner(System.in);
      String str=in.next();
      int y=1;
      int v=str.length()-1;
     
      int min=Integer.MAX_VALUE;
      while(y<str.length()){
    	  String sub=str.substring(0,y);
    	  String sub1=str.substring(y,v+1);
    	 // System.out.println(sub);
    	 // System.out.println(sub1);
    	  int x=Integer.parseInt(sub);
    	  int yy=Integer.parseInt(sub1);
    	 // System.out.println(x);
    	 // System.out.println(yy);
    	  
    	  int z=x+yy;
    	  System.out.println(z);
    	  min=Math.min(min,z);
    	  y++;
      }
      
      
      System.out.println(min);
      
	}*/
	static public int minNumber(String expression){
		
	      int y=1;
	      int v=expression.length()-1;
	     
	      int min=Integer.MAX_VALUE;
	      while(y<expression.length()){
	    	  String sub=expression.substring(0,y);
	    	  String sub1=expression.substring(y,v+1);
	    	
	    	  int x=Integer.parseInt(sub);
	    	  int yy=Integer.parseInt(sub1);
	    
	    	  
	    	  int z=x+yy;
	    	  System.out.println(z);
	    	  min=Math.min(min,z);
	    	  y++;
	      }
	      
	      
	      return min;
	}

}
