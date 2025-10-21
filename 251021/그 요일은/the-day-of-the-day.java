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
        sum1 += d1;

        int sum2 = 0;
        for(int i = 1; i<= m2; i++){
            sum2 += days_of_months_leap[i];
        }
        sum2 += d2;
        String[] days_of_weeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int weekIndex = 0;
        for(int i = 0; i<days_of_weeks.length; i++){
            if(A.equals(days_of_weeks[i])){
                weekIndex = i;
            }
        }
        //System.out.println(weekIndex);

        int answer = 0;
        for(int i = sum1; i<= sum2; i++){
            if(weekIndex == i%7){
                answer++;
            }
        }
        System.out.println(answer);
    }
}