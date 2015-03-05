import java.util.Scanner;


public class oskalosa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=in.nextInt();
	
	int m=in.nextInt();
	int x,y;
	for(int i=0;i<m;i++){
		x=in.nextInt();
		y=in.nextInt();
		if(n==1){ System.out.println("0");
			return;
		}
		int p=x-1-1;
		int pp=x-1+1;
		if(p<0&&n>1){ 
		//arr[x-1-1]=Math.abs(arr[x-1-1]+=y-1);
			int k=y-1;
		arr[x]=Math.abs(arr[x]+=arr[x-1]-k-1);
		arr[x-1]=Math.abs(arr[x-1]-=arr[x-1]);
		//System.out.println("<0");
	//	System.out.print(" "
		//		+arr[x-1]+" "+arr[x]);
		}
		else if(pp>n-1&&n>1){
			int k=y-1;
			arr[x-1-1]=Math.abs(arr[x-1-1]+=k);
			arr[x-1]=Math.abs(arr[x-1]-=arr[x-1]);
		//	arr[x]=Math.abs(arr[x]+=arr[x-1]-y);
			//System.out.println(">n-1");
			//System.out.print(" "+arr[x-1-1]+" "
			//		+arr[x-1]);
			
		}
		else {
			int k=y-1;
			arr[x-1-1]=Math.abs(arr[x-1-1]+=k);
			
			arr[x]=Math.abs(arr[x]+=arr[x-1]-k-1);
			arr[x-1]=Math.abs(arr[x-1]-=arr[x-1]);
			//System.out.print(arr[x-1-1]+" "
		//	+arr[x-1]+" "+arr[x]);
		}
	}

	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
	
	
	}
	

}
