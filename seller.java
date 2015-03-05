import java.util.Scanner;


public class seller  {

	public static void main(String[] args) {
		Scanner cin= new Scanner(System.in);	
		int n=cin.nextInt();
		int v=cin.nextInt();
		int k[]=new int[n];
		int m=0;
		int z;
		int arr[]=new int[n];
		int count=0;int c=0;
		for (int i = 0; i <n; i++) {
			m=0;
			k[i]=cin.nextInt();
			for (int j = 0; j < k[i]; j++) {
				
				z=cin.nextInt();
				if(z<v){if(m==0){arr[c]=i+1; c++; count++; m=1;}}
			}
		}
	
		System.out.println(count);
		for (int i = 0; i <count; i++) {
			System.out.print(arr[i] +" ");
		}
	
	
	}

}