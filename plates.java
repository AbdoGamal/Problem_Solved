import java.util.Scanner;

//saudede emi 
//euo amo voce 
//wanna voce ser minha futura esposa
public class plates {

	public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
        	arr[i] = in.nextInt();
        }
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                if(m == 0){
                	count1++;
                }
                else m--;
            }
            else if(arr[i] == 2){
                if(m == 0 && k == 0){
                	count2++;
                }
                else if(m != 0 && k != 0){
                    k--;
                }
                else if(k == 0 && m != 0){
                    m--;
                }
                else if(m == 0 && k != 0){
                    k--;
                }
            }
        }
        System.out.println(count1 + count2);
}
}