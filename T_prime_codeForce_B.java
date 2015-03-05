package codeforce;

import java.util.Scanner;

public class T_prime_codeForce_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        long y=0;
        int j;
        for(int i=0;i<n;i++){
         
        	y=in.nextLong();
            long x=(long) Math.sqrt(y);
        	
        		
        		for( j=2;j*j<=x;j++){
        			if(x%j==0) break;}
        		
        			if(j*j>x&& x*x==y&&y>1)
        System.out.println("YES");
        else System.out.println("NO");
        count=0;
        }
     //  if(count==3)System.out.println("YES");
     //  else System.out.println("NO");
	
	

	}
	}
