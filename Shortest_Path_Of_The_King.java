package A;

//problem tags
//greedy && shortest paths
//codeforce beta round #3

import java.util.Scanner;

public class Shortest_Path_Of_The_King {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		int n1 = a.charAt(0)-b.charAt(0);
		int n2 = a.charAt(1)- b.charAt(1);
		
		
		System.out.println(Math.max(Math.abs(n1), Math.abs(n2)));
		
		while(n1!=0 || n2!=0){
			String s ="";
			if(n1>0) {s += "L"; n1--;}
			if(n1<0) {s += "R"; n1++;}
			if(n2>0) {s += "D"; n2--;}
			if(n2<0) {s += "U"; n2++;}
			System.out.println(s);
		}
		
		
		
		
		
	}

}
