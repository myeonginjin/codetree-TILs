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

            if(node > arr[i-1]) {
                dp[i] = dp[i-1] + 1;
            }
            else dp[i] = dp[i-1];
        }

        System.out.print(dp[n-1]);

    }
}