import java.util.Scanner;


public class decrysing_set
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		
		for (int i=0;i<k;i ++)
		{
			System.out.print(n+ " ");
			n-- ;
		}
		for (int i=1;i<=n;i ++)	
			System.out.print(i + " ");
	}
}