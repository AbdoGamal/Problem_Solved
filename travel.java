import java.util.*;

public class travel
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        if(a * m <= b) {
            System.out.println(n * a);
        } else {
            int result = Math.min((n / m) * b + a * (n % m), ((n/m) + 1) * b);
            System.out.println(result);
        }
    }
}