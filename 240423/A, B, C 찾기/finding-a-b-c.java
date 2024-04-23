import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i<4; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i<4; i++){
            if(arr[i] > sum ) sum = arr[i];
        }

        System.out.print(a+ " " + b + " " + (sum - (a+b)));

    }
}