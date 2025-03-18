import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(numsOfDays(A, B, C) - numsOfDays(11,11,11));

    }

    public static int numsOfDays(int day, int hour, int min){
        int sumMin = (day - 1) * 24 * 60;
        sumMin += hour * 60;
        sumMin += min;
        return sumMin;
    }
}