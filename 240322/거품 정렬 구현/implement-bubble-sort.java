import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}