import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class spilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="";
        String search="";
        int pos=0;
        boolean t=false;
        int k=0;
        String word="" ;
	String str1="";
	int count=0;
	Scanner input =new Scanner(System.in);
	Scanner input1 =new Scanner(System.in);
	text=input.nextLine();
	search=input.nextLine();
	//word=input.nextLine();
	pos=input1.nextInt();
	String str[]=text.split(" ");
	
	
	/*if(word.charAt(0)=='N'){
	if(text.contains(search)){
	
		System.out.println("Part of word ");
		count=text.indexOf(search, pos);
		t=true;

		}
	
	else 
		t=false;
		}*/
	
	
		// if(word.charAt(0)=='Y'){
	
	for(int i=0;i<str.length;i++){
		System.out.println(str[i]);
		
if(str[i].equals(search)){
        System.out.println(str[i]);
        
     
        	count=k;
if(text.indexOf(search, count)>=pos){
       System.out.println(count);	 
       	t=true;
       	break;
}
else {
	k+=search.length()+1;
System.out.println("else counter"+count);	
t=false;

}
        } 
        
	 else {
		 k+=str[i].length()+1;
		 System.out.println(" K "+k);
			t=false;
			}
	}
	
	
	if(t==true) System.out.println(count);
	else System.out.println(-1);
	
	
}		
}