import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        //x 숫자
        for (int i = 1; i<10001; i++){
            
            boolean ans = true;

            int x = i;

            //맞는지 체크
            for(int j = 0; j<n; j++){
                x *= 2;
                
                if (arr[j][0] > x || arr[j][1] < x) ans = false;
            }

            if(ans) {
                System.out.print(i);
                break;
            }
        }
    }
}