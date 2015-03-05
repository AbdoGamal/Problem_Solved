import java.util.*;
public class robot {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++){
			int x = in.nextInt();
			if(x!=0){
				System.out.printf("P");
				x--;
			}
			if(i != 0){
				for(int j = 0; j < x;j++)
					System.out.printf("LRP");
			}
			else{
				for(int j = 0; j < x;j++)
					System.out.printf("RLP");
			}
			if(i != n - 1)
				System.out.printf("R");
		}
	}
}