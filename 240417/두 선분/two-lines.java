import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        String str;

        str = (x3 <= x1 && x1 <= x4) || (x1 <= x3 && x3 <= x2) ? "intersecting" : "nonintersecting";

        System.out.print(str);
    }
}