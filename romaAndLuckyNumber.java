import java.util.Scanner;


public class romaAndLuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
   	int k=in.nextInt();
   	int result=0;
   	for(int i=1;i<=n;i++){
   		int a=in.nextInt();
   		int count=0;
   		while(a>0){
   			int key=a%10;
   			if(key==4||key==7) count++;
   			a/=10;
   		}
   		if(count>k) result++;
   	}
   	System.out.println(n-result);
	}
	

}
