import java.util.Scanner;


public class songsandjoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,d,k;
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
       d=in.nextInt();
       int sum=0;
       for(int i=0;i<n;i++){
    	   k=in.nextInt();
    	   sum+=k;
       }    
    sum+=(n-1)*10;
    int joke=d-sum;
    if(joke<0) System.out.println("-1");
    else System.out.println((joke/5)+(n-1)*2);
}
}
