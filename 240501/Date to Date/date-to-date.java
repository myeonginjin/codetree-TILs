import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] months = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int date1 = 0;
        for (int i = 1; i<m1; i++){
            date1 += months[i];
        } 

        date1 += d1;


        int date2 = 0;
        for (int i = 0; i<m2; i++){
            date2 += months[i];
        }

        date2 += d2;


        System.out.print(date2 - (date1-1));
    }
}