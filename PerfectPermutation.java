import java.util.Scanner;


public class PerfectPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     if(n%2!=0){
    	 System.out.println(-1);
     return;
     }
     int arr[]=new int [n];
     for(int i=0;i<n;i++){
    	 arr[i]=i+1;
     }
     for(int i=0;i<n-1;i+=2){
    	 int tmp=arr[i];
    	 arr[i]=arr[i+1];
    	 arr[i+1]=tmp;
    	 System.out.print(arr[i]+" "+arr[i+1]+" ");
     }
    
	}
	
}
