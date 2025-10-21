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

        int result = Math.abs(sum2 - sum1)%7;
        
        // 6 = 일요일
        // 5 = 토요일
        // 4 = 금요일
        // 3 = 목요일
        // 2 = 수요일
        // 1 = 화요일
        // 0 = 월요일
        // -1 = 일요일
        // -2 = 토요일
        // -3 = 금요일
        // -4 = 목요일
        // -5 = 수요일
        // -6 = 화요일
    
        if(result == 1 || result == -6){
    System.out.println("화");
}else if(result == 2 || result == -5){
    System.out.println("수");
}else if(result == 3 || result == -4){
    System.out.println("목");
}else if(result == 4 || result == -3){
    System.out.println("금");
}else if(result == 5 || result == -2){
    System.out.println("토");
}else if(result == 6 || result == -1){
    System.out.println("일");
}else if(result == 0){
    System.out.println("월");
}

    }
}