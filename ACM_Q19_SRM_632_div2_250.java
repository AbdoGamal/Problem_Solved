package codeforce;

//nameOfClass RunningAroundPark

public class ACM_Q19_SRM_632_div2_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,3,5,7,9,2,4,8,9};
		int co=1;
	for(int i=0;i<arr.length-1;i++){
		if(arr[i]>=arr[i+1]) co++;
	}
		System.out.print(co);
		
	}
 
	
   public static int numberOfLap(int N, int[] d){
	   int co=1;
		for(int i=0;i<d.length-1;i++){
			if(d[i]>=d[i+1]) co++;
		}
			return co;
	   
   }
	
}
