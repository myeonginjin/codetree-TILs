import java.util.Scanner;

public class Main {

    public static int[][] arr = new int[201][201];
    public static int offset = 100;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x1,y1,x2,y2;

        for (int i = 0; i<n; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            paint(x1, y1, x2, y2);
        }

        int answer = 0;
        for(int i = 0; i<201; i++){
            for (int j=0; j<201; j++){
                if(arr[i][j]==1) answer += 1;
            }
        }

        System.out.print(answer);
    }

    public static void paint(int x1, int y1, int x2, int y2){
        for (int i = x1; i<x2; i++){
            for(int j = y1; j<y2; j++){
                arr[i+offset][j+offset] = 1;
            }
        }
    }
}