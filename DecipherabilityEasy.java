package codeforce;

public class DecipherabilityEasy {
	public String check(String s, String t){
		String c="";
	      String h="";
	      int k=0;
	      String imp="Impossible";
	      String pos="Possible";
	      if(s.length()-t.length()>1)    return imp;
	      else if(s.length()==t.length()) return imp;
	      else if(s.length()<t.length())  return imp;
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
	      if(s.equals(h))return pos;
	      else   return imp;
	      }
		
	}
}
