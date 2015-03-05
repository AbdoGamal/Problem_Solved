import java.util.Scanner;

public class Cards {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int i=0, j=n-1, k;
		int Ssum=0, Dsum=0;
		int a[] = new int[n+1];
		
		boolean b=true;
		
		for(k=0;k<n;k++)
			a[k]=in.nextInt();
		
		do{
			if(a[i]>a[j]){
				k=a[i];
				i++;
			}else{
				k=a[j];
				j--;
			}
			if(b)Ssum+=k;
			else Dsum+=k;
			b=!b;
		}while(i<=j);
		
		System.out.println(Ssum+" "+Dsum);
	}

}