package codeforce;

public class ACM_Q28_SRM622_div2_250 {
//nameOfClass FibonacciDiv2
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[33];
		int i=2;
		while(i<arr.length){
			arr[0]=0;
			arr[1]=1;
			arr[i]=arr[i-1]+arr[i-2];
			i++;
		}
for (int j=0;j<arr.length;j++) System.out.println(arr[j]);

     int n=1000000;
     int max=Integer.MAX_VALUE;
     for (int j=0;j<arr.length-1;j++){
    	
      	 if(n>=arr[j]&&n<=arr[j+1]){
      		 System.out.println("yes");
      	     System.out.println(arr[j]+" "+arr[j+1]);
      	     max=Math.min(max,Math.min(Math.abs(n-arr[j]),Math.abs(n-arr[j+1])));
      	 }
     }
     System.out.println(max);
	}*/
	
	
	public static int find(int N){
		int arr[]=new int[33];
		int i=2;
		while(i<arr.length){
			arr[0]=0;
			arr[1]=1;
			arr[i]=arr[i-1]+arr[i-2];
			i++;
		}
for (int j=0;j<arr.length;j++) System.out.println(arr[j]);
     int max=Integer.MAX_VALUE;
     for (int j=0;j<arr.length-1;j++){
    	
      	 if(N>=arr[j]&&N<=arr[j+1]){
      		 System.out.println(arr[j]+" "+arr[j+1]);
      	     max=Math.min(max,Math.min(Math.abs(N-arr[j]),Math.abs(N-arr[j+1])));
      	 }
     }
     return max;
		
	}
}
