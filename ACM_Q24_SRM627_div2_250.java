package codeforce;

import java.util.Arrays;
import java.util.Scanner;
//nameOfClass ManySquares
public class ACM_Q24_SRM627_div2_250 {
	public static void main(String[] args) {
		int arr[]={1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 3, 3};
		System.out.println(howManySquares(arr));
	}

	public static int howManySquares(int[] sticks){
		
        int i=0,j=0;
		int fr[]=new int[sticks.length];
		int p=0;
		int s=0;
		int t=0;
		Arrays.sort(sticks);
		while(i<sticks.length)
		{
		for(j=i;j<sticks.length;j++)
		{
		if(sticks[i]==sticks[j]){
		 fr[t]++;
		}
		
		else{
			s=0;
			t++;
			break;
		}
		}
		i=0;
		i+=j;
		}
        int co=0;
	for(int q=0;q<fr.length;q++){
	//	System.out.println(fr[q]);
		if(fr[q]>=4){
			co+=fr[q]/4;
		}
	}
		
		return co;
	}
	
	
	
	}