import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        int originTime = (11 * 24 * 60) + (11 * 60) + 11;
        int newTime = (d * 24 * 60) + (h * 60) + m;

        int dif = newTime - originTime >= 0 ? newTime - originTime : -1;
        System.out.print(dif);
    }
}