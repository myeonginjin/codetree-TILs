import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.println(func(n));
    }

    static int func(int n){
        if(n < 10){
            return n * n;
        }

        int digit = n % 10;

        return func(n / 10) + digit * digit ;
    }
}