import java.io.*;


public class Main {

    public static int n;
    public static int[] arr = new int[10000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }

        int ans = (moveBox( sum / n )) / 2;

        System.out.print(ans);

    }
    
    public static int moveBox(int avg) {

        int cnt = 0;

        for (int i = 0; i<n; i++){
            if(arr[i] != avg) {
                cnt += Math.abs(arr[i]-avg);
            }
        }

        return cnt;
    }
}