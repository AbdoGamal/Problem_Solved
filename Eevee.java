package codeforce;

import java.util.ArrayList;
import java.util.Scanner;

public class Eevee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String[] main ={"vaporeon", "jolteon",
		                "flareon", "espeon", "umbreon", "leafeon"
		                 ,"glaceon", "sylveon"};
    int n=in.nextInt();
	String str=in.next();
	int v=0;
	for(int i=0;i<main.length;i++){
		if(main[i].matches(str)){
			System.out.println(main[i]);
			return;
			
		}
		
		
	}
 
	
	

}
}