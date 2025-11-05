import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = 0, cnt = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] > t ) {
                cnt++;
                //System.out.println(arr[i] + " " + cnt);
            }
            else cnt = 0;
            ans = Math.max(cnt, ans);
        }

        System.out.println(ans);
    }
}