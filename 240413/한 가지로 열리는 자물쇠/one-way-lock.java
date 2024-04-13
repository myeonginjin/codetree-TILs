import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        int cnt = 0;

        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                for(int k = 1; k<=n; k++){
                    
                    if ( Math.abs(i-f) <= 2 || Math.abs(j-s) <= 2 || Math.abs(k-t) <= 2 ) cnt++;

                }
            }
        }

        System.out.print(cnt);
    }
}