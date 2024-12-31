import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        str = br.readLine();
        st = new StringTokenizer(str);

        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 1; i<n; i++){
            int node = arr[i];

            for (int j = 0; j<=i; j++) {
                if(node > arr[j]) dp[i] = Math.max( dp[i], dp[j] + 1 );
                //else dp[i] = Math.max(dp[i], dp[j]);
            }
        }
        Arrays.sort(dp);
        System.out.print(dp[n-1]);

    }
}