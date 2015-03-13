package codeforce;

public class ACM_Q22_SRM_629_div2_250 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		int c=1;
		int d=1;
		
		int co=2;
		boolean t=false;
		for(int i=co;i>0;i--){
			if(a<=b&&c<=d){
				t=true;
			System.out.println("1");	
			break;
			}
			else {
				t=false;
				int temp=c;
				c=d;
				d=temp;
				if(a<=b&&c<=d){
					System.out.println("1");	
					t=true;
					break;
					}
			}
		}
		
		if(t==true)System.out.println("1");
		else System.out.println("-1");
	}
*/
	
	public   int solve(int holeH, int holeW, int boardH, int boardW){
		int co=2;
		boolean t=false;
		for(int i=co;i>0;i--){
			if(holeH<=boardH&&holeW<boardW||holeH<boardH&&holeW<=boardW){
				t=true;
			//System.out.println("1");	
			break;
			}
			else {
				t=false;
				int temp=boardH;
				boardH=boardW;
				boardW=temp;
			if(holeH<=boardH&&holeW<boardW||holeH<boardH&&holeW<=boardW){
				t=true;
			//System.out.println("1");	
			break;
			}
			}
		}
		
		if(t==true)return 1;
		else return -1;
	}
	
	
}
