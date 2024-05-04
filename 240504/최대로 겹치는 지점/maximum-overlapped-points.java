import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[101];

        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            int s = sc.nextInt();
            int l = sc.nextInt();

            for (int j = s; j<=l; j++){
                arr[j] += 1;
            }
        }

        int maxN = 0;
        for (int i = 0; i<101; i++){
            maxN = Math.max(maxN, arr[i]);
        }

        System.out.print(maxN);
    }

}