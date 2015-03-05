package codeforce;

import java.util.Scanner;

public class Cifera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in=new Scanner(System.in);
          long n=in.nextLong();
          long m=in.nextLong();
          long s=n;
          int count=0; 
    while(s<m){
    	s*=n;
    	count++;
    }
	System.out.println(s!=m?"NO":"YES\n"+count);
	
	}

}
