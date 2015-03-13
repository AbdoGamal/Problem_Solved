package codeforce;

public class ACM_Q23_SRM_628_div2_250 {
//nameOfClass BishopMove 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(howManyMoves(4, 6, 7, 4));
	}
	public static int howManyMoves(int r1, int c1, int r2, int c2){
		int re=0;
		if(r1==r2&&c1==c2)
			re=0;
		
		else{
		if((Math.abs(r2-r1)+Math.abs(c2-c1))%2==0){
			//System.out.println("YES");
			
			if(Math.abs(r2-r1)==Math.abs(c2-c1)){
			//	System.out.println("1");
				re=1;
			}
			else{  // System.out.println("2"); 
				re=2;
				} 
			
		}
		else {
			re=-1;
	//		System.out.println("-1");
		}
	
	
	
		}
		return re;	
		
}
}
