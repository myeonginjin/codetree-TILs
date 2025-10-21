import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] days_of_months = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum1 = 0;
        for(int i = 1; i <= m1; i++){
            sum1 += days_of_months[i];
        }
        sum1 += d1;

        int sum2 = 0;
        for(int i = 1; i <= m1; i++){
            sum2 += days_of_months[i];
        }
        sum2 += d2;

        int result = sum2 - sum1;

        result += 7;

        String[] days_of_week = new String[]{"Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};

        System.out.println(days_of_week[result%7]);

    }
}