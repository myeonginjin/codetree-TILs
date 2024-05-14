import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2001][2001];
        int offset = 1000;

        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int i = 0; i<3; i++){
            int x1 = sc.nextInt()+offset;
            int y1 = sc.nextInt()+offset;
            int x2 = sc.nextInt()+offset;
            int y2 = sc.nextInt()+offset;

            maxX = Math.max(maxX, Math.max(x1,x2));
            maxY = Math.max(maxY, Math.max(y1,y2));

            minX = Math.min(minX, Math.min(x1,x2));
            minY = Math.min(minY, Math.min(y1,y2));

            if (i == 2){
                for (int j = x1; j<x2; j++) {
                    for (int k = y1; k<y2; k++){

                        if (arr[j][k] ==1){
                            arr[j][k] = 5;
                        }
                        

                    }
                }
            }

            else {
                for (int j = x1; j<x2; j++) {
                    for (int k = y1; k<y2; k++){
                        arr[j][k] += 1;
                    }
                }
            }

        }
        int cnt = 0;
        for (int i = minX; i<= maxX; i++){
            for (int j = minY; j<= maxY; j++){
                if (arr[i][j] == 1) cnt++;
            }
        }

        // for (int i = minX; i<= maxX; i++){
        //     System.out.println();
        //     for (int j = minY; j<= maxY; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        // }

        System.out.print(cnt);
    }
}