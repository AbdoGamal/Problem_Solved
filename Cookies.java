import java.util.Scanner;


public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int sum=0;
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
    	 arr[i]=in.nextInt();
    	 sum+=arr[i];
     }
     int count=0;
   // System.out.println(sum);
     for(int i=0;i<n;i++){
    	 
    	 if((sum-arr[i])%2==0){
    	//	 System.out.println("YES");    		 
    		 count++;
    	// sum+=arr[i];
    	// System.out.println(sum);
    	 
    	 }
    	 
    	 
     }
     
     
     System.out.println(count);
     
	}

}
