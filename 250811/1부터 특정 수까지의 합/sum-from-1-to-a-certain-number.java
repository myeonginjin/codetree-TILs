import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.println(func(n));
    }

    static int func(int n){
        int sum = 0;
        for(int i = 1; i<= n; i++){
            sum += i;
        }

        return sum / 10;
    }
}