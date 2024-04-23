import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        for (int i = 0; i<7; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];


        int c = a+b != arr[2] ? arr[2] : arr[3];


        System.out.print(a+" "+b+" "+c);

    }
}