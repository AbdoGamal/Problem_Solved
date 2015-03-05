import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class tringle {
	 ArrayList<Double>list=new ArrayList<Double>();
	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		int arr[]=new int[6];
		
		for(int i=0;i<6;i++){
			arr[i]=in.nextInt();
		}
		
		cheack(arr);
		
	}
   static public ArrayList<Double> doo(int arr[]){
	   ArrayList<Double>list=new ArrayList<Double>();
	   double a=Math.pow((arr[2]-arr[0]), 2)+Math.pow((arr[3]-arr[1]),2);
		list.add(a);
		double b= Math.pow((arr[4]-arr[2]), 2)+Math.pow((arr[5]-arr[3]),2);
		list.add(b);
		double c=Math.pow((arr[4]-arr[0]), 2)+Math.pow((arr[5]-arr[1]),2);
		list.add(c);
		return list;
   }
   static public void cheack(int []arr){
	   boolean t=false;
	   boolean tt=false;
	   ArrayList<Double>list=doo(arr);
		Double i = Collections.max(list);
		list.remove(list.indexOf(i));
		if(i==list.get(0)+list.get(1)){  
		t= true;
		}
		else
			{
			for(int ii=0;ii<6;ii++){
				arr[ii]+=1;
			//	System.out.print(arr[ii]+" ");
				ArrayList<Double> list1=doo(arr);
				//System.out.println(list1);
				Double it = Collections.max(list1);
				list1.remove(list1.indexOf(it));
				//System.out.println(list1);
				//System.out.println(it);
				list.remove(list1);
				if(it==list1.get(0)+list1.get(1)){ 
				tt=true;
				
				//System.out.println("yeeeesss");
				break;
				}
				else {
					arr[ii]-=1;
				//System.out.println("noooozzzz");
				    tt=false;
				}
				System.out.print(arr[ii]+" ");
			}}
   if(t==true) System.out.println("RIGHT");
   else if(tt==true) System.out.println("ALMOST");
   else System.out.println("NEITHER");	
		}
}