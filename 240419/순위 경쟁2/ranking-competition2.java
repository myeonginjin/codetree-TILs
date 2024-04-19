import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        char rank = 'C';
        int cnt = 0;

        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i<n; i++){
            str = br.readLine();
            st = new StringTokenizer(str);

            char c = st.nextToken().charAt(0);
            int s = Integer.parseInt(st.nextToken());

            switch(c) {
                case 'A':
                    aScore += s;
                    break;
                case 'B':
                    bScore += s;
                    break;
            }

            char winner = 'C';

            if (aScore == bScore) {
                winner = 'C';
            }
            else {
                winner = aScore > bScore ? 'A' : 'B';
            }

            if (winner!=rank) {
                cnt++;
                rank = winner;
            }

        }

        System.out.print(cnt);
    }
}