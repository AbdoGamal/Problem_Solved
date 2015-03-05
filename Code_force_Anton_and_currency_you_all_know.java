package codeforce;

import java.util.Scanner;

public class Code_force_Anton_and_currency_you_all_know {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int b=-1;
		char s[]=str.toCharArray();
		char c=s[str.length()-1];
		for(int i=0;i<s.length-1;i++){
			char m=s[i];
			if(m%2==0){
				//System.out.println("yes");
				b=i;
				if(m<c)
				break;
			}
		}
		if(b==-1){
			System.out.println("-1");
		}
		else
		{
			char temp =s[b];
			s[b] = s[str.length()-1];
			s[str.length()-1] = temp;
			System.out.println(new String(s));
		}
		
		
	}
}
