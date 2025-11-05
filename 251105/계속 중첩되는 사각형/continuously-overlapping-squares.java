import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int OFFSET = 100;

        int n = sc.nextInt();
        int[][] arr = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            // 짝수는 빨간색 = 2
            if(i%2 == 0){
                for(int z = x1; z<x2; z++){
                    for(int j = y1; j<y2; y++){
                        arr[z][j] = 2;
                    }
                }
            }

            // 홀수는 파란색 = 1
            if(i%2 == 1){
                for(int z = x1; z<x2; z++){
                    for(int j = y1; j<y2; y++){
                        arr[z][j] = 1;
                    }
                }
            }
        }

        int red = 0;
        int blue = 0;

        for(int i = 0; i<=OFFSET*2; i++){
            for(int j = 0; j<=OFFSET*2; j++){
                if(arr[i][j] == 1){
                    blue++;
                }
            }
        }

        System.out.println(blue);
    }
}