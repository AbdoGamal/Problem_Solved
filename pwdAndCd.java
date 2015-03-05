import java.util.ArrayList;
import java.util.Scanner;


public class pwdAndCd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     ArrayList<String>list=new ArrayList<String>();
     
     while(n-->0){
    	 if(in.next().equals("pwd")){
    		 for(String string : list){
    			 System.out.print('/'+string);
    		 }
    		 System.out.println('/');
    	 }
    	 else{
         String str=in.next();
         if(str.charAt(0)=='/'){
        	list.clear();
        	
         str=str.substring(1);
         }
    	 for(String string : str.split("/")){
    		 if(string.equals(".."))
    			 list.remove(list.size()-1);
    		 else
    			 list.add(string);
    			 
     }
    	 
     }
    	 
     }
		

}
}
