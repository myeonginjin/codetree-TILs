import java.util.Scanner;

public class Main {
    public static int n,m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];

        int elm = 1;

        boolean[][] exist = new boolean[n][m];

        int[] dr = new int[]{1,0,-1,0};
        int[] dc = new int[]{0,1,0,-1};
        
        int dir = 0;

        int cr = 0;
        int cc = 0;

        while (true){
            arr[cr][cc] = elm;

            if(elm == n*m){
                break;
            }

            exist[cr][cc] = true;

            int nr = cr + dr[dir];
            int nc = cc + dc[dir];

            // System.out.println(nr+" "+nc +" "+dir);

            if(!indexOk(nr,nc) || exist[nr][nc]){
                dir = (dir+1) % 4;
            }

            cr += dr[dir];
            cc += dc[dir];
            elm++;
        }

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean indexOk(int r, int c){
        return r < n && r >= 0 && c < m && c >=0;
    }
}