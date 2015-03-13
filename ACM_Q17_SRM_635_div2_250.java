package codeforce;

import java.util.Scanner;
//nameOfClass IdentifyingWood
public class ACM_Q17_SRM_635_div2_250 {

	/*public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String t=in.next();
		int x=0;
		int count=0;
		if(t.length()>s.length())
			System.out.println("Nope");
		else {
			for(int i=0;i<t.length();i++){
	//	System.out.println(s.charAt(x)+" " +t.charAt(i)+" ");
				if(x>s.length()-1) break;
			if(s.charAt(x)==t.charAt(i)){
				count++;
				x++;
				
			    }
			else{
				while(true){
					x++;

					if(x>s.length()-1) break;
	//System.out.println(s.charAt(x)+" " +t.charAt(i)+" ");				
					if(s.charAt(x)==t.charAt(i)){
						count++;
						x++;
						break;
					    }
				}
			}
			}
		    }
		
		
		System.out.println(count);
		
		
	}
	*/
	
	public static String check(String s, String t){
		int x=0;
		int count=0;
		if(t.length()>s.length())
			System.out.println("Nope");
		else {
			for(int i=0;i<t.length();i++){
			if(x>s.length()-1) break;
			if(s.charAt(x)==t.charAt(i)){
				count++;
				x++;
				
			    }
			else{
				while(true){
					x++;

					if(x>s.length()-1) break;
	        		if(s.charAt(x)==t.charAt(i)){
						count++;
						x++;
						break;
					    }
				}
			}
			}
		    }
		
		
		if(count==t.length()) return "Yep, it's wood.";
		else  return "Nope.";
		
		
	}	
		
	}