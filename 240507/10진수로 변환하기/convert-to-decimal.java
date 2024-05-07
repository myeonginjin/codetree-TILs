import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int ans = 0;

        int mul = 1;
        for (int i = str.length()-1; i>=0; i--){
            int num = Integer.parseInt(str.substring(i,i+1));
            ans += mul*num;

            mul *= 2;
        }

        System.out.print(ans);
    }
}