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


        int[] arrr = new int[101];

        for(int i = 0; i<2; i++){
            str = br.readLine();
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = a; j<b; j++){
                arrr[j] = 1;
            }

        }
        int cnt = 0;

        for (int i =0; i<arrr.length; i++){
            if(arrr[i]==1) cnt++;
        }

        System.out.print(cnt);
        
    }
}