import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(func(a,b,c));
    }

    static int func(int a, int b, int c){
        // a가 b, c보다 작을 때
        if(a < b && a < c) return a;

        // b가 a, c보다 작을 때,

        if(b < a && b < c) return b;

        // c가 a, b보다 작을 때
        return c;
    }
}