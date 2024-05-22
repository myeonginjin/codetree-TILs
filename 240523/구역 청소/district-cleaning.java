import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        String str;
        StringTokenizer st;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();


        int maxN = 0;
        int minN = 101;

        for(int i = 0; i<2; i++){
            str = br.readLine();
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            
            maxN = Math.max(maxN, a);
            maxN = Math.max(maxN,b);

            minN = Math.min(minN, a);
            minN = Math.min(minN, b);
        }
        sb.append(maxN - minN);

        System.out.print(sb);
        
    }
}