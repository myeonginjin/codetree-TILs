import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int maxSum = 0;
        for (int i = x; i<=y; i++){
            int sum = getSum(i);
            maxSum = Math.max(maxSum, sum);
        }
        System.out.print(maxSum);
        
    }
    public static int getSum(int num) {
        int s = 0;

        while (true){
            if (num < 10){
                s+= num;
                break;
            }
            String str = String.valueOf(num);
            int div = (str.length()-1)* 10;
            s += num / div;
            num = num % div;
        }
        return s;
    }
}