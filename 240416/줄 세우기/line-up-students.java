import java.io.*;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Stu implements Comparable<Stu> {
    int n;
    int c;
    int k;

    public Stu (int num, int cm, int kg) {
        this.n = num;
        this.c = cm;
        this.k = kg;
    }

    @Override
    public int compareTo(Stu s) {
        if (s.c == this.c) {
            if (s.k == this.k) {
                return this.n - s.n;
            }
            return s.k - this.k;
        }
        return s.c - this.c;
    }
}


public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        StringBuilder sb = new StringBuilder();
        ArrayList<Stu> arr2 = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        Stu[] arr = new Stu[n];

        for (int i = 1; i<=n; i++){
            str = br.readLine();
            st = new StringTokenizer(str);

            int cm = Integer.parseInt(st.nextToken());
            int kg = Integer.parseInt(st.nextToken());

            arr[i-1] = new Stu(i, cm, kg);

            Stu s = new Stu(i, cm, kg);
            arr2.add(s);
        }

        Arrays.sort(arr);

        // for (int i = 0; i<n; i++){
        //     sb.append(arr[i].c+" "+arr[i].k+" "+arr[i].n);
        //     sb.append("\n");
        // }

        Collections.sort(arr2);

        for (int i = 0; i<arr2.size(); i++){
            sb.append(arr2.get(i).c+" "+arr2.get(i).k+" "+arr2.get(i).n);
            sb.append("\n");
        }

        System.out.print(sb);
    }
}