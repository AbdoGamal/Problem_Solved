import java.util.Scanner;


public class inverting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner (System.in);
		String inv="";
        String str=in.next();
		for(int i=0;i<str.length();i++){
			if(i==0&&str.charAt(i)=='9'){
		 //   System.out.println("9");
			inv+="9";	
			}
			else if(i==0&&str.charAt(i)=='0'){
         // System.out.println("0");			
				inv+="9";	
			}
			else{
			//	System.out.println("ok1");
			int k=Integer.parseInt(str.charAt(i)+"");
			if(k>=5){
			//	System.out.println("yes");
			k=9-k;
			inv+=k+"";
			//System.out.println(inv);
}
			else{
				//System.out.println("eles");
				inv+=str.charAt(i);

}}
}
		for(int i=0;i<inv.length();i++){
			if(inv.charAt(0)=='0')
				inv=inv.substring(i,inv.length()-1);
		}
		if(inv.length()>=1)
		System.out.println(inv);
		else System.out.println("-1");
}
}
