import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }



        int[] arr = new int[101];

        for (int i = 0; i<n; i++) {
            int str = x1[i];
            int end = x2[i];

            for (int j = str; j<end; j++) {
                arr[j]++;
            }
        }
        int ans = 0;
        for (int i = 0; i<101; i++) {
            ans = Math.max(ans, arr[i]);
        }

        System.out.println(ans);
    }
}