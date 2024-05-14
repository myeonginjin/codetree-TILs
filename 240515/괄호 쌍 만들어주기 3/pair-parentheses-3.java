import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int cnt = 0;

        for (int i = 0; i<str.length(); i++){
            if (str.substring(i,i+1).charAt(0) == '(') {
                for (int j = i+1; j<str.length(); j++){
                    if (str.substring(j,j+1).charAt(0) == ')'){
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);

    }
}