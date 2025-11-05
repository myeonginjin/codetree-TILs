import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int OFFSET = 1000;
        int[] arr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i == 0 || arr[i] != arr[i-1]){
                if(max < arr[i]) max = arr[i];
            }
        }

        // int count = 0;
        // for(int i = 0; i<n; i++){
        //     if(max == arr[i]){
        //         while(arr[i] != arr[i-1]){
        //             count++;
        //             i++;
        //         }
        //     }
        // }

        System.out.println(max);
    }
}