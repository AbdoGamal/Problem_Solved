package codeforce;

import java.util.ArrayList;
import java.util.Scanner;
 //SRM 650-div2-250
public class ACM_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
	    int count =0;
	    if(b>a)
	    {
	    	int c=a;
	    	a=b;
	    	b=c;
	    }
	    ArrayList<Integer>list=new ArrayList<Integer>(); 
		list.add(a);
	    while(a%2==0){
			a/=2;
			list.add(a);
		}
	    if(list.contains(b)) count++;
	    while(b%2==0){
	    	if(list.contains(b)) count++;
	    	b/=2;
	    }
	
		System.out.println(count);
	
	}

}
