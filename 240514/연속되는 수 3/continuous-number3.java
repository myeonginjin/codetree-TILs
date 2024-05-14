import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxLen = 1;
        int len = 1;

        boolean minus = false;

        for (int i = 0; i<n; i++){
            int num = Integer.parseInt(br.readLine());

            if(i ==0){
                minus = num > 0 ? false : true;
                continue;
            }

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