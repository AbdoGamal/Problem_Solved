import java.util.Scanner;


public class counterExambel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		long l = in.nextLong();
		long r = in.nextLong();
		if (l % 2 != 0){
		 //   System.out.print("s");
			l++;}
		if (r - l > 1){
			//System.out.print("sss");
			System.out.println(l++ + " " + l++ + " " + l);
		}else
		    System.out.println(-1);
	}

}
