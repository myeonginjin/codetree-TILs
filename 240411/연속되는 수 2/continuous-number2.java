import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxCnt = 1;
        int cnt = 1;

        int n = Integer.parseInt(br.readLine());
        

        int fir = Integer.parseInt(br.readLine());
        int point = fir;

        for (int i = 1; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if (fir == num){
                cnt++;

                maxCnt = Math.max(maxCnt, cnt);
            }
            else{
                fir = num;
                cnt = 1;
            }
        }

        System.out.print(maxCnt);
    }
}