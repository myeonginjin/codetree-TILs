import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];

        int ans = -1;
        for (int i = 0; i<m; i++){
            int s = sc.nextInt();
            arr[s] += 1;

            if (arr[s] >= k){
                ans = s;
                break;
            }
        }
        System.out.print(ans);
    }
}