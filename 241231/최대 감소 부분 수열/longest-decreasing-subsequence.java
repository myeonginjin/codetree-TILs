import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        arr[0] = Integer.MAX_VALUE;

        for (int i = 1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i<=n; i++) dp[i] = Integer.MIN_VALUE;

        for (int i = 1; i<=n; i++) {
            int node = arr[i];

            for (int j = 0; j<=i; j++){
                if(node < arr[j]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }
        Arrays.sort(dp);
        System.out.print(dp[n]);

    }
}