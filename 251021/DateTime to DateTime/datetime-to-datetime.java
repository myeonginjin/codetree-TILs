import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int sum1 = A*24*60 + B*60 + C;
        int sum2 = 11*24*60 + 11*60 + 11;


        if(sum2 > sum1) System.out.println("-1");
        else{
            System.out.println(Math.abs(sum1 - sum2));
        }

    }
}