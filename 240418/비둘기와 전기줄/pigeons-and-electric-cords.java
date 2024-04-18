import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int cnt;
    public static int[] arr = new int[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        n = Integer.parseInt(br.readLine());
        
        
        for (int i = 0; i<n; i++){
            str = br.readLine();
            st = new StringTokenizer(str);
            int num = Integer.parseInt(st.nextToken());
            int spot = Integer.parseInt(st.nextToken());

            countMove(num, spot);
        }

        System.out.print(cnt);

    }

    public static void countMove(int num, int spot) {
        
        if(arr[num] == 0) {
            arr[num] = spot+1;
        }

        else if(arr[num] != spot+1){
            cnt++;
            arr[num] = spot+1;
        }
    }
}