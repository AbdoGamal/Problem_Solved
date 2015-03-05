import java.util.Scanner;


public class DZY_Loves_Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner (System.in);
        int p=in.nextInt();
        int n=in.nextInt();
        int arr[]=new int[n];
        boolean check[]=new boolean[p];
        int z=0;
        boolean t=false;
        for(int i=0;i<n;i++){
        	int k=in.nextInt();
        	z=(k%p);
        //	System.out.println(z);
        
        	if(check[z]==true)
        	{
        		System.out.println(i+1);
        		t=true;
        		return;
        		
        	}
        	
        	check[z]=true;
        
}
        if(t==false)
        	System.out.println(-1);
}

}
