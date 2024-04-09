import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr = new int[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String str;

        str = br.readLine();
        st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        for (int i = 0; i<k; i++){
            str = br.readLine();
            st = new StringTokenizer(str);
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            stack(p1,p2);
        }

        int answer = getAnswer();

        System.out.print(answer);
    }

    public static void stack(int p1, int p2) {
        for(int i = p1; i <= p2; i++){
            arr[i] += 1;
        }
    }

    public static int getAnswer() {
        int max = 0;

        for (int i = 1; i<arr.length; i++){
            if (max < arr[i]) max = arr[i];
        }

        return max;
    }
}