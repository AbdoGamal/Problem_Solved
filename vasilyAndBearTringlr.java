import java.util.Scanner;


public class vasilyAndBearTringlr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int x=in.nextInt();
       int y=in.nextInt();

       int x1=0;
       int y2=0;

       int y1=Math.abs(x)+Math.abs(y);
       int x2=Math.abs(x)+Math.abs(y);

       if(x<0){
       x2=(-1)*x2;
       }

       if(y<0){
       y1=(-1)*y1;
       }

       if(x1<x2){

       System.out.println(x1+"  "+y1+"  "+x2+"  "+y2);

       }

       else{

       System.out.println(x2+"  "+y2+"  "+x1+"  "+y1);
       }
	}

}
