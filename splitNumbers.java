import java.util.Scanner;


public class splitNumbers {
	
	
	
	public static void main(String[] args) {
	       int n;
	       
	       Scanner in=new Scanner(System.in);
	       n=in.nextInt();
	       String s=split(n);
	       
	        String num1=s.substring(0,1);
	        String num2=s.substring(num1.length(),s.length());
	        System.out.println(num1);
	        System.out.println(num2);
	        int a,b;
	        int i=0;
while(i<11&&s.length()>1){
           a=mult(num1, 0, num1.length());
           b=mult(num2, 0, num2.length());
            System.out.println("a  "+a);
	        System.out.println("b  "+b);
		   if(a!=b&&num2.length()==1){
			   System.out.println("NO");
			   break;
		   }
	        if(a==b){
			   System.out.println("a==b +  YES  ");
			   break;
		   }
		   else if(a>b ){
			   System.out.println("a>b +  NO  ");
			   num1=s.substring(0,num1.length()+1);
		       num2=s.substring(num1.length(),s.length());

		   }
		   else if(a<b){
			   System.out.println("a<b +  NO  ");
			   num1=s.substring(0,num1.length()+1);
		       num2=s.substring(num1.length(),s.length());
		   }
	 }
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static String check(int number){
	   String yes="YES";
	   String no="NO";
	   boolean t=true;
       String s=split(number);
        String num1=s.substring(0,1);
        String num2=s.substring(num1.length(),s.length());
        int a,b;
        int i=0;
        if(s.length()==1) t=false;
while(i<11&&s.length()>1){
       a=mult(num1, 0, num1.length());
       b=mult(num2, 0, num2.length());
	   if(a!=b&&num2.length()==1){
		   t=false;
		   break;
	   }
        if(a==b){
		   t=true;
		   break;
	   }
	   else if(a>b ){
		   t=false;
		   break;

	   }
	   else if(a<b){
		    num1=s.substring(0,num1.length()+1);
	       num2=s.substring(num1.length(),s.length());
	   }
 
	 
}
		if(t==true )return yes;
		else return no;
	    }

	
static public String split(int num){
		   String save="";
while(num!=0){
			int f=num%10;
			save+=f;
			num/=10;
			
}
            rev(save);
		    return save;
}
static public int mult(String num,int start ,int end){
		   int re=1;
		   String s="";
for(int i=start;i<end;i++){
			s=""+num.charAt(i); 
			int a = Integer.parseInt(s);
			
		    re*=a;
}	
		return re;
		
}
static public String rev(String num){
	StringBuilder string=new StringBuilder(num);
	
	//System.out.println(string.reverse().toString());
	
	
	return string.reverse().toString();
}

}
