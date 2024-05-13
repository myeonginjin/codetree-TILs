import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[201];
        int offset = 100;

        for (int i = 0; i<n; i++){
            int x1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;

            for (int j = x1; j<x2; j++){
                arr[j] += 1;
            }
        }

        int maxCnt = 0;

        for (int i = 0; i<arr.length; i++){
            maxCnt = Math.max(maxCnt , arr[i]);
        }

        System.out.print(maxCnt);
    }
}