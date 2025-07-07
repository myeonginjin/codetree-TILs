import java.util.*;
import java.io.*;

public class Main {
    static int n,k;
    static int[] arr;
    static int ans;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        StringTokenizer st;

        str = br.readLine();
        st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n+1];

        for (int i = 0; i<k; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j<=end; j++) arr[j]++;
        }
        
        for (int i = 1; i<=n; i++) ans = Math.max(ans, arr[i]);

        sb.append(ans);
        System.out.println(sb);

        br.close();
    }


}