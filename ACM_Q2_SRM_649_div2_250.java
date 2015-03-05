package codeforce;

import java.util.Scanner;

public class ACM_Q2_SRM_649_div2_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		
		Scanner in=new Scanner(System.in);
      String s=in.next();
      String t=in.next();
     // check(s, t);
      String c="";
      String h="";
      int k=0;
      
      if(s.length()-t.length()>1)     System.out.println("Impossible");
      else if(s.length()==t.length()) System.out.println("Impossible");
      else if(s.length()<t.length())  System.out.println("Impossible");
      else{
    	  for(int i=0;i<s.length();i++){
    		  if(i==s.length()-1){ t+=s.charAt(i);
    		  k=i;
    		  break;
    		  }
    		  else if(s.charAt(i)!=t.charAt(i)){
    			c=s.charAt(i)+"";  
    		    k=i;
    		    break;
    		  }
    		  
    		  h+=s.charAt(i)+"";
    	  }
    	  
    	  h+=c+t.substring(k);
      
      System.out.println(h);
      if(s.equals(h))System.out.println("Possible");
      else   System.out.println("Impossible");
      }
	}
	static public String check(String s, String t){
		String c="";
	      String h="";
	      int k=0;
	      String imp="Impossible";
	      String pos="Possible";
	      boolean y=false;
	      if(s.length()-t.length()>1)   {
	    	  y=false; 
	    	   
	    	  }
	      else if(s.length()==t.length()) y=false;
	      else if(s.length()<t.length())  y=false;
	      else{
	    	  for(int i=0;i<s.length();i++){
	    		  if(i==s.length()-1){ t+=s.charAt(i);
	    		  k=i;
	    		  break;
	    		  }
	    		  else if(s.charAt(i)!=t.charAt(i)){
	    			c=s.charAt(i)+"";  
	    		    k=i;
	    		    break;
	    		  }
	    		  
	    		  h+=s.charAt(i)+"";
	    	  }
	    	  
	    	  h+=c+t.substring(k);
	      
	     // System.out.println(h);
	      if(s.equals(h))y=true;
	      else   y=false;
	      }
	      if(y==true) return pos;
	      else return imp ;
	    		  
		
	}

}
