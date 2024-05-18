import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cost = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int cnt = 0;

        for (int i = arr.length-1; i>=0; i--){
            cnt += cost / arr[i];

            cost %= arr[i];
        }

        System.out.print(cnt);
    }
}