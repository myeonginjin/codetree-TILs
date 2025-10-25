import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.

        // 3과 4가 주어지면

        // 3진수를 4진수로 변환하는 코드 만들기

        int sum = 0;
        for(int i = 0; i<N.length(); i++){
            sum = sum * A + N.charAt(i) - '0';
        }

        int cnt = 0;
        int[] answer = new int[sum];
        while(true){
            if(sum < B){
                answer[cnt] = sum;
                break;
            }

            answer[cnt++] = sum%B;
            sum = sum / B;
        }

        for(int i = cnt; i>= 0; i--){
            System.out.print(answer[i]);
        }
    }
}