import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();


        int[] arr = new int[10001];

        for (int i = 0; i<n; i++){
            int spot = sc.nextInt();
            char type = sc.next().charAt(0);

            int score = type == 'G' ? 1 : 2;
            arr[spot] = score;
        }

        // for (int i = 0; i< 17; i++){
        //     System.out.print(arr[i]+" ");
        // }

        int maxS = 0;
        for (int i = 0; i<arr.length-k; i++){
            int s = 0;
            for (int j=i; j<=i+k; j++){
                s += arr[j];
            }
            maxS = Math.max(s, maxS);

        }

        System.out.print(maxS);
    }
}