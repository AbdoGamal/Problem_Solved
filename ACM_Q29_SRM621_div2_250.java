package codeforce;

import java.awt.AWTPermission;
import java.util.Arrays;

public class ACM_Q29_SRM621_div2_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String []arr={"c", "bb", "aaa"};
    for(int i=1;i<arr.length;i++){
    	String s=arr[i]; String s1=arr[i-1];
    	boolean t=true; boolean tt=true;
    	if(s.compareTo(s1)>0) t=false;
    	if(s.length()>s1.length())tt=false;
    	if(t=true&&tt==true)System.out.println("both");
    	else if(t=true) System.out.println("7agm");
    	else if(t=true) System.out.println("7roof");
    	else  System.out.println("non");
    }
	
	
	
	}
	
	public static String sortingMethod(String[] stringList){
		boolean t=true; boolean tt=true;
		for(int i=1;i<stringList.length;i++){
	    	String s=stringList[i]; String s1=stringList[i-1];
	    	
	    	if(s.compareTo(s1)>0) t=false;
	    	if(s.length()>s1.length())tt=false;
		}
	    	if(t=true&&tt==true)return "both";
	    	 if(t=true) return "lexicographically";
	    	 if(t=true) return "lengths";
	    	  return "none";
		
	
	
	
	}}