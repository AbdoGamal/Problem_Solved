package codeforce;

import java.util.ArrayList;

//not yet
public class ACM_Q25_SRM626_div2_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]={1,1,1};
        int sum=0;
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)sum+=arr[i];
       
        int n=arr.length;
        int save=0;
        
        for(int i=0;i<n-1;i++){
        	sum+=arr[i];
        	//System.out.print(arr[i]);
        	for(int j=i+1;j<arr.length;j++){
        		
        		//System.out.print(" "+arr[j]+" ");
        		sum+=arr[j];
        		
        	}
        	System.out.println();
            }
       
	//System.out.println(sum);
	
	
	
System.out.println(sum);
	
	
	}

}
