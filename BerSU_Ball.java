import java.util.Arrays;
import java.util.Scanner;


public class BerSU_Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int boys[]=new int[n];
       for(int i=0;i<n;i++)
    	   boys[i]=in.nextInt();
       int m=in.nextInt();
       int girls[]=new int[m];
       for(int i=0;i<m;i++)
    	   girls[i]=in.nextInt();
	Arrays.sort(boys);
	Arrays.sort(girls);
	int k=0;
	int count =0;
	for(int i=0;i<n;i++){
		for(int j=k;j<m;j++){
		//	System.out.println(k+" "+j);
		//	System.out.println("no " +boys[i]+" "+girls[j]);
			
			if(Math.abs(boys[i]-girls[j])<=1){
			//	System.out.println("yes " +boys[i]+" "+girls[j]);
				count++;
				k=j+1;
			//	System.out.println(k);
				break;
			}
		}
	}
	System.out.println(count);
	
	}

}
