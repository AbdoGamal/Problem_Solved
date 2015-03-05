package codeforce;

import java.util.Scanner;

public class Colorful_Stones_Simplified_Edition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in=new Scanner(System.in);
      String s=in.next();
      String t=in.next();
      int count=0;
	  
      for(int j=0;j<t.length();j++){
    	  if(t.charAt(j)==s.charAt(count)){
    		  count++;
    	  }
      }
      System.out.println(count+1);
      
	}

}
