import java.util.Scanner;

public class Main {
    public static int[] process = new int[300];
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int index = 0;
        for (int i = 0; i<n; i++){
            process[index++] = sc.nextInt();
            process[index++] = sc.nextInt();
            process[index++] = sc.nextInt();
        }

        int ans = getAnswer();

        System.out.print(ans);
    }
    
    public static int getAnswer( ) {
        int maxCnt = 0;

        for (int i = 1; i<=3; i++){
            int[] cup = new int[4];
            int cnt = 0;

            cup[i] = 1;

            for (int j = 0; j<n*3-2; j+=3){
                int temp = cup[process[j]];
                cup[process[j]] = cup[process[j+1]];
                cup[process[j+1]] = temp;

                if (cup[process[j+2]] == 1) {
                    cnt++;
                }
            }

            maxCnt = Math.max(maxCnt, cnt);
        }

        return maxCnt;
    }
}