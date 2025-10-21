import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();

        int[] days_of_months_leap = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // A요일은 몇 번 등장하게 되는지
        int sum1 = 0;
        for(int i = 1; i<= m1; i++){
            sum1 += days_of_months_leap[i];
        }

        int sum2 = 0;
        for(int i = 1; i<= m2; i++){
            sum2 += days_of_months_leap[i];
        }

        int rest_of_days = (sum2 - sum1)/7;
        String[] days_of_weeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        String target = days_of_weeks[(sum2 - sum1)%7];
        System.out.println(target);
        if(target == A){
            rest_of_days += 1;
        }

        System.out.println(rest_of_days);
    


    }
}