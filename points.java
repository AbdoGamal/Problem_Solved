import java.util.Scanner;
//after black contest 
//by AbdoGamal 
//24/2/2015
//11:18 pm
public class points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] x=new int[n];
        int[] y=new int[n];
        int a=0;int b=0;int c=0;int d=0;
        for(int i=0;i<n;i++){
            x[i]=in.nextInt();
            y[i]=in.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
if(x[j]>x[i]&&y[j]==y[i])
a++;
if(x[j]<x[i]&&y[j]==y[i])
b++;
if(x[j]==x[i]&&y[j]>y[i])
c++;
if(x[j]==x[i]&&y[j]<y[i])
d++;
}
if(a>0&&b>0&&c>0&&d>0)
count++;
a=0;
b=0;
c=0;
d=0;
}
System.out.print(count);
 }
}