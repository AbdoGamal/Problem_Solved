import java.util.Scanner;


public class juice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int  n, k, l, c, d, p, nl, np;
        n=in.nextInt();
        k=in.nextInt();
        l=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        p=in.nextInt();
        nl=in.nextInt();
        np=in.nextInt();
        
         l=k*l;
       //  System.out.println(l);
         l=l/nl;
         //System.out.println(l);
         d=d*c;
         //System.out.println(d);
         p=p/np;
         //System.out.println(p);
         int min=Math.min(l,Math.min(d, p))/n;
         System.out.println(min);
	}

}
