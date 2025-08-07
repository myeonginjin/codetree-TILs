import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(func(n));
    }

    static int func(int n){
        if(n == 0){
            return n;
        }
        return n + func(n-1);
    }
}