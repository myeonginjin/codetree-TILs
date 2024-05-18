import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i<n; i++){ 
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 0; i<n; i++){
            sum += arr[i];

            if(sum < 0) {
                sum = 0;
                continue;
            }

            maxSum = Math.max(sum , maxSum);
        }

        System.out.print(maxSum);
    }
}