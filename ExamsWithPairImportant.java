
import java.util.Arrays;
import java.util.Scanner;

//solved by pair most easy =D 
//created by AbdoGamal
//
public class ExamsWithPairImportant {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Pair [] arr = new Pair[n];
		int x=0, y=0;
		for (int i = 0; i < n; i++) {
			x = in.nextInt();
			y = in.nextInt();
			arr[i] = new Pair(x,y);
			//creat new pair of (x,y)
		}
		Arrays.sort(arr);
		//sort pair using just X 
		int Final=arr[0].y;
		//make Final== first y in pair
		for (int i =1; i < arr.length; i++) {
			if(Final<=arr[i].y){
				Final=arr[i].y;
				//change to next y
			}else{
				Final=arr[i].x;
			  //choose to next x 
			}
		}
		System.out.println(Final);
}

}
/*class Pair implements Comparable<Pair>{
	int x,y;
	public Pair(int x,int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Pair o) {
		if (o.x == this.x)
			return -(o.y - this.y);
		else
			return -(o.x - this.x);
	}
	
}
*/