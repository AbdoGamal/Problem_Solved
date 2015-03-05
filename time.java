import java.util.Scanner;


public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int start = time(in.nextLine());
        int temp = time(in.nextLine());
        int dur = 24*60 - temp;
        int t = (start + dur) % (24*60);
        System.out.printf("%02d:%02d\n",t/60,t%60);
	}
	static int time (String s){
		String arr[] = s.split(":");
		return Integer.parseInt(arr[0])*60 + Integer.parseInt(arr[1]);
	}
}
