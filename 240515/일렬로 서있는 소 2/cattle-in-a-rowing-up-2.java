import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            int k = sc.nextInt();
            arr[i] = k;
        }
        int cnt = 0;
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                for (int k = j+1; k<n; k++){
                    if (arr[i] <= arr[j] && arr[j] <= arr[k]) cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}