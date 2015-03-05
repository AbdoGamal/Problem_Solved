import java.util.Scanner;


public class minDiffecult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=in.nextInt();
        int ans=Integer.MAX_VALUE;
        int pre=0;
        for(int i=1;i<n-1;i++){
            int diff=0;	
        	for(int j=0;j<n;j++){
        		if(i==j) continue ;
        		else{		
                diff=Math.max(diff, arr[j]-pre);
                }
        
        		pre=arr[j];
        }		
        ans=Math.min(ans,diff);	
        }
        System.out.println(ans);
}
}
