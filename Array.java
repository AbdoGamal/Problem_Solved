package codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++) {
	      arr[i] = in.nextInt();
	    }
	    Arrays.sort(arr);
	    int st = 1, end = arr.length - 1;
	    System.out.println("1 " + arr[0]);
	      if(arr[end] > 0)
	      System.out.println( "1 " + arr[end--]);
	      else
	      System.out.println( "2 "   + 
	      arr[st++] + " " + arr[st++]);
	      System.out.print( (end-st+1)
	    		                + " ");
	      for(int i = st; i <= end; i++)
	      System.out.println(" " + arr[i]);
	}

}
