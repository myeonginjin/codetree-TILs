import java.util.*;
import java.io.*;
import java.lang.StringBuilder;

class Stu implements Comparable<Stu> {
    int cm, kg,n;

    public Stu (int a, int b, int c){
        this.cm = a;
        this.kg = b;
        this.n = c;
    }

    public int compareTo(Stu s) {
        if (this.cm == s.cm) {
            return s.kg - this.kg;
        }

        return this.cm - s.cm;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stu[] arr = new Stu[n];

        String str;
        StringTokenizer st;

        for (int i = 0; i<n; i++){
            str = br.readLine();
            st = new StringTokenizer(str);
            arr[i] = new Stu(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i+1);
        }

        Arrays.sort(arr);

        for (int i = 0; i<n; i++) {
            sb.append(arr[i].cm+" "+arr[i].kg+" "+arr[i].n+"\n");
        }

        System.out.print(sb);
    }
}