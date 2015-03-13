package codeforce;

public class ACM_Q26_SRM625_div2_250 {
//nameOfClass AddMultiply
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(makeExpression(10));
	
	}
	public static int[] makeExpression(int y){
		int arr[]=new int[3];
		if(y==0){
			arr[0]=7;
			arr[1]=10;
			arr[2]=-70;
		}
		else if(y==1){
			arr[0]=2;
			arr[1]=2;
			arr[2]=-3;
		}
		else {
		arr[0]=y;
		arr[1]=2;
		arr[2]=-y;
		}	
	return arr;
	
	}

}
