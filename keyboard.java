import java.util.HashSet;
import java.util.Scanner;


public class keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        Scanner input=new Scanner(System.in);
        int n = 0;
        int max=0;
        HashSet<Character>set=new HashSet<Character>();
        String st="";
        int s=0,e=n;
       // while(n>0){
         n=in.nextInt();
         String str=input.nextLine();
        while(true){
        	System.out.println("yes");
        	st=str.substring(s,e);
        	//System.out.println(st.charAt(0));
        	 for(int i=0;i<st.length();i++){
        	        //set.add(st.charAt(i));
        	        System.out.println(st.charAt(i));
        	              
        	 }
        	 
        	 System.out.println(st.length()+" "+str.length());
        	 if(s==str.length()){
        		 System.out.println("exit");
        		 System.out.println(st);
        		 System.out.println(st.length());
        		 max=Math.max(max, st.length());
        		 break;
        		
        	 }
        	 if(set.size()<=n){
        		 if(e==str.length()){
        			 s+=1;
        		 }
        		 else {
        		 System.out.println("EQUAL");
        		System.out.println(st);
        		 System.out.println(st.length());
        		
        		 e+=1;
        		 max=Math.max(max, st.length());
        		 set.removeAll(set);
        		 System.out.println("**********************");
        	 }}
        	 else {
        		 if(e==str.length()){
        			 s+=1;
        		 }
        		 else
        		 System.out.println("else");
        		 System.out.println(st);
        		 System.out.println(st.length());
        		 
        		 s=e;
        		 e+=1;
        		 
        		 
        		 if(e>str.length()-1)e=str.length()-1;
        		// max=Math.max(max, st.length());
        		 set.removeAll(set);
        		 System.out.println("**********************");
        	 }}
        
        System.out.println(max);
	}
	//}
}
