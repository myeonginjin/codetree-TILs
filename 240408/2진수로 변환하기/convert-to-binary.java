import java.io.*;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        while(n > 2){
            arr.add(n%2);
            n /= 2;
        }
        
        if(n!=0) arr.add(n);

        for (int i = arr.size()-1; i>=0; i--){
            if(i==0 && arr.get(i)==0){
                break;
            }

            sb.append(arr.get(i));
        }

        System.out.print(sb);

    }
}