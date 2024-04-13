import java.io.*;
import java.util.StringTokenizer;

public class Main  {

    public static int currentSpot = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str; 
        StringTokenizer st;

        str = br.readLine();

        st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] aSpot = new int[1000000];
        int[] bSpot = new int[1000000];

        int time = 0;

        for (int i = 0; i<n; i++){
            str = br.readLine();
            st = new StringTokenizer(str);

            char type = st.nextToken().charAt(0);
            int dis = Integer.parseInt(st.nextToken());

            time += dis;

            move(aSpot, type, dis);
        }

        currentSpot = 0;

        for (int i = 0; i<m; i++){
            str = br.readLine();
            st = new StringTokenizer(str);

            char type = st.nextToken().charAt(0);
            int dis = Integer.parseInt(st.nextToken());

            move(bSpot, type, dis);
        }
        
        int answer = -1;

        for (int i = 1; i<time; i++){
            if(aSpot[i] == bSpot[i]) {
                
                answer = i;
                break;
            }
        }

        System.out.print(answer);
    }

    public static void move(int[] arr, char t, int d) {

        if (t == 'R'){
            for (int i = 0; i<d; i++){
                arr[i] = currentSpot;
                currentSpot++;
            }
        }
        
        else if (t == 'L'){
            for (int i = 0; i<d; i++){
                arr[i] = currentSpot;
                currentSpot--;
            }
        }

    }
}