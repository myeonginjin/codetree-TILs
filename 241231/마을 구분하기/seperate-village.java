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
                    size = 0;
                    dfs(i, j, 1);
                    q.add(size);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        
        while(!q.isEmpty()) System.out.println(q.poll());
    }

    static void dfs(int r , int c, int s) {
        visit[r][c] = true;
        size = s;

        for (int i = 0; i<4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(indexOk(nr, nc) && arr[nr][nc]==1 && !visit[nr][nc]) {
                dfs(nr, nc, s+1);
            }
        }
    }

    static boolean indexOk(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }
}