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



        int[] arr = new int[201];

        for (int i = 0; i<n; i++) {
            int str = x1[i];
            int end = x2[i];

            for (int j = str; j<end; j++) {
                arr[j+100]++;
            }
        }
        int ans = 0;
        int idx = 0;
        for (int i = 0; i<201; i++) {
            if (ans < arr[i]) {
                idx = i - 100;
                ans = arr[i];
            }
        }

        System.out.println(ans);
    }
}