import java.util.HashSet;
import java.util.Scanner;

//ajudados por Emi meu melhor amigo, 
//amor e esposa do futuro

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char arr[]=str.toCharArray();
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]==' '||arr[i]==',')
				continue;
				set.add(arr[i]);
			}
		System.out.println(set.size()-1);
	}

}
