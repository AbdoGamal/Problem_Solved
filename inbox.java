import java.util.Scanner;


public class inbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int []arr=new int[n];
         for(int i=0;i<n;i++){
        	 arr[i]=in.nextInt();
         }
         int count=1;
         for(int i=0;i<n-1;i++){
        	 if(arr[i]==1){
        		 //System.out.println("first one");
        		 if(arr[i+1]==1){
        			 //System.out.println("second one");
        			 count++;
        		 
        		 }
        		 else {
        			 //System.out.println("return");
        			 count+=2;
        		 }
        	 }
        	 
         }
         if(arr[n-1]==0) count-=2;
         System.out.println(count<0 ? "0" : count);
	}

}
