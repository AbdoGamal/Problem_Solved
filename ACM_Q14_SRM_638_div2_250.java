package codeforce;

import java.util.Scanner;
// nameOfClass NamingConvention
public class ACM_Q14_SRM_638_div2_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.out.println(toCamelCase("sum_of_two_numbers"));
		//System.out.println((int)'A'+32);
	/*	Scanner in=new Scanner(System.in);
		String st=in.next();
		String[]str=st.split("_");
			String h="";
		for(int i=1;i<str.length;i++){
			char []v=str[i].toCharArray();
			v[0]=(char) (v[0]-32);
			//System.out.print(v);
			for(int j=0;j<v.length;j++)
		   h+=v[j];
		}
			    System.out.print(str[0]+h);	
		
		*/
	}

	static public String toCamelCase(String variableName){
	
		String[]str=variableName.split("_");
			String h="";
		for(int i=1;i<str.length;i++){
			char []v=str[i].toCharArray();
			v[0]=(char) (v[0]-32);
			//System.out.print(v);
			for(int j=0;j<v.length;j++)
		   h+=v[j];
		}
			  return str[0]+h;	
	}
}
