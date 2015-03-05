import java.util.ArrayList;
import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getKDigits(20,9);
		Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       
       int k=in.nextInt();
       
       ArrayList<Character>list=new ArrayList<Character>();
       
       String str=fac(n)+"";
       for(int i=0;i<str.length();i++)
    	   list.add(str.charAt(i));
       System.out.println(list);
       for(int i=0;i<list.size();i++){
   System.out.println(list.get(list.size()-1));
       if(list.get(list.size()-1)=='0'){
    	   System.out.println("yes");
    	   list.remove(list.size()-1);
    	   System.out.println(list);  
       } 
       }
       StringBuilder re=new StringBuilder();
       System.out.println(str+" " +list);
       for(int i=0;i<k;i++){
    	if(list.size()<k) k=list.size();
    	   re.append(list.get(list.size()-1-i));
       }
       System.out.print("\"");
       System.out.print(re.reverse());
       System.out.print("\"");
	}
	static public String getKDigits(int N, int K){
           ArrayList<Character>list=new ArrayList<Character>();
	       
	       String str=fac(N)+"";
for(int i=0;i<str.length();i++)
	    	   list.add(str.charAt(i));
	   
for(int i=0;i<list.size();i++){
	   
	      if(list.get(list.size()-1)=='0'){
	    	 
	    	   list.remove(list.size()-1);
	    	   
	       } 
	       }
	       StringBuilder re=new StringBuilder();
	      
	       for(int i=0;i<K;i++){
	    	if(list.size()<K) K=list.size();
	    	   re.append(list.get(list.size()-1-i));
	       }
	      /*System.out.print("\"");
	       System.out.print(re.reverse());
	       System.out.print("\"");*/
		   String x="\""+re.reverse()+"\"";
		   System.out.println(x);
		return x;
	}
static public long fac(int n){
	long fact=1;
	for(int i=1;i<=n;i++){
		fact*=i;
	}
	//System.out.println(fact);
	return fact;
	
}
}
