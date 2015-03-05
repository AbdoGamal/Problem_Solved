package codeforce;

import java.util.HashSet;
import java.util.Scanner;

public class Sereja_and_Suffixes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int arr[] = new int[n];
		for(int i = 0; i < n ; i++)
			arr[i] = in.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = n-1; i >= 0; i--){
			set.add(arr[i]);
			arr[i] = set.size();
			//System.out.println(hs);
			//System.out.println(arr[i]);
		}
        
		for(int i = 0; i < m; i++)
			System.out.println(arr[in.nextInt()-1]);
      
     	}

}
