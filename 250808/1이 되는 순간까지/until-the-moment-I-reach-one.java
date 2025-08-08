import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.println(func(n));
    }

    static int func(int n){

        if(n == 1){
            return 0;
        }
        int remainder = n;

        if(remainder % 2 == 0){
            return func(n / 2) + 1;
        }else{
            return func(n / 3)  + 1;
        }
    }
}