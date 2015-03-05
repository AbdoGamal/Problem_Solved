import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class swapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println(n); 
		for(int i = 0; i < n; i++) {
			int k = i; 
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[k]) k = j; 
			}
			int tmp = arr[i]; 
			arr[i] = arr[k]; 
			arr[k] = tmp; 
			System.out.println(i + " " + k);
		}
	}

}
