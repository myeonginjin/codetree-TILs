import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[] dp;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        str = br.readLine();
        st = new StringTokenizer(str);

        arr = new int[n+1];
        dp = new int[n+1];

        for (int i = 1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        init();

        for (int i = 1; i<=n; i++) {
            int elm = arr[i];

            for (int j = 0; j<i; j++) {
                if(elm > arr[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        Arrays.sort(dp);
        System.out.print(dp[n]);
    }

    static void init() {
        dp[0] = 0;
        for (int i = 1; i<=n; i++) dp[i] = Integer.MIN_VALUE;
    }
}