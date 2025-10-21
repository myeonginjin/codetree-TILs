import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        A += A*24*60;
        B += B*60;
        int sum1 = A + B + C;

        int sum2 = 0;
        sum2 += 11 * 24 * 60;
        sum2 += 11*60;
        sum2 += 11;

        System.out.println(Math.abs(sum2 - sum1));

    }
}