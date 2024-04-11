import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int maxCnt = 0;
        int cnt = 0;

        int n = sc.nextInt();
        

        int fir = sc.nextInt();
        int point = fir;

        for (int i = 1; i<n; i++){
            int num = sc.nextInt();
            if (fir == num){
                cnt++;

                maxCnt = Math.max(maxCnt, cnt);
            }
            else{
                fir = num;
                cnt = 1;
            }
        }

        System.out.print(maxCnt);
    }
}