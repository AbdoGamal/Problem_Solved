import java.util.Scanner;

/**
 * Date: 27-01-2015
 * Time: 23:30
 */
public class square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        boolean[][] array = new boolean[n+2][m+2];

        for (int i = 1; i <= k; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            array[x][y] = true;

            if (squareMatrix(array, x, y) || squareMatrix(array, x+1, y) || squareMatrix(array, x, y+1) || squareMatrix(array, x+1, y+1)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }

    private static boolean squareMatrix(boolean[][] arr, int i, int j) {

        return arr[i][j] && arr[i][j-1] && arr[i-1][j] && arr[i-1][j-1];
    }
}