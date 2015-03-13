package codeforce;

import java.util.Arrays;
//nameOfClass CostOfDancing
public class ACM_Q27_SRM624_div2_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=39;
		int arr[]={973, 793, 722, 573, 521, 568, 845, 674, 595, 310, 284, 794, 913, 93, 129, 758, 108, 433, 181, 163, 96, 932,
				 703, 989, 884, 420, 615, 991, 364, 657, 421, 336, 801, 142, 908, 321, 709, 752, 346, 656, 413, 629, 801};
		Arrays.sort(arr);
		int sum=0;
		for(int i=0;i<n;i++)sum+=arr[i];
		System.out.println(sum);
	}
	public static int minimum(int K, int[] danceCost){
		Arrays.sort(danceCost);
		int sum=0;
		for(int i=0;i<K;i++)sum+=danceCost[i];
		return sum;
		
	}

}
