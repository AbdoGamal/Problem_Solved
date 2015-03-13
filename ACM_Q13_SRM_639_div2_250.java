package codeforce;

import java.util.ArrayList;
import java.util.Scanner;
//nameOfClass ElectronicPetEasy
public class ACM_Q13_SRM_639_div2_250 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//isDifficult(3, 3, 7, 21, 1, 1);
		  Scanner in=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<Integer>();
        int st1,p1,t1,st2,p2,t2;
        st1=in.nextInt();
        p1=in.nextInt();
        t1=in.nextInt();
        st2=in.nextInt();
        p2=in.nextInt();
        t2=in.nextInt();
        int sum=0;
	list.add(st1);
	if(list.contains(st2)) sum++;
	else list.add(st2);
      
	for(int i=0;i<t1-1;i++){
		st1+=p1;
		System.out.print(st1+" ");
		if(list.contains(st1)) sum++;
		list.add(st1);
		
	}
        System.out.println();
        
        for(int i=0;i<t2-1;i++){
		st2+=p2;
		System.out.print(st2+" ");
		if(list.contains(st2))sum++;
	}
        System.out.println();
	if(sum>0)System.out.println("Diffecult");
	else System.out.println("Easy");
        
	System.out.print(sum);
	for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
	}*/
	public static String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2){
		 Scanner in=new Scanner(System.in);
	      ArrayList<Integer>list=new ArrayList<Integer>();
	      
	        int sum=0;
		list.add(st1);
		if(list.contains(st2)) sum++;
		else list.add(st2);
	      
		for(int i=0;i<t1-1;i++){
			st1+=p1;
			if(list.contains(st1)) sum++;
			//System.out.print(st1+" ");
			list.add(st1);
		}
	        System.out.println();
	        
	        for(int i=0;i<t2-1;i++){
			st2+=p2;
			//System.out.print(st2+" ");
			if(list.contains(st2))sum++;
		}
	        System.out.println();
		if(sum>0) return "Difficult";
		else return "Easy";
	        
		
	}
}
