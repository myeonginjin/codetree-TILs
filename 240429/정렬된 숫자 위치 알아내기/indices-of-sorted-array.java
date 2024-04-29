import java.io.*;
import java.util.*;

class Num {
    int size, index;

    public Num(int a, int b) {
        this.size = a;
        this.index = b;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        String str;

        str = br.readLine();
        st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());

        Num[] arr = new Num[n];
        str = br.readLine();
        st = new StringTokenizer(str);

        for (int i = 0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = new Num(num, i+1);
        }

        Arrays.sort(arr, new Comparator<Num>(){
            public int compare(Num a, Num b) {
                return a.size - b.size;
            }
        });

        int[] newArr = new int[n+1];

        for (int i = 0; i<n; i++){
            newArr[arr[i].index] = i+1;
        }

        for (int i = 1; i<=n; i++){
            sb.append(newArr[i]+" ");
        }

        System.out.print(sb);
    }
}