import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        String[] weeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Sun"};

        int day1 = 0;
        int day2 = 0;

        for (int i = 0; i<m1-1; i++){
            day1 += days[i];
        }
        day1 += d1;

        for (int i = 0; i<m2-1; i++){
            day2 += days[i];
        }
        day2 += d2;


        int dif = Math.abs(day1 - day2) % 7;

        String ans;

        if(day1 <= day2){
            ans = weeks[dif];
        }

        else {
            ans = weeks[ 7 - dif ];
        }   

        System.out.print(ans);

    }
}