package codeforce;

import java.util.Scanner;

public class PetransBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[7];
    for(int i=0;i<7;i++)arr[i]=in.nextInt();
    int sum=0;
    int count=0;
    int i=0;
    while(sum<=n){
    	
    	sum+=arr[i];
    	//System.out.print(sum+" "+i);
    	count++;
    	if(sum>=n)  break;
    	i++;
    	if(i==7){ i=0;
    	count=0;
    	}
        }
		System.out.println(count);
	
		
}
}
