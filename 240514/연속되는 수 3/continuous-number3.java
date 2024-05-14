import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int firN = Integer.parseInt(br.readLine());
        boolean minus = firN > 0 ? false : true;
        int maxLen = 0;
        int len = 1;


        for (int i = 1; i<n; i++){
            int num = Integer.parseInt(br.readLine());

            if(minus && num < 0){
                len++;
                maxLen = Math.max(len, maxLen);
            }
            else if (!minus && num > 0){
                len++;
                maxLen = Math.max(len, maxLen);
            }

            else {
                len = 1;
                minus = num > 0 ? false : true;
            }
        }

        System.out.print(maxLen);

        
    }
}