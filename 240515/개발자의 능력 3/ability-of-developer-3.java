import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] arr = new int[6];

        for (int i = 0; i<6; i++){
            int num = sc.nextInt();
            arr[i] = num;
            sum += num;
        }

        int minDif = Integer.MAX_VALUE;
        int n = 6;
        for (int i = 0; i<n-2; i++){

            for (int j = i+1; j<n-1; j++){

                for (int k = j+1; k<n; k++){
                    int dis = arr[i] + arr[j] + arr[k];
                    minDif = Math.min( Math.abs(dis - ( sum - dis )) , minDif);
                }
            }
        }

        System.out.print(minDif);


    }
}