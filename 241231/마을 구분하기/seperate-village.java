import java.util.*;

public class Main {
    static int n, size;
    static int[][] arr;
    static PriorityQueue<Integer> q = new PriorityQueue<>();
    static boolean[][] visit;
    static int[] dr = new int[]{-1,1,0,0};
    static int[] dc = new int[]{0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if(arr[i][j] == 1 && visit[i][j] == false) {
                    size = 1;
                    dfs(i, j);
                    q.add(size);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        
        while(!q.isEmpty()) System.out.println(q.poll());

        System.out.println();

        // for (int i = 0; i<n; i++) {
        //     for (int j = 0; j<n; j++){
        //         if(visit[i][j]) System.out.print("1 ");
        //         else System.out.print("0 "); 
        //     }
        //     System.out.println();
        // }
    }

    static void dfs(int r , int c) {
        visit[r][c] = true;

        for (int i = 0; i<4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(indexOk(nr, nc) && arr[nr][nc]==1 && !visit[nr][nc]) {
                size++;
                dfs(nr, nc);
            }
        }
    }

    static boolean indexOk(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }
}