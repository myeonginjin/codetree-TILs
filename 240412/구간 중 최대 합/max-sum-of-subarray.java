import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[100];
        StringTokenizer st;
        String str;

        str = br.readLine();
        st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str);

        for (int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = findMaxSum(arr, k);
        

        System.out.print(ans);
    }

    public static int findMaxSum(int[] arr, int num){
        int maxSum = 0;

        for (int i = 0; i <= arr.length-num; i++){
            int sum = 0;

            for (int j=i; j<i+num; j++){
                sum += arr[j];
            }

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}