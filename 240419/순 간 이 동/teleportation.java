import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int minDis = Integer.MAX_VALUE;

        minDis = Math.min(minDis, Math.abs(a-b));
        minDis = Math.min(minDis, Math.abs(Math.min(a,b) -  Math.min(x,y)) + Math.abs(Math.max(a,b) - Math.max(x,y)));

        System.out.print(minDis);

    }
}