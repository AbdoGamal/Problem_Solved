import java.util.HashMap;
import java.util.Scanner;


public class lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		HashMap<String, String> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    int m = in.nextInt();
		
		while(m-- > 0){
			String a = in.next();
			String b = in.next();
			String rr = b;
			if(a.length() <= b.length())
				rr = a;
			map.put(a, rr);
		}
		
		while(n-- > 0){
			String s=in.next();
			System.out.print(map.get(s));
			if(n != 0)
				System.out.print(" ");
		}
		
	}

}
