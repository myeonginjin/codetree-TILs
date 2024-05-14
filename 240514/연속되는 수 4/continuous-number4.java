import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxLen = 1;
        int len = 1;

        int preNum = 0;

        for (int i = 0; i<n; i++){
            int num = sc.nextInt();

            if (i == 0){
                preNum = num;
            }
            else if (num > preNum){
                len++;
            }
            else {
                len = 1;
            }
            preNum = num;
            maxLen = Math.max(len, maxLen);
        }

        System.out.print(maxLen);
    }
}