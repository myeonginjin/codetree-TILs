import java.util.*;

public class Main {
    public static int n,m;
    public static int[][] arr = new int[101][101];
    public static int[][] visited = new int[101][101];


    public static boolean canGo(int r, int c){
        return r >=0 && r < n && c >= 0 && c < m;
    }


    public static void move(int r , int c){
        int[] dr = new int[]{1,0};
        int[] dc = new int[]{0,1};

        

        for (int i = 0; i<2; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];

            

            if(canGo(nr,nc) && arr[nr][nc] != 0 && visited[nr][nc]!=1){
                visited[nr][nc] = 1;

                // System.out.println(nr+" "+nc);
                
                move(nr, nc);
            }
        }



    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        move(0,0);
        visited[0][0] = 1;

        System.out.println(visited[n-1][m-1]);

        // for (int i = 0; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         System.out.print(visited[i][j]+" ");
        //     }
        //     System.out.println();
        // }

    }
}