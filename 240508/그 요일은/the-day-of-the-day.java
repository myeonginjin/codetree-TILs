import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String week = sc.next();

        int[] days = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};

        int orijinDate =0;
        int newDate =0;

        for (int i = 0; i<m1-1; i++){
            orijinDate += days[i];
        }
        orijinDate += d1;

        for (int i = 0; i<m2-1; i++){
            newDate += days[i];
        }
        newDate += d2;

        int dif = newDate - orijinDate;

        int cnt = 0;

        cnt += dif / 7;


        int rest = dif % 7;

        int weekIndex = -1;
        String[] weeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        for (int i = 0; i<7; i++){
            if(week.equals(weeks[i])){
                weekIndex = i;
            }
        }
        // System.out.println(cnt+" "+ weekIndex);

        if (weekIndex <= rest){
            cnt++;
        }

        System.out.println(cnt);

    }
}

/*
5 6 7 8 9 10 11
12 
*/