import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[201][201];
        int offset = 100;

        for (int i = 0; i<n; i++){

            int c = sc.nextInt() + offset;
            int r = sc.nextInt() + offset;

            for (int s = r; s<r+8; s++){
                for (int j = c; j<c+8; j++){
                    arr[s][j] = 1;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i<201; i++){
            for (int j = 0; j<201; j++){
                if(arr[i][j] == 1)cnt++;
            }
        }
        System.out.print(cnt);
    }
}