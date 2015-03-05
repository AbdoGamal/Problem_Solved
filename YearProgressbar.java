import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//January 01, 2400 00:01
//1.8973891924711593E-4

public class YearProgressbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		percentage(str);
		
		HashMap<String,Integer>dayOfMonth=new LinkedHashMap<>();
		HashMap<String,Integer>numOfDays=new LinkedHashMap<>();
		String []sub=str.split(", ");
		String[]t=sub[0].split(" ");
		String[]s=sub[1].split(" ");
		String[]tt=s[1].split(":");
		String month=t[0];
		double day=Integer.parseInt(t[1]);
		double year=Integer.parseInt(s[0]);
		double hour=Integer.parseInt(tt[0]);
		double min=Integer.parseInt(tt[1]);
   // Number Of Days per Month
		dayOfMonth.put("January",31);
		dayOfMonth.put("February",28);
		dayOfMonth.put("March",31);
		dayOfMonth.put("April",30);
		dayOfMonth.put("May",31);
		dayOfMonth.put("June",30);
		dayOfMonth.put("July",31);
		dayOfMonth.put("August",31);
		dayOfMonth.put("September",30);
		dayOfMonth.put("October",31);
		dayOfMonth.put("November",30);
		dayOfMonth.put("December",31);
	// Number Of Month	
		numOfDays.put("January",1);
		numOfDays.put("February",2);
		numOfDays.put("March",3);
		numOfDays.put("April",4);
		numOfDays.put("May",5);
		numOfDays.put("June",6);
		numOfDays.put("July",7);
		numOfDays.put("August",8);
		numOfDays.put("September",9);
		numOfDays.put("October",10);
		numOfDays.put("November",11);
		numOfDays.put("December",12);
		 double total=(double) 00.00;
		 
		int i=0;
		for (String key : numOfDays.keySet()) {
			  if(i==numOfDays.get(month)-1)break;
			  System.out.println( dayOfMonth.get(key));
			   i++;
			   total+=dayOfMonth.get(key);
			}
		System.out.println(total);
		total+=day-1;
	   
		System.out.println(total);
	
	    
	    double min1=0;
	    double hour1 = 0;
	    double days=365;
	   min1=(double)(min)/(double)(60);
	   System.out.println(min1);  
	   hour+=min1;
	   hour1=hour/(double)24.0;
	   System.out.println(hour);
	   System.out.println(hour1);
	    
	   
	   total+=hour1;
	   boolean isLeapYear = ((year % 4 == 0) && 
			    (year % 100 != 0) || (year % 400 == 0));
			    if(isLeapYear){
			    	System.out.println("yes"); 
			    	System.out.println(numOfDays.get(month));
			    	   if(numOfDays.get(month)>2){
			    		   System.out.println("yes");
			    	   total+=1;
			    	   }
			    	   
			    	   days+=1;
			          	    
			    }
	   
	    System.out.println((double)(total*100/(double)days));

}
	
	static public double percentage(String currentDate){
		double prec=0.0;
		HashMap<String,Integer>dayOfMonth=new LinkedHashMap<>();
		HashMap<String,Integer>numOfDays=new LinkedHashMap<>();
		String []sub=currentDate.split(", ");
		String[]t=sub[0].split(" ");
		String[]s=sub[1].split(" ");
		String[]tt=s[1].split(":");
		String month=t[0];
		double day=Integer.parseInt(t[1]);
		double year=Integer.parseInt(s[0]);
		double hour=Integer.parseInt(tt[0]);
		double min=Integer.parseInt(tt[1]);
   // Number Of Days per Month
		dayOfMonth.put("January",31);
		dayOfMonth.put("February",28);
		dayOfMonth.put("March",31);
		dayOfMonth.put("April",30);
		dayOfMonth.put("May",31);
		dayOfMonth.put("June",30);
		dayOfMonth.put("July",31);
		dayOfMonth.put("August",31);
		dayOfMonth.put("September",30);
		dayOfMonth.put("October",31);
		dayOfMonth.put("November",30);
		dayOfMonth.put("December",31);
	// Number Of Month	
		numOfDays.put("January",1);
		numOfDays.put("February",2);
		numOfDays.put("March",3);
		numOfDays.put("April",4);
		numOfDays.put("May",5);
		numOfDays.put("June",6);
		numOfDays.put("July",7);
		numOfDays.put("August",8);
		numOfDays.put("September",9);
		numOfDays.put("October",10);
		numOfDays.put("November",11);
		numOfDays.put("December",12);
		 double total=(double) 00.00;
		 
		int i=0;
		for (String key : numOfDays.keySet()) {
			  if(i==numOfDays.get(month)-1)break;
			   //System.out.println( dayOfMonth.get(key));
			   i++;
			   total+=dayOfMonth.get(key);
			}
		total+=day-1;
	   
		//System.out.println(total);
	
	    
	    double min1=0;
	    double hour1 = 0;
	    double days=365;
	   min1=(double)(min)/(double)(60);
	   //System.out.println(min1);  
	   hour+=min1;
	   hour1=hour/(double)24.0;
	 //  System.out.println(hour);
	 //  System.out.println(hour1);
	    
	   
	   total+=hour1;
	    boolean isLeapYear = ((year % 4 == 0) && 
	    (year % 100 != 0) || (year % 400 == 0));
	    if(isLeapYear){
	    	System.out.println("yes"); 
	    	System.out.println(numOfDays.get(month));
	    	   if(numOfDays.get(month)>2){
	    		   System.out.println("yes");
	    	   total+=1;
	    	   }
	    	   
	    	   days+=1;
	          	    
	    }
	    prec=(double)(total*100/(double)days);
	    System.out.println(prec);
		return prec;

}	
}