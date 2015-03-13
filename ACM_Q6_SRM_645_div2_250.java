package codeforce;

import java.util.Scanner;

public class ACM_Q6_SRM_645_div2_250 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int [n];
		int arr1[]=new int[n];
		int count=0;
		for (int i=0;i<n;i++){
			arr[i]=in.nextInt();
		    arr1[i]=arr[i];
		}
		int i=1;
		while(count<9000){
			if(i>=(n-1))i=1;
			for(int j=1;j<n-1;j++){
			if(arr[i]<arr[i-1]&&arr[i]<arr[i+1]){
				arr1[i]++;
			}
			else  if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
				arr1[i]--;
			}
			i++;
			count++;
			}
			for (int i1=0;i1<n;i1++){
				
			    arr[i1]=arr1[i1];
			}
			}
			for(int s=0;s<n;s++)
				System.out.print(arr1[s]+" ");
			System.out.println();
		
	}*/
		
	static public int[] performTheExperiment(int[] colonies){
	
		int arr1[]=new int[colonies.length];
		int count=0;
		for (int i=0;i<colonies.length;i++){
		arr1[i]=colonies[i];
		}
		int i=1;
		while(count<9000){
			if(i>=(colonies.length-1))i=1;
			for(int j=1;j<colonies.length-1;j++){
			if(colonies[i]<colonies[i-1]&&colonies[i]<colonies[i+1]){
				arr1[i]++;
			}
			else  if(colonies[i]>colonies[i-1]&&colonies[i]>colonies[i+1]){
				arr1[i]--;
			}
			i++;
			count++;
			}
			for (int i1=0;i1<colonies.length;i1++){
				
				colonies[i1]=arr1[i1];
			}
			}
			/*for(int s=0;s<colonies.length;s++)
				System.out.print(arr1[s]+" ");
			System.out.println();*/
		return arr1;
		
	}
}

