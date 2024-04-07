import java.io.*;
import java.lang.StringBuilder;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        st = new StringTokenizer(str);

        int orginH, orginM, newH, newM;

        orginH = Integer.parseInt(st.nextToken());
        orginM = Integer.parseInt(st.nextToken());
        newH = Integer.parseInt(st.nextToken());
        newM = Integer.parseInt(st.nextToken());

        int answer = getDif(orginH, orginM, newH, newM);        

        sb.append(answer);

        System.out.print(sb);
    }

    public static int getDif(int oH, int oM, int nH, int nM) {
        int orginTime = oH*60 + oM;
        int newTime = nH*60 + nM;

        return newTime - orginTime;
    }
}