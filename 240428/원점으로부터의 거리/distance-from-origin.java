import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.lang.StringBuilder;


class Point {
    int x,y,n;

    public Point(int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.n = n;
    }
}

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        
        int n = Integer.parseInt(br.readLine());

        Point[] arr = new Point[n];
        for (int i = 0; i<n; i++){
            str = br.readLine();
            st = new StringTokenizer(str);

            arr[i] = new Point(Integer.parseInt(st.nextToken()) , Integer.parseInt(st.nextToken()), i+1);
        }

        Arrays.sort(arr, new Comparator<Point>() {
            public int compare(Point a, Point b) {
                int aDis = Math.abs(a.x - 0) + Math.abs(a.y - 0);
                int bDis = Math.abs(b.x - 0) + Math.abs(b.y - 0);

                return aDis - bDis;
            }
        });

        for (int i = 0; i<n; i++){
            System.out.println(arr[i].n);
        }
    }
}