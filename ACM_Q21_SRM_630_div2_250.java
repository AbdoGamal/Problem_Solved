package codeforce;

public class ACM_Q21_SRM_630_div2_250 {
//nameOfClass DoubleLetter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	    String str="zzxzxxzxxzzx";
	    
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				System.out.println(str.charAt(i)+" "+str.charAt(i+1));	
			str=str.replaceFirst(str.substring(i,i+2)+"","");
			i=-1;
			System.out.println(str);
			}
		    }
	   if(str.isEmpty())System.out.println("Possible");
	   else System.out.println("Impossible");
	   
	}
	
	public static String remove(String str,int s,int s1){
		str=str.replaceFirst(str.substring(s,s+2)+"","");
		System.out.println(str);
		return str;
		
	}
	public static String ableToSolve(String S){
		for(int i=0;i<S.length()-1;i++){
			if(S.charAt(i)==S.charAt(i+1)){	
			S=S.replaceFirst(S.substring(i,i+2)+"","");
			i=-1;
			}
		    }
	   if(S.isEmpty()) return "Possible";
	   else return "Impossible";
	   
	}
}
